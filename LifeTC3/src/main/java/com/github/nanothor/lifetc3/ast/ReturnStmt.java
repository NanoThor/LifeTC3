package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

//no da ast para o comando return
public class ReturnStmt extends Node {

	private Node ret;

	public ReturnStmt(Node ret) {
		this.ret = ret;

		// System.out.println(this);
	}

	@Override
	public String toString() {
		return "ReturnStmt [ret=" + ret + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		ret.visit(ps);
		switch (ret.type) {
		case INT:
		case BOOLEAN:
			ps.println("            ireturn");
			break;
		case FLOAT:
			ps.println("            freturn");
			break;
		case STRING:
			ps.println("            areturn");
			break;
		default:
			ps.println("            return");
			break;
		}
	}
}
