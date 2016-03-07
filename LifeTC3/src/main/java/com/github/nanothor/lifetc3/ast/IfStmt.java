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
		String label1 = "iflabel" + (label++);
		String label2 = "iflabel" + (label++);

		condition.visit(ps);

		if (debug)
			ps.println("; If Stmt");

		switch (condition.getType()) {
		case FLOAT:
			ps.println("            f2i ");
		case BOOLEAN:
		case INT:
			ps.println("            ifeq " + label1);
			break;
		case STRING:
			ps.println("            ldc \"\"");
			ps.println("            if_acmpeq " + label1);
			break;
		default:
			throw new RuntimeException("Erro Interno!");
		}

		then.visit(ps);

		if (elze != null) {
			ps.println("            goto " + label2);
			ps.println(label1);
			elze.visit(ps);
			ps.println(label2);
		} else {
			ps.println(label1);
		}
	}
}
