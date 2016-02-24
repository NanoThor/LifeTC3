package com.github.nanothor.lifetc3.ast;

public class VarNode extends Node {
	private String varName;

	public VarNode(String varName, Type type) {
		this.varName = varName;
		this.type = type;
	}
}
