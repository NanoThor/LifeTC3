grammar Grammar01;

options { 

}

//======================================
// RULES ===============================
//======================================

entry
    :(statment)* EOF
    ;

statment
    : expression_stat;

expression_stat: exp EOL;

exp: assignment_exp;

assignment_exp
    : conditional_exp
    | ID assignment_operator assignment_exp
    ;

assignment_operator
    : (ASSIGN_OP | ASSIGN_MUL | ASSIGN_DIV | ASSIGN_MOD | ASSIGN_ADD | ASSIGN_SUB)
    ;

conditional_exp
    : logical_or_exp
    | logical_or_exp '?' exp ':' conditional_exp
    ;

logical_or_exp
    : logical_and_exp
    | logical_or_exp L_OR logical_or_exp
    ;

logical_and_exp
    : inclusive_or_exp
    | logical_and_exp L_AND logical_and_exp
    ;

inclusive_or_exp
    : exclusive_or_exp
    | inclusive_or_exp B_OR inclusive_or_exp
    ;

exclusive_or_exp
    : and_exp
    | exclusive_or_exp B_XOR exclusive_or_exp
    ;

and_exp
    : equality_exp
    | and_exp B_AND and_exp
    ;
    
equality_exp
    : relational_exp
    | equality_exp EQUAL equality_exp
    | equality_exp DIFF equality_exp
    ;

relational_exp
    : shift_exp
    | relational_exp MORE_THAN relational_exp
    | relational_exp LESS_THAN relational_exp
    | relational_exp MORE_THAN_OR_EQUAL relational_exp
    | relational_exp LESS_THAN_OR_EQUAL relational_exp
    ;

shift_exp
    : additive_exp
    | shift_exp LSHIFT shift_exp
    | shift_exp RSHIFT shift_exp
    ;

additive_exp
    : mult_exp
    | additive_exp ADD mult_exp
    | additive_exp SUB mult_exp
    ;

mult_exp
    : primary_exp
    | mult_exp MUL primary_exp
    | mult_exp DIV primary_exp
    ;

primary_exp
    : ID
    | CONST
    | LPARENS exp RPARENS
    ;


 

//======================================
// TOKENS ==============================
//======================================
RESERVED_WORD
    :	RW_IF
	|	RW_ELSE
	|	RW_FUNCTION
	|	RW_PRINT
	|	RW_RETURN
	|	RW_THEN
	;

// SYMBOLS ======================

RW_IF: 'if';
RW_THEN: 'then';
RW_ELSE: 'else';
RW_FUNCTION: 'function';
RW_PRINT: 'print';
RW_RETURN: 'return';

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
DIFF: '!=1';
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
LPARENS: '(';
RPARENS: ')';
ID: [a-zA-Z][a-zA-Z0-9]* ;
CONST: [0-9]+ ;
EOL: ';';
//INVALID: .;
WS  : [ \t\n\r] -> channel(HIDDEN);