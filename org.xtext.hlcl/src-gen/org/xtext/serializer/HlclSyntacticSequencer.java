/*
 * generated by Xtext 2.13.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.HlclGrammarAccess;

@SuppressWarnings("all")
public class HlclSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HlclGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SetDomain___CommaKeyword_1_1_0_INTTerminalRuleCall_1_1_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HlclGrammarAccess) access;
		match_SetDomain___CommaKeyword_1_1_0_INTTerminalRuleCall_1_1_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getSetDomainAccess().getCommaKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getSetDomainAccess().getINTTerminalRuleCall_1_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_SetDomain___CommaKeyword_1_1_0_INTTerminalRuleCall_1_1_1__p.equals(syntax))
				emit_SetDomain___CommaKeyword_1_1_0_INTTerminalRuleCall_1_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (',' INT)+
	 *
	 * This ambiguous syntax occurs at:
	 *     list=INT (ambiguity) ']' (rule end)
	 */
	protected void emit_SetDomain___CommaKeyword_1_1_0_INTTerminalRuleCall_1_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}