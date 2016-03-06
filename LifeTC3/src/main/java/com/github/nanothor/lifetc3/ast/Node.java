package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

/**
 * Classe responsável por representar o No da arvore
 * 
 * @author Anderson
 */
// no generico da ast
public abstract class Node {
	String name;
	protected Type type;
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

	public abstract void visit(PrintStream ps);
}
