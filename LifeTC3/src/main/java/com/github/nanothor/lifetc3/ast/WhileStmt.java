package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

//no da ast para o comando while
public class WhileStmt extends Node {

	private Node cond;
	private Node cmds;

	public WhileStmt(Node cond, Node cmds) {
		this.cond = cond;
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("TODO");
	}
}
