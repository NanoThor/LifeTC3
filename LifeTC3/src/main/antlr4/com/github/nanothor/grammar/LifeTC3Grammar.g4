grammar LifeTC3Grammar;

@parser::header {
	import com.github.nanothor.lifetc3.ast.*;
}

// regra inicial
prog
	: CLASS ID ';' (varDecl|consDecl)* function* mainFunction EOF
	;

// switch para constantes literais
literal
returns [Node n]
	: t=INT_LITERAL		{ $n = new ConstLiteralNode(Type.INT,     $t.getText()); }
	| t=FLOAT_LITERAL	{ $n = new ConstLiteralNode(Type.FLOAT,   $t.getText()); }
	| t=STRING_LITERAL	{ $n = new ConstLiteralNode(Type.STRING,  $t.getText()); }
	| t=TRUE			{ $n = new ConstLiteralNode(Type.BOOLEAN, $t.getText()); }
	| t=FALSE			{ $n = new ConstLiteralNode(Type.BOOLEAN, $t.getText()); }
	;

// declaração de variáveis
varDecl
	: VAR ID (',' ID)* ':' type ';'
	;

// declaração de constantes
consDecl
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
	: '{' (varDecl|consDecl)* stmt* '}'
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
returns [Node n]
	: u=relOp  { $n = $u.n; }
	;

// operadores relacionais
relOp
returns [Node n]
	: l=eqOp '>'  r=eqOp { $n = new BinaryOpNode(BinaryOperation.GT , $l.n, $r.n); } 
	| l=eqOp '>=' r=eqOp { $n = new BinaryOpNode(BinaryOperation.GTE, $l.n, $r.n); }
	| l=eqOp '<'  r=eqOp { $n = new BinaryOpNode(BinaryOperation.LT , $l.n, $r.n); }
	| l=eqOp '<=' r=eqOp { $n = new BinaryOpNode(BinaryOperation.LTE, $l.n, $r.n); }
	| u=eqOp { $n = $u.n; }
	;

// operadores de igualdades (desigualdade)
eqOp
returns [Node n]
	: l=expr '==' r=expr { $n = new BinaryOpNode(BinaryOperation.EQ, $l.n, $r.n); }
	| l=expr '!=' r=expr { $n = new BinaryOpNode(BinaryOperation.NE, $l.n, $r.n); }
	| l=expr '<>' r=expr { $n = new BinaryOpNode(BinaryOperation.NE, $l.n, $r.n); }
	| u=expr { $n = $u.n; }
	;

// adição e subtração
expr
returns [Node n]
	: l=expr '+' r=term { $n = new BinaryOpNode(BinaryOperation.ADD, $l.n, $r.n); }
	| l=expr '-' r=term { $n = new BinaryOpNode(BinaryOperation.SUB, $l.n, $r.n); }
	| u=term { $n = $u.n; }
	;

// multiplicação e divisão
term
returns [Node n]
	: l=term '*' r=unary { $n = new BinaryOpNode(BinaryOperation.MUL, $l.n, $r.n); }
	| l=term '/' r=unary { $n = new BinaryOpNode(BinaryOperation.DIV, $l.n, $r.n); }
	| u=unary { $n = $u.n; }
	;

// operadores unarios
unary
returns [Node n]
	: '!' unary	{ $n = new NotNode($unary.n); }
	| '-' unary	{ $n = new MenusNode($unary.n); }
	| factor	{ $n = $factor.n; }
	;

// fator
factor
returns [Node n]
	: '(' bool ')'	{ $n = null; }
	| ID			{ $n = null; }
	| functionCall	{ $n = null; }
	| literal		{ $n = $literal.n; }
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
