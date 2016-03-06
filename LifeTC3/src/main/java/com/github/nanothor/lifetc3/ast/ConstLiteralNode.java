package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

/**
 * Representa as constantes literais na AST
 * 
 * @author Anderson
 */
public class ConstLiteralNode extends Node {
	private String value;

	public ConstLiteralNode(Type type, String value) {
		this.type = type;
		this.value = value;
	}

	@Override
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("ldc "+ value);
	}
}
