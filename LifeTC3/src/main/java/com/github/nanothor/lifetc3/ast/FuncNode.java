package com.github.nanothor.lifetc3.ast;

import java.util.List;

//no da ast para implementação de função
public class FuncNode extends Node {
    private List<Node> nodes;

    public FuncNode(List<Node> ns) {
        nodes = ns;

        // System.out.println(this);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "FuncNode [nodes=" + nodes + "]";
    }
}
