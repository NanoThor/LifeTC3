package com.github.nanothor.lifetc3.ide.serializer;

import com.github.nanothor.lifetc3.ide.services.LifeTC3GrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LifeTC3SyntacticSequencer extends AbstractSyntacticSequencer {

	protected LifeTC3GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Constant_FLOAT_LITERALTerminalRuleCall_3_1_or_FalseKeyword_3_4_or_INT_LITERALTerminalRuleCall_3_0_or_STRING_LITERALTerminalRuleCall_3_2_or_TrueKeyword_3_3;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LifeTC3GrammarAccess) access;
		match_Constant_FLOAT_LITERALTerminalRuleCall_3_1_or_FalseKeyword_3_4_or_INT_LITERALTerminalRuleCall_3_0_or_STRING_LITERALTerminalRuleCall_3_2_or_TrueKeyword_3_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstantAccess().getFLOAT_LITERALTerminalRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getFalseKeyword_3_4()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getINT_LITERALTerminalRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getSTRING_LITERALTerminalRuleCall_3_2()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getTrueKeyword_3_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getFLOAT_LITERALRule())
			return getFLOAT_LITERALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINT_LITERALRule())
			return getINT_LITERALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRING_LITERALRule())
			return getSTRING_LITERALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTypeRule())
			return getTypeToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal FLOAT_LITERAL: ('0'..'9')+ ('.' ('0'..'9')+)?;
	 */
	protected String getFLOAT_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT_LITERAL: ('0'..'9')+;
	 */
	protected String getINT_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING_LITERAL: '"' (.)* '"';
	 */
	protected String getSTRING_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * Type
	 * 	: 'string'
	 * 	| 'int'
	 * 	| 'float'
	 * 	| 'boolean'
	 * 	;
	 */
	protected String getTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "string";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Constant_FLOAT_LITERALTerminalRuleCall_3_1_or_FalseKeyword_3_4_or_INT_LITERALTerminalRuleCall_3_0_or_STRING_LITERALTerminalRuleCall_3_2_or_TrueKeyword_3_3.equals(syntax))
				emit_Constant_FLOAT_LITERALTerminalRuleCall_3_1_or_FalseKeyword_3_4_or_INT_LITERALTerminalRuleCall_3_0_or_STRING_LITERALTerminalRuleCall_3_2_or_TrueKeyword_3_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | 'True' | 'False'
	 */
	protected void emit_Constant_FLOAT_LITERALTerminalRuleCall_3_1_or_FalseKeyword_3_4_or_INT_LITERALTerminalRuleCall_3_0_or_STRING_LITERALTerminalRuleCall_3_2_or_TrueKeyword_3_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
