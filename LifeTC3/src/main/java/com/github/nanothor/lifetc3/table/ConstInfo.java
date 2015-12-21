package com.github.nanothor.lifetc3.table;

import com.github.nanothor.lifetc3.ast.Type;

// Informações sobre constantes.
public class ConstInfo extends Info {
    private Type type;
    private String value;

    public ConstInfo(Type type, String value) {
        this.type = type;
        this.value = value;
    }
    
    public Type getType() {
        return type;
    }
    
    public String getValue() {
        return value;
    }
}
