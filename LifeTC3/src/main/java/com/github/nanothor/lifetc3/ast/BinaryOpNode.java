package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

/**
 * Classe responsável por representa Operações binários na AST
 * 
 * @author Anderson
 */
public class BinaryOpNode extends Node {
	private BinaryOperation op;
	private Node left;
	private Node right;

	private static long labelCounter = 0;

	public BinaryOpNode(BinaryOperation op, Node left, Node right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public BinaryOperation getOp() {
		return op;
	}

	public void setOp(BinaryOperation op) {
		this.op = op;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BinaryOpNode [op=" + op + ", left=" + left + ", right=" + right + "]";
	}

	@Override
	public void visit(PrintStream ps) {
		left.visit(ps);
		right.visit(ps);
		
		switch (op) {
		case ADD:
			ps.println(getTypedOperation("add", left.getType()));
			break;
		case SUB:
			ps.println(getTypedOperation("sub", left.getType()));
			break;
		case MUL:
			ps.println(getTypedOperation("mul", left.getType()));
			break;
		case DIV:
			ps.println(getTypedOperation("div", left.getType()));
			break;
		default:
			throw new RuntimeException("Erro Interno. Operação não reconhecida.");
		}
	}
	
	public String getTypedOperation(String sufix, Type type){
		switch (type) {
		case INT:
			return "i" + sufix;  
		case FLOAT:
			return "f" + sufix;
		default:
			throw new RuntimeException("Erro Interno. Tipo não definido.");
		}
	}
}
