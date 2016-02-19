package com.github.nanothor.lifetc3.ast;

/**
 * Representa as constantes literais na AST
 * 
 * @author Anderson
 */
public class ConstLiteralNode extends Node {
    private Type type;
    private String value;

    public ConstLiteralNode(Type type, String value) {
        this.type = type;
        this.value = value;
        
        System.out.printf("ConstLiteralNode(%s, %s)\n", type, value);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
