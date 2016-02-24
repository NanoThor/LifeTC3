package com.github.nanothor.lifetc3.ast;

public class ConstNode extends Node {
	private String constName;

	public ConstNode(String constName, Type type) {
		this.constName = constName;
		this.type = type;
	}
}
