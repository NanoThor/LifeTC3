package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;
import java.util.LinkedList;

import com.github.nanothor.lifetc3.table.FuncInfo;
import com.github.nanothor.lifetc3.util.Pair;

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

		int counter = 0;

		// para gerar o nome;
		StringBuilder builder = new StringBuilder();
		builder.setLength(0);
		builder.append('_');
		builder.append(info.getFunctionName());

		info.getArgs().forEach(e -> {
			builder.append('_');
			builder.append(e.first.toString().toLowerCase());
		});

		builder.append('_');
		builder.append(info.getArgs().size());
		String funcName = builder.toString();

		// para gerar o descritor
		builder.setLength(0);
		for (Pair<Type, String> e : info.getArgs()) {
			String ret = convertTypeToDesc(e.first);
			builder.append(ret);
		}

		String desc = builder.toString();
		String ret = convertTypeToDesc(type);

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
