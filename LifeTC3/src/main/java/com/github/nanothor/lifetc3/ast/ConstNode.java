package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

import com.github.nanothor.lifetc3.table.ConstInfo;
import com.github.nanothor.lifetc3.table.Entry;
import com.github.nanothor.lifetc3.table.Table;

public class ConstNode extends Node {
	private String constName;

	public ConstNode(String constName, Type type) {
		this.constName = constName;
		this.type = type;
	}

	@Override
	public void visit(PrintStream ps) {
		Entry entry = Table.get(constName, scopeAccessor);
		ConstInfo info = ((ConstInfo) entry.getInfo());
		ps.println("; ConstNode");
		ps.println("            ldc " + info.getValue());
	}
}
