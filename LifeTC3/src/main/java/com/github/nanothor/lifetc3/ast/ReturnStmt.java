package com.github.nanothor.lifetc3.ast;

//no da ast para o comando return
public class ReturnStmt extends Node {

    private Node ret;

    public ReturnStmt(Node ret) {
        this.ret = ret;

        // System.out.println(this);
    }

    @Override
    public String toString() {
        return "ReturnStmt [ret=" + ret + "]";
    }
}
