package com.github.nanothor.lifetc3;

import java.util.ArrayList;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.github.nanothor.grammar.LifeTC3GrammarBaseVisitor;
import com.github.nanothor.grammar.LifeTC3GrammarParser.AssignContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.BlockContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.BoolContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ConstDeclContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.EqOpContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ExitStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ExprContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FactorContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ForStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FuncBodyContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FuncDeclContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FunctionCallContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.IfStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.LiteralContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.MainFunctionContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ProgContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.RelOpContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ReturnStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.StmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.TermContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.UnaryContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.VarDeclContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.WhileStmtContext;
import com.github.nanothor.lifetc3.ast.AssignStmt;
import com.github.nanothor.lifetc3.ast.BinaryOpNode;
import com.github.nanothor.lifetc3.ast.BinaryOperation;
import com.github.nanothor.lifetc3.ast.ClassNode;
import com.github.nanothor.lifetc3.ast.ConstLiteralNode;
import com.github.nanothor.lifetc3.ast.ExitStmt;
import com.github.nanothor.lifetc3.ast.ForStmt;
import com.github.nanothor.lifetc3.ast.FuncCallStmt;
import com.github.nanothor.lifetc3.ast.FuncNode;
import com.github.nanothor.lifetc3.ast.IfStmt;
import com.github.nanothor.lifetc3.ast.MenusNode;
import com.github.nanothor.lifetc3.ast.Node;
import com.github.nanothor.lifetc3.ast.NotNode;
import com.github.nanothor.lifetc3.ast.ReturnStmt;
import com.github.nanothor.lifetc3.ast.Type;
import com.github.nanothor.lifetc3.ast.WhileStmt;
import com.github.nanothor.lifetc3.table.ConstInfo;
import com.github.nanothor.lifetc3.table.Entry;
import com.github.nanothor.lifetc3.table.Entry.EntryType;
import com.github.nanothor.lifetc3.table.FuncInfo;
import com.github.nanothor.lifetc3.table.Info;
import com.github.nanothor.lifetc3.table.Scope;
import com.github.nanothor.lifetc3.table.VarInfo;

public class TreeSynthesizer extends LifeTC3GrammarBaseVisitor<Object> {
    private Map<String, Entry> table;
    private Scope scope;

    public TreeSynthesizer(Map<String, Entry> table) {
        super();
        this.table = table;
    }

    @Override
    public Object visitProg(ProgContext ctx) {
        // adiciona o id da classe à tabela de simbolos
        {
            String id = ctx.ID().getText();
            table.put(id, new Entry(id, Entry.EntryType.CLASS, null));
        }

        // define o escopo para variáveis como global
        scope = Scope.GLOBAL;
        Object obj;
        ClassNode node = new ClassNode();
        int size = ctx.getChildCount();
        // 3 representa a primeira var. ou const. na parse tree
        for (int i = 3; i < size; ++i) {
            obj = visit(ctx.getChild(i));

            if (obj != null && obj instanceof Node) {
                node.add((Node) obj);
            }
        }

        ctx.n = node;
        
        System.out.println(ctx.n);

        return ctx.n;
    }

    // adiciona variáveis à tabela de simbolos
    @Override
    public Object visitVarDecl(VarDeclContext ctx) {
        for (TerminalNode idx : ctx.ID()) {
            String id = idx.getText();
            Info info = new VarInfo(ctx.type().t, scope);
            table.put(id, new Entry(id, EntryType.VAR, info));
        }

        return null;
    }

    // adiciona constantes à tabela de simbolos
    @Override
    public Object visitConstDecl(ConstDeclContext ctx) {
        String id = ctx.name.getText();
        Info info = new ConstInfo(ctx.type().t, ctx.value.getText());
        table.put(id, new Entry(id, EntryType.CONST, info));

        return null;
    }

    @Override
    public Object visitFuncDecl(FuncDeclContext ctx) {
        String id = ctx.name.getText();
        Info info = new FuncInfo();
        table.put(id, new Entry(id, EntryType.FUNCTION, info));

        scope = Scope.LOCAL;

        visitChildren(ctx);

        scope = Scope.GLOBAL;

        ctx.n = new FuncNode(ctx.funcBody().ns);

        return ctx.n;
    }

    @Override
    public Object visitFuncBody(FuncBodyContext ctx) {
        visitChildren(ctx);

        ctx.ns = new ArrayList<Node>();

        // adiciona todos os statement como filho da função
        for (StmtContext st : ctx.stmt()) {
            ctx.ns.add(st.n);
        }

//        System.out.println(ctx.ns);

        return null;
    }

    @Override
    public Object visitMainFunction(MainFunctionContext ctx) {
        // muda o escopo para local
        scope = Scope.LOCAL;
        visitChildren(ctx);
        // muda o escopo para global
        scope = Scope.GLOBAL;

        ctx.n = new FuncNode(ctx.funcBody().ns);

        return ctx.n;
    }

    @Override
    public Object visitStmt(StmtContext ctx) {
        visitChildren(ctx);
        // assign stmt
        if (ctx.assign() != null)
            ctx.n = ctx.assign().n;
        // function call stmt
        else if (ctx.functionCall() != null)
            ctx.n = ctx.functionCall().n;
        // return stmt
        else if (ctx.returnStmt() != null)
            ctx.n = ctx.returnStmt().n;
        // if stmt
        else if (ctx.ifStmt() != null)
            ctx.n = ctx.ifStmt().n;
        // for stmt
        else if (ctx.forStmt() != null)
            ctx.n = ctx.forStmt().n;
        // while stmt
        else if (ctx.whileStmt() != null)
            ctx.n = ctx.whileStmt().n;
        // exit stmt
        else if (ctx.exitStmt() != null)
            ctx.n = ctx.exitStmt().n;
        else
            throw new RuntimeException("Erro em stmt");

        return ctx.n;
    }

    @Override
    public Object visitForStmt(ForStmtContext ctx) {
        visitChildren(ctx);

        // adiciona a variável de conftrole do for à tabela de simbolos
        String varId = ctx.var.getText();
        Info info = new VarInfo(Type.INT, Scope.LOCAL);
        table.put(varId, new Entry(varId, EntryType.VAR, info));

        ctx.n = new ForStmt(varId, ctx.b.n, ctx.e.n, ctx.block().ns);
        return ctx.n;
    }

    @Override
    public Object visitIfStmt(IfStmtContext ctx) {
        visitChildren(ctx);

        ctx.n = new IfStmt(ctx.c.n, ctx.t.ns, ctx.e.ns);
        return ctx.n;
    }

    @Override
    public Object visitWhileStmt(WhileStmtContext ctx) {
        visitChildren(ctx);
        ctx.n = new WhileStmt(ctx.c.n, ctx.b.ns);
        return ctx.n;
    }

    @Override
    public Object visitExitStmt(ExitStmtContext ctx) {
        visitChildren(ctx);
        ctx.n = new ExitStmt();
        return ctx.n;
    }

    @Override
    public Object visitReturnStmt(ReturnStmtContext ctx) {
        visitChildren(ctx);
        ctx.n = new ReturnStmt(ctx.bool().n);
        return ctx.n;
    }

    @Override
    public Object visitAssign(AssignContext ctx) {
        visitChildren(ctx);
        ctx.n = new AssignStmt(ctx.l.getText(), ctx.e.n);
        return ctx.n;
    }

    @Override
    public Object visitFunctionCall(FunctionCallContext ctx) {
        visitChildren(ctx);
        ctx.n = new FuncCallStmt();
        for (BoolContext a : ctx.bool()) {
            ((FuncCallStmt) ctx.n).add(a.n);
        }
        return ctx.n;
    }

    @Override
    public Object visitBlock(BlockContext ctx) {
        visitChildren(ctx);

        ctx.ns = new ArrayList<Node>();

        // adiciona todos os statement como filho da função
        for (StmtContext st : ctx.stmt()) {
            ctx.ns.add(st.n);
        }

        return ctx.ns;
    }

    @Override
    public Object visitBool(BoolContext ctx) {
        visitChildren(ctx);
        ctx.n = ctx.relOp().n;
        return ctx.n;
    }

    @Override
    public Object visitRelOp(RelOpContext ctx) {
        visitChildren(ctx);
        if (ctx.op != null) {
            switch (ctx.op.getText()) {
            case ">":
                ctx.n = new BinaryOpNode(BinaryOperation.GT, ctx.l.n, ctx.r.n);
                break;
            case ">=":
                ctx.n = new BinaryOpNode(BinaryOperation.GTE, ctx.l.n, ctx.r.n);
                break;
            case "<":
                ctx.n = new BinaryOpNode(BinaryOperation.LT, ctx.l.n, ctx.r.n);
                break;
            case "<=":
                ctx.n = new BinaryOpNode(BinaryOperation.LTE, ctx.l.n, ctx.r.n);
                break;
            default:
                throw new RuntimeException("Error em relop");
            }
        } else {
            ctx.n = ctx.l.n;
        }
        return ctx.n;
    }

    @Override
    public Object visitEqOp(EqOpContext ctx) {
        visitChildren(ctx);
        if (ctx.op != null) {
            switch (ctx.op.getText()) {
            case "==":
                ctx.n = new BinaryOpNode(BinaryOperation.EQ, ctx.l.n, ctx.r.n);
                break;
            case "!=":
            case "<>":
                ctx.n = new BinaryOpNode(BinaryOperation.NE, ctx.l.n, ctx.r.n);
                break;
            }
        } else {
            ctx.n = ctx.l.n;
        }

        return ctx.n;
    }

    @Override
    public Object visitExpr(ExprContext ctx) {
        visitChildren(ctx);
        if (ctx.op != null) {
            switch (ctx.op.getText()) {
            case "+":
                ctx.n = new BinaryOpNode(BinaryOperation.ADD, ctx.l.n, ctx.r.n);
                break;
            case "-":
                ctx.n = new BinaryOpNode(BinaryOperation.SUB, ctx.l.n, ctx.r.n);
                break;
            }
        } else {
            ctx.n = ctx.u.n;
        }

        return ctx.n;
    }

    @Override
    public Object visitTerm(TermContext ctx) {
        visitChildren(ctx);
        if (ctx.op != null) {
            switch (ctx.op.getText()) {
            case "*":
                ctx.n = new BinaryOpNode(BinaryOperation.MUL, ctx.l.n, ctx.r.n);
                break;
            case "/":
                ctx.n = new BinaryOpNode(BinaryOperation.DIV, ctx.l.n, ctx.r.n);
                break;
            }
        } else {
            ctx.n = ctx.u.n;
        }
        return ctx.n;
    }

    @Override
    public Object visitUnary(UnaryContext ctx) {
        visitChildren(ctx);
        if (ctx.op != null) {
            switch (ctx.op.getText()) {
            case "!":
                ctx.n = new NotNode(ctx.r.n);
                break;
            case "-":
                ctx.n = new MenusNode(ctx.r.n);
                break;
            default:
                throw new RuntimeException("Erro em Unary");
            }
        } else {
            ctx.n = ctx.u.n;
        }
        return ctx.n;
    }

    @Override
    public Object visitFactor(FactorContext ctx) {
        visitChildren(ctx);
        if (ctx.bool() != null) {
            ctx.n = ctx.bool().n;
        } else if (ctx.ID() != null) {
            ctx.n = new ConstLiteralNode(Type.STRING, "Variável: "+ctx.ID().getText());
        } else if (ctx.functionCall() != null) {
            ctx.n = ctx.functionCall().n;
        } else if (ctx.literal() != null) {
            ctx.n = ctx.literal().n;
        }
        return ctx.n;
    }

    @Override
    public Object visitLiteral(LiteralContext ctx) {
        visitChildren(ctx);
        if (ctx.INT_LITERAL() != null) {
            ctx.n = new ConstLiteralNode(Type.INT, ctx.INT_LITERAL().getText());
        } else if (ctx.FLOAT_LITERAL() != null) {
            ctx.n = new ConstLiteralNode(Type.FLOAT, ctx.FLOAT_LITERAL()
                    .getText());
        } else if (ctx.STRING_LITERAL() != null) {
            ctx.n = new ConstLiteralNode(Type.STRING, ctx.STRING_LITERAL()
                    .getText());
        } else if (ctx.TRUE() != null) {
            ctx.n = new ConstLiteralNode(Type.BOOLEAN, ctx.TRUE().getText());
        } else if (ctx.FALSE() != null) {
            ctx.n = new ConstLiteralNode(Type.BOOLEAN, ctx.FALSE().getText());
        }

        return ctx.n;
    }
}
