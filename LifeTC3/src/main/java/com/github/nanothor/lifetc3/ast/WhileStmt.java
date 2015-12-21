package com.github.nanothor.lifetc3.ast;

import java.util.List;

//no da ast para o comando while
public class WhileStmt extends Node {

    private Node cond;
    private List<Node> cmds;

    public WhileStmt(Node cond, List<Node> cmds) {
        this.cond = cond;
        this.cmds = cmds;

        // System.out.println(this);
    }

    @Override
    public String toString() {
        return "WhileStmt [cond=" + cond + ", cmds=" + cmds + "]";
    }
}
