/*
* generated by Xtext
*/
package compil.dslcalculette.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DCalcGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cAbstractExpressionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAbstractExpressionsAbstractExpressionParserRuleCall_0 = (RuleCall)cAbstractExpressionsAssignment.eContents().get(0);
		
		//Model:
		//	abstractExpressions+=AbstractExpression*;
		public ParserRule getRule() { return rule; }

		//abstractExpressions+=AbstractExpression*
		public Assignment getAbstractExpressionsAssignment() { return cAbstractExpressionsAssignment; }

		//AbstractExpression
		public RuleCall getAbstractExpressionsAbstractExpressionParserRuleCall_0() { return cAbstractExpressionsAbstractExpressionParserRuleCall_0; }
	}

	public class AbstractExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//AbstractExpression:
		//	expression=Expression ";";
		public ParserRule getRule() { return rule; }

		//expression=Expression ";"
		public Group getGroup() { return cGroup; }

		//expression=Expression
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }

		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0_0() { return cExpressionExpressionParserRuleCall_0_0; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOperandeParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExpressionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperateurAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOperateurAlternatives_1_1_0 = (Alternatives)cOperateurAssignment_1_1.eContents().get(0);
		private final Keyword cOperateurPlusSignKeyword_1_1_0_0 = (Keyword)cOperateurAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOperateurHyphenMinusKeyword_1_1_0_1 = (Keyword)cOperateurAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Expression:
		//	Operande ({Expression.left=current} operateur=("+" | "-") right=Expression)?;
		public ParserRule getRule() { return rule; }

		//Operande ({Expression.left=current} operateur=("+" | "-") right=Expression)?
		public Group getGroup() { return cGroup; }

		//Operande
		public RuleCall getOperandeParserRuleCall_0() { return cOperandeParserRuleCall_0; }

		//({Expression.left=current} operateur=("+" | "-") right=Expression)?
		public Group getGroup_1() { return cGroup_1; }

		//{Expression.left=current}
		public Action getExpressionLeftAction_1_0() { return cExpressionLeftAction_1_0; }

		//operateur=("+" | "-")
		public Assignment getOperateurAssignment_1_1() { return cOperateurAssignment_1_1; }

		//"+" | "-"
		public Alternatives getOperateurAlternatives_1_1_0() { return cOperateurAlternatives_1_1_0; }

		//"+"
		public Keyword getOperateurPlusSignKeyword_1_1_0_0() { return cOperateurPlusSignKeyword_1_1_0_0; }

		//"-"
		public Keyword getOperateurHyphenMinusKeyword_1_1_0_1() { return cOperateurHyphenMinusKeyword_1_1_0_1; }

		//right=Expression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Expression
		public RuleCall getRightExpressionParserRuleCall_1_2_0() { return cRightExpressionParserRuleCall_1_2_0; }
	}

	public class OperandeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Operande");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTermeParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExpressionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperateurAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOperateurAlternatives_1_1_0 = (Alternatives)cOperateurAssignment_1_1.eContents().get(0);
		private final Keyword cOperateurAsteriskKeyword_1_1_0_0 = (Keyword)cOperateurAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOperateurSolidusKeyword_1_1_0_1 = (Keyword)cOperateurAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Operande returns Expression:
		//	Terme ({Expression.left=current} operateur=("*" | "/") right=Expression)?;
		public ParserRule getRule() { return rule; }

		//Terme ({Expression.left=current} operateur=("*" | "/") right=Expression)?
		public Group getGroup() { return cGroup; }

		//Terme
		public RuleCall getTermeParserRuleCall_0() { return cTermeParserRuleCall_0; }

		//({Expression.left=current} operateur=("*" | "/") right=Expression)?
		public Group getGroup_1() { return cGroup_1; }

		//{Expression.left=current}
		public Action getExpressionLeftAction_1_0() { return cExpressionLeftAction_1_0; }

		//operateur=("*" | "/")
		public Assignment getOperateurAssignment_1_1() { return cOperateurAssignment_1_1; }

		//"*" | "/"
		public Alternatives getOperateurAlternatives_1_1_0() { return cOperateurAlternatives_1_1_0; }

		//"*"
		public Keyword getOperateurAsteriskKeyword_1_1_0_0() { return cOperateurAsteriskKeyword_1_1_0_0; }

		//"/"
		public Keyword getOperateurSolidusKeyword_1_1_0_1() { return cOperateurSolidusKeyword_1_1_0_1; }

		//right=Expression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Expression
		public RuleCall getRightExpressionParserRuleCall_1_2_0() { return cRightExpressionParserRuleCall_1_2_0; }
	}

	public class TermeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Terme");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cSigneAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cSigneHyphenMinusKeyword_1_0_0 = (Keyword)cSigneAssignment_1_0.eContents().get(0);
		private final Assignment cValeurAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValeurINTTerminalRuleCall_1_1_0 = (RuleCall)cValeurAssignment_1_1.eContents().get(0);
		private final Assignment cValeurAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cValeurINTTerminalRuleCall_2_0 = (RuleCall)cValeurAssignment_2.eContents().get(0);
		
		//Terme returns Expression:
		//	"(" Expression ")" | signe="-" valeur=INT | valeur=INT;
		public ParserRule getRule() { return rule; }

		//"(" Expression ")" | signe="-" valeur=INT | valeur=INT
		public Alternatives getAlternatives() { return cAlternatives; }

		//"(" Expression ")"
		public Group getGroup_0() { return cGroup_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }

		//Expression
		public RuleCall getExpressionParserRuleCall_0_1() { return cExpressionParserRuleCall_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }

		//signe="-" valeur=INT
		public Group getGroup_1() { return cGroup_1; }

		//signe="-"
		public Assignment getSigneAssignment_1_0() { return cSigneAssignment_1_0; }

		//"-"
		public Keyword getSigneHyphenMinusKeyword_1_0_0() { return cSigneHyphenMinusKeyword_1_0_0; }

		//valeur=INT
		public Assignment getValeurAssignment_1_1() { return cValeurAssignment_1_1; }

		//INT
		public RuleCall getValeurINTTerminalRuleCall_1_1_0() { return cValeurINTTerminalRuleCall_1_1_0; }

		//valeur=INT
		public Assignment getValeurAssignment_2() { return cValeurAssignment_2; }

		//INT
		public RuleCall getValeurINTTerminalRuleCall_2_0() { return cValeurINTTerminalRuleCall_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final AbstractExpressionElements pAbstractExpression;
	private final ExpressionElements pExpression;
	private final OperandeElements pOperande;
	private final TermeElements pTerme;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DCalcGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAbstractExpression = new AbstractExpressionElements();
		this.pExpression = new ExpressionElements();
		this.pOperande = new OperandeElements();
		this.pTerme = new TermeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("compil.dslcalculette.DCalc".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	abstractExpressions+=AbstractExpression*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//AbstractExpression:
	//	expression=Expression ";";
	public AbstractExpressionElements getAbstractExpressionAccess() {
		return pAbstractExpression;
	}
	
	public ParserRule getAbstractExpressionRule() {
		return getAbstractExpressionAccess().getRule();
	}

	//Expression:
	//	Operande ({Expression.left=current} operateur=("+" | "-") right=Expression)?;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//Operande returns Expression:
	//	Terme ({Expression.left=current} operateur=("*" | "/") right=Expression)?;
	public OperandeElements getOperandeAccess() {
		return pOperande;
	}
	
	public ParserRule getOperandeRule() {
		return getOperandeAccess().getRule();
	}

	//Terme returns Expression:
	//	"(" Expression ")" | signe="-" valeur=INT | valeur=INT;
	public TermeElements getTermeAccess() {
		return pTerme;
	}
	
	public ParserRule getTermeRule() {
		return getTermeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
