grammar LifeTC3Grammar;

@parser::header 
{
	import com.github.nanothor.lifetc3.ast.Node;
	import com.github.nanothor.lifetc3.ast.Type;
	import java.util.List;
}

// regra inicial
prog
returns [Node n]
	: CLASS name=ID ';' (varDecl|constDecl)* funcDecl* mainFunction EOF
	;

// switch para constantes literais
literal
returns [Node n]
	: l=INT_LITERAL
	| l=FLOAT_LITERAL
	| l=STRING_LITERAL
	| l=TRUE
	| l=FALSE
	;

// declaração de variáveis
varDecl
	: VAR ID (',' ID)* ':' type ';'
	;

// declaração de constantes
constDecl
	: type name=ID '=' value=literal ';'
	;

// switch para tipos
type
returns [Type t]
	: STRING
	| INT
	| FLOAT
	| BOOL
	;

// definição de função
funcDecl
returns [Node n]
	: name=ID '(' (arg (',' arg)*)?')' ':' type  funcBody;

// definiçao de parametro formal
arg
returns [Node n]
	: type ID ('=' literal)?
	;

// definição do bloco principal
mainFunction
returns [Node n]
	: 'main' '(' ')' funcBody
	;

// corpo de função
funcBody
returns [List<Node> ns]
	: '{' (varDecl|constDecl)* stmt* '}'
	;

// statement de retorno
returnStmt
returns [Node n]
	: 'return' '(' bool ')'
	;

// switch de statement
stmt
returns [Node n]
	: assign ';'
	| functionCall ';'
	| returnStmt ';'
	| ifStmt
	| forStmt
	| whileStmt
	| exitStmt ';'
	;

functionCall
returns [Node n]
	: ID '(' (bool (',' bool)*)? ')'
	;


// statement exit (equivalente ao break do java, c, python e etc)
exitStmt
returns [Node n]
	: 'exit'
	;

// statement if
ifStmt
returns [Node n]
	: 'if' '(' c=bool ')' t=block ('else' e=block )?
	;

// statement for
forStmt
returns [Node n]
	: 'for' '(' var=ID '=' b=expr ':' e=expr ('step' s=expr)? ')' block
	;

// statement while
whileStmt
returns [Node n]
	: 'while' '(' c=bool ')' b=block
	;

// usado no if, for e while
block
returns [List<Node> ns]
	: '{' (stmt)* '}'
	;

// operação de atribuição
assign
returns [Node n]
	: l=ID '=' e=bool
	;

// switch (em caso de adição dos operadores 'e' e 'ou' )
bool
returns [Node n]
	: relOp
	;

// operadores relacionais
relOp
returns [Node n]
	: l=eqOp op='>'  r=eqOp
	| l=eqOp op='>=' r=eqOp
	| l=eqOp op='<'  r=eqOp
	| l=eqOp op='<=' r=eqOp
	| l=eqOp
	;

// operadores de igualdades (desigualdade)
eqOp
returns [Node n]
	: l=expr op='==' r=expr
	| l=expr op='!=' r=expr
	| l=expr op='<>' r=expr
	| l=expr
	;

// adição e subtração
expr
returns [Node n]
	: l=expr op='+' r=term
	| l=expr op='-' r=term
	| u=term
	;

// multiplicação e divisão
term
returns [Node n]
	: l=term op='*' r=unary
	| l=term op='/' r=unary
	| u=unary
	;

// operadores unarios
unary
returns [Node n]
	: op='!' r=unary
	| op='-' r=unary
	| u=factor
	;

// fator
factor
returns [Node n]
	: '(' bool ')'
	| ID
	| functionCall
	| literal
	;

// tipos
STRING: 'string';
INT: 'int';
FLOAT: 'float';
BOOL: 'boolean';

// palavras reservadas
VAR: 'var';
CLASS: 'class';

// boolean literals
TRUE: 'TRUE';
FALSE: 'FALSE';

// int literals
INT_LITERAL: [0-9]+;
// float literals
FLOAT_LITERAL: [0-9]+ '.' [0-9]+?;
// string literals
STRING_LITERAL: '"' (.)*? '"';

// regra reconhecedora de identificadores
ID: [a-zA-Z][a-zA-Z0-9_]*;

// comentário de uma linha
SL_COMMENT: '//' (~[\n])* -> skip;
// comentário de multiplas linhas
ML_COMMENT: '/*' .*? '*/' -> skip;

// tratamento de espaços
WS: [ \n\r\t] -> skip;
