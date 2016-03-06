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
		this.setN(n);

		// System.out.println(this);
	}

	public Node getN() {
		return n;
	}

	public void setN(Node n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "NotNode [n=" + n + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("TODO");
	}
}
