package com.github.nanothor.lifetc3.ast;

import java.util.ArrayList;
import java.util.List;

//no da ast para classe (programa)
public class ClassNode extends Node {
    List<Node> childs;

    public ClassNode() {
        childs = new ArrayList<Node>();

        // System.out.println(this);
    }

    public void add(Node n) {
        childs.add(n);
    }

    @Override
    public String toString() {
        return "ClassNode [childs=" + childs + "]";
    }
}
