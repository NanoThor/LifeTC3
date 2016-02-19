grammar AnalisysGrammar;

//entry: (RESERVED_WORD | IDENTIFIER | WHITESPACE | LITERAL_INT | LITERAL_FLOAT | LITERAL_CHAR | PARENS | BLOCK | OPERATORS)*;
entry: ;
//======================================
// TOKENS ==============================
//======================================


LITERAL_INT: NUMBER+;
LITERAL_FLOAT: NUMBER+('.' NUMBER+)?;
LITERAL_CHAR: '\'' .*? '\'';
LITERAL_STRING: '\"' .*? '\"';

PARENS
	: LPARENS
	| RPARENS
	;
	
BLOCK
	: LBRACKETS
	| RBRACKETS
	;


RESERVED_WORD
    :	RW_IF
	|	RW_ELSE
	|	RW_WHILE
	|	RW_RETURN
	|	RW_FOR
	|	RW_VAR
	|	RW_CLASS
	|	RW_STEP
	|	RW_EXIT
	|	RW_INT
	|	RW_FLOAT
	|	RW_STRING
	|	RW_BOOL
	;


OPERATORS
	: BINARY_OPERATORS
	| ASSIGNMENT_OPERATORS
	| LOGICAL_OPERATORS
	;

BINARY_OPERATORS
	: ADD
	| SUB
	| MUL
	| DIV
	;

ASSIGNMENT_OPERATORS
	: ASSIGN_ADD
	| ASSIGN_SUB
	| ASSIGN_MUL
	| ASSIGN_DIV
	| ASSIGN_MOD
	| ASSIGN_OP
	;

LOGICAL_OPERATORS
	: L_AND
	| L_OR
	| L_NEG
	| B_OR
	| B_XOR
	| B_AND
	| EQUAL
	| DIFF_1
	| DIFF_2
	| LESS_THAN
	| MORE_THAN
	| LESS_THAN_OR_EQUAL
	| MORE_THAN_OR_EQUAL
	| LSHIFT
	| RSHIFT
	;
	
IDENTIFIER: ID;
WHITESPACE: WS;
//===============================


// SYMBOLS ======================

RW_IF: 'if';
RW_ELSE: 'else';
RW_FOR: 'for';
RW_WHILE: 'while';
RW_RETURN: 'return';
RW_VAR: 'var';
RW_CLASS: 'class';
RW_STRING: 'string';
RW_FLOAT: 'float';
RW_INT: 'int';
RW_BOOL: 'boolean';
RW_EXIT: 'exit';
RW_STEP: 'step';

BLOCK_OPEN: '{';
BLOCK_CLOSE: '}';

// BINARY OPERATORS =============
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
// ==============================

// ASSIGNMENT OPERATORS =========
ASSIGN_OP: '=';
ASSIGN_MUL: '*=';
ASSIGN_DIV: '/=';
ASSIGN_MOD: '%=';
ASSIGN_ADD: '+=';
ASSIGN_SUB: '-=';
//===============================

// LOGICAL OPERATORS ============
L_NEG: '!';
L_AND: '&&';
L_OR: '||';
//===============================

// BITWISE LOGICAL OPERATORS ====
B_OR : '|';
B_XOR: '^';
B_AND: '&';
//===============================

// EQUALITY OPERATORS ===========
EQUAL: '==';
DIFF_1: '!=';
DIFF_2: '<>';
//===============================

// RELATIONAL OPERATORS =========
LESS_THAN: '<';
MORE_THAN: '>';
LESS_THAN_OR_EQUAL: '<=';
MORE_THAN_OR_EQUAL: '<=';
//===============================

// SHIFT OPERATORS ==============
LSHIFT: '<<';
RSHIFT: '>>';
//===============================

// PRAMARY ======================
LBRACKETS: '{';
RBRACKETS: '}';
LPARENS: '(';
RPARENS: ')';
ID: CHAR (NUMBER | CHAR)*;
NUMBER: [0-9]+;
CHAR: [a-zA-Z]+;
ANYCHAR: .;
EOL: ';';
//INVALID: .;
WS  : [ \t\n\r];