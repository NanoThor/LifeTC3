grammar LifeTC3Grammar;

@passer::header {
	import com.github.nanothor.lifetc3.*;
}

// regra inicial
prog
	: CLASS ID ';' (variable|constant)* function* mainFunction EOF
	;

// switch para constantes literais
literal
	: INT_LITERAL
	| FLOAT_LITERAL
	| STRING_LITERAL
	| TRUE
	| FALSE
	;

// declaração de variáveis
variable
	: VAR ID (',' ID)* ':' type ';'
	;

// declaração de constantes
constant
	: type ID '=' literal ';'
	;

// switch para tipos
type
	: STRING
	| INT
	| FLOAT
	| BOOL
	;

// definição de função
function
	: ID '(' (arg (',' arg)*)?')' ':' type  funcBody;

// definiçao de parametro formal
arg
	: type ID ('=' literal)?
	;

// definição do bloco principal
mainFunction
	: 'main' '(' ')' funcBody
	;

// corpo de função
funcBody
	: '{' (variable|constant)* stmt* '}'
	;

// statement de retorno
returnStmt
	: 'return' '(' bool ')'
	;

// switch de statement
stmt
	: assign ';'
	| functionCall ';'
	| returnStmt ';'
	| ifStmt
	| forStmt
	| whileStmt
	| exitStmt ';'
	;

functionCall
	: ID '(' (bool (',' bool)*)? ')'
	;


// statement exit (equivalente ao break do java, c, python e etc)
exitStmt
	: 'exit'
	;

// statement if
ifStmt
	: 'if' '(' bool ')' block ('else' block )?
	;

// statement for
forStmt
	: 'for' '(' ID '=' (ID|INT_LITERAL) ':' (ID|INT_LITERAL) ('step' INT_LITERAL)? ')' block
	;

// statement while
whileStmt
	: 'while' '(' bool ')' block
	;

// usado no if, for e while
block
	: '{' (stmt)* '}'
	;

// operação de atribuição
assign
	: ID '=' bool
	;

// switch (em caso de adição dos operadores 'e' e 'ou' )
bool
	: relOp
	;

// operadores relacionais
relOp
	: eqOp '>' eqOp
	| eqOp '>=' eqOp
	| eqOp '<' eqOp
	| eqOp '<=' eqOp
	| eqOp
	;

// operadores de igualdades (desigualdade)
eqOp
	: expr '==' expr
	| expr '!=' expr
	| expr '<>' expr
	| expr
	;

// adição e subtração
expr
	: expr '+' term
	| expr '-' term
	| term
	;

// multiplicação e divisão
term
	: term '*' unary
	| term '/' unary
	| unary
	;

// operadores unarios
unary
	: '!' unary
	| '-' unary
	| factor
	;

// fator
factor
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
