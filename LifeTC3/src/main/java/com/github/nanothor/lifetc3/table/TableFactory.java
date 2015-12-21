package com.github.nanothor.lifetc3.table;

import java.util.HashMap;
import java.util.Map;

// fabrica de tabela de simbolos (adicionado inicialmente funções built-in)
public class TableFactory {
    public Map<String, Entry> getTable() {
        Map<String, Entry> table = new HashMap<String, Entry>();
        table.put("read", new Entry("read", Entry.EntryType.FUNCTION, new FuncInfo()));
        table.put("print", new Entry("print", Entry.EntryType.FUNCTION, new FuncInfo()));
        return table;
    }
}
