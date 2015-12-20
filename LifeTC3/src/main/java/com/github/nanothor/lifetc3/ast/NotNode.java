package com.github.nanothor.lifetc3.ast;

/**
 * Representa na AST a operação 'not'
 * 
 * @author Anderson
 */
public class NotNode extends Node {
    private Node n;

    public NotNode(Node n) {
        this.setN(n);
    }

    public Node getN() {
        return n;
    }

    public void setN(Node n) {
        this.n = n;
    }
}
