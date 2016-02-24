package com.github.nanothor.lifetc3.ast;

public class FunctionNode extends SeqNode {
	public String function;

	public FunctionNode(String funcName) {
		function = funcName;
	}
}
