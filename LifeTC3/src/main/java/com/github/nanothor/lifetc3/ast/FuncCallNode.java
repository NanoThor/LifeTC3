package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

import com.github.nanothor.lifetc3.table.FuncInfo;

//no da ast para chamada de função
public class FuncCallNode extends SeqNode {
	private FuncInfo info;

	public FuncCallNode() {

	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("TODO");
	}

	public FuncInfo getInfo() {
		return info;
	}

	public void setInfo(FuncInfo info) {
		this.info = info;
	}
}
