package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

/**
 * Representa na AST a operação 'not'
 * 
 * @author Anderson
 */
public class NotNode extends Node {
	private Node n;

	public NotNode(Node n) {
		this.n = n;
		this.type = Type.BOOLEAN;
	}

	@Override
	public String toString() {
		return "NotNode [n=" + n + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("; Not");
		ps.print("            ldc 1");
		ps.print("            ixor");

	}
}
