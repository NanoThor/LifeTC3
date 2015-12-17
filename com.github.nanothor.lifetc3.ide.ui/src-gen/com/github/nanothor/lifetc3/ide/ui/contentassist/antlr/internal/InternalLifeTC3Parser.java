package com.github.nanothor.lifetc3.ide.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.github.nanothor.lifetc3.ide.services.LifeTC3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLifeTC3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT_LITERAL", "RULE_FLOAT_LITERAL", "RULE_STRING_LITERAL", "RULE_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'string'", "'int'", "'float'", "'boolean'", "'class'", "';'", "'var'", "':'", "','", "'='"
    };
    public static final int RULE_STRING=11;
    public static final int RULE_STRING_LITERAL=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_FLOAT_LITERAL=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT_LITERAL=4;
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
    public String getGrammarFileName() { return "../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g"; }


     
     	private LifeTC3GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LifeTC3GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProg"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:60:1: entryRuleProg : ruleProg EOF ;
    public final void entryRuleProg() throws RecognitionException {
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:61:1: ( ruleProg EOF )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:62:1: ruleProg EOF
            {
             before(grammarAccess.getProgRule()); 
            pushFollow(FOLLOW_ruleProg_in_entryRuleProg61);
            ruleProg();

            state._fsp--;

             after(grammarAccess.getProgRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProg68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProg"


    // $ANTLR start "ruleProg"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:69:1: ruleProg : ( ( rule__Prog__Group__0 ) ) ;
    public final void ruleProg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:73:2: ( ( ( rule__Prog__Group__0 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:74:1: ( ( rule__Prog__Group__0 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:74:1: ( ( rule__Prog__Group__0 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:75:1: ( rule__Prog__Group__0 )
            {
             before(grammarAccess.getProgAccess().getGroup()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:76:1: ( rule__Prog__Group__0 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:76:2: rule__Prog__Group__0
            {
            pushFollow(FOLLOW_rule__Prog__Group__0_in_ruleProg94);
            rule__Prog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProg"


    // $ANTLR start "entryRuleVariable"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:88:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:89:1: ( ruleVariable EOF )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:90:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable121);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:97:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:101:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:102:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:102:1: ( ( rule__Variable__Group__0 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:103:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:104:1: ( rule__Variable__Group__0 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:104:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable154);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleConstant"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:116:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:117:1: ( ruleConstant EOF )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:118:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant181);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:125:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:129:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:130:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:130:1: ( ( rule__Constant__Group__0 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:131:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:132:1: ( rule__Constant__Group__0 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:132:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant214);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleType"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:144:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:145:1: ( ruleType EOF )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:146:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType241);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:153:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:157:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:158:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:158:1: ( ( rule__Type__Alternatives ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:159:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:160:1: ( rule__Type__Alternatives )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:160:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType274);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Prog__Alternatives_3"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:172:1: rule__Prog__Alternatives_3 : ( ( ( rule__Prog__VcAssignment_3_0 ) ) | ( ( rule__Prog__VcAssignment_3_1 ) ) );
    public final void rule__Prog__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:176:1: ( ( ( rule__Prog__VcAssignment_3_0 ) ) | ( ( rule__Prog__VcAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=19)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:177:1: ( ( rule__Prog__VcAssignment_3_0 ) )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:177:1: ( ( rule__Prog__VcAssignment_3_0 ) )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:178:1: ( rule__Prog__VcAssignment_3_0 )
                    {
                     before(grammarAccess.getProgAccess().getVcAssignment_3_0()); 
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:179:1: ( rule__Prog__VcAssignment_3_0 )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:179:2: rule__Prog__VcAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Prog__VcAssignment_3_0_in_rule__Prog__Alternatives_3310);
                    rule__Prog__VcAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgAccess().getVcAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:183:6: ( ( rule__Prog__VcAssignment_3_1 ) )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:183:6: ( ( rule__Prog__VcAssignment_3_1 ) )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:184:1: ( rule__Prog__VcAssignment_3_1 )
                    {
                     before(grammarAccess.getProgAccess().getVcAssignment_3_1()); 
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:185:1: ( rule__Prog__VcAssignment_3_1 )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:185:2: rule__Prog__VcAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Prog__VcAssignment_3_1_in_rule__Prog__Alternatives_3328);
                    rule__Prog__VcAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgAccess().getVcAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Alternatives_3"


    // $ANTLR start "rule__Constant__Alternatives_3"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:194:1: rule__Constant__Alternatives_3 : ( ( RULE_INT_LITERAL ) | ( RULE_FLOAT_LITERAL ) | ( RULE_STRING_LITERAL ) | ( 'True' ) | ( 'False' ) );
    public final void rule__Constant__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:198:1: ( ( RULE_INT_LITERAL ) | ( RULE_FLOAT_LITERAL ) | ( RULE_STRING_LITERAL ) | ( 'True' ) | ( 'False' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_INT_LITERAL:
                {
                alt2=1;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt2=2;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:199:1: ( RULE_INT_LITERAL )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:199:1: ( RULE_INT_LITERAL )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:200:1: RULE_INT_LITERAL
                    {
                     before(grammarAccess.getConstantAccess().getINT_LITERALTerminalRuleCall_3_0()); 
                    match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_rule__Constant__Alternatives_3361); 
                     after(grammarAccess.getConstantAccess().getINT_LITERALTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:205:6: ( RULE_FLOAT_LITERAL )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:205:6: ( RULE_FLOAT_LITERAL )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:206:1: RULE_FLOAT_LITERAL
                    {
                     before(grammarAccess.getConstantAccess().getFLOAT_LITERALTerminalRuleCall_3_1()); 
                    match(input,RULE_FLOAT_LITERAL,FOLLOW_RULE_FLOAT_LITERAL_in_rule__Constant__Alternatives_3378); 
                     after(grammarAccess.getConstantAccess().getFLOAT_LITERALTerminalRuleCall_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:211:6: ( RULE_STRING_LITERAL )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:211:6: ( RULE_STRING_LITERAL )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:212:1: RULE_STRING_LITERAL
                    {
                     before(grammarAccess.getConstantAccess().getSTRING_LITERALTerminalRuleCall_3_2()); 
                    match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_rule__Constant__Alternatives_3395); 
                     after(grammarAccess.getConstantAccess().getSTRING_LITERALTerminalRuleCall_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:217:6: ( 'True' )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:217:6: ( 'True' )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:218:1: 'True'
                    {
                     before(grammarAccess.getConstantAccess().getTrueKeyword_3_3()); 
                    match(input,14,FOLLOW_14_in_rule__Constant__Alternatives_3413); 
                     after(grammarAccess.getConstantAccess().getTrueKeyword_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:225:6: ( 'False' )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:225:6: ( 'False' )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:226:1: 'False'
                    {
                     before(grammarAccess.getConstantAccess().getFalseKeyword_3_4()); 
                    match(input,15,FOLLOW_15_in_rule__Constant__Alternatives_3433); 
                     after(grammarAccess.getConstantAccess().getFalseKeyword_3_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives_3"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:238:1: rule__Type__Alternatives : ( ( 'string' ) | ( 'int' ) | ( 'float' ) | ( 'boolean' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:242:1: ( ( 'string' ) | ( 'int' ) | ( 'float' ) | ( 'boolean' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:243:1: ( 'string' )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:243:1: ( 'string' )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:244:1: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives468); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:251:6: ( 'int' )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:251:6: ( 'int' )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:252:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives488); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:259:6: ( 'float' )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:259:6: ( 'float' )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:260:1: 'float'
                    {
                     before(grammarAccess.getTypeAccess().getFloatKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives508); 
                     after(grammarAccess.getTypeAccess().getFloatKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:267:6: ( 'boolean' )
                    {
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:267:6: ( 'boolean' )
                    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:268:1: 'boolean'
                    {
                     before(grammarAccess.getTypeAccess().getBooleanKeyword_3()); 
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives528); 
                     after(grammarAccess.getTypeAccess().getBooleanKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Prog__Group__0"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:282:1: rule__Prog__Group__0 : rule__Prog__Group__0__Impl rule__Prog__Group__1 ;
    public final void rule__Prog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:286:1: ( rule__Prog__Group__0__Impl rule__Prog__Group__1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:287:2: rule__Prog__Group__0__Impl rule__Prog__Group__1
            {
            pushFollow(FOLLOW_rule__Prog__Group__0__Impl_in_rule__Prog__Group__0560);
            rule__Prog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prog__Group__1_in_rule__Prog__Group__0563);
            rule__Prog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__0"


    // $ANTLR start "rule__Prog__Group__0__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:294:1: rule__Prog__Group__0__Impl : ( 'class' ) ;
    public final void rule__Prog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:298:1: ( ( 'class' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:299:1: ( 'class' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:299:1: ( 'class' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:300:1: 'class'
            {
             before(grammarAccess.getProgAccess().getClassKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Prog__Group__0__Impl591); 
             after(grammarAccess.getProgAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__0__Impl"


    // $ANTLR start "rule__Prog__Group__1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:313:1: rule__Prog__Group__1 : rule__Prog__Group__1__Impl rule__Prog__Group__2 ;
    public final void rule__Prog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:317:1: ( rule__Prog__Group__1__Impl rule__Prog__Group__2 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:318:2: rule__Prog__Group__1__Impl rule__Prog__Group__2
            {
            pushFollow(FOLLOW_rule__Prog__Group__1__Impl_in_rule__Prog__Group__1622);
            rule__Prog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prog__Group__2_in_rule__Prog__Group__1625);
            rule__Prog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__1"


    // $ANTLR start "rule__Prog__Group__1__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:325:1: rule__Prog__Group__1__Impl : ( ( rule__Prog__NameAssignment_1 ) ) ;
    public final void rule__Prog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:329:1: ( ( ( rule__Prog__NameAssignment_1 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:330:1: ( ( rule__Prog__NameAssignment_1 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:330:1: ( ( rule__Prog__NameAssignment_1 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:331:1: ( rule__Prog__NameAssignment_1 )
            {
             before(grammarAccess.getProgAccess().getNameAssignment_1()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:332:1: ( rule__Prog__NameAssignment_1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:332:2: rule__Prog__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Prog__NameAssignment_1_in_rule__Prog__Group__1__Impl652);
            rule__Prog__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__1__Impl"


    // $ANTLR start "rule__Prog__Group__2"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:342:1: rule__Prog__Group__2 : rule__Prog__Group__2__Impl rule__Prog__Group__3 ;
    public final void rule__Prog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:346:1: ( rule__Prog__Group__2__Impl rule__Prog__Group__3 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:347:2: rule__Prog__Group__2__Impl rule__Prog__Group__3
            {
            pushFollow(FOLLOW_rule__Prog__Group__2__Impl_in_rule__Prog__Group__2682);
            rule__Prog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prog__Group__3_in_rule__Prog__Group__2685);
            rule__Prog__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__2"


    // $ANTLR start "rule__Prog__Group__2__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:354:1: rule__Prog__Group__2__Impl : ( ';' ) ;
    public final void rule__Prog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:358:1: ( ( ';' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:359:1: ( ';' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:359:1: ( ';' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:360:1: ';'
            {
             before(grammarAccess.getProgAccess().getSemicolonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Prog__Group__2__Impl713); 
             after(grammarAccess.getProgAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__2__Impl"


    // $ANTLR start "rule__Prog__Group__3"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:373:1: rule__Prog__Group__3 : rule__Prog__Group__3__Impl ;
    public final void rule__Prog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:377:1: ( rule__Prog__Group__3__Impl )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:378:2: rule__Prog__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Prog__Group__3__Impl_in_rule__Prog__Group__3744);
            rule__Prog__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__3"


    // $ANTLR start "rule__Prog__Group__3__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:384:1: rule__Prog__Group__3__Impl : ( ( rule__Prog__Alternatives_3 )* ) ;
    public final void rule__Prog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:388:1: ( ( ( rule__Prog__Alternatives_3 )* ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:389:1: ( ( rule__Prog__Alternatives_3 )* )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:389:1: ( ( rule__Prog__Alternatives_3 )* )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:390:1: ( rule__Prog__Alternatives_3 )*
            {
             before(grammarAccess.getProgAccess().getAlternatives_3()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:391:1: ( rule__Prog__Alternatives_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=19)||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:391:2: rule__Prog__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Prog__Alternatives_3_in_rule__Prog__Group__3__Impl771);
            	    rule__Prog__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:409:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:413:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:414:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0810);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0813);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:421:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:425:1: ( ( 'var' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:426:1: ( 'var' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:426:1: ( 'var' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:427:1: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Variable__Group__0__Impl841); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:440:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:444:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:445:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1872);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1875);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:452:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NamesAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:456:1: ( ( ( rule__Variable__NamesAssignment_1 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:457:1: ( ( rule__Variable__NamesAssignment_1 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:457:1: ( ( rule__Variable__NamesAssignment_1 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:458:1: ( rule__Variable__NamesAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:459:1: ( rule__Variable__NamesAssignment_1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:459:2: rule__Variable__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NamesAssignment_1_in_rule__Variable__Group__1__Impl902);
            rule__Variable__NamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:469:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:473:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:474:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2932);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__2935);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:481:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )* ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:485:1: ( ( ( rule__Variable__Group_2__0 )* ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:486:1: ( ( rule__Variable__Group_2__0 )* )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:486:1: ( ( rule__Variable__Group_2__0 )* )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:487:1: ( rule__Variable__Group_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:488:1: ( rule__Variable__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:488:2: rule__Variable__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl962);
            	    rule__Variable__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:498:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:502:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:503:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__3993);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__3996);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:510:1: rule__Variable__Group__3__Impl : ( ':' ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:514:1: ( ( ':' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:515:1: ( ':' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:515:1: ( ':' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:516:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Variable__Group__3__Impl1024); 
             after(grammarAccess.getVariableAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:529:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:533:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:534:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_rule__Variable__Group__4__Impl_in_rule__Variable__Group__41055);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__5_in_rule__Variable__Group__41058);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:541:1: rule__Variable__Group__4__Impl : ( ruleType ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:545:1: ( ( ruleType ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:546:1: ( ruleType )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:546:1: ( ruleType )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:547:1: ruleType
            {
             before(grammarAccess.getVariableAccess().getTypeParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleType_in_rule__Variable__Group__4__Impl1085);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:558:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:562:1: ( rule__Variable__Group__5__Impl )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:563:2: rule__Variable__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__5__Impl_in_rule__Variable__Group__51114);
            rule__Variable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:569:1: rule__Variable__Group__5__Impl : ( ';' ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:573:1: ( ( ';' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:574:1: ( ';' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:574:1: ( ';' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:575:1: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Variable__Group__5__Impl1142); 
             after(grammarAccess.getVariableAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group_2__0"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:600:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:604:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:605:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__01185);
            rule__Variable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__01188);
            rule__Variable__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0"


    // $ANTLR start "rule__Variable__Group_2__0__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:612:1: rule__Variable__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:616:1: ( ( ',' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:617:1: ( ',' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:617:1: ( ',' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:618:1: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Variable__Group_2__0__Impl1216); 
             after(grammarAccess.getVariableAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_2__1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:631:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:635:1: ( rule__Variable__Group_2__1__Impl )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:636:2: rule__Variable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__11247);
            rule__Variable__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1"


    // $ANTLR start "rule__Variable__Group_2__1__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:642:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__NamesAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:646:1: ( ( ( rule__Variable__NamesAssignment_2_1 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:647:1: ( ( rule__Variable__NamesAssignment_2_1 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:647:1: ( ( rule__Variable__NamesAssignment_2_1 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:648:1: ( rule__Variable__NamesAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_2_1()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:649:1: ( rule__Variable__NamesAssignment_2_1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:649:2: rule__Variable__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Variable__NamesAssignment_2_1_in_rule__Variable__Group_2__1__Impl1274);
            rule__Variable__NamesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:663:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:667:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:668:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__01308);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__01311);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:675:1: rule__Constant__Group__0__Impl : ( ruleType ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:679:1: ( ( ruleType ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:680:1: ( ruleType )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:680:1: ( ruleType )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:681:1: ruleType
            {
             before(grammarAccess.getConstantAccess().getTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Constant__Group__0__Impl1338);
            ruleType();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:692:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:696:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:697:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__11367);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__11370);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:704:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:708:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:709:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:709:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:710:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:711:1: ( rule__Constant__NameAssignment_1 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:711:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl1397);
            rule__Constant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:721:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:725:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:726:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__21427);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__21430);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:733:1: rule__Constant__Group__2__Impl : ( '=' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:737:1: ( ( '=' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:738:1: ( '=' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:738:1: ( '=' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:739:1: '='
            {
             before(grammarAccess.getConstantAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Constant__Group__2__Impl1458); 
             after(grammarAccess.getConstantAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:752:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:756:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:757:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__31489);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__31492);
            rule__Constant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:764:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__Alternatives_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:768:1: ( ( ( rule__Constant__Alternatives_3 ) ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:769:1: ( ( rule__Constant__Alternatives_3 ) )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:769:1: ( ( rule__Constant__Alternatives_3 ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:770:1: ( rule__Constant__Alternatives_3 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_3()); 
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:771:1: ( rule__Constant__Alternatives_3 )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:771:2: rule__Constant__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_3_in_rule__Constant__Group__3__Impl1519);
            rule__Constant__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:781:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:785:1: ( rule__Constant__Group__4__Impl )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:786:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__41549);
            rule__Constant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:792:1: rule__Constant__Group__4__Impl : ( ';' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:796:1: ( ( ';' ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:797:1: ( ';' )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:797:1: ( ';' )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:798:1: ';'
            {
             before(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Constant__Group__4__Impl1577); 
             after(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Prog__NameAssignment_1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:822:1: rule__Prog__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Prog__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:826:1: ( ( RULE_ID ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:827:1: ( RULE_ID )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:827:1: ( RULE_ID )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:828:1: RULE_ID
            {
             before(grammarAccess.getProgAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prog__NameAssignment_11623); 
             after(grammarAccess.getProgAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__NameAssignment_1"


    // $ANTLR start "rule__Prog__VcAssignment_3_0"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:837:1: rule__Prog__VcAssignment_3_0 : ( ruleVariable ) ;
    public final void rule__Prog__VcAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:841:1: ( ( ruleVariable ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:842:1: ( ruleVariable )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:842:1: ( ruleVariable )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:843:1: ruleVariable
            {
             before(grammarAccess.getProgAccess().getVcVariableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Prog__VcAssignment_3_01654);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getProgAccess().getVcVariableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__VcAssignment_3_0"


    // $ANTLR start "rule__Prog__VcAssignment_3_1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:852:1: rule__Prog__VcAssignment_3_1 : ( ruleConstant ) ;
    public final void rule__Prog__VcAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:856:1: ( ( ruleConstant ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:857:1: ( ruleConstant )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:857:1: ( ruleConstant )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:858:1: ruleConstant
            {
             before(grammarAccess.getProgAccess().getVcConstantParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstant_in_rule__Prog__VcAssignment_3_11685);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getProgAccess().getVcConstantParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prog__VcAssignment_3_1"


    // $ANTLR start "rule__Variable__NamesAssignment_1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:867:1: rule__Variable__NamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:871:1: ( ( RULE_ID ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:872:1: ( RULE_ID )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:872:1: ( RULE_ID )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:873:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NamesAssignment_11716); 
             after(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NamesAssignment_1"


    // $ANTLR start "rule__Variable__NamesAssignment_2_1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:882:1: rule__Variable__NamesAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:886:1: ( ( RULE_ID ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:887:1: ( RULE_ID )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:887:1: ( RULE_ID )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:888:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NamesAssignment_2_11747); 
             after(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NamesAssignment_2_1"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:897:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:901:1: ( ( RULE_ID ) )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:902:1: ( RULE_ID )
            {
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:902:1: ( RULE_ID )
            // ../com.github.nanothor.lifetc3.ide.ui/src-gen/com/github/nanothor/lifetc3/ide/ui/contentassist/antlr/internal/InternalLifeTC3.g:903:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_11778); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProg_in_entryRuleProg61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProg68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__Group__0_in_ruleProg94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__VcAssignment_3_0_in_rule__Prog__Alternatives_3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__VcAssignment_3_1_in_rule__Prog__Alternatives_3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_rule__Constant__Alternatives_3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_LITERAL_in_rule__Constant__Alternatives_3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_rule__Constant__Alternatives_3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Constant__Alternatives_3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Constant__Alternatives_3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__Group__0__Impl_in_rule__Prog__Group__0560 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Prog__Group__1_in_rule__Prog__Group__0563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Prog__Group__0__Impl591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__Group__1__Impl_in_rule__Prog__Group__1622 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Prog__Group__2_in_rule__Prog__Group__1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__NameAssignment_1_in_rule__Prog__Group__1__Impl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__Group__2__Impl_in_rule__Prog__Group__2682 = new BitSet(new long[]{0x00000000004F0000L});
    public static final BitSet FOLLOW_rule__Prog__Group__3_in_rule__Prog__Group__2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Prog__Group__2__Impl713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__Group__3__Impl_in_rule__Prog__Group__3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prog__Alternatives_3_in_rule__Prog__Group__3__Impl771 = new BitSet(new long[]{0x00000000004F0002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0810 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Variable__Group__0__Impl841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1872 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NamesAssignment_1_in_rule__Variable__Group__1__Impl902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2932 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl962 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__3993 = new BitSet(new long[]{0x00000000004F0000L});
    public static final BitSet FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Variable__Group__3__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__4__Impl_in_rule__Variable__Group__41055 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Variable__Group__5_in_rule__Variable__Group__41058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable__Group__4__Impl1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__5__Impl_in_rule__Variable__Group__51114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Variable__Group__5__Impl1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__01185 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__01188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable__Group_2__0__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NamesAssignment_2_1_in_rule__Variable__Group_2__1__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__01308 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__01311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Constant__Group__0__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__11367 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__21427 = new BitSet(new long[]{0x000000000000C070L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__21430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constant__Group__2__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__31489 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__31492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_3_in_rule__Constant__Group__3__Impl1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__41549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constant__Group__4__Impl1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prog__NameAssignment_11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Prog__VcAssignment_3_01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Prog__VcAssignment_3_11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NamesAssignment_11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NamesAssignment_2_11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_11778 = new BitSet(new long[]{0x0000000000000002L});

}