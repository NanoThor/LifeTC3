package com.github.nanothor.lifetc3.ast;

/**
 * Representa a operação menos unario na AST
 * 
 * @author Anderson
 * 
 */
// no da ast para menos unario
public class MenusNode extends Node {
    private Node n;

    public MenusNode(Node n) {
        this.n = n;
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
        return "MenusNode [n=" + n + "]";
    }

}
