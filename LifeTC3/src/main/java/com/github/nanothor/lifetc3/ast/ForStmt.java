package com.github.nanothor.lifetc3.ast;

import java.util.List;

//no da ast para o comando for
public class ForStmt extends Node {
    String var;
    Node ini;
    Node fin;
    List<Node> cmds;

    public ForStmt(String var, Node ini, Node fin, List<Node> cmds) {
        super();
        this.var = var;
        this.ini = ini;
        this.fin = fin;
        this.cmds = cmds;

        // System.out.println(this);
    }

    @Override
    public String toString() {
        return "ForStmt [var=" + var + ", ini=" + ini + ", fin=" + fin
                + ", cmds=" + cmds + "]";
    }
}
