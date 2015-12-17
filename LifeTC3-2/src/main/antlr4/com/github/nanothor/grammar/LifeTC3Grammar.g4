grammar LifeTC3Grammar;

prog
	: CLASS ID ';' (variable|constant)* EOF
	;

variable
	: VAR ID (',' ID)* ':' type ';'
	;

constant
	: type ID '='
		( INT_LITERAL
		| FLOAT_LITERAL
		| STRING_LITERAL
		| TRUE
		| FALSE
		) ';'
	;


type
	: STRING
	| INT
	| FLOAT
	| BOOL
	;

STRING: 'string';
INT: 'int';
FLOAT: 'float';
BOOL: 'boolean';

VAR: 'var';

CLASS: 'class';
TRUE: 'True';
FALSE: 'False';
ID: [a-zA-Z][a-zA-Z0-9_]*;

INT_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]+ '.' [0-9]+?;
STRING_LITERAL: '"' (.)*? '"';

SL_COMMENT: '//' (~[\n])* -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \n\r\t] -> skip;
