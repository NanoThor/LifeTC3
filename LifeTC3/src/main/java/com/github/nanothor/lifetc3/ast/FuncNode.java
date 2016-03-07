package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;
import java.util.LinkedList;

import com.github.nanothor.lifetc3.table.ArgInfo;
import com.github.nanothor.lifetc3.table.Entry;
import com.github.nanothor.lifetc3.table.FuncInfo;
import com.github.nanothor.lifetc3.table.Table;

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
		// para gerar o nome;
		StringBuilder builder = new StringBuilder();
		builder.setLength(0);
		builder.append('_');
		builder.append(info.getFunctionName());

		for (String e : info.getArgNames()) {
			Entry entry = Table.get(e, info.getScopeAccessor().peek());
			builder.append('_');
			builder.append(((ArgInfo) entry.getInfo()).getType().toString().toLowerCase());
		}

		builder.append('_');
		builder.append(info.getArgNames().size());
		String funcName = builder.toString();

		// para gerar o descritor
		builder.setLength(0);
		for (String e : info.getArgNames()) {
			Entry entry = Table.get(e, info.getScopeAccessor().peek());
			String ret = convertTypeToDesc(((ArgInfo) entry.getInfo()).getType());
			builder.append(ret);
		}

		String desc = builder.toString();
		String ret = convertTypeToDesc(info.getType());

		ps.println();
		ps.println(".method public " + funcName + "(" + desc + ")" + ret);

		LinkedList<Integer> ea = scopeAccessor;
		scopeAccessor = info.getScopeAccessor();
		super.visit(ps);
		scopeAccessor = ea;

		ps.println(".end method");
		info.setEmmitedCode(true);
	}

	private String convertTypeToDesc(Type t) {
		String ret;
		switch (t) {
		case STRING:
			ret = "Ljava/lang/String;";
			break;
		case BOOLEAN:
		case INT:
			ret = "I";
			break;
		case FLOAT:
			ret = "F";
			break;
		case TYPE_ERROR:
			ret = "V";
			break;
		default:
			throw new RuntimeException("Erro Interno!");
		}
		return ret;
	}
}
