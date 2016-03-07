package com.github.nanothor.lifetc3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.github.nanothor.grammar.LifeTC3GrammarListener;
import com.github.nanothor.grammar.LifeTC3GrammarParser.AddOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ArgContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.AssignContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.BlockContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.BoolContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.BoolLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.BoolLiteralLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ClassBodyContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ClassHeadContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ConstDeclContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.DiffOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.DivOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.EqOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ExitStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FloatLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FloatLiteralLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ForStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromAssignToStmtLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromBoolToFactorLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromEqOpToRelOpLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromExitStmtToStmtLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromExprToEqOpLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromFactorToUnaryLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromForStmtToStmtLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromFunctionCallToStmtLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromIfStmtToStmtLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromReturnStmtToStmtLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromTermToExprLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromUnaryToTermLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FromWhileStmtToStmtLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FuncBodyContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FuncDeclContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FuncHeadContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FunctionCallContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.FunctionCallLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.GeOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.GtOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.IfStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.IntLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.IntLiteralLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.LeOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.LiteralContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.LiteralLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.LtOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.MainFunctionContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.MinusOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.MulOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.NotOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ProgContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ReturnStmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.StmtContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.StringLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.StringLiteralLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.SubOperationLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.VarConstUseLContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.VarDeclContext;
import com.github.nanothor.grammar.LifeTC3GrammarParser.WhileStmtContext;
import com.github.nanothor.lifetc3.ast.AssignStmt;
import com.github.nanothor.lifetc3.ast.BinaryOpNode;
import com.github.nanothor.lifetc3.ast.BinaryOperation;
import com.github.nanothor.lifetc3.ast.ClassNode;
import com.github.nanothor.lifetc3.ast.ConstLiteralNode;
import com.github.nanothor.lifetc3.ast.ConstNode;
import com.github.nanothor.lifetc3.ast.ExitStmt;
import com.github.nanothor.lifetc3.ast.ForStmt;
import com.github.nanothor.lifetc3.ast.FuncCallNode;
import com.github.nanothor.lifetc3.ast.FuncNode;
import com.github.nanothor.lifetc3.ast.IfStmt;
import com.github.nanothor.lifetc3.ast.MenusNode;
import com.github.nanothor.lifetc3.ast.Node;
import com.github.nanothor.lifetc3.ast.NotNode;
import com.github.nanothor.lifetc3.ast.ReturnStmt;
import com.github.nanothor.lifetc3.ast.SeqNode;
import com.github.nanothor.lifetc3.ast.Type;
import com.github.nanothor.lifetc3.ast.VarNode;
import com.github.nanothor.lifetc3.ast.WhileStmt;
import com.github.nanothor.lifetc3.table.ArgInfo;
import com.github.nanothor.lifetc3.table.BuiltIn;
import com.github.nanothor.lifetc3.table.ClassInfo;
import com.github.nanothor.lifetc3.table.ConstInfo;
import com.github.nanothor.lifetc3.table.Entry;
import com.github.nanothor.lifetc3.table.Entry.EntryType;
import com.github.nanothor.lifetc3.table.FuncInfo;
import com.github.nanothor.lifetc3.table.Scope;
import com.github.nanothor.lifetc3.table.Table;
import com.github.nanothor.lifetc3.table.VarInfo;

public class AstGen implements LifeTC3GrammarListener {
	private boolean debug = false;
	private Stack<Scope> scope;
	private LinkedList<Integer> tableKeyAccessor;

	public AstGen() {
		// cia a pilha de escopo;
		scope = new Stack<>();
		// lista de sequecia que permite o acesso a tabela de simbolos
		tableKeyAccessor = new LinkedList<>();
		// adiciona as funções built-in
		tableKeyAccessor.push(BuiltIn.getTableId());
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		if (debug)
			System.out.println("Hey, I'm Here!");
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		if (debug)
			System.out.println(node);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if (debug) {
			System.out.println("Entrando: " + ctx.getClass().getName());
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		if (debug) {
			System.out.println("Saindo: " + ctx.getClass().getName());
		}
	}

	@Override
	public void enterProg(ProgContext ctx) {
		tableKeyAccessor.push(Table.newId());
	}

	@Override
	public void exitProg(ProgContext ctx) {
		ctx.n = ctx.classBody().n;
		ClassInfo info = ctx.classHead().classInfo;
		info.setScopeAccessor(tableKeyAccessor);
		((ClassNode) ctx.n).setClassInfo(info);
		tableKeyAccessor.pop();
	}

	@Override
	public void enterClassHead(ClassHeadContext ctx) {
		// obtem o nome da classe
		String classId = ctx.name.getText();

		// criação do objeto que guarda dados da classe;
		ClassInfo info = new ClassInfo(classId);
		info.setScopeAccessor(tableKeyAccessor);

		// necessário ao no ClassNode da AST
		ctx.classInfo = info;

		// coloca o nome na tabela de simbolos
		Table.put(classId, new Entry(classId, EntryType.CLASS, info), tableKeyAccessor.get(1));
	}

	@Override
	public void exitClassHead(ClassHeadContext ctx) {
	}

	@Override
	public void enterClassBody(ClassBodyContext ctx) {
		// questẽs de escopo
		scope.push(Scope.GLOBAL);
	}

	@Override
	public void exitClassBody(ClassBodyContext ctx) {
		// questẽs de escopo
		scope.pop();

		ClassNode seq = new ClassNode();
		ctx.funcDecl().forEach(x -> seq.add(x.n));
		seq.add(ctx.mainFunction().n);
		ctx.n = seq;
	}

	@Override
	public void enterIntLiteralL(IntLiteralLContext ctx) {
	}

	@Override
	public void exitIntLiteralL(IntLiteralLContext ctx) {
		String value = ctx.INT_LITERAL().getText();
		ctx.n = new ConstLiteralNode(Type.INT, value);
	}

	@Override
	public void enterFloatLiteralL(FloatLiteralLContext ctx) {
	}

	@Override
	public void exitFloatLiteralL(FloatLiteralLContext ctx) {
		String value = ctx.FLOAT_LITERAL().getText();
		ctx.n = new ConstLiteralNode(Type.FLOAT, value);
	}

	@Override
	public void enterStringLiteralL(StringLiteralLContext ctx) {
	}

	@Override
	public void exitStringLiteralL(StringLiteralLContext ctx) {
		String value = ctx.STRING_LITERAL().getText();
		ctx.n = new ConstLiteralNode(Type.STRING, value);
	}

	@Override
	public void enterBoolLiteralL(BoolLiteralLContext ctx) {
	}

	@Override
	public void exitBoolLiteralL(BoolLiteralLContext ctx) {
		String value = ctx.v.getText();
		ctx.n = new ConstLiteralNode(Type.BOOLEAN, value);
	}

	@Override
	public void enterVarDecl(VarDeclContext ctx) {

	}

	@Override
	public void exitVarDecl(VarDeclContext ctx) {
		String varName;
		for (TerminalNode v : ctx.ID()) {
			varName = v.getText();
			if (Table.containsKey(varName, tableKeyAccessor)) {
				throw new ParseCancellationException(varName + " já definido.");
			}
			VarInfo info = new VarInfo(ctx.type().t, scope.peek());
			Table.put(varName, new Entry(varName, EntryType.VAR, info), tableKeyAccessor.peek());
		}
	}

	@Override
	public void enterConstDecl(ConstDeclContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitConstDecl(ConstDeclContext ctx) {
		// checar tipo;
		if (ctx.type().t != ctx.literal().n.getType()) {
			Token start = ctx.getStart();
			String msg = String.format("Erro: linha %d, coluna %d; Tipos não casam em '%s'", start.getLine(),
					start.getCharPositionInLine(), ctx.getText());
			throw new RuntimeException(msg);
		}

		String constName = ctx.name.getText();
		if (Table.containsKey(constName, tableKeyAccessor.peek())) {
			throw new ParseCancellationException(constName + " já definido!");
		}
		ConstLiteralNode n = (ConstLiteralNode) ctx.literal().n;
		ConstInfo constInfo = new ConstInfo(n.getType(), n.getValue());
		Table.put(constName, new Entry(constName, EntryType.CONST, constInfo), tableKeyAccessor.peek());
	}

	@Override
	public void enterFuncDecl(FuncDeclContext ctx) {

		tableKeyAccessor.push(Table.newId());
		scope.push(Scope.LOCAL);
	}

	@Override
	public void exitFuncDecl(FuncDeclContext ctx) {
		// Questões de Escopo
		tableKeyAccessor.pop();
		scope.pop();

		// repassa o nó para cima
		ctx.n = ctx.funcBody().n;

		// informação de necessário ao nó FuncNode;
		FuncInfo info = ctx.funcHead().info;
		((FuncNode) ctx.n).setInfo(info);
	}

	@Override
	public void enterArg(ArgContext ctx) {
	}

	@Override
	public void exitArg(ArgContext ctx) {
		String name = ctx.ID().getText();

		if (Table.containsKey(name, tableKeyAccessor.peek()))
			erro(ctx, ctx.ID() + " já definido!");

		LiteralContext literal = ctx.literal();
		ArgInfo info;
		if (literal != null) {
			ConstLiteralNode n = (ConstLiteralNode) literal.n;
			info = new ArgInfo(ctx.type().t, scope.peek(), n.getValue());
		} else {
			info = new ArgInfo(ctx.type().t, scope.peek(), null);
		}
		Table.put(name, new Entry(name, EntryType.ARG, info), tableKeyAccessor.peek());
	}

	@Override
	public void enterMainFunction(MainFunctionContext ctx) {
		tableKeyAccessor.push(Table.newId());
		scope.push(Scope.LOCAL);
	}

	@Override
	public void exitMainFunction(MainFunctionContext ctx) {
		ctx.n = ctx.funcBody().n;

		FuncInfo info = new FuncInfo("main", new ArrayList<>());
		info.setType(Type.TYPE_ERROR);
		info.setScopeAccessor(tableKeyAccessor);
		((FuncNode) ctx.n).setInfo(info);

		scope.pop();
		tableKeyAccessor.pop();
	}

	@Override
	public void enterFuncBody(FuncBodyContext ctx) {
		if (debug)
			System.out.println(tableKeyAccessor);
	}

	@Override
	public void exitFuncBody(FuncBodyContext ctx) {
		FuncNode seq = new FuncNode();
		for (StmtContext stmt : ctx.stmt()) {
			seq.add(stmt.n);
		}
		ctx.n = seq;
	}

	@Override
	public void enterReturnStmt(ReturnStmtContext ctx) {
	}

	@Override
	public void exitReturnStmt(ReturnStmtContext ctx) {
		ctx.n = new ReturnStmt(ctx.ret.n);
	}

	@Override
	public void enterFromAssignToStmtL(FromAssignToStmtLContext ctx) {
	}

	@Override
	public void exitFromAssignToStmtL(FromAssignToStmtLContext ctx) {
		ctx.n = ctx.assign().n;
	}

	@Override
	public void enterFromFunctionCallToStmtL(FromFunctionCallToStmtLContext ctx) {
	}

	@Override
	public void exitFromFunctionCallToStmtL(FromFunctionCallToStmtLContext ctx) {
		ctx.n = ctx.functionCall().n;
	}

	@Override
	public void enterFromReturnStmtToStmtL(FromReturnStmtToStmtLContext ctx) {
	}

	@Override
	public void exitFromReturnStmtToStmtL(FromReturnStmtToStmtLContext ctx) {
		ctx.n = ctx.returnStmt().n;
	}

	@Override
	public void enterFromIfStmtToStmtL(FromIfStmtToStmtLContext ctx) {
	}

	@Override
	public void exitFromIfStmtToStmtL(FromIfStmtToStmtLContext ctx) {
		ctx.n = ctx.ifStmt().n;
	}

	@Override
	public void enterFromForStmtToStmtL(FromForStmtToStmtLContext ctx) {
	}

	@Override
	public void exitFromForStmtToStmtL(FromForStmtToStmtLContext ctx) {
		ctx.n = ctx.forStmt().n;
	}

	@Override
	public void enterFromWhileStmtToStmtL(FromWhileStmtToStmtLContext ctx) {
	}

	@Override
	public void exitFromWhileStmtToStmtL(FromWhileStmtToStmtLContext ctx) {
		ctx.n = ctx.whileStmt().n;
	}

	@Override
	public void enterFromExitStmtToStmtL(FromExitStmtToStmtLContext ctx) {
	}

	@Override
	public void exitFromExitStmtToStmtL(FromExitStmtToStmtLContext ctx) {
		ctx.n = ctx.exitStmt().n;
	}

	@Override
	public void enterFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitFunctionCall(FunctionCallContext ctx) {
		String funcName = ctx.ID().getText();
		Entry entry = Table.get(funcName, tableKeyAccessor);

		if (entry == null)
			erro(ctx, "A função " + funcName + " não foi declarada!");
		if (entry.getType() != EntryType.FUNCTION && entry.getType() != EntryType.BUILTIN_FUNCTION)
			erro(ctx, funcName + " não é uma função");

		FuncCallNode n = new FuncCallNode();
		for (BoolContext av : ctx.bool()) {
			n.add(av.n);
		}

		if (entry.getType() == EntryType.FUNCTION) {
			StringBuilder builder = new StringBuilder();
			builder.append('_');
			builder.append(funcName);

			n.getNodes().forEach(e -> {
				builder.append('_');
				builder.append(e.getType().toString().toLowerCase());
			});

			builder.append('_');
			builder.append(n.getNodes().size());
			String newFuncName = builder.toString();
			Entry entry2 = Table.get(newFuncName, tableKeyAccessor);
			if (entry2 == null)
				erro(ctx, "A função " + funcName + " não possui declaração compativel com os parametros reais");

			FuncInfo info = (FuncInfo) entry2.getInfo();
			n.setInfo(info);
			n.setType(info.getType());
		}

		if (entry.getType() == EntryType.BUILTIN_FUNCTION) {
			n.setInfo(null);
			n.setType(Type.TYPE_ERROR);
		}

		ctx.n = n;
	}

	@Override
	public void enterExitStmt(ExitStmtContext ctx) {

	}

	@Override
	public void exitExitStmt(ExitStmtContext ctx) {
		ctx.n = new ExitStmt();
	}

	@Override
	public void enterIfStmt(IfStmtContext ctx) {
	}

	@Override
	public void exitIfStmt(IfStmtContext ctx) {
		Node condition = ctx.c.n;
		Node then = ctx.t.n;
		Node elze = (ctx.e != null) ? ctx.e.n : null;
		ctx.n = new IfStmt(condition, then, elze);
	}

	@Override
	public void enterForStmt(ForStmtContext ctx) {

	}

	@Override
	public void exitForStmt(ForStmtContext ctx) {
		// TODO
		String var = ctx.var.getText();
		Node ini = ctx.b.n;
		Node fin = ctx.e.n;
		Node cmds = ctx.block().n;
		ctx.n = new ForStmt(var, ini, fin, cmds);
	}

	@Override
	public void enterWhileStmt(WhileStmtContext ctx) {
	}

	@Override
	public void exitWhileStmt(WhileStmtContext ctx) {
		Node cond = ctx.c.n;
		Node cmds = ctx.b.n;
		ctx.n = new WhileStmt(cond, cmds);
	}

	@Override
	public void enterBlock(BlockContext ctx) {
	}

	@Override
	public void exitBlock(BlockContext ctx) {
		SeqNode seq = new SeqNode();
		for (StmtContext stmt : ctx.stmt()) {
			seq.add(stmt.n);
		}
		ctx.n = seq;
	}

	@Override
	public void enterAssign(AssignContext ctx) {
	}

	@Override
	public void exitAssign(AssignContext ctx) {
		ctx.n = new AssignStmt(ctx.l.getText(), ctx.e.n);
	}

	@Override
	public void enterBool(BoolContext ctx) {

	}

	@Override
	public void exitBool(BoolContext ctx) {
		ctx.n = ctx.relOp().n;
	}

	@Override
	public void enterGtOperationL(GtOperationLContext ctx) {
	}

	@Override
	public void exitGtOperationL(GtOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '" + ctx.op.getText() + "' não é aplicável a tipos incompatíveis");

		ctx.n = new BinaryOpNode(BinaryOperation.GT, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterGeOperationL(GeOperationLContext ctx) {
	}

	@Override
	public void exitGeOperationL(GeOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '" + ctx.op.getText() + "' não é aplicável a tipos incompatíveis");

		ctx.n = new BinaryOpNode(BinaryOperation.GTE, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterLtOperationL(LtOperationLContext ctx) {
	}

	@Override
	public void exitLtOperationL(LtOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '" + ctx.op.getText() + "' não é aplicável a tipos incompatíveis");

		ctx.n = new BinaryOpNode(BinaryOperation.LT, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterLeOperationL(LeOperationLContext ctx) {

	}

	@Override
	public void exitLeOperationL(LeOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '" + ctx.op.getText() + "' não é aplicável a tipos incompatíveis");

		ctx.n = new BinaryOpNode(BinaryOperation.LTE, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterFromEqOpToRelOpL(FromEqOpToRelOpLContext ctx) {

	}

	@Override
	public void exitFromEqOpToRelOpL(FromEqOpToRelOpLContext ctx) {
		ctx.n = ctx.eqOp().n;
	}

	@Override
	public void enterEqOperationL(EqOperationLContext ctx) {

	}

	@Override
	public void exitEqOperationL(EqOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '==' não é aplicável a tipos incompatíveis");

		ctx.n = new BinaryOpNode(BinaryOperation.EQ, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterDiffOperationL(DiffOperationLContext ctx) {
	}

	@Override
	public void exitDiffOperationL(DiffOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '" + ctx.op.getText() + "' não é aplicável a tipos incompatíveis");
		ctx.n = new BinaryOpNode(BinaryOperation.NE, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterFromExprToEqOpL(FromExprToEqOpLContext ctx) {

	}

	@Override
	public void exitFromExprToEqOpL(FromExprToEqOpLContext ctx) {
		ctx.n = ctx.expr().n;
	}

	@Override
	public void enterAddOperationL(AddOperationLContext ctx) {

	}

	@Override
	public void exitAddOperationL(AddOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '+' não é aplicável a tipos incompatíveis");
		if (lt != Type.INT && lt != Type.FLOAT)
			erro(ctx, "O operador '+' não é aplicável ao tipo" + lt.toString().toLowerCase());

		ctx.n = new BinaryOpNode(BinaryOperation.ADD, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterFromTermToExprL(FromTermToExprLContext ctx) {

	}

	@Override
	public void exitFromTermToExprL(FromTermToExprLContext ctx) {
		ctx.n = ctx.term().n;
	}

	@Override
	public void enterSubOperationL(SubOperationLContext ctx) {
	}

	@Override
	public void exitSubOperationL(SubOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '-' não é aplicável a tipos incompatíveis");
		if (lt != Type.INT && lt != Type.FLOAT)
			erro(ctx, "O operador '-' não é aplicável ao tipo" + lt.toString().toLowerCase());

		ctx.n = new BinaryOpNode(BinaryOperation.SUB, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterDivOperationL(DivOperationLContext ctx) {

	}

	@Override
	public void exitDivOperationL(DivOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '/' não é aplicável a tipos incompatíveis");
		if (lt != Type.INT && lt != Type.FLOAT)
			erro(ctx, "O operador '/' não é aplicável ao tipo" + lt.toString().toLowerCase());
		ctx.n = new BinaryOpNode(BinaryOperation.DIV, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterFromUnaryToTermL(FromUnaryToTermLContext ctx) {

	}

	@Override
	public void exitFromUnaryToTermL(FromUnaryToTermLContext ctx) {
		ctx.n = ctx.unary().n;
	}

	@Override
	public void enterMulOperationL(MulOperationLContext ctx) {

	}

	@Override
	public void exitMulOperationL(MulOperationLContext ctx) {
		Type lt = ctx.l.n.getType();
		Type rt = ctx.r.n.getType();
		if (lt != rt)
			erro(ctx, "O operador '*' não é aplicável a tipos incompatíveis");

		if (lt != Type.INT && lt != Type.FLOAT)
			erro(ctx, "O operador '*' não é aplicável ao tipo" + lt.toString().toLowerCase());

		ctx.n = new BinaryOpNode(BinaryOperation.MUL, ctx.l.n, ctx.r.n);
	}

	@Override
	public void enterNotOperationL(NotOperationLContext ctx) {

	}

	@Override
	public void exitNotOperationL(NotOperationLContext ctx) {
		if (ctx.r.n.getType() != Type.BOOLEAN) {
			erro(ctx, "O operador '!' age somente sobre expressões booleanas");
		}

		ctx.n = new NotNode(ctx.r.n);
	}

	private void erro(ParserRuleContext ctx, String msg) {
		Token start = ctx.getStart();
		String msgEx = String.format("Erro: linha %d, coluna %d; %s", start.getLine(), start.getCharPositionInLine(),
				msg);
		throw new RuntimeException(msgEx);
	}

	@Override
	public void enterMinusOperationL(MinusOperationLContext ctx) {

	}

	@Override
	public void exitMinusOperationL(MinusOperationLContext ctx) {
		if (ctx.r.n.getType() != Type.INT && ctx.r.n.getType() != Type.FLOAT)
			erro(ctx, "O operador '-' não é aplicável ao tipo " + ctx.r.n.getType().toString().toLowerCase());
		ctx.n = new MenusNode(ctx.r.n);
	}

	@Override
	public void enterFromFactorToUnaryL(FromFactorToUnaryLContext ctx) {

	}

	@Override
	public void exitFromFactorToUnaryL(FromFactorToUnaryLContext ctx) {
		ctx.n = ctx.factor().n;
	}

	@Override
	public void enterFromBoolToFactorL(FromBoolToFactorLContext ctx) {

	}

	@Override
	public void exitFromBoolToFactorL(FromBoolToFactorLContext ctx) {
		ctx.n = ctx.bool().n;
	}

	@Override
	public void enterVarConstUseL(VarConstUseLContext ctx) {
	}

	@Override
	public void exitVarConstUseL(VarConstUseLContext ctx) {
		String name = ctx.ID().getText();

		Entry info = Table.get(name, tableKeyAccessor);
		if (debug)
			System.out.println("var ou const: " + name);
		if (info == null)
			throw new ParseCancellationException();
		// throw new RuntimeException("Id não declarado");

		switch (info.getType()) {
		case CONST:
			ctx.n = new ConstNode(name, ((ConstInfo) info.getInfo()).getType());
			break;
		case VAR:
			ctx.n = new VarNode(name, ((VarInfo) info.getInfo()).getType());
			break;
		case ARG:
			ctx.n = new VarNode(name, ((ArgInfo) info.getInfo()).getType());
			break;
		default:
			throw new ParseCancellationException();
			// RuntimeException("erro! classe ou função não pode ser usado como
			// var ou const");

		}
	}

	@Override
	public void enterFunctionCallL(FunctionCallLContext ctx) {
	}

	@Override
	public void exitFunctionCallL(FunctionCallLContext ctx) {
		ctx.n = ctx.functionCall().n;
	}

	@Override
	public void enterLiteralL(LiteralLContext ctx) {

	}

	@Override
	public void exitLiteralL(LiteralLContext ctx) {
		ctx.n = ctx.literal().n;
	}

	@Override
	public void enterStringL(StringLContext ctx) {
		ctx.t = Type.STRING;
	}

	@Override
	public void exitStringL(StringLContext ctx) {
	}

	@Override
	public void enterIntL(IntLContext ctx) {
		ctx.t = Type.INT;
	}

	@Override
	public void exitIntL(IntLContext ctx) {
	}

	@Override
	public void enterFloatL(FloatLContext ctx) {
		ctx.t = Type.FLOAT;
	}

	@Override
	public void exitFloatL(FloatLContext ctx) {
	}

	@Override
	public void enterBoolL(BoolLContext ctx) {
		ctx.t = Type.BOOLEAN;
	}

	@Override
	public void exitBoolL(BoolLContext ctx) {
	}

	@Override
	public void enterFuncHead(FuncHeadContext ctx) {
		// nome da função
		String name = ctx.name.getText();

		// verificação de erro!
		// verificar se a função existe
		Entry entry = Table.get(name, tableKeyAccessor);
		if (entry != null && entry.getType() != EntryType.FUNCTION)
			throw new RuntimeException(name + " já declarado!");

		// adiciona o um marcador para função
		if (entry == null)
			Table.put(name, new Entry(name, EntryType.FUNCTION, null), tableKeyAccessor.get(1));
	}

	@Override
	public void exitFuncHead(FuncHeadContext ctx) {
		// nome da função
		String name = ctx.name.getText();

		// lista de nomes dos parametros
		List<String> args = new ArrayList<>();

		// quantidade de parametros default
		Integer qtParamDefault = 0;

		// lista os parametros e conta a quantidade de funções com parametros
		// default
		for (ArgContext e : ctx.arg()) {
			args.add(e.ID().getText());
		}

		// conjunto de informações sobre a função
		FuncInfo info = new FuncInfo(name, args);
		info.setType(ctx.type().t);
		info.setScopeAccessor(tableKeyAccessor);
		qtParamDefault = info.getQtParamDefault();
		ctx.info = info;

		// para cada possível representção de função (parametros default)
		// cria um marcador e coloca na tabela.
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <= qtParamDefault; ++i) {
			int j = 1;
			builder.setLength(0);
			builder.append('_');
			builder.append(name);
			int counter = 0;
			for (String argName : args) {
				Entry entry = Table.get(argName, tableKeyAccessor.peek());
				ArgInfo argInfo = (ArgInfo) entry.getInfo();
				if (argInfo.getDefaultValue() != null)
					if (argInfo.getDefaultValue() != null) {
						if (j > i)
							continue;
						else
							++j;
					}
				builder.append('_');
				builder.append(argInfo.getType().toString().toLowerCase());
				++counter;
			}
			builder.append('_');
			builder.append(counter);

			String newFuncName = builder.toString();
			if (Table.get(newFuncName, tableKeyAccessor) != null)
				throw new RuntimeException("Há conflitos nas definições da função " + name);
			Table.put(newFuncName, new Entry(newFuncName, EntryType.FUNCTION, info), tableKeyAccessor.get(1));
			// System.out.println("Declaração de função:" + newFuncName);
		}
	}

}
