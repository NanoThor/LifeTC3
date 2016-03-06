package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

//no da ast para exit(break) de loops
public class ExitStmt extends Node {

	public ExitStmt() {
		// System.out.println(this);
	}

	@Override
	public String toString() {
		return "ExitStmt []";
	}

	@Override
	public void visit(PrintStream ps) {
		ps.println("TODO");
	}
}
