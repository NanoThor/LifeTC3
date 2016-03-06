package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

public class ConstNode extends Node {
	private String constName;

	public ConstNode(String constName, Type type) {
		this.constName = constName;
		this.type = type;
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("TODO");
	}
}
