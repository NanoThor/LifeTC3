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
	: ID '(' (arg (',' arg)*)?')' ':' type  funcBlock;

// definiçao de parametro formal
arg
	: type ID ('=' literal)?
	;

// definição do bloco principal
mainFunction
	: 'main' funcBlock
	;

// corpo de função
funcBlock
	: '{' (variable|constant)* stmt* '}'
	;


stmt
	: assign ';'
	;

assign
	: ID '=' bool
	;
	
bool
	: relOp
	;


relOp
	: eqOp '>' eqOp
	| eqOp '>=' eqOp
	| eqOp '<' eqOp
	| eqOp '<=' eqOp
	| eqOp
	;

eqOp
	: expr '==' expr
	| expr '!=' expr
	| expr '<>' expr
	| expr
	;

expr
	: expr '+' term
	| expr '-' term
	| term
	;

term
	: term '*' unary
	| term '/' unary
	| unary
	;

unary
	: '!' unary
	| '-' unary
	| factor
	;

factor
	: '(' bool ')'
	| ID
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
