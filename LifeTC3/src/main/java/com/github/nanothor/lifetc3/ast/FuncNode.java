package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;
import java.util.LinkedList;

import com.github.nanothor.lifetc3.table.FuncInfo;

//no da ast para implementação de função
public class FuncNode extends SeqNode {
	private FuncInfo info;

	public FuncInfo getInfo() {
		return info;
	}

	public void setInfo(FuncInfo info) {
		this.info = info;
	}

	@Override
	public void visit(PrintStream ps) {
		System.out.println("Fazer pre e pos função");

		LinkedList<Integer> ea = scopeAccessor;
		scopeAccessor = info.getScopeAccessor();

		super.visit(ps);

		scopeAccessor = ea;
	}
}
