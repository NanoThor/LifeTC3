package com.github.nanothor.lifetc3.ast;

import java.util.List;

//no da ast para comando if
public class IfStmt extends Node {
    // para a condição
    private Node condition;
    // para o then
    private List<Node> then;
    // para o else
    private List<Node> elze;

    public IfStmt(Node condition, List<Node> then, List<Node> elze) {
        super();
        this.condition = condition;
        this.then = then;
        this.elze = elze;

        // System.out.println(this);
    }

    @Override
    public String toString() {
        return "IfStmt [condition=" + condition + ", then=" + then + ", elze="
                + elze + "]";
    }

}
