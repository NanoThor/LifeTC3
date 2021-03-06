package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;
import java.util.LinkedList;

/**
 * Classe responsável por representar o No da arvore
 * 
 * @author Anderson
 */
// no generico da ast
public abstract class Node {
	protected static LinkedList<Integer> scopeAccessor;
	protected static final boolean debug = true;

	String name;
	protected Type type = Type.TYPE_ERROR;
	protected String retAddr;

	static long counter = 0;

	public Node() {
		name = getClass().getName();
		retAddr = "$" + counter;
		++counter;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public abstract void visit(PrintStream ps);
}
