package compil.dslcalculette.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import compil.dslcalculette.services.DCalcGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDCalcParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDCalcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDCalcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDCalcParser.tokenNames; }
    public String getGrammarFileName() { return "../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g"; }



     	private DCalcGrammarAccess grammarAccess;
     	
        public InternalDCalcParser(TokenStream input, DCalcGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DCalcGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:76:1: ruleModel returns [EObject current=null] : ( (lv_abstractExpressions_0_0= ruleAbstractExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_abstractExpressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:79:28: ( ( (lv_abstractExpressions_0_0= ruleAbstractExpression ) )* )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:80:1: ( (lv_abstractExpressions_0_0= ruleAbstractExpression ) )*
            {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:80:1: ( (lv_abstractExpressions_0_0= ruleAbstractExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==13||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:81:1: (lv_abstractExpressions_0_0= ruleAbstractExpression )
            	    {
            	    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:81:1: (lv_abstractExpressions_0_0= ruleAbstractExpression )
            	    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:82:3: lv_abstractExpressions_0_0= ruleAbstractExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAbstractExpressionsAbstractExpressionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractExpression_in_ruleModel130);
            	    lv_abstractExpressions_0_0=ruleAbstractExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"abstractExpressions",
            	            		lv_abstractExpressions_0_0, 
            	            		"AbstractExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractExpression"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:106:1: entryRuleAbstractExpression returns [EObject current=null] : iv_ruleAbstractExpression= ruleAbstractExpression EOF ;
    public final EObject entryRuleAbstractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExpression = null;


        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:107:2: (iv_ruleAbstractExpression= ruleAbstractExpression EOF )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:108:2: iv_ruleAbstractExpression= ruleAbstractExpression EOF
            {
             newCompositeNode(grammarAccess.getAbstractExpressionRule()); 
            pushFollow(FOLLOW_ruleAbstractExpression_in_entryRuleAbstractExpression166);
            iv_ruleAbstractExpression=ruleAbstractExpression();

            state._fsp--;

             current =iv_ruleAbstractExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractExpression176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractExpression"


    // $ANTLR start "ruleAbstractExpression"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:115:1: ruleAbstractExpression returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleAbstractExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:118:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:119:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:119:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:119:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:119:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:120:1: (lv_expression_0_0= ruleExpression )
            {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:120:1: (lv_expression_0_0= ruleExpression )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:121:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAbstractExpressionAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAbstractExpression222);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAbstractExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleAbstractExpression234); 

                	newLeafNode(otherlv_1, grammarAccess.getAbstractExpressionAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractExpression"


    // $ANTLR start "entryRuleExpression"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:149:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:150:2: (iv_ruleExpression= ruleExpression EOF )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:151:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression270);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:158:1: ruleExpression returns [EObject current=null] : (this_Operande_0= ruleOperande ( () ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operateur_2_1=null;
        Token lv_operateur_2_2=null;
        EObject this_Operande_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:161:28: ( (this_Operande_0= ruleOperande ( () ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:162:1: (this_Operande_0= ruleOperande ( () ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:162:1: (this_Operande_0= ruleOperande ( () ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:163:5: this_Operande_0= ruleOperande ( () ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOperandeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOperande_in_ruleExpression327);
            this_Operande_0=ruleOperande();

            state._fsp--;

             
                    current = this_Operande_0; 
                    afterParserOrEnumRuleCall();
                
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:171:1: ( () ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:171:2: () ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:171:2: ()
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:172:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
                                current);
                        

                    }

                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:177:2: ( ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:178:1: ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:178:1: ( (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:179:1: (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:179:1: (lv_operateur_2_1= '+' | lv_operateur_2_2= '-' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==12) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==13) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:180:3: lv_operateur_2_1= '+'
                            {
                            lv_operateur_2_1=(Token)match(input,12,FOLLOW_12_in_ruleExpression356); 

                                    newLeafNode(lv_operateur_2_1, grammarAccess.getExpressionAccess().getOperateurPlusSignKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "operateur", lv_operateur_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:192:8: lv_operateur_2_2= '-'
                            {
                            lv_operateur_2_2=(Token)match(input,13,FOLLOW_13_in_ruleExpression385); 

                                    newLeafNode(lv_operateur_2_2, grammarAccess.getExpressionAccess().getOperateurHyphenMinusKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "operateur", lv_operateur_2_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:207:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:208:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:208:1: (lv_right_3_0= ruleExpression )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:209:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression422);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperande"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:233:1: entryRuleOperande returns [EObject current=null] : iv_ruleOperande= ruleOperande EOF ;
    public final EObject entryRuleOperande() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperande = null;


        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:234:2: (iv_ruleOperande= ruleOperande EOF )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:235:2: iv_ruleOperande= ruleOperande EOF
            {
             newCompositeNode(grammarAccess.getOperandeRule()); 
            pushFollow(FOLLOW_ruleOperande_in_entryRuleOperande460);
            iv_ruleOperande=ruleOperande();

            state._fsp--;

             current =iv_ruleOperande; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperande470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperande"


    // $ANTLR start "ruleOperande"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:242:1: ruleOperande returns [EObject current=null] : (this_Terme_0= ruleTerme ( () ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleOperande() throws RecognitionException {
        EObject current = null;

        Token lv_operateur_2_1=null;
        Token lv_operateur_2_2=null;
        EObject this_Terme_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:245:28: ( (this_Terme_0= ruleTerme ( () ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:246:1: (this_Terme_0= ruleTerme ( () ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:246:1: (this_Terme_0= ruleTerme ( () ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:247:5: this_Terme_0= ruleTerme ( () ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getOperandeAccess().getTermeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerme_in_ruleOperande517);
            this_Terme_0=ruleTerme();

            state._fsp--;

             
                    current = this_Terme_0; 
                    afterParserOrEnumRuleCall();
                
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:255:1: ( () ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=14 && LA5_0<=15)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:255:2: () ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:255:2: ()
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:256:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getOperandeAccess().getExpressionLeftAction_1_0(),
                                current);
                        

                    }

                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:261:2: ( ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:262:1: ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:262:1: ( (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:263:1: (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:263:1: (lv_operateur_2_1= '*' | lv_operateur_2_2= '/' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==15) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:264:3: lv_operateur_2_1= '*'
                            {
                            lv_operateur_2_1=(Token)match(input,14,FOLLOW_14_in_ruleOperande546); 

                                    newLeafNode(lv_operateur_2_1, grammarAccess.getOperandeAccess().getOperateurAsteriskKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOperandeRule());
                            	        }
                                   		setWithLastConsumed(current, "operateur", lv_operateur_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:276:8: lv_operateur_2_2= '/'
                            {
                            lv_operateur_2_2=(Token)match(input,15,FOLLOW_15_in_ruleOperande575); 

                                    newLeafNode(lv_operateur_2_2, grammarAccess.getOperandeAccess().getOperateurSolidusKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOperandeRule());
                            	        }
                                   		setWithLastConsumed(current, "operateur", lv_operateur_2_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:291:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:292:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:292:1: (lv_right_3_0= ruleExpression )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:293:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperandeAccess().getRightExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleOperande612);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperandeRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperande"


    // $ANTLR start "entryRuleTerme"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:317:1: entryRuleTerme returns [EObject current=null] : iv_ruleTerme= ruleTerme EOF ;
    public final EObject entryRuleTerme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerme = null;


        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:318:2: (iv_ruleTerme= ruleTerme EOF )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:319:2: iv_ruleTerme= ruleTerme EOF
            {
             newCompositeNode(grammarAccess.getTermeRule()); 
            pushFollow(FOLLOW_ruleTerme_in_entryRuleTerme650);
            iv_ruleTerme=ruleTerme();

            state._fsp--;

             current =iv_ruleTerme; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerme660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerme"


    // $ANTLR start "ruleTerme"
    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:326:1: ruleTerme returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( ( (lv_signe_3_0= '-' ) ) ( (lv_valeur_4_0= RULE_INT ) ) ) | ( (lv_valeur_5_0= RULE_INT ) ) ) ;
    public final EObject ruleTerme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_signe_3_0=null;
        Token lv_valeur_4_0=null;
        Token lv_valeur_5_0=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:329:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( ( (lv_signe_3_0= '-' ) ) ( (lv_valeur_4_0= RULE_INT ) ) ) | ( (lv_valeur_5_0= RULE_INT ) ) ) )
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:330:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( ( (lv_signe_3_0= '-' ) ) ( (lv_valeur_4_0= RULE_INT ) ) ) | ( (lv_valeur_5_0= RULE_INT ) ) )
            {
            // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:330:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( ( (lv_signe_3_0= '-' ) ) ( (lv_valeur_4_0= RULE_INT ) ) ) | ( (lv_valeur_5_0= RULE_INT ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:330:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:330:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:330:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTerme698); 

                        	newLeafNode(otherlv_0, grammarAccess.getTermeAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getTermeAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerme720);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTerme731); 

                        	newLeafNode(otherlv_2, grammarAccess.getTermeAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:348:6: ( ( (lv_signe_3_0= '-' ) ) ( (lv_valeur_4_0= RULE_INT ) ) )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:348:6: ( ( (lv_signe_3_0= '-' ) ) ( (lv_valeur_4_0= RULE_INT ) ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:348:7: ( (lv_signe_3_0= '-' ) ) ( (lv_valeur_4_0= RULE_INT ) )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:348:7: ( (lv_signe_3_0= '-' ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:349:1: (lv_signe_3_0= '-' )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:349:1: (lv_signe_3_0= '-' )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:350:3: lv_signe_3_0= '-'
                    {
                    lv_signe_3_0=(Token)match(input,13,FOLLOW_13_in_ruleTerme757); 

                            newLeafNode(lv_signe_3_0, grammarAccess.getTermeAccess().getSigneHyphenMinusKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermeRule());
                    	        }
                           		setWithLastConsumed(current, "signe", lv_signe_3_0, "-");
                    	    

                    }


                    }

                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:363:2: ( (lv_valeur_4_0= RULE_INT ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:364:1: (lv_valeur_4_0= RULE_INT )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:364:1: (lv_valeur_4_0= RULE_INT )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:365:3: lv_valeur_4_0= RULE_INT
                    {
                    lv_valeur_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerme787); 

                    			newLeafNode(lv_valeur_4_0, grammarAccess.getTermeAccess().getValeurINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valeur",
                            		lv_valeur_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:382:6: ( (lv_valeur_5_0= RULE_INT ) )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:382:6: ( (lv_valeur_5_0= RULE_INT ) )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:383:1: (lv_valeur_5_0= RULE_INT )
                    {
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:383:1: (lv_valeur_5_0= RULE_INT )
                    // ../compil.dslcalculette/src-gen/compil/dslcalculette/parser/antlr/internal/InternalDCalc.g:384:3: lv_valeur_5_0= RULE_INT
                    {
                    lv_valeur_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerme816); 

                    			newLeafNode(lv_valeur_5_0, grammarAccess.getTermeAccess().getValeurINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valeur",
                            		lv_valeur_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerme"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleModel130 = new BitSet(new long[]{0x0000000000012012L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_entryRuleAbstractExpression166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExpression176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractExpression222 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAbstractExpression234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperande_in_ruleExpression327 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleExpression356 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_13_in_ruleExpression385 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperande_in_entryRuleOperande460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperande470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerme_in_ruleOperande517 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleOperande546 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_15_in_ruleOperande575 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOperande612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerme_in_entryRuleTerme650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerme660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTerme698 = new BitSet(new long[]{0x0000000000032010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerme720 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTerme731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTerme757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerme787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerme816 = new BitSet(new long[]{0x0000000000000002L});

}