package com.github.nanothor.lifetc3;

public class BinaryOpNode extends Node{
    private BinaryOperation op;
    private Node left;
    private Node right;

    public BinaryOpNode(BinaryOperation op, Node left, Node right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public BinaryOperation getOp() {
        return op;
    }

    public void setOp(BinaryOperation op) {
        this.op = op;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}