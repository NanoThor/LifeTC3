package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

import com.github.nanothor.lifetc3.table.ArgInfo;
import com.github.nanothor.lifetc3.table.Entry;
import com.github.nanothor.lifetc3.table.Entry.EntryType;
import com.github.nanothor.lifetc3.table.Table;
import com.github.nanothor.lifetc3.table.VarInfo;

public class VarNode extends Node {
	private String varName;

	public VarNode(String varName, Type type) {
		this.varName = varName;
		this.type = type;
	}

	@Override
	public void visit(PrintStream ps) {
		Entry entry = Table.get(varName, scopeAccessor);
		if (entry.getType() == EntryType.ARG) {
			ArgInfo info = (ArgInfo) entry.getInfo();
			switch (info.getType()) {
			case BOOLEAN:
			case INT:
				ps.println("            iload " + info.getAddress());
				break;
			case FLOAT:
				ps.println("            fload " + info.getAddress());
				break;
			case STRING:
				ps.println("            aload " + info.getAddress());
				break;
			default:
				throw new RuntimeException("Erro Interno!");
			}
		}
		if (entry.getType() == EntryType.VAR) {
			VarInfo info = (VarInfo) entry.getInfo();
			switch (info.getScope()) {
			case LOCAL:
				switch (info.getType()) {
				case BOOLEAN:
				case INT:
					ps.println("            iload " + info.getAdrress());
					break;
				case FLOAT:
					ps.println("            fload " + info.getAdrress());
					break;
				case STRING:
					ps.println("            aload " + info.getAdrress());
					break;
				default:
					throw new RuntimeException("Erro Interno!");
				}
				break;
			case GLOBAL:
				switch (info.getType()) {
				case BOOLEAN:
				case INT:
					ps.println("            getfield " + info.getAdrress() + " I");
					break;
				case FLOAT:
					ps.println("            getfield " + info.getAdrress() + " F");
					break;
				case STRING:
					ps.println("            getfield " + info.getAdrress() + " Ljava/lang/String;");
					break;
				default:
					throw new RuntimeException("Erro Interno!");
				}
				break;
			default:
				throw new RuntimeException("Erro Interno!");
			}
		}
	}
}
