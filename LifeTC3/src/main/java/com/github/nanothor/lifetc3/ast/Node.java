package com.github.nanothor.lifetc3.ast;

/**
 * Classe responsável por representar o No da arvore
 * 
 * @author Anderson
 */
// no generico da ast
public class Node {
	String name;
	protected Type type;

	public Node() {
		name = getClass().getName();
	}

	public Type getType() {
		return type;
	}
}
