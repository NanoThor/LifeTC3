package com.github.nanothor.lifetc3.ide.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.github.nanothor.lifetc3.ide.services.LifeTC3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLifeTC3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT_LITERAL", "RULE_FLOAT_LITERAL", "RULE_STRING_LITERAL", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'class'", "';'", "'var'", "','", "':'", "'='", "'True'", "'False'", "'string'", "'int'", "'float'", "'boolean'"
    };
    public static final int RULE_STRING=11;
    public static final int RULE_STRING_LITERAL=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_FLOAT_LITERAL=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT_LITERAL=5;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLifeTC3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLifeTC3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLifeTC3Parser.tokenNames; }
    public String getGrammarFileName() { return "../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g"; }



     	private LifeTC3GrammarAccess grammarAccess;
     	
        public InternalLifeTC3Parser(TokenStream input, LifeTC3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Prog";	
       	}
       	
       	@Override
       	protected LifeTC3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProg"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:67:1: entryRuleProg returns [EObject current=null] : iv_ruleProg= ruleProg EOF ;
    public final EObject entryRuleProg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProg = null;


        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:68:2: (iv_ruleProg= ruleProg EOF )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:69:2: iv_ruleProg= ruleProg EOF
            {
             newCompositeNode(grammarAccess.getProgRule()); 
            pushFollow(FOLLOW_ruleProg_in_entryRuleProg75);
            iv_ruleProg=ruleProg();

            state._fsp--;

             current =iv_ruleProg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProg85); 

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
    // $ANTLR end "entryRuleProg"


    // $ANTLR start "ruleProg"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:76:1: ruleProg returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( ( (lv_vc_3_0= ruleVariable ) ) | ( (lv_vc_4_0= ruleConstant ) ) )* ) ;
    public final EObject ruleProg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_vc_3_0 = null;

        EObject lv_vc_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:79:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( ( (lv_vc_3_0= ruleVariable ) ) | ( (lv_vc_4_0= ruleConstant ) ) )* ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( ( (lv_vc_3_0= ruleVariable ) ) | ( (lv_vc_4_0= ruleConstant ) ) )* )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( ( (lv_vc_3_0= ruleVariable ) ) | ( (lv_vc_4_0= ruleConstant ) ) )* )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:80:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( ( (lv_vc_3_0= ruleVariable ) ) | ( (lv_vc_4_0= ruleConstant ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProg122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgAccess().getClassKeyword_0());
                
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:85:1: (lv_name_1_0= RULE_ID )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProg139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProgAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProgRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProg156); 

                	newLeafNode(otherlv_2, grammarAccess.getProgAccess().getSemicolonKeyword_2());
                
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:106:1: ( ( (lv_vc_3_0= ruleVariable ) ) | ( (lv_vc_4_0= ruleConstant ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=22 && LA1_0<=25)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:106:2: ( (lv_vc_3_0= ruleVariable ) )
            	    {
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:106:2: ( (lv_vc_3_0= ruleVariable ) )
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:107:1: (lv_vc_3_0= ruleVariable )
            	    {
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:107:1: (lv_vc_3_0= ruleVariable )
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:108:3: lv_vc_3_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgAccess().getVcVariableParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleProg178);
            	    lv_vc_3_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vc",
            	            		lv_vc_3_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:125:6: ( (lv_vc_4_0= ruleConstant ) )
            	    {
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:125:6: ( (lv_vc_4_0= ruleConstant ) )
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:126:1: (lv_vc_4_0= ruleConstant )
            	    {
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:126:1: (lv_vc_4_0= ruleConstant )
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:127:3: lv_vc_4_0= ruleConstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgAccess().getVcConstantParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstant_in_ruleProg205);
            	    lv_vc_4_0=ruleConstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vc",
            	            		lv_vc_4_0, 
            	            		"Constant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleProg"


    // $ANTLR start "entryRuleVariable"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:151:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:152:2: (iv_ruleVariable= ruleVariable EOF )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:153:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable243);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable253); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:160:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ':' ruleType otherlv_6= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_names_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:163:28: ( (otherlv_0= 'var' ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ':' ruleType otherlv_6= ';' ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:164:1: (otherlv_0= 'var' ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ':' ruleType otherlv_6= ';' )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:164:1: (otherlv_0= 'var' ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ':' ruleType otherlv_6= ';' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:164:3: otherlv_0= 'var' ( (lv_names_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )* otherlv_4= ':' ruleType otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleVariable290); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
                
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:168:1: ( (lv_names_1_0= RULE_ID ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:169:1: (lv_names_1_0= RULE_ID )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:169:1: (lv_names_1_0= RULE_ID )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:170:3: lv_names_1_0= RULE_ID
            {
            lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable307); 

            			newLeafNode(lv_names_1_0, grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"names",
                    		lv_names_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:186:2: (otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:186:4: otherlv_2= ',' ( (lv_names_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleVariable325); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:190:1: ( (lv_names_3_0= RULE_ID ) )
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:191:1: (lv_names_3_0= RULE_ID )
            	    {
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:191:1: (lv_names_3_0= RULE_ID )
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:192:3: lv_names_3_0= RULE_ID
            	    {
            	    lv_names_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable342); 

            	    			newLeafNode(lv_names_3_0, grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVariableRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"names",
            	            		lv_names_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleVariable361); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getColonKeyword_3());
                
             
                    newCompositeNode(grammarAccess.getVariableAccess().getTypeParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleVariable377);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleVariable388); 

                	newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleConstant"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:232:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:233:2: (iv_ruleConstant= ruleConstant EOF )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:234:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant424);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant434); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:241:1: ruleConstant returns [EObject current=null] : ( ruleType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (this_INT_LITERAL_3= RULE_INT_LITERAL | this_FLOAT_LITERAL_4= RULE_FLOAT_LITERAL | this_STRING_LITERAL_5= RULE_STRING_LITERAL | otherlv_6= 'True' | otherlv_7= 'False' ) otherlv_8= ';' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_INT_LITERAL_3=null;
        Token this_FLOAT_LITERAL_4=null;
        Token this_STRING_LITERAL_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:244:28: ( ( ruleType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (this_INT_LITERAL_3= RULE_INT_LITERAL | this_FLOAT_LITERAL_4= RULE_FLOAT_LITERAL | this_STRING_LITERAL_5= RULE_STRING_LITERAL | otherlv_6= 'True' | otherlv_7= 'False' ) otherlv_8= ';' ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:245:1: ( ruleType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (this_INT_LITERAL_3= RULE_INT_LITERAL | this_FLOAT_LITERAL_4= RULE_FLOAT_LITERAL | this_STRING_LITERAL_5= RULE_STRING_LITERAL | otherlv_6= 'True' | otherlv_7= 'False' ) otherlv_8= ';' )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:245:1: ( ruleType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (this_INT_LITERAL_3= RULE_INT_LITERAL | this_FLOAT_LITERAL_4= RULE_FLOAT_LITERAL | this_STRING_LITERAL_5= RULE_STRING_LITERAL | otherlv_6= 'True' | otherlv_7= 'False' ) otherlv_8= ';' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:246:5: ruleType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (this_INT_LITERAL_3= RULE_INT_LITERAL | this_FLOAT_LITERAL_4= RULE_FLOAT_LITERAL | this_STRING_LITERAL_5= RULE_STRING_LITERAL | otherlv_6= 'True' | otherlv_7= 'False' ) otherlv_8= ';'
            {
             
                    newCompositeNode(grammarAccess.getConstantAccess().getTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleConstant475);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:253:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:254:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:254:1: (lv_name_1_0= RULE_ID )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:255:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant491); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleConstant508); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
                
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:275:1: (this_INT_LITERAL_3= RULE_INT_LITERAL | this_FLOAT_LITERAL_4= RULE_FLOAT_LITERAL | this_STRING_LITERAL_5= RULE_STRING_LITERAL | otherlv_6= 'True' | otherlv_7= 'False' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_INT_LITERAL:
                {
                alt3=1;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt3=2;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:275:2: this_INT_LITERAL_3= RULE_INT_LITERAL
                    {
                    this_INT_LITERAL_3=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleConstant520); 
                     
                        newLeafNode(this_INT_LITERAL_3, grammarAccess.getConstantAccess().getINT_LITERALTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:280:6: this_FLOAT_LITERAL_4= RULE_FLOAT_LITERAL
                    {
                    this_FLOAT_LITERAL_4=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_RULE_FLOAT_LITERAL_in_ruleConstant536); 
                     
                        newLeafNode(this_FLOAT_LITERAL_4, grammarAccess.getConstantAccess().getFLOAT_LITERALTerminalRuleCall_3_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:285:6: this_STRING_LITERAL_5= RULE_STRING_LITERAL
                    {
                    this_STRING_LITERAL_5=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleConstant552); 
                     
                        newLeafNode(this_STRING_LITERAL_5, grammarAccess.getConstantAccess().getSTRING_LITERALTerminalRuleCall_3_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:290:7: otherlv_6= 'True'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleConstant569); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantAccess().getTrueKeyword_3_3());
                        

                    }
                    break;
                case 5 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:295:7: otherlv_7= 'False'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleConstant587); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstantAccess().getFalseKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleConstant600); 

                	newLeafNode(otherlv_8, grammarAccess.getConstantAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleType"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:311:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:312:2: (iv_ruleType= ruleType EOF )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:313:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType637);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType648); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:320:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:323:28: ( (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:324:1: (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:324:1: (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:325:2: kw= 'string'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleType686); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:332:2: kw= 'int'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleType705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:339:2: kw= 'float'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleType724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:346:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleType743); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_3()); 
                        

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProg_in_entryRuleProg75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProg85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProg122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProg139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProg156 = new BitSet(new long[]{0x0000000003C10002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleProg178 = new BitSet(new long[]{0x0000000003C10002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleProg205 = new BitSet(new long[]{0x0000000003C10002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVariable290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable307 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleVariable325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable342 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleVariable361 = new BitSet(new long[]{0x0000000003C10000L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable377 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariable388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstant475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant491 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstant508 = new BitSet(new long[]{0x00000000003000E0L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleConstant520 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_FLOAT_LITERAL_in_ruleConstant536 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleConstant552 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20_in_ruleConstant569 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21_in_ruleConstant587 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstant600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleType743 = new BitSet(new long[]{0x0000000000000002L});

}