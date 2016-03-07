package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

//no da ast para o comando while
public class WhileStmt extends Node {

	private Node cond;
	private Node cmds;

	private static long labels = 0;
	
	public WhileStmt(Node cond, Node cmds) {
		this.cond = cond;
	}

	@Override
	public void visit(PrintStream ps) {
		String label0 = "whilelabel"+(labels++)+":";
		String label1= "whilelabel"+(labels++)+":";
		
		ps.println(label0);
		cond.visit(ps);
		ps.println("            ldc 1");
		ps.println("            ifne "+label1);
		cmds.visit(ps);
		ps.println("            goto "+label0);
		ps.println(label1);
	}
}
