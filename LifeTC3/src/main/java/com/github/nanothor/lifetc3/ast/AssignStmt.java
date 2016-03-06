package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

import com.github.nanothor.lifetc3.table.Entry;
import com.github.nanothor.lifetc3.table.Table;
import com.github.nanothor.lifetc3.table.VarInfo;

// no da ast para atribuição
public class AssignStmt extends Node {
	private Node val;
	private String var;

	public AssignStmt(String var, Node val) {
		this.var = var;
		this.val = val;
	}

	@Override
	public void visit(PrintStream ps) {
		Entry entry = Table.get(var, scopeAccessor);
		VarInfo varInfo = (VarInfo) entry.getInfo();

		val.visit(ps);

		switch (varInfo.getScope()) {
		case LOCAL:
			emmitForLocalVar(ps, varInfo);
			break;
		case GLOBAL:
			emmitForGlobalVar(ps, varInfo);
			break;
		default:
			break;
		}
	}

	private void emmitForGlobalVar(PrintStream ps, VarInfo varInfo) {
		switch (varInfo.getType()) {
		case BOOLEAN:
		case INT:
			ps.println("            putfield " + var + " I");
			break;
		case FLOAT:
			ps.println("            putfield " + var + " F");
			break;
		case STRING:
			ps.println("            putfield " + var + " Ljava/lang/String;");
			break;
		default:
			throw new RuntimeException("Erro Interno!");
		}
	}

	private void emmitForLocalVar(PrintStream ps, VarInfo varInfo) {
		ps.println("; visitar variável");
		switch (varInfo.getType()) {
		case BOOLEAN:
		case INT:
			ps.println("            istore " + varInfo.getAdrress());
			break;
		case FLOAT:
			ps.println("            fstore " + varInfo.getAdrress());
			break;
		case STRING:
			ps.println("            astore " + varInfo.getAdrress());
			break;
		default:
			throw new RuntimeException("Erro Interno!");
		}
	}
}
