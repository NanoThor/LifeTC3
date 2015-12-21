package com.github.nanothor.lifetc3.ast;

// no da ast para atribuição
public class AssignStmt extends Node {

    private Node val;
    private String var;

    public AssignStmt(String var, Node val) {
        this.var = var;
        this.val = val;

        // System.out.println(this);
    }

    @Override
    public String toString() {
        return "AssignStmt [val=" + val + ", var=" + var + "]";
    }
}
