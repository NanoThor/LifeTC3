package com.github.nanothor.lifetc3.table;

import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

import com.github.nanothor.lifetc3.ast.Type;

public class FuncDesc {
    private Type returnType;
    private List<Type> param;
    private List<Pair<Type, String>> optParams;

    public FuncDesc(Type returnType, List<Type> param,
            List<Pair<Type, String>> optParams) {
        super();
        this.returnType = returnType;
        this.param = param;
        this.optParams = optParams;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<Type> getParam() {
        return param;
    }

    public List<Pair<Type, String>> getOptParams() {
        return optParams;
    }
}
