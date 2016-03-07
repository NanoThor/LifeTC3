package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

//no da ast para comando if
public class IfStmt extends Node {
	// para a condição
	private Node condition;
	// para o then
	private Node then;
	// para o else
	private Node elze;

	private static long label;
	
	public IfStmt(Node condition, Node then, Node elze) {
		this.condition = condition;
		this.then = then;
		this.elze = elze;

		// System.out.println(this);
	}

	@Override
	public String toString() {
		return "IfStmt [condition=" + condition + ", then=" + then + ", elze=" + elze + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		String label0 = "iflabel"+(label++)+":";
		
		ps.println("IFSTMT=============");
		condition.visit(ps);
		ps.println("            ldc 1");
		ps.println("            ifne "+label0);
		then.visit(ps);
		ps.println(label0);
		if(elze!=null)
			elze.visit(ps);
		
		
	}
}
