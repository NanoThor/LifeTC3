package com.github.nanothor.lifetc3.ast;

//no da ast para exit(break) de loops
public class ExitStmt extends Node {

    public ExitStmt() {
        // System.out.println(this);
    }

    @Override
    public String toString() {
        return "ExitStmt []";
    }

}
