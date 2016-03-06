grammar LifeTC3Grammar;

@parser::header
{
	import com.github.nanothor.lifetc3.ast.Node;
	import com.github.nanothor.lifetc3.ast.Type;
}

// regra inicial
prog
returns [Node n]
	: classHead classBody EOF
	;

classHead
returns [com.github.nanothor.lifetc3.table.ClassInfo classInfo]
	: CLASS name=ID ';'
	;

classBody
returns [Node n]
	: (varDecl|constDecl)* funcDecl* mainFunction
	;

// switch para constantes literais
literal
returns [Node n]
	: INT_LITERAL         # IntLiteralL
	| FLOAT_LITERAL       # FloatLiteralL
	| STRING_LITERAL      # StringLiteralL
	| v=TRUE              # BoolLiteralL
	| v=FALSE             # BoolLiteralL
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
	: STRING        # StringL
	| INT           # IntL
	| FLOAT         # FloatL
	| BOOL          # BoolL
	;

// definição de função
funcDecl
returns [Node n]
	: funcHead  funcBody;

funcHead
returns [com.github.nanothor.lifetc3.table.FuncInfo info]
    : name=ID '(' (arg (',' arg)*)?')' ':' type
    ;

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
returns [Node n]
	: '{' (varDecl|constDecl)* stmt* '}'
	;

// statement de retorno
returnStmt
returns [Node n]
	: 'return' '(' ret=bool ')'
	;

// switch de statement
stmt
returns [Node n]
	: assign ';'          # FromAssignToStmtL
	| functionCall ';'    # FromFunctionCallToStmtL
	| returnStmt ';'      # FromReturnStmtToStmtL
	| ifStmt              # FromIfStmtToStmtL
	| forStmt             # FromForStmtToStmtL
	| whileStmt           # FromWhileStmtToStmtL
	| exitStmt ';'        # FromExitStmtToStmtL
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
returns [Node n]
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
	: l=eqOp op='>'  r=eqOp # GtOperationL
	| l=eqOp op='>=' r=eqOp # GeOperationL
	| l=eqOp op='<'  r=eqOp # LtOperationL
	| l=eqOp op='<=' r=eqOp # LeOperationL
	| eqOp                # FromEqOpToRelOpL
	;

// operadores de igualdades (desigualdade)
eqOp
returns [Node n]
	: l=expr op='==' r=expr # EqOperationL
	| l=expr op='!=' r=expr # DiffOperationL
	| l=expr op='<>' r=expr # DiffOperationL
	| l=expr                # FromExprToEqOpL
	;

// adição e subtração
expr
returns [Node n]
	: l=expr op='+' r=term  # AddOperationL
	| l=expr op='-' r=term  # SubOperationL
	| u=term                # FromTermToExprL
	;

// multiplicação e divisão
term
returns [Node n]
	: l=term op='*' r=unary   # MulOperationL
	| l=term op='/' r=unary   # DivOperationL
	| u=unary                 # FromUnaryToTermL
	;

// operadores unarios
unary
returns [Node n]
	: op='!' r=unary  # NotOperationL
	| op='-' r=unary  # MinusOperationL
	| u=factor        # FromFactorToUnaryL
	;

// fator
factor
returns [Node n]
	: '(' bool ')'    # FromBoolToFactorL
	| ID              # VarConstUseL
	| 
	functionCall    # FunctionCallL
	| literal         # LiteralL
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
