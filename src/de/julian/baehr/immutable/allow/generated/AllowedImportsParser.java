// Generated from AllowedImports.g4 by ANTLR 4.4

	package de.julian.baehr.immutable.allow.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AllowedImportsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALLOW=1, ALL=2, FROM=3, EXCEPT=4, COMMA=5, SEMICOLON=6, DOT=7, PLUS=8, 
		NAME=9, WHITE_SPACE=10, MULTILINE_COMMENT=11, SINGLELINE_COMMENT=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'allow'", "'all'", "'from'", "'except'", "','", "';'", "'.'", 
		"'+'", "NAME", "WHITE_SPACE", "MULTILINE_COMMENT", "SINGLELINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_fullyQualifiedName = 1, RULE_subPackages = 2, 
		RULE_listOfNames = 3, RULE_allowedImport = 4;
	public static final String[] ruleNames = {
		"compilationUnit", "fullyQualifiedName", "subPackages", "listOfNames", 
		"allowedImport"
	};

	@Override
	public String getGrammarFileName() { return "AllowedImports.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AllowedImportsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AllowedImportsParser.EOF, 0); }
		public AllowedImportContext allowedImport(int i) {
			return getRuleContext(AllowedImportContext.class,i);
		}
		public List<AllowedImportContext> allowedImport() {
			return getRuleContexts(AllowedImportContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALLOW) {
				{
				{
				setState(10); allowedImport();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullyQualifiedNameContext extends ParserRuleContext {
		public TerminalNode NAME(int i) {
			return getToken(AllowedImportsParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AllowedImportsParser.DOT); }
		public List<TerminalNode> NAME() { return getTokens(AllowedImportsParser.NAME); }
		public TerminalNode DOT(int i) {
			return getToken(AllowedImportsParser.DOT, i);
		}
		public FullyQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullyQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterFullyQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitFullyQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitFullyQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullyQualifiedNameContext fullyQualifiedName() throws RecognitionException {
		FullyQualifiedNameContext _localctx = new FullyQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fullyQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(NAME);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(19); match(DOT);
				setState(20); match(NAME);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubPackagesContext extends ParserRuleContext {
		public TerminalNode NAME(int i) {
			return getToken(AllowedImportsParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AllowedImportsParser.DOT); }
		public List<TerminalNode> NAME() { return getTokens(AllowedImportsParser.NAME); }
		public TerminalNode PLUS() { return getToken(AllowedImportsParser.PLUS, 0); }
		public TerminalNode DOT(int i) {
			return getToken(AllowedImportsParser.DOT, i);
		}
		public SubPackagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subPackages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterSubPackages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitSubPackages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitSubPackages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPackagesContext subPackages() throws RecognitionException {
		SubPackagesContext _localctx = new SubPackagesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subPackages);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(NAME);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27); match(DOT);
					setState(28); match(NAME);
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(34); match(DOT);
			setState(35); match(PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOfNamesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AllowedImportsParser.NAME, 0); }
		public TerminalNode COMMA() { return getToken(AllowedImportsParser.COMMA, 0); }
		public ListOfNamesContext listOfNames() {
			return getRuleContext(ListOfNamesContext.class,0);
		}
		public ListOfNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterListOfNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitListOfNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitListOfNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfNamesContext listOfNames() throws RecognitionException {
		return listOfNames(0);
	}

	private ListOfNamesContext listOfNames(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListOfNamesContext _localctx = new ListOfNamesContext(_ctx, _parentState);
		ListOfNamesContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_listOfNames, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(38); match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ListOfNamesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_listOfNames);
						setState(40);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(41); match(COMMA);
						setState(42); match(NAME);
						}
						break;
					case 2:
						{
						_localctx = new ListOfNamesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_listOfNames);
						setState(43);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(44); match(COMMA);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AllowedImportContext extends ParserRuleContext {
		public AllowedImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowedImport; }
	 
		public AllowedImportContext() { }
		public void copyFrom(AllowedImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllowMultipleClassesContext extends AllowedImportContext {
		public ListOfNamesContext allowedClasses;
		public FullyQualifiedNameContext allowedPackage;
		public TerminalNode SEMICOLON() { return getToken(AllowedImportsParser.SEMICOLON, 0); }
		public TerminalNode ALLOW() { return getToken(AllowedImportsParser.ALLOW, 0); }
		public ListOfNamesContext listOfNames() {
			return getRuleContext(ListOfNamesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AllowedImportsParser.FROM, 0); }
		public FullyQualifiedNameContext fullyQualifiedName() {
			return getRuleContext(FullyQualifiedNameContext.class,0);
		}
		public AllowMultipleClassesContext(AllowedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterAllowMultipleClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitAllowMultipleClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitAllowMultipleClasses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllowSomePackageContext extends AllowedImportContext {
		public FullyQualifiedNameContext allowedPackage;
		public ListOfNamesContext disallowedClasses;
		public TerminalNode SEMICOLON() { return getToken(AllowedImportsParser.SEMICOLON, 0); }
		public TerminalNode ALLOW() { return getToken(AllowedImportsParser.ALLOW, 0); }
		public ListOfNamesContext listOfNames() {
			return getRuleContext(ListOfNamesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AllowedImportsParser.FROM, 0); }
		public TerminalNode EXCEPT() { return getToken(AllowedImportsParser.EXCEPT, 0); }
		public FullyQualifiedNameContext fullyQualifiedName() {
			return getRuleContext(FullyQualifiedNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(AllowedImportsParser.ALL, 0); }
		public AllowSomePackageContext(AllowedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterAllowSomePackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitAllowSomePackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitAllowSomePackage(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllowSingleClassContext extends AllowedImportContext {
		public FullyQualifiedNameContext allowedClass;
		public TerminalNode SEMICOLON() { return getToken(AllowedImportsParser.SEMICOLON, 0); }
		public TerminalNode ALLOW() { return getToken(AllowedImportsParser.ALLOW, 0); }
		public FullyQualifiedNameContext fullyQualifiedName() {
			return getRuleContext(FullyQualifiedNameContext.class,0);
		}
		public AllowSingleClassContext(AllowedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterAllowSingleClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitAllowSingleClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitAllowSingleClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllowSubPackagesContext extends AllowedImportContext {
		public SubPackagesContext allowedPackage;
		public TerminalNode SEMICOLON() { return getToken(AllowedImportsParser.SEMICOLON, 0); }
		public SubPackagesContext subPackages() {
			return getRuleContext(SubPackagesContext.class,0);
		}
		public TerminalNode ALLOW() { return getToken(AllowedImportsParser.ALLOW, 0); }
		public TerminalNode FROM() { return getToken(AllowedImportsParser.FROM, 0); }
		public TerminalNode ALL() { return getToken(AllowedImportsParser.ALL, 0); }
		public AllowSubPackagesContext(AllowedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterAllowSubPackages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitAllowSubPackages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitAllowSubPackages(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllowAllPackageContext extends AllowedImportContext {
		public FullyQualifiedNameContext allowedPackage;
		public TerminalNode SEMICOLON() { return getToken(AllowedImportsParser.SEMICOLON, 0); }
		public TerminalNode ALLOW() { return getToken(AllowedImportsParser.ALLOW, 0); }
		public TerminalNode FROM() { return getToken(AllowedImportsParser.FROM, 0); }
		public FullyQualifiedNameContext fullyQualifiedName() {
			return getRuleContext(FullyQualifiedNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(AllowedImportsParser.ALL, 0); }
		public AllowAllPackageContext(AllowedImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).enterAllowAllPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AllowedImportsListener ) ((AllowedImportsListener)listener).exitAllowAllPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AllowedImportsVisitor ) return ((AllowedImportsVisitor<? extends T>)visitor).visitAllowAllPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllowedImportContext allowedImport() throws RecognitionException {
		AllowedImportContext _localctx = new AllowedImportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_allowedImport);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AllowSingleClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50); match(ALLOW);
				setState(51); ((AllowSingleClassContext)_localctx).allowedClass = fullyQualifiedName();
				setState(52); match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new AllowMultipleClassesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(ALLOW);
				setState(55); ((AllowMultipleClassesContext)_localctx).allowedClasses = listOfNames(0);
				setState(56); match(FROM);
				setState(57); ((AllowMultipleClassesContext)_localctx).allowedPackage = fullyQualifiedName();
				setState(58); match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new AllowSomePackageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60); match(ALLOW);
				setState(61); match(ALL);
				setState(62); match(FROM);
				setState(63); ((AllowSomePackageContext)_localctx).allowedPackage = fullyQualifiedName();
				setState(64); match(EXCEPT);
				setState(65); ((AllowSomePackageContext)_localctx).disallowedClasses = listOfNames(0);
				setState(66); match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new AllowAllPackageContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68); match(ALLOW);
				setState(69); match(ALL);
				setState(70); match(FROM);
				setState(71); ((AllowAllPackageContext)_localctx).allowedPackage = fullyQualifiedName();
				setState(72); match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new AllowSubPackagesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(74); match(ALLOW);
				setState(75); match(ALL);
				setState(76); match(FROM);
				setState(77); ((AllowSubPackagesContext)_localctx).allowedPackage = subPackages();
				setState(78); match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return listOfNames_sempred((ListOfNamesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listOfNames_sempred(ListOfNamesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\6"+
		"\2\3\b\7\2\4\6\b\n\2\2X\2\17\3\2\2\2\4\24\3\2\2\2\6\34\3\2\2\2\b\'\3\2"+
		"\2\2\nR\3\2\2\2\f\16\5\n\6\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17"+
		"\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24"+
		"\31\7\13\2\2\25\26\7\t\2\2\26\30\7\13\2\2\27\25\3\2\2\2\30\33\3\2\2\2"+
		"\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2\2\2\34!\7\13\2\2\35"+
		"\36\7\t\2\2\36 \7\13\2\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2"+
		"\2\"$\3\2\2\2#!\3\2\2\2$%\7\t\2\2%&\7\n\2\2&\7\3\2\2\2\'(\b\5\1\2()\7"+
		"\13\2\2)\61\3\2\2\2*+\f\4\2\2+,\7\7\2\2,\60\7\13\2\2-.\f\3\2\2.\60\7\7"+
		"\2\2/*\3\2\2\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\t"+
		"\3\2\2\2\63\61\3\2\2\2\64\65\7\3\2\2\65\66\5\4\3\2\66\67\7\b\2\2\67S\3"+
		"\2\2\289\7\3\2\29:\5\b\5\2:;\7\5\2\2;<\5\4\3\2<=\7\b\2\2=S\3\2\2\2>?\7"+
		"\3\2\2?@\7\4\2\2@A\7\5\2\2AB\5\4\3\2BC\7\6\2\2CD\5\b\5\2DE\7\b\2\2ES\3"+
		"\2\2\2FG\7\3\2\2GH\7\4\2\2HI\7\5\2\2IJ\5\4\3\2JK\7\b\2\2KS\3\2\2\2LM\7"+
		"\3\2\2MN\7\4\2\2NO\7\5\2\2OP\5\6\4\2PQ\7\b\2\2QS\3\2\2\2R\64\3\2\2\2R"+
		"8\3\2\2\2R>\3\2\2\2RF\3\2\2\2RL\3\2\2\2S\13\3\2\2\2\b\17\31!/\61R";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}