package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

//no da ast para comando if
public class IfStmt extends Node {
	// para a condição
	private Node condition;
	// para o then
	private Node then;
	// para o else
	private Node elze;

	public IfStmt(Node condition, Node then, Node elze) {
		this.condition = condition;
		this.then = then;
		this.elze = elze;

		// System.out.println(this);
	}

	@Override
	public String toString() {
		return "IfStmt [condition=" + condition + ", then=" + then + ", elze=" + elze + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("TODO");
	}
}
