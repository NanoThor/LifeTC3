package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

import com.github.nanothor.lifetc3.table.Entry;
import com.github.nanothor.lifetc3.table.Table;
import com.github.nanothor.lifetc3.table.VarInfo;

//no da ast para o comando for
public class ForStmt extends Node {
	String var;
	Node ini;
	Node fin;
	Node cmds;

	private static long label = 0;
	
	public ForStmt(String var, Node ini, Node fin, Node cmds) {
		super();
		this.var = var;
		this.ini = ini;
		this.fin = fin;
		this.cmds = cmds;

		// System.out.println(this);
	}

	@Override
	public String toString() {
		return "ForStmt [var=" + var + ", ini=" + ini + ", fin=" + fin + ", cmds=" + cmds + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		Entry entry = Table.get(var, scopeAccessor);
		VarInfo varInfo = (VarInfo) entry.getInfo();
		Integer controlAddr = varInfo.getAdrress();
		String label0 = "forlabel"+(label++)+":";
		String label1 = "forlabel"+(label++)+":";
		
		
		ini.visit(ps);
		System.out.println("            istore "+controlAddr);
		System.out.println(label0);
		System.out.println("            iload "+controlAddr);
		fin.visit(ps);
		System.out.println("            ifeq "+label1);
		cmds.visit(ps);
		System.out.println("            iload "+controlAddr);
		System.out.println("            ldc 1");
		System.out.println("            iadd");
		System.out.println("            istore "+controlAddr);
		System.out.println("            goto "+label0);
		System.out.println(label1);
		
	}
}
