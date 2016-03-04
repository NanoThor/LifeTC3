package com.github.nanothor.lifetc3.codegen;

public enum Opcode {
	// Store
	STORE_I, STORE_F, STORE_B, STORE_S,
	// Add
	ADD_I, ADD_F,
	// Sub
	SUB_I, SUB_F,
	// Mul
	MUL_I, MUL_F,
	// Div
	DIV_I, DIV_F,
	// Jump Incondicional
	JMP,
	// Jumps Condicionais BOOLEANOS
	JEQ, JNE, JGT, JGTE, JLT, JLTE,
	// Jumps Condicionais para STRING
	JSEQ, JSNE, JSGT, JSGTE, JSLT, JSLTE,
	// Jumps Condicionais para INTEIRO
	JIEQ, JINE, JIGT, JIGTE, JILT, JILTE,
	// Jumps Condicionais para FLOAT
	JFEQ, JFNE, JFGT, JFGTE, JFLT, JFLTE,
	// No Operation
	NOP, 
}
