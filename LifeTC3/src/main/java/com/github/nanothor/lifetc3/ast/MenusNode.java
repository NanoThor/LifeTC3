package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

/**
 * Representa a operação menos unario na AST
 * 
 * @author Anderson
 * 
 */
// no da ast para menos unario
public class MenusNode extends Node {
	private Node n;

	public MenusNode(Node n) {
		this.n = n;
		this.type = n.getType();
	}

	public Node getN() {
		return n;
	}

	public void setN(Node n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "MenusNode [n=" + n + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		n.visit(ps);
		ps.println("; Minus Unary");
		switch (n.type) {
		case INT:
			ps.println("            ineg");
			break;
		case FLOAT:
			ps.println("            fneg");
			break;
		default:
			throw new RuntimeException("Erro Interno!");
		}
	}
}
