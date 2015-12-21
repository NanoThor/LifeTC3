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

        // System.out.println(this);
    }

    public Node getN() {
        return n;
    }

    public void setN(Node n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "NotNode [n=" + n + "]";
    }

}
