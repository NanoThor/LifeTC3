package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

public class VarNode extends Node {
	private String varName;

	public VarNode(String varName, Type type) {
		this.varName = varName;
		this.type = type;
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("TODO");
	}
}
