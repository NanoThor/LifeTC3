package com.github.nanothor.lifetc3.ast;

import java.util.ArrayList;
import java.util.List;

//no da ast para chamada de função
public class FuncCallStmt extends Node {
    List<Node> args;

    public FuncCallStmt() {
        args = new ArrayList<Node>();

        // System.out.println(this);
    }

    public void add(Node n) {
        args.add(n);
    }

    @Override
    public String toString() {
        return "FuncCallStmt [args=" + args + "]";
    }

}
