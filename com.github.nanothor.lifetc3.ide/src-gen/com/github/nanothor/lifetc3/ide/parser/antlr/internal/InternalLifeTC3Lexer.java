package com.github.nanothor.lifetc3.ide.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLifeTC3Lexer extends Lexer {
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

    public InternalLifeTC3Lexer() {;} 
    public InternalLifeTC3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLifeTC3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:11:7: ( 'class' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:11:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:12:7: ( ';' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:13:7: ( 'var' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:13:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:14:7: ( ',' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:15:7: ( ':' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:16:7: ( '=' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:17:7: ( 'True' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:17:9: 'True'
            {
            match("True"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:18:7: ( 'False' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:18:9: 'False'
            {
            match("False"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:19:7: ( 'string' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:19:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:20:7: ( 'int' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:20:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:21:7: ( 'float' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:21:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:22:7: ( 'boolean' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:22:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:358:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:358:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:358:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT_LITERAL"
    public final void mRULE_INT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:360:18: ( ( '0' .. '9' )+ )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:360:20: ( '0' .. '9' )+
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:360:20: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:360:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_LITERAL"

    // $ANTLR start "RULE_FLOAT_LITERAL"
    public final void mRULE_FLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:20: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:22: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:22: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:23: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:34: ( '.' ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:35: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:39: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:362:40: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_LITERAL"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:364:21: ( '\"' ( . )* '\"' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:364:23: '\"' ( . )* '\"'
            {
            match('\"'); 
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:364:27: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\"') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:364:27: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:366:17: ( '//' (~ ( '\\n' ) )* )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:366:19: '//' (~ ( '\\n' ) )*
            {
            match("//"); 

            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:366:24: (~ ( '\\n' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:366:24: ~ ( '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:368:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:368:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:368:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:368:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:370:10: ( ( '0' .. '9' )+ )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:370:12: ( '0' .. '9' )+
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:370:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:370:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:372:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:374:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:374:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:374:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:376:16: ( . )
            // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:376:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ID | RULE_INT_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING_LITERAL | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt14=22;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:90: RULE_INT_LITERAL
                {
                mRULE_INT_LITERAL(); 

                }
                break;
            case 15 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:107: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 16 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:126: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 17 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:146: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:162: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:178: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:187: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../com.github.nanothor.lifetc3.ide/src-gen/com/github/nanothor/lifetc3/ide/parser/antlr/internal/InternalLifeTC3.g:1:207: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\25\1\uffff\1\25\3\uffff\6\25\1\uffff\1\41\3\23\2\uffff"+
        "\1\25\2\uffff\1\25\3\uffff\6\25\1\uffff\1\41\10\uffff\1\25\1\67"+
        "\3\25\1\73\2\25\1\65\2\uffff\1\25\1\uffff\1\77\2\25\1\uffff\2\25"+
        "\1\104\1\uffff\1\105\1\25\1\107\1\25\2\uffff\1\111\1\uffff\1\25"+
        "\1\uffff\1\113\1\uffff";
    static final String DFA14_eofS =
        "\114\uffff";
    static final String DFA14_minS =
        "\1\0\1\154\1\uffff\1\141\3\uffff\1\162\1\141\1\164\1\156\1\154"+
        "\1\157\1\uffff\1\56\1\0\1\52\1\0\2\uffff\1\141\2\uffff\1\162\3\uffff"+
        "\1\165\1\154\1\162\1\164\2\157\1\uffff\1\56\1\uffff\2\0\5\uffff"+
        "\1\163\1\60\1\145\1\163\1\151\1\60\1\141\1\154\2\0\1\uffff\1\163"+
        "\1\uffff\1\60\1\145\1\156\1\uffff\1\164\1\145\1\60\1\uffff\1\60"+
        "\1\147\1\60\1\141\2\uffff\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\154\1\uffff\1\141\3\uffff\1\162\1\141\1\164\1\156\1"+
        "\154\1\157\1\uffff\1\71\1\uffff\1\57\1\uffff\2\uffff\1\141\2\uffff"+
        "\1\162\3\uffff\1\165\1\154\1\162\1\164\2\157\1\uffff\1\71\1\uffff"+
        "\2\uffff\5\uffff\1\163\1\172\1\145\1\163\1\151\1\172\1\141\1\154"+
        "\2\uffff\1\uffff\1\163\1\uffff\1\172\1\145\1\156\1\uffff\1\164\1"+
        "\145\1\172\1\uffff\1\172\1\147\1\172\1\141\2\uffff\1\172\1\uffff"+
        "\1\156\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\6\uffff\1\15\4\uffff\1\25\1\26"+
        "\1\uffff\1\15\1\2\1\uffff\1\4\1\5\1\6\6\uffff\1\16\1\uffff\1\17"+
        "\2\uffff\1\20\1\21\1\22\1\24\1\25\12\uffff\1\20\1\uffff\1\3\3\uffff"+
        "\1\12\3\uffff\1\7\4\uffff\1\1\1\10\1\uffff\1\13\1\uffff\1\11\1\uffff"+
        "\1\14";
    static final String DFA14_specialS =
        "\1\3\16\uffff\1\6\1\uffff\1\0\22\uffff\1\2\1\5\15\uffff\1\1\1\4"+
        "\27\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\21\4\23\1"+
            "\4\2\23\1\20\12\16\1\5\1\2\1\23\1\6\3\23\5\15\1\10\15\15\1\7"+
            "\6\15\6\23\1\15\1\14\1\1\2\15\1\13\2\15\1\12\11\15\1\11\2\15"+
            "\1\3\4\15\uff85\23",
            "\1\24",
            "",
            "\1\27",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\43\1\uffff\12\42",
            "\42\45\1\46\71\45\1\44\uffa3\45",
            "\1\50\4\uffff\1\47",
            "\0\51",
            "",
            "",
            "\1\53",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\43\1\uffff\12\42",
            "",
            "\42\64\1\63\uffdd\64",
            "\42\45\1\46\71\45\1\44\uffa3\45",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\74",
            "\1\75",
            "\42\45\1\46\71\45\1\44\uffa3\45",
            "\42\45\1\46\71\45\1\44\uffa3\45",
            "",
            "\1\76",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\106",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\110",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\112",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ID | RULE_INT_LITERAL | RULE_FLOAT_LITERAL | RULE_STRING_LITERAL | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 41;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_51 = input.LA(1);

                        s = -1;
                        if ( (LA14_51=='\"') ) {s = 38;}

                        else if ( (LA14_51=='\\') ) {s = 36;}

                        else if ( ((LA14_51>='\u0000' && LA14_51<='!')||(LA14_51>='#' && LA14_51<='[')||(LA14_51>=']' && LA14_51<='\uFFFF')) ) {s = 37;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( (LA14_36=='\"') ) {s = 51;}

                        else if ( ((LA14_36>='\u0000' && LA14_36<='!')||(LA14_36>='#' && LA14_36<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='c') ) {s = 1;}

                        else if ( (LA14_0==';') ) {s = 2;}

                        else if ( (LA14_0=='v') ) {s = 3;}

                        else if ( (LA14_0==',') ) {s = 4;}

                        else if ( (LA14_0==':') ) {s = 5;}

                        else if ( (LA14_0=='=') ) {s = 6;}

                        else if ( (LA14_0=='T') ) {s = 7;}

                        else if ( (LA14_0=='F') ) {s = 8;}

                        else if ( (LA14_0=='s') ) {s = 9;}

                        else if ( (LA14_0=='i') ) {s = 10;}

                        else if ( (LA14_0=='f') ) {s = 11;}

                        else if ( (LA14_0=='b') ) {s = 12;}

                        else if ( ((LA14_0>='A' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='S')||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='a'||(LA14_0>='d' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='u')||(LA14_0>='w' && LA14_0<='z')) ) {s = 13;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 14;}

                        else if ( (LA14_0=='\"') ) {s = 15;}

                        else if ( (LA14_0=='/') ) {s = 16;}

                        else if ( (LA14_0=='\'') ) {s = 17;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 18;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<='`')||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_52 = input.LA(1);

                        s = -1;
                        if ( (LA14_52=='\"') ) {s = 38;}

                        else if ( (LA14_52=='\\') ) {s = 36;}

                        else if ( ((LA14_52>='\u0000' && LA14_52<='!')||(LA14_52>='#' && LA14_52<='[')||(LA14_52>=']' && LA14_52<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_37 = input.LA(1);

                        s = -1;
                        if ( (LA14_37=='\"') ) {s = 38;}

                        else if ( (LA14_37=='\\') ) {s = 36;}

                        else if ( ((LA14_37>='\u0000' && LA14_37<='!')||(LA14_37>='#' && LA14_37<='[')||(LA14_37>=']' && LA14_37<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( (LA14_15=='\\') ) {s = 36;}

                        else if ( ((LA14_15>='\u0000' && LA14_15<='!')||(LA14_15>='#' && LA14_15<='[')||(LA14_15>=']' && LA14_15<='\uFFFF')) ) {s = 37;}

                        else if ( (LA14_15=='\"') ) {s = 38;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}