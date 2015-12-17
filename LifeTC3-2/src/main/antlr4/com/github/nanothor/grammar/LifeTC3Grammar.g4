grammar LifeTC3Grammar;

prog
	: CLASS ID
	;
	
CLASS: 'class';
ID: [a-zA-Z][a-zA-Z0-9_]*;


SL_COMMENT: '//' (~[\n])* -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \n\\r\t] -> skip;