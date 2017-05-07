// Generated from Java.g4 by ANTLR 4.4

	package de.julian.baehr.immutable.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifierList = 4, RULE_modifier = 5, RULE_classOrInterfaceModifier = 6, 
		RULE_variableModifierList = 7, RULE_variableModifier = 8, RULE_classDeclaration = 9, 
		RULE_typeParameters = 10, RULE_typeParameter = 11, RULE_typeBound = 12, 
		RULE_enumDeclaration = 13, RULE_enumConstants = 14, RULE_enumConstant = 15, 
		RULE_enumBodyDeclarations = 16, RULE_interfaceDeclaration = 17, RULE_typeList = 18, 
		RULE_classBody = 19, RULE_interfaceBody = 20, RULE_classBodyDeclaration = 21, 
		RULE_memberDeclaration = 22, RULE_methodDeclaration = 23, RULE_genericMethodDeclaration = 24, 
		RULE_constructorDeclaration = 25, RULE_genericConstructorDeclaration = 26, 
		RULE_fieldDeclaration = 27, RULE_interfaceBodyDeclaration = 28, RULE_interfaceMemberDeclaration = 29, 
		RULE_constDeclaration = 30, RULE_constantDeclarator = 31, RULE_interfaceMethodDeclaration = 32, 
		RULE_genericInterfaceMethodDeclaration = 33, RULE_variableDeclarators = 34, 
		RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36, RULE_variableInitializer = 37, 
		RULE_arrayInitializer = 38, RULE_enumConstantName = 39, RULE_typeType = 40, 
		RULE_arrayDeclaration = 41, RULE_classOrInterfaceTypeList = 42, RULE_classOrInterfaceType = 43, 
		RULE_primitiveType = 44, RULE_typeArguments = 45, RULE_typeArgumentsList = 46, 
		RULE_typeArgument = 47, RULE_qualifiedNameList = 48, RULE_formalParameters = 49, 
		RULE_formalParameterList = 50, RULE_formalParameter = 51, RULE_lastFormalParameter = 52, 
		RULE_methodBody = 53, RULE_constructorBody = 54, RULE_qualifiedName = 55, 
		RULE_literal = 56, RULE_annotation = 57, RULE_annotationName = 58, RULE_elementValuePairs = 59, 
		RULE_elementValuePair = 60, RULE_elementValue = 61, RULE_elementValueArrayInitializer = 62, 
		RULE_annotationTypeDeclaration = 63, RULE_annotationTypeBody = 64, RULE_annotationTypeElementDeclaration = 65, 
		RULE_annotationTypeElementRest = 66, RULE_annotationMethodOrConstantRest = 67, 
		RULE_annotationMethod = 68, RULE_annotationConstant = 69, RULE_annotationMethodRest = 70, 
		RULE_annotationConstantRest = 71, RULE_defaultValue = 72, RULE_block = 73, 
		RULE_blockStatement = 74, RULE_localVariableDeclarationStatement = 75, 
		RULE_localVariableDeclaration = 76, RULE_statement = 77, RULE_catchClause = 78, 
		RULE_catchType = 79, RULE_finallyBlock = 80, RULE_resourceSpecification = 81, 
		RULE_resources = 82, RULE_resource = 83, RULE_switchBlockStatementGroup = 84, 
		RULE_switchLabel = 85, RULE_forControl = 86, RULE_forInit = 87, RULE_enhancedForControl = 88, 
		RULE_forUpdate = 89, RULE_parExpression = 90, RULE_expressionList = 91, 
		RULE_statementExpression = 92, RULE_constantExpression = 93, RULE_expression = 94, 
		RULE_primary = 95, RULE_creator = 96, RULE_createdName = 97, RULE_innerCreator = 98, 
		RULE_arrayCreatorRest = 99, RULE_classCreatorRest = 100, RULE_explicitGenericInvocation = 101, 
		RULE_nonWildcardTypeArguments = 102, RULE_typeArgumentsOrDiamond = 103, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 104, RULE_superSuffix = 105, 
		RULE_explicitGenericInvocationSuffix = 106, RULE_arguments = 107;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifierList", "modifier", "classOrInterfaceModifier", "variableModifierList", 
		"variableModifier", "classDeclaration", "typeParameters", "typeParameter", 
		"typeBound", "enumDeclaration", "enumConstants", "enumConstant", "enumBodyDeclarations", 
		"interfaceDeclaration", "typeList", "classBody", "interfaceBody", "classBodyDeclaration", 
		"memberDeclaration", "methodDeclaration", "genericMethodDeclaration", 
		"constructorDeclaration", "genericConstructorDeclaration", "fieldDeclaration", 
		"interfaceBodyDeclaration", "interfaceMemberDeclaration", "constDeclaration", 
		"constantDeclarator", "interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", 
		"variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "enumConstantName", "typeType", "arrayDeclaration", 
		"classOrInterfaceTypeList", "classOrInterfaceType", "primitiveType", "typeArguments", 
		"typeArgumentsList", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterList", "formalParameter", "lastFormalParameter", "methodBody", 
		"constructorBody", "qualifiedName", "literal", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
		"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethod", 
		"annotationConstant", "annotationMethodRest", "annotationConstantRest", 
		"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
		"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGenericInvocationSuffix", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); packageDeclaration();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(217); importDeclaration();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(223); typeDeclaration();
				}
			}

			setState(226); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext packageName;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(PACKAGE);
			setState(229); ((PackageDeclarationContext)_localctx).packageName = qualifiedName();
			setState(230); match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	 
		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StaticImportManyContext extends ImportDeclarationContext {
		public QualifiedNameContext className;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StaticImportManyContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStaticImportMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStaticImportMany(this);
		}
	}
	public static class SingleClassImportContext extends ImportDeclarationContext {
		public QualifiedNameContext className;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SingleClassImportContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSingleClassImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSingleClassImport(this);
		}
	}
	public static class StarImportContext extends ImportDeclarationContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarImportContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStarImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStarImport(this);
		}
	}
	public static class StaticImportContext extends ImportDeclarationContext {
		public QualifiedNameContext methodName;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StaticImportContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStaticImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStaticImport(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleClassImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(IMPORT);
				setState(233); ((SingleClassImportContext)_localctx).className = qualifiedName();
				setState(234); match(SEMI);
				}
				break;
			case 2:
				_localctx = new StarImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(IMPORT);
				setState(237); qualifiedName();
				{
				setState(238); match(DOT);
				setState(239); match(MUL);
				}
				setState(241); match(SEMI);
				}
				break;
			case 3:
				_localctx = new StaticImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243); match(IMPORT);
				setState(244); match(STATIC);
				setState(245); ((StaticImportContext)_localctx).methodName = qualifiedName();
				setState(246); match(SEMI);
				}
				break;
			case 4:
				_localctx = new StaticImportManyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248); match(IMPORT);
				setState(249); match(STATIC);
				setState(250); ((StaticImportManyContext)_localctx).className = qualifiedName();
				{
				setState(251); match(DOT);
				setState(252); match(MUL);
				}
				setState(254); match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(258); classDeclaration();
				}
				break;
			case 2:
				{
				setState(259); enumDeclaration();
				}
				break;
			case 3:
				{
				setState(260); interfaceDeclaration();
				}
				break;
			case 4:
				{
				setState(261); annotationTypeDeclaration();
				}
				break;
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

	public static class ModifierListContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		return modifierList(0);
	}

	private ModifierListContext modifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ModifierListContext _localctx = new ModifierListContext(_ctx, _parentState);
		ModifierListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_modifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(265); modifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ModifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_modifierList);
					setState(267);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(268); modifier();
					}
					} 
				}
				setState(273);
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

	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	 
		public ModifierContext() { }
		public void copyFrom(ModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleModiferContext extends ModifierContext {
		public SimpleModiferContext(ModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSimpleModifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSimpleModifer(this);
		}
	}
	public static class NonSimpleModifierContext extends ModifierContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public NonSimpleModifierContext(ModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonSimpleModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonSimpleModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier);
		int _la;
		try {
			setState(276);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				_localctx = new NonSimpleModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				_localctx = new SimpleModiferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
	 
		public ClassOrInterfaceModifierContext() { }
		public void copyFrom(ClassOrInterfaceModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnnotationModiferContext extends ClassOrInterfaceModifierContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationModiferContext(ClassOrInterfaceModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationModifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationModifer(this);
		}
	}
	public static class SimpleClassModiferContext extends ClassOrInterfaceModifierContext {
		public SimpleClassModiferContext(ClassOrInterfaceModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSimpleClassModifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSimpleClassModifer(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(280);
			switch (_input.LA(1)) {
			case AT:
				_localctx = new AnnotationModiferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278); annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				_localctx = new SimpleClassModiferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableModifierListContext extends ParserRuleContext {
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public VariableModifierListContext variableModifierList() {
			return getRuleContext(VariableModifierListContext.class,0);
		}
		public VariableModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifierList(this);
		}
	}

	public final VariableModifierListContext variableModifierList() throws RecognitionException {
		return variableModifierList(0);
	}

	private VariableModifierListContext variableModifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableModifierListContext _localctx = new VariableModifierListContext(_ctx, _parentState);
		VariableModifierListContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_variableModifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283); variableModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableModifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableModifierList);
					setState(285);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(286); variableModifier();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
	 
		public VariableModifierContext() { }
		public void copyFrom(VariableModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnnotationVariableModifierContext extends VariableModifierContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationVariableModifierContext(VariableModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationVariableModifier(this);
		}
	}
	public static class SimpleVariableModifierContext extends VariableModifierContext {
		public SimpleVariableModifierContext(VariableModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSimpleVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSimpleVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableModifier);
		try {
			setState(294);
			switch (_input.LA(1)) {
			case FINAL:
				_localctx = new SimpleVariableModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292); match(FINAL);
				}
				break;
			case AT:
				_localctx = new AnnotationVariableModifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifiers;
		public Token className;
		public TypeTypeContext extensionType;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(296); ((ClassDeclarationContext)_localctx).modifiers = modifierList(0);
				}
			}

			setState(299); match(CLASS);
			setState(300); ((ClassDeclarationContext)_localctx).className = match(Identifier);
			setState(302);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(301); typeParameters();
				}
			}

			setState(306);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(304); match(EXTENDS);
				setState(305); ((ClassDeclarationContext)_localctx).extensionType = typeType();
				}
			}

			setState(310);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(308); match(IMPLEMENTS);
				setState(309); typeList();
				}
			}

			setState(312); classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(LT);
			setState(315); typeParameter();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316); match(COMMA);
				setState(317); typeParameter();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323); match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(Identifier);
			setState(328);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(326); match(EXTENDS);
				setState(327); typeBound();
				}
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); typeType();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(331); match(BITAND);
				setState(332); typeType();
				}
				}
				setState(337);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifiers;
		public Token enumName;
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(338); ((EnumDeclarationContext)_localctx).modifiers = modifierList(0);
				}
			}

			setState(341); match(ENUM);
			setState(342); ((EnumDeclarationContext)_localctx).enumName = match(Identifier);
			setState(345);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(343); match(IMPLEMENTS);
				setState(344); typeList();
				}
			}

			setState(347); match(LBRACE);
			setState(349);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(348); enumConstants();
				}
			}

			setState(352);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(351); match(COMMA);
				}
			}

			setState(355);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(354); enumBodyDeclarations();
				}
			}

			setState(357); match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359); enumConstant();
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360); match(COMMA);
					setState(361); enumConstant();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(367); annotation();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373); match(Identifier);
			setState(375);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(374); arguments();
				}
			}

			setState(378);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(377); classBody();
				}
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(SEMI);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(381); classBodyDeclaration();
				}
				}
				setState(386);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifiers;
		public Token interfaceName;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(387); ((InterfaceDeclarationContext)_localctx).modifiers = modifierList(0);
				}
			}

			setState(390); match(INTERFACE);
			setState(391); ((InterfaceDeclarationContext)_localctx).interfaceName = match(Identifier);
			setState(393);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(392); typeParameters();
				}
			}

			setState(397);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(395); match(EXTENDS);
				setState(396); typeList();
				}
			}

			setState(399); interfaceBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); typeType();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402); match(COMMA);
				setState(403); typeType();
				}
				}
				setState(408);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(LBRACE);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(410); classBodyDeclaration();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416); match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(LBRACE);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(419); interfaceBodyDeclaration();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425); match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	 
		public ClassBodyDeclarationContext() { }
		public void copyFrom(ClassBodyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassBodyDeclarationStaticBlockContext extends ClassBodyDeclarationContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassBodyDeclarationStaticBlockContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclarationStaticBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclarationStaticBlock(this);
		}
	}
	public static class ClassBodyDeclarationMemberContext extends ClassBodyDeclarationContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationMemberContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclarationMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclarationMember(this);
		}
	}
	public static class ClassBodyDeclarationSemicolonContext extends ClassBodyDeclarationContext {
		public ClassBodyDeclarationSemicolonContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclarationSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclarationSemicolon(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ClassBodyDeclarationSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(427); match(SEMI);
				}
				break;
			case 2:
				_localctx = new ClassBodyDeclarationStaticBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(428); match(STATIC);
					}
				}

				setState(431); block();
				}
				break;
			case 3:
				_localctx = new ClassBodyDeclarationMemberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(432); memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_memberDeclaration);
		try {
			setState(444);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435); methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436); genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437); fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438); constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439); genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(440); interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(441); annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(442); classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(443); enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token brackets;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(446); modifierList(0);
				}
			}

			setState(451);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(449); typeType();
				}
				break;
			case VOID:
				{
				setState(450); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(453); match(Identifier);
			setState(454); formalParameters();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(455); ((MethodDeclarationContext)_localctx).brackets = match(LBRACK);
				setState(456); match(RBRACK);
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(462); match(THROWS);
				setState(463); qualifiedNameList();
				}
			}

			setState(468);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(466); methodBody();
				}
				break;
			case SEMI:
				{
				setState(467); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(470); modifierList(0);
				}
			}

			setState(473); typeParameters();
			setState(474); methodDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(476); modifierList(0);
				}
			}

			setState(479); match(Identifier);
			setState(480); formalParameters();
			setState(483);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(481); match(THROWS);
				setState(482); qualifiedNameList();
				}
			}

			setState(485); constructorBody();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(487); modifierList(0);
				}
			}

			setState(490); typeParameters();
			setState(491); constructorDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(493); modifierList(0);
				}
			}

			setState(496); typeType();
			setState(497); variableDeclarators();
			setState(498); match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceBodyDeclaration);
		try {
			setState(502);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(500); interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(501); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMemberDeclaration);
		try {
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504); constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506); genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(508); annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(509); classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(510); enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(513); modifierList(0);
				}
			}

			setState(516); typeType();
			setState(517); constantDeclarator();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518); match(COMMA);
				setState(519); constantDeclarator();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525); match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public Token brackets;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); match(Identifier);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(528); ((ConstantDeclaratorContext)_localctx).brackets = match(LBRACK);
				setState(529); match(RBRACK);
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535); match(ASSIGN);
			setState(536); variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public Token brackets;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(538); modifierList(0);
				}
			}

			setState(543);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(541); typeType();
				}
				break;
			case VOID:
				{
				setState(542); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(545); match(Identifier);
			setState(546); formalParameters();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(547); ((InterfaceMethodDeclarationContext)_localctx).brackets = match(LBRACK);
				setState(548); match(RBRACK);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(554); match(THROWS);
				setState(555); qualifiedNameList();
				}
			}

			setState(558); match(SEMI);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(560); modifierList(0);
				}
			}

			setState(563); typeParameters();
			setState(564); interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); variableDeclarator();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(567); match(COMMA);
				setState(568); variableDeclarator();
				}
				}
				setState(573);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); variableDeclaratorId();
			setState(577);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(575); match(ASSIGN);
				setState(576); variableInitializer();
				}
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public Token arrayBrackets;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(Identifier);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(580); ((VariableDeclaratorIdContext)_localctx).arrayBrackets = match(LBRACK);
				setState(581); match(RBRACK);
				}
				}
				setState(586);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableInitializer);
		try {
			setState(589);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(587); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(588); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591); match(LBRACE);
			setState(603);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(592); variableInitializer();
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(593); match(COMMA);
						setState(594); variableInitializer();
						}
						} 
					}
					setState(599);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(601);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(600); match(COMMA);
					}
				}

				}
			}

			setState(605); match(RBRACE);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); match(Identifier);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeListContext cType;
		public ArrayDeclarationContext brackets;
		public PrimitiveTypeContext pType;
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeType);
		try {
			setState(617);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(609); ((TypeTypeContext)_localctx).cType = classOrInterfaceTypeList(0);
				setState(611);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(610); ((TypeTypeContext)_localctx).brackets = arrayDeclaration();
					}
					break;
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(613); ((TypeTypeContext)_localctx).pType = primitiveType();
				setState(615);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(614); ((TypeTypeContext)_localctx).brackets = arrayDeclaration();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayDeclaration(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(619); match(LBRACK);
					setState(620); match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(623); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ClassOrInterfaceTypeListContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public ClassOrInterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceTypeList(this);
		}
	}

	public final ClassOrInterfaceTypeListContext classOrInterfaceTypeList() throws RecognitionException {
		return classOrInterfaceTypeList(0);
	}

	private ClassOrInterfaceTypeListContext classOrInterfaceTypeList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassOrInterfaceTypeListContext _localctx = new ClassOrInterfaceTypeListContext(_ctx, _parentState);
		ClassOrInterfaceTypeListContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_classOrInterfaceTypeList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(626); classOrInterfaceType();
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassOrInterfaceTypeListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classOrInterfaceTypeList);
					setState(628);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(629); match(DOT);
					setState(630); classOrInterfaceType();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public Token id;
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); ((ClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(638);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(637); typeArguments();
				}
				break;
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentsListContext typeArgumentsList() {
			return getRuleContext(TypeArgumentsListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642); match(LT);
			setState(643); typeArgumentsList(0);
			setState(644); match(GT);
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

	public static class TypeArgumentsListContext extends ParserRuleContext {
		public TypeArgumentContext typeArgument() {
			return getRuleContext(TypeArgumentContext.class,0);
		}
		public TypeArgumentsListContext typeArgumentsList() {
			return getRuleContext(TypeArgumentsListContext.class,0);
		}
		public TypeArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgumentsList(this);
		}
	}

	public final TypeArgumentsListContext typeArgumentsList() throws RecognitionException {
		return typeArgumentsList(0);
	}

	private TypeArgumentsListContext typeArgumentsList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeArgumentsListContext _localctx = new TypeArgumentsListContext(_ctx, _parentState);
		TypeArgumentsListContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_typeArgumentsList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(647); typeArgument();
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeArgumentsListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeArgumentsList);
					setState(649);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(650); match(COMMA);
					setState(651); typeArgument();
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	 
		public TypeArgumentContext() { }
		public void copyFrom(TypeArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalTypeArgumentContext extends TypeArgumentContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public NormalTypeArgumentContext(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNormalTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNormalTypeArgument(this);
		}
	}
	public static class WildcardTypeArgumentContext extends TypeArgumentContext {
		public Token keyWord;
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public WildcardTypeArgumentContext(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWildcardTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWildcardTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeArgument);
		int _la;
		try {
			setState(663);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				_localctx = new NormalTypeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(657); typeType();
				}
				break;
			case QUESTION:
				_localctx = new WildcardTypeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(658); match(QUESTION);
				setState(661);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(659);
					((WildcardTypeArgumentContext)_localctx).keyWord = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
						((WildcardTypeArgumentContext)_localctx).keyWord = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(660); typeType();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); qualifiedName();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(666); match(COMMA);
				setState(667); qualifiedName();
				}
				}
				setState(672);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); match(LPAREN);
			setState(675);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(674); formalParameterList();
				}
			}

			setState(677); match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(692);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679); formalParameter();
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(680); match(COMMA);
						setState(681); formalParameter();
						}
						} 
					}
					setState(686);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(689);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(687); match(COMMA);
					setState(688); lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691); lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableModifierListContext variableModifierList() {
			return getRuleContext(VariableModifierListContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_la = _input.LA(1);
			if (_la==FINAL || _la==AT) {
				{
				setState(694); variableModifierList(0);
				}
			}

			setState(697); typeType();
			setState(698); variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableModifierListContext variableModifierList() {
			return getRuleContext(VariableModifierListContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if (_la==FINAL || _la==AT) {
				{
				setState(700); variableModifierList(0);
				}
			}

			setState(703); typeType();
			setState(704); match(ELLIPSIS);
			setState(705); variableDeclaratorId();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707); block();
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709); block();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(711); match(Identifier);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712); match(DOT);
					setState(713); match(Identifier);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AnnotationContext extends ParserRuleContext {
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721); match(AT);
			setState(722); annotationName();
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(723); match(LPAREN);
				setState(726);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(724); elementValuePairs();
					}
					break;
				case 2:
					{
					setState(725); elementValue();
					}
					break;
				}
				setState(728); match(RPAREN);
				}
				break;
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); qualifiedName();
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); elementValuePair();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(734); match(COMMA);
				setState(735); elementValuePair();
				}
				}
				setState(740);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741); match(Identifier);
			setState(742); match(ASSIGN);
			setState(743); elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementValue);
		try {
			setState(748);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(745); expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(746); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(747); elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(750); match(LBRACE);
			setState(759);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				setState(751); elementValue();
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(752); match(COMMA);
						setState(753); elementValue();
						}
						} 
					}
					setState(758);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
			}

			setState(762);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(761); match(COMMA);
				}
			}

			setState(764); match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifiers;
		public Token name;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(766); ((AnnotationTypeDeclarationContext)_localctx).modifiers = modifierList(0);
				}
				break;
			}
			setState(769); match(AT);
			setState(770); match(INTERFACE);
			setState(771); ((AnnotationTypeDeclarationContext)_localctx).name = match(Identifier);
			setState(772); annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); match(LBRACE);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(775); annotationTypeElementDeclaration();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781); match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationTypeElementDeclaration);
		try {
			setState(785);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(783); annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(784); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationTypeElementRest);
		try {
			setState(806);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787); annotationMethodOrConstantRest();
				setState(788); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790); classDeclaration();
				setState(792);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(791); match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(794); interfaceDeclaration();
				setState(796);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(795); match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(798); enumDeclaration();
				setState(800);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(799); match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(802); annotationTypeDeclaration();
				setState(804);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(803); match(SEMI);
					}
					break;
				}
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationConstantContext annotationConstant() {
			return getRuleContext(AnnotationConstantContext.class,0);
		}
		public AnnotationMethodContext annotationMethod() {
			return getRuleContext(AnnotationMethodContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationMethodOrConstantRest);
		try {
			setState(810);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808); annotationMethod();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809); annotationConstant();
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

	public static class AnnotationMethodContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethod(this);
		}
	}

	public final AnnotationMethodContext annotationMethod() throws RecognitionException {
		AnnotationMethodContext _localctx = new AnnotationMethodContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(812); modifierList(0);
				}
			}

			setState(815); typeType();
			setState(816); annotationMethodRest();
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

	public static class AnnotationConstantContext extends ParserRuleContext {
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationConstant(this);
		}
	}

	public final AnnotationConstantContext annotationConstant() throws RecognitionException {
		AnnotationConstantContext _localctx = new AnnotationConstantContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(818); modifierList(0);
				}
			}

			setState(821); typeType();
			setState(822); annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824); ((AnnotationMethodRestContext)_localctx).id = match(Identifier);
			setState(825); match(LPAREN);
			setState(826); match(RPAREN);
			setState(828);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(827); defaultValue();
				}
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830); variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); match(DEFAULT);
			setState(833); elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835); match(LBRACE);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(836); blockStatement();
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(842); match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_blockStatement);
		try {
			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(846); typeDeclaration();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849); localVariableDeclaration();
			setState(850); match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierListContext variableModifierList() {
			return getRuleContext(VariableModifierListContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_la = _input.LA(1);
			if (_la==FINAL || _la==AT) {
				{
				setState(852); variableModifierList(0);
				}
			}

			setState(855); typeType();
			setState(856); variableDeclarators();
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(962);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859); match(ASSERT);
				setState(860); expression(0);
				setState(863);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(861); match(COLON);
					setState(862); expression(0);
					}
				}

				setState(865); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(867); match(IF);
				setState(868); parExpression();
				setState(869); statement();
				setState(872);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(870); match(ELSE);
					setState(871); statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874); match(FOR);
				setState(875); match(LPAREN);
				setState(876); forControl();
				setState(877); match(RPAREN);
				setState(878); statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(880); match(WHILE);
				setState(881); parExpression();
				setState(882); statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(884); match(DO);
				setState(885); statement();
				setState(886); match(WHILE);
				setState(887); parExpression();
				setState(888); match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(890); match(TRY);
				setState(891); block();
				setState(901);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(893); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(892); catchClause();
						}
						}
						setState(895); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(898);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(897); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(900); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(903); match(TRY);
				setState(904); resourceSpecification();
				setState(905); block();
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(906); catchClause();
					}
					}
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(913);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(912); finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(915); match(SWITCH);
				setState(916); parExpression();
				setState(917); match(LBRACE);
				setState(921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(918); switchBlockStatementGroup();
						}
						} 
					}
					setState(923);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(924); switchLabel();
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(930); match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(932); match(SYNCHRONIZED);
				setState(933); parExpression();
				setState(934); block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(936); match(RETURN);
				setState(938);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(937); expression(0);
					}
				}

				setState(940); match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(941); match(THROW);
				setState(942); expression(0);
				setState(943); match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(945); match(BREAK);
				setState(947);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(946); match(Identifier);
					}
				}

				setState(949); match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(950); match(CONTINUE);
				setState(952);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(951); match(Identifier);
					}
				}

				setState(954); match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(955); match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(956); statementExpression();
				setState(957); match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(959); match(Identifier);
				setState(960); match(COLON);
				setState(961); statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableModifierListContext variableModifierList() {
			return getRuleContext(VariableModifierListContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964); match(CATCH);
			setState(965); match(LPAREN);
			setState(967);
			_la = _input.LA(1);
			if (_la==FINAL || _la==AT) {
				{
				setState(966); variableModifierList(0);
				}
			}

			setState(969); catchType();
			setState(970); match(Identifier);
			setState(971); match(RPAREN);
			setState(972); block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); qualifiedName();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(975); match(BITOR);
				setState(976); qualifiedName();
				}
				}
				setState(981);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982); match(FINALLY);
			setState(983); block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985); match(LPAREN);
			setState(986); resources();
			setState(988);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(987); match(SEMI);
				}
			}

			setState(990); match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(992); resource();
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(993); match(SEMI);
					setState(994); resource();
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableModifierListContext variableModifierList() {
			return getRuleContext(VariableModifierListContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			_la = _input.LA(1);
			if (_la==FINAL || _la==AT) {
				{
				setState(1000); variableModifierList(0);
				}
			}

			setState(1003); classOrInterfaceTypeList(0);
			setState(1004); variableDeclaratorId();
			setState(1005); match(ASSIGN);
			setState(1006); expression(0);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1008); switchLabel();
				}
				}
				setState(1011); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1014); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1013); blockStatement();
				}
				}
				setState(1016); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_switchLabel);
		try {
			setState(1028);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018); match(CASE);
				setState(1019); constantExpression();
				setState(1020); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022); match(CASE);
				setState(1023); enumConstantName();
				setState(1024); match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026); match(DEFAULT);
				setState(1027); match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_forControl);
		int _la;
		try {
			setState(1042);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
					{
					setState(1031); forInit();
					}
				}

				setState(1034); match(SEMI);
				setState(1036);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1035); expression(0);
					}
				}

				setState(1038); match(SEMI);
				setState(1040);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1039); forUpdate();
					}
				}

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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forInit);
		try {
			setState(1046);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045); expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableModifierListContext variableModifierList() {
			return getRuleContext(VariableModifierListContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			_la = _input.LA(1);
			if (_la==FINAL || _la==AT) {
				{
				setState(1048); variableModifierList(0);
				}
			}

			setState(1051); typeType();
			setState(1052); variableDeclaratorId();
			setState(1053); match(COLON);
			setState(1054); expression(0);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); match(LPAREN);
			setState(1059); expression(0);
			setState(1060); match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062); expression(0);
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1063); match(COMMA);
				setState(1064); expression(0);
				}
				}
				setState(1069);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070); expression(0);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1075); match(LPAREN);
				setState(1076); typeType();
				setState(1077); match(RPAREN);
				setState(1078); expression(17);
				}
				break;
			case 2:
				{
				setState(1080);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1081); expression(15);
				}
				break;
			case 3:
				{
				setState(1082);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1083); expression(14);
				}
				break;
			case 4:
				{
				setState(1084); primary();
				}
				break;
			case 5:
				{
				setState(1085); match(NEW);
				setState(1086); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1172);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1089);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1090);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1091); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1092);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1093);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1094); expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1095);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1103);
						switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
						case 1:
							{
							setState(1096); match(LT);
							setState(1097); match(LT);
							}
							break;
						case 2:
							{
							setState(1098); match(GT);
							setState(1099); match(GT);
							setState(1100); match(GT);
							}
							break;
						case 3:
							{
							setState(1101); match(GT);
							setState(1102); match(GT);
							}
							break;
						}
						setState(1105); expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1106);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1107);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1108); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1109);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1110);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1111); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1112);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1113); match(BITAND);
						setState(1114); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1115);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1116); match(CARET);
						setState(1117); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1118);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1119); match(BITOR);
						setState(1120); expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1121);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1122); match(AND);
						setState(1123); expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1125); match(OR);
						setState(1126); expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1128); match(QUESTION);
						setState(1129); expression(0);
						setState(1130); match(COLON);
						setState(1131); expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1133);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1134);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1135); expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1136);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1137); match(DOT);
						setState(1138); match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1139);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1140); match(DOT);
						setState(1141); match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1142);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1143); match(DOT);
						setState(1144); match(NEW);
						setState(1146);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1145); nonWildcardTypeArguments();
							}
						}

						setState(1148); innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1150); match(DOT);
						setState(1151); match(SUPER);
						setState(1152); superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1153);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1154); match(DOT);
						setState(1155); explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1157); match(LBRACK);
						setState(1158); expression(0);
						setState(1159); match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1161);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1162); match(LPAREN);
						setState(1164);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
							{
							setState(1163); expressionList();
							}
						}

						setState(1166); match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1167);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1168);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1170); match(INSTANCEOF);
						setState(1171); typeType();
						}
						break;
					}
					} 
				}
				setState(1176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_primary);
		try {
			setState(1198);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177); match(LPAREN);
				setState(1178); expression(0);
				setState(1179); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181); match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1182); match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1183); literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1184); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1185); typeType();
				setState(1186); match(DOT);
				setState(1187); match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1189); match(VOID);
				setState(1190); match(DOT);
				setState(1191); match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1192); nonWildcardTypeArguments();
				setState(1196);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1193); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1194); match(THIS);
					setState(1195); arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatorContext extends ParserRuleContext {
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_creator);
		try {
			setState(1209);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200); nonWildcardTypeArguments();
				setState(1201); createdName();
				setState(1202); classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204); createdName();
				setState(1207);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1205); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1206); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_createdName);
		int _la;
		try {
			setState(1226);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1211); match(Identifier);
				setState(1213);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1212); typeArgumentsOrDiamond();
					}
				}

				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1215); match(DOT);
					setState(1216); match(Identifier);
					setState(1218);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1217); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228); match(Identifier);
			setState(1230);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1229); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1232); classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1234); match(LBRACK);
			setState(1262);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1235); match(RBRACK);
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1236); match(LBRACK);
					setState(1237); match(RBRACK);
					}
					}
					setState(1242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1243); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1244); expression(0);
				setState(1245); match(RBRACK);
				setState(1252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1246); match(LBRACK);
						setState(1247); expression(0);
						setState(1248); match(RBRACK);
						}
						} 
					}
					setState(1254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1255); match(LBRACK);
						setState(1256); match(RBRACK);
						}
						} 
					}
					setState(1261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264); arguments();
			setState(1266);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1265); classBody();
				}
				break;
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268); nonWildcardTypeArguments();
			setState(1269); explicitGenericInvocationSuffix();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271); match(LT);
			setState(1272); typeList();
			setState(1273); match(GT);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typeArgumentsOrDiamond);
		try {
			setState(1278);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275); match(LT);
				setState(1276); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277); typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1283);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280); match(LT);
				setState(1281); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282); nonWildcardTypeArguments();
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_superSuffix);
		try {
			setState(1291);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286); match(DOT);
				setState(1287); match(Identifier);
				setState(1289);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1288); arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1297);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293); match(SUPER);
				setState(1294); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295); match(Identifier);
				setState(1296); arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); match(LPAREN);
			setState(1301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(1300); expressionList();
				}
			}

			setState(1303); match(RPAREN);
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
		case 4: return modifierList_sempred((ModifierListContext)_localctx, predIndex);
		case 7: return variableModifierList_sempred((VariableModifierListContext)_localctx, predIndex);
		case 42: return classOrInterfaceTypeList_sempred((ClassOrInterfaceTypeListContext)_localctx, predIndex);
		case 46: return typeArgumentsList_sempred((TypeArgumentsListContext)_localctx, predIndex);
		case 94: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean classOrInterfaceTypeList_sempred(ClassOrInterfaceTypeListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 13);
		case 5: return precpred(_ctx, 12);
		case 6: return precpred(_ctx, 11);
		case 7: return precpred(_ctx, 10);
		case 8: return precpred(_ctx, 8);
		case 9: return precpred(_ctx, 7);
		case 10: return precpred(_ctx, 6);
		case 11: return precpred(_ctx, 5);
		case 12: return precpred(_ctx, 4);
		case 13: return precpred(_ctx, 3);
		case 14: return precpred(_ctx, 2);
		case 15: return precpred(_ctx, 1);
		case 16: return precpred(_ctx, 25);
		case 17: return precpred(_ctx, 24);
		case 18: return precpred(_ctx, 23);
		case 19: return precpred(_ctx, 22);
		case 20: return precpred(_ctx, 21);
		case 21: return precpred(_ctx, 20);
		case 22: return precpred(_ctx, 19);
		case 23: return precpred(_ctx, 16);
		case 24: return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean variableModifierList_sempred(VariableModifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeArgumentsList_sempred(TypeArgumentsListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean modifierList_sempred(ModifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3k\u051c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\7\2\u00dd\n\2\f\2\16\2\u00e0\13\2\3\2\5\2\u00e3"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0103\n\4\3"+
		"\5\3\5\3\5\3\5\5\5\u0109\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u0110\n\6\f\6\16"+
		"\6\u0113\13\6\3\7\3\7\5\7\u0117\n\7\3\b\3\b\5\b\u011b\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u0122\n\t\f\t\16\t\u0125\13\t\3\n\3\n\5\n\u0129\n\n\3\13"+
		"\5\13\u012c\n\13\3\13\3\13\3\13\5\13\u0131\n\13\3\13\3\13\5\13\u0135\n"+
		"\13\3\13\3\13\5\13\u0139\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0141\n\f"+
		"\f\f\16\f\u0144\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u014b\n\r\3\16\3\16\3\16"+
		"\7\16\u0150\n\16\f\16\16\16\u0153\13\16\3\17\5\17\u0156\n\17\3\17\3\17"+
		"\3\17\3\17\5\17\u015c\n\17\3\17\3\17\5\17\u0160\n\17\3\17\5\17\u0163\n"+
		"\17\3\17\5\17\u0166\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u016d\n\20\f\20"+
		"\16\20\u0170\13\20\3\21\7\21\u0173\n\21\f\21\16\21\u0176\13\21\3\21\3"+
		"\21\5\21\u017a\n\21\3\21\5\21\u017d\n\21\3\22\3\22\7\22\u0181\n\22\f\22"+
		"\16\22\u0184\13\22\3\23\5\23\u0187\n\23\3\23\3\23\3\23\5\23\u018c\n\23"+
		"\3\23\3\23\5\23\u0190\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u0197\n\24\f"+
		"\24\16\24\u019a\13\24\3\25\3\25\7\25\u019e\n\25\f\25\16\25\u01a1\13\25"+
		"\3\25\3\25\3\26\3\26\7\26\u01a7\n\26\f\26\16\26\u01aa\13\26\3\26\3\26"+
		"\3\27\3\27\5\27\u01b0\n\27\3\27\3\27\5\27\u01b4\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u01bf\n\30\3\31\5\31\u01c2\n\31\3\31"+
		"\3\31\5\31\u01c6\n\31\3\31\3\31\3\31\3\31\7\31\u01cc\n\31\f\31\16\31\u01cf"+
		"\13\31\3\31\3\31\5\31\u01d3\n\31\3\31\3\31\5\31\u01d7\n\31\3\32\5\32\u01da"+
		"\n\32\3\32\3\32\3\32\3\33\5\33\u01e0\n\33\3\33\3\33\3\33\3\33\5\33\u01e6"+
		"\n\33\3\33\3\33\3\34\5\34\u01eb\n\34\3\34\3\34\3\34\3\35\5\35\u01f1\n"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u01f9\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0202\n\37\3 \5 \u0205\n \3 \3 \3 \3 \7 \u020b\n"+
		" \f \16 \u020e\13 \3 \3 \3!\3!\3!\7!\u0215\n!\f!\16!\u0218\13!\3!\3!\3"+
		"!\3\"\5\"\u021e\n\"\3\"\3\"\5\"\u0222\n\"\3\"\3\"\3\"\3\"\7\"\u0228\n"+
		"\"\f\"\16\"\u022b\13\"\3\"\3\"\5\"\u022f\n\"\3\"\3\"\3#\5#\u0234\n#\3"+
		"#\3#\3#\3$\3$\3$\7$\u023c\n$\f$\16$\u023f\13$\3%\3%\3%\5%\u0244\n%\3&"+
		"\3&\3&\7&\u0249\n&\f&\16&\u024c\13&\3\'\3\'\5\'\u0250\n\'\3(\3(\3(\3("+
		"\7(\u0256\n(\f(\16(\u0259\13(\3(\5(\u025c\n(\5(\u025e\n(\3(\3(\3)\3)\3"+
		"*\3*\5*\u0266\n*\3*\3*\5*\u026a\n*\5*\u026c\n*\3+\3+\6+\u0270\n+\r+\16"+
		"+\u0271\3,\3,\3,\3,\3,\3,\7,\u027a\n,\f,\16,\u027d\13,\3-\3-\5-\u0281"+
		"\n-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u028f\n\60\f"+
		"\60\16\60\u0292\13\60\3\61\3\61\3\61\3\61\5\61\u0298\n\61\5\61\u029a\n"+
		"\61\3\62\3\62\3\62\7\62\u029f\n\62\f\62\16\62\u02a2\13\62\3\63\3\63\5"+
		"\63\u02a6\n\63\3\63\3\63\3\64\3\64\3\64\7\64\u02ad\n\64\f\64\16\64\u02b0"+
		"\13\64\3\64\3\64\5\64\u02b4\n\64\3\64\5\64\u02b7\n\64\3\65\5\65\u02ba"+
		"\n\65\3\65\3\65\3\65\3\66\5\66\u02c0\n\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\39\79\u02cd\n9\f9\169\u02d0\139\3:\3:\3;\3;\3;\3;\3;\5;\u02d9"+
		"\n;\3;\5;\u02dc\n;\3<\3<\3=\3=\3=\7=\u02e3\n=\f=\16=\u02e6\13=\3>\3>\3"+
		">\3>\3?\3?\3?\5?\u02ef\n?\3@\3@\3@\3@\7@\u02f5\n@\f@\16@\u02f8\13@\5@"+
		"\u02fa\n@\3@\5@\u02fd\n@\3@\3@\3A\5A\u0302\nA\3A\3A\3A\3A\3A\3B\3B\7B"+
		"\u030b\nB\fB\16B\u030e\13B\3B\3B\3C\3C\5C\u0314\nC\3D\3D\3D\3D\3D\5D\u031b"+
		"\nD\3D\3D\5D\u031f\nD\3D\3D\5D\u0323\nD\3D\3D\5D\u0327\nD\5D\u0329\nD"+
		"\3E\3E\5E\u032d\nE\3F\5F\u0330\nF\3F\3F\3F\3G\5G\u0336\nG\3G\3G\3G\3H"+
		"\3H\3H\3H\5H\u033f\nH\3I\3I\3J\3J\3J\3K\3K\7K\u0348\nK\fK\16K\u034b\13"+
		"K\3K\3K\3L\3L\3L\5L\u0352\nL\3M\3M\3M\3N\5N\u0358\nN\3N\3N\3N\3O\3O\3"+
		"O\3O\3O\5O\u0362\nO\3O\3O\3O\3O\3O\3O\3O\5O\u036b\nO\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\6O\u0380\nO\rO\16O\u0381\3O\5"+
		"O\u0385\nO\3O\5O\u0388\nO\3O\3O\3O\3O\7O\u038e\nO\fO\16O\u0391\13O\3O"+
		"\5O\u0394\nO\3O\3O\3O\3O\7O\u039a\nO\fO\16O\u039d\13O\3O\7O\u03a0\nO\f"+
		"O\16O\u03a3\13O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u03ad\nO\3O\3O\3O\3O\3O\3O"+
		"\3O\5O\u03b6\nO\3O\3O\3O\5O\u03bb\nO\3O\3O\3O\3O\3O\3O\3O\3O\5O\u03c5"+
		"\nO\3P\3P\3P\5P\u03ca\nP\3P\3P\3P\3P\3P\3Q\3Q\3Q\7Q\u03d4\nQ\fQ\16Q\u03d7"+
		"\13Q\3R\3R\3R\3S\3S\3S\5S\u03df\nS\3S\3S\3T\3T\3T\7T\u03e6\nT\fT\16T\u03e9"+
		"\13T\3U\5U\u03ec\nU\3U\3U\3U\3U\3U\3V\6V\u03f4\nV\rV\16V\u03f5\3V\6V\u03f9"+
		"\nV\rV\16V\u03fa\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0407\nW\3X\3X\5X\u040b"+
		"\nX\3X\3X\5X\u040f\nX\3X\3X\5X\u0413\nX\5X\u0415\nX\3Y\3Y\5Y\u0419\nY"+
		"\3Z\5Z\u041c\nZ\3Z\3Z\3Z\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\7]\u042c"+
		"\n]\f]\16]\u042f\13]\3^\3^\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\5`\u0442\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0452\n`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u047d\n`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u048f\n`\3`\3`\3`\3`\3"+
		"`\3`\7`\u0497\n`\f`\16`\u049a\13`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\5a\u04af\na\5a\u04b1\na\3b\3b\3b\3b\3b\3b\3b\5b"+
		"\u04ba\nb\5b\u04bc\nb\3c\3c\5c\u04c0\nc\3c\3c\3c\5c\u04c5\nc\7c\u04c7"+
		"\nc\fc\16c\u04ca\13c\3c\5c\u04cd\nc\3d\3d\5d\u04d1\nd\3d\3d\3e\3e\3e\3"+
		"e\7e\u04d9\ne\fe\16e\u04dc\13e\3e\3e\3e\3e\3e\3e\3e\7e\u04e5\ne\fe\16"+
		"e\u04e8\13e\3e\3e\7e\u04ec\ne\fe\16e\u04ef\13e\5e\u04f1\ne\3f\3f\5f\u04f5"+
		"\nf\3g\3g\3g\3h\3h\3h\3h\3i\3i\3i\5i\u0501\ni\3j\3j\3j\5j\u0506\nj\3k"+
		"\3k\3k\3k\5k\u050c\nk\5k\u050e\nk\3l\3l\3l\3l\5l\u0514\nl\3m\3m\5m\u0518"+
		"\nm\3m\3m\3m\2\7\n\20V^\u00ben\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\2\17\6\2  ,,\60\60\63\63\6"+
		"\2\3\3\24\24#%()\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\4\2\23\23"+
		"**\3\2\65:\3\2QT\3\2GH\4\2UVZZ\3\2ST\4\2EFLM\4\2KKNN\4\2DD[e\3\2QR\u058e"+
		"\2\u00da\3\2\2\2\4\u00e6\3\2\2\2\6\u0102\3\2\2\2\b\u0108\3\2\2\2\n\u010a"+
		"\3\2\2\2\f\u0116\3\2\2\2\16\u011a\3\2\2\2\20\u011c\3\2\2\2\22\u0128\3"+
		"\2\2\2\24\u012b\3\2\2\2\26\u013c\3\2\2\2\30\u0147\3\2\2\2\32\u014c\3\2"+
		"\2\2\34\u0155\3\2\2\2\36\u0169\3\2\2\2 \u0174\3\2\2\2\"\u017e\3\2\2\2"+
		"$\u0186\3\2\2\2&\u0193\3\2\2\2(\u019b\3\2\2\2*\u01a4\3\2\2\2,\u01b3\3"+
		"\2\2\2.\u01be\3\2\2\2\60\u01c1\3\2\2\2\62\u01d9\3\2\2\2\64\u01df\3\2\2"+
		"\2\66\u01ea\3\2\2\28\u01f0\3\2\2\2:\u01f8\3\2\2\2<\u0201\3\2\2\2>\u0204"+
		"\3\2\2\2@\u0211\3\2\2\2B\u021d\3\2\2\2D\u0233\3\2\2\2F\u0238\3\2\2\2H"+
		"\u0240\3\2\2\2J\u0245\3\2\2\2L\u024f\3\2\2\2N\u0251\3\2\2\2P\u0261\3\2"+
		"\2\2R\u026b\3\2\2\2T\u026f\3\2\2\2V\u0273\3\2\2\2X\u027e\3\2\2\2Z\u0282"+
		"\3\2\2\2\\\u0284\3\2\2\2^\u0288\3\2\2\2`\u0299\3\2\2\2b\u029b\3\2\2\2"+
		"d\u02a3\3\2\2\2f\u02b6\3\2\2\2h\u02b9\3\2\2\2j\u02bf\3\2\2\2l\u02c5\3"+
		"\2\2\2n\u02c7\3\2\2\2p\u02c9\3\2\2\2r\u02d1\3\2\2\2t\u02d3\3\2\2\2v\u02dd"+
		"\3\2\2\2x\u02df\3\2\2\2z\u02e7\3\2\2\2|\u02ee\3\2\2\2~\u02f0\3\2\2\2\u0080"+
		"\u0301\3\2\2\2\u0082\u0308\3\2\2\2\u0084\u0313\3\2\2\2\u0086\u0328\3\2"+
		"\2\2\u0088\u032c\3\2\2\2\u008a\u032f\3\2\2\2\u008c\u0335\3\2\2\2\u008e"+
		"\u033a\3\2\2\2\u0090\u0340\3\2\2\2\u0092\u0342\3\2\2\2\u0094\u0345\3\2"+
		"\2\2\u0096\u0351\3\2\2\2\u0098\u0353\3\2\2\2\u009a\u0357\3\2\2\2\u009c"+
		"\u03c4\3\2\2\2\u009e\u03c6\3\2\2\2\u00a0\u03d0\3\2\2\2\u00a2\u03d8\3\2"+
		"\2\2\u00a4\u03db\3\2\2\2\u00a6\u03e2\3\2\2\2\u00a8\u03eb\3\2\2\2\u00aa"+
		"\u03f3\3\2\2\2\u00ac\u0406\3\2\2\2\u00ae\u0414\3\2\2\2\u00b0\u0418\3\2"+
		"\2\2\u00b2\u041b\3\2\2\2\u00b4\u0422\3\2\2\2\u00b6\u0424\3\2\2\2\u00b8"+
		"\u0428\3\2\2\2\u00ba\u0430\3\2\2\2\u00bc\u0432\3\2\2\2\u00be\u0441\3\2"+
		"\2\2\u00c0\u04b0\3\2\2\2\u00c2\u04bb\3\2\2\2\u00c4\u04cc\3\2\2\2\u00c6"+
		"\u04ce\3\2\2\2\u00c8\u04d4\3\2\2\2\u00ca\u04f2\3\2\2\2\u00cc\u04f6\3\2"+
		"\2\2\u00ce\u04f9\3\2\2\2\u00d0\u0500\3\2\2\2\u00d2\u0505\3\2\2\2\u00d4"+
		"\u050d\3\2\2\2\u00d6\u0513\3\2\2\2\u00d8\u0515\3\2\2\2\u00da\u00de\5\4"+
		"\3\2\u00db\u00dd\5\6\4\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e3\5\b\5\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\7\2\2\3\u00e5\3\3\2\2\2\u00e6\u00e7\7\"\2\2"+
		"\u00e7\u00e8\5p9\2\u00e8\u00e9\7A\2\2\u00e9\5\3\2\2\2\u00ea\u00eb\7\33"+
		"\2\2\u00eb\u00ec\5p9\2\u00ec\u00ed\7A\2\2\u00ed\u0103\3\2\2\2\u00ee\u00ef"+
		"\7\33\2\2\u00ef\u00f0\5p9\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7U\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\7A\2\2\u00f4\u0103\3\2\2\2\u00f5\u00f6\7\33"+
		"\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f8\5p9\2\u00f8\u00f9\7A\2\2\u00f9\u0103"+
		"\3\2\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc\7(\2\2\u00fc\u00fd\5p9\2\u00fd"+
		"\u00fe\7C\2\2\u00fe\u00ff\7U\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7A\2"+
		"\2\u0101\u0103\3\2\2\2\u0102\u00ea\3\2\2\2\u0102\u00ee\3\2\2\2\u0102\u00f5"+
		"\3\2\2\2\u0102\u00fa\3\2\2\2\u0103\7\3\2\2\2\u0104\u0109\5\24\13\2\u0105"+
		"\u0109\5\34\17\2\u0106\u0109\5$\23\2\u0107\u0109\5\u0080A\2\u0108\u0104"+
		"\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\t\3\2\2\2\u010a\u010b\b\6\1\2\u010b\u010c\5\f\7\2\u010c\u0111\3\2\2\2"+
		"\u010d\u010e\f\3\2\2\u010e\u0110\5\f\7\2\u010f\u010d\3\2\2\2\u0110\u0113"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\13\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0117\5\16\b\2\u0115\u0117\t\2\2\2\u0116\u0114\3"+
		"\2\2\2\u0116\u0115\3\2\2\2\u0117\r\3\2\2\2\u0118\u011b\5t;\2\u0119\u011b"+
		"\t\3\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\17\3\2\2\2\u011c"+
		"\u011d\b\t\1\2\u011d\u011e\5\22\n\2\u011e\u0123\3\2\2\2\u011f\u0120\f"+
		"\3\2\2\u0120\u0122\5\22\n\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\21\3\2\2\2\u0125\u0123\3\2\2"+
		"\2\u0126\u0129\7\24\2\2\u0127\u0129\5t;\2\u0128\u0126\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\23\3\2\2\2\u012a\u012c\5\n\6\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\13\2\2\u012e\u0130\7"+
		"f\2\2\u012f\u0131\5\26\f\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0133\7\23\2\2\u0133\u0135\5R*\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0137\7\32\2\2\u0137"+
		"\u0139\5&\24\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\5(\25\2\u013b\25\3\2\2\2\u013c\u013d\7F\2\2\u013d\u0142"+
		"\5\30\r\2\u013e\u013f\7B\2\2\u013f\u0141\5\30\r\2\u0140\u013e\3\2\2\2"+
		"\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7E\2\2\u0146\27\3\2\2\2\u0147"+
		"\u014a\7f\2\2\u0148\u0149\7\23\2\2\u0149\u014b\5\32\16\2\u014a\u0148\3"+
		"\2\2\2\u014a\u014b\3\2\2\2\u014b\31\3\2\2\2\u014c\u0151\5R*\2\u014d\u014e"+
		"\7W\2\2\u014e\u0150\5R*\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\33\3\2\2\2\u0153\u0151\3\2\2"+
		"\2\u0154\u0156\5\n\6\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\7\22\2\2\u0158\u015b\7f\2\2\u0159\u015a\7\32\2\2"+
		"\u015a\u015c\5&\24\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015f\7=\2\2\u015e\u0160\5\36\20\2\u015f\u015e\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\7B\2\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0166\5\"\22\2"+
		"\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\7>\2\2\u0168\35\3\2\2\2\u0169\u016e\5 \21\2\u016a\u016b\7B\2\2\u016b"+
		"\u016d\5 \21\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\37\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173"+
		"\5t;\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\7f"+
		"\2\2\u0178\u017a\5\u00d8m\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u017d\5(\25\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d!\3\2\2\2\u017e\u0182\7A\2\2\u017f\u0181\5,\27\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"#\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\5\n\6\2\u0186\u0185\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\36\2\2\u0189\u018b"+
		"\7f\2\2\u018a\u018c\5\26\f\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018e\7\23\2\2\u018e\u0190\5&\24\2\u018f\u018d\3"+
		"\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5*\26\2\u0192"+
		"%\3\2\2\2\u0193\u0198\5R*\2\u0194\u0195\7B\2\2\u0195\u0197\5R*\2\u0196"+
		"\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\'\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019f\7=\2\2\u019c\u019e"+
		"\5,\27\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7>"+
		"\2\2\u01a3)\3\2\2\2\u01a4\u01a8\7=\2\2\u01a5\u01a7\5:\36\2\u01a6\u01a5"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7>\2\2\u01ac+\3\2\2\2\u01ad"+
		"\u01b4\7A\2\2\u01ae\u01b0\7(\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2"+
		"\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\5\u0094K\2\u01b2\u01b4\5.\30\2\u01b3"+
		"\u01ad\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4-\3\2\2\2"+
		"\u01b5\u01bf\5\60\31\2\u01b6\u01bf\5\62\32\2\u01b7\u01bf\58\35\2\u01b8"+
		"\u01bf\5\64\33\2\u01b9\u01bf\5\66\34\2\u01ba\u01bf\5$\23\2\u01bb\u01bf"+
		"\5\u0080A\2\u01bc\u01bf\5\24\13\2\u01bd\u01bf\5\34\17\2\u01be\u01b5\3"+
		"\2\2\2\u01be\u01b6\3\2\2\2\u01be\u01b7\3\2\2\2\u01be\u01b8\3\2\2\2\u01be"+
		"\u01b9\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2"+
		"\2\2\u01be\u01bd\3\2\2\2\u01bf/\3\2\2\2\u01c0\u01c2\5\n\6\2\u01c1\u01c0"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c6\5R*\2\u01c4"+
		"\u01c6\7\62\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3"+
		"\2\2\2\u01c7\u01c8\7f\2\2\u01c8\u01cd\5d\63\2\u01c9\u01ca\7?\2\2\u01ca"+
		"\u01cc\7@\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0"+
		"\u01d1\7/\2\2\u01d1\u01d3\5b\62\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d7\5l\67\2\u01d5\u01d7\7A\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\61\3\2\2\2\u01d8\u01da\5\n\6"+
		"\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc"+
		"\5\26\f\2\u01dc\u01dd\5\60\31\2\u01dd\63\3\2\2\2\u01de\u01e0\5\n\6\2\u01df"+
		"\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\7f"+
		"\2\2\u01e2\u01e5\5d\63\2\u01e3\u01e4\7/\2\2\u01e4\u01e6\5b\62\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5n"+
		"8\2\u01e8\65\3\2\2\2\u01e9\u01eb\5\n\6\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\5\26\f\2\u01ed\u01ee\5\64\33"+
		"\2\u01ee\67\3\2\2\2\u01ef\u01f1\5\n\6\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5R*\2\u01f3\u01f4\5F$\2\u01f4"+
		"\u01f5\7A\2\2\u01f59\3\2\2\2\u01f6\u01f9\5<\37\2\u01f7\u01f9\7A\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9;\3\2\2\2\u01fa\u0202\5> \2\u01fb"+
		"\u0202\5B\"\2\u01fc\u0202\5D#\2\u01fd\u0202\5$\23\2\u01fe\u0202\5\u0080"+
		"A\2\u01ff\u0202\5\24\13\2\u0200\u0202\5\34\17\2\u0201\u01fa\3\2\2\2\u0201"+
		"\u01fb\3\2\2\2\u0201\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0201\u01fe\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202=\3\2\2\2\u0203\u0205"+
		"\5\n\6\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\5R*\2\u0207\u020c\5@!\2\u0208\u0209\7B\2\2\u0209\u020b\5@!\2\u020a"+
		"\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7A\2\2\u0210"+
		"?\3\2\2\2\u0211\u0216\7f\2\2\u0212\u0213\7?\2\2\u0213\u0215\7@\2\2\u0214"+
		"\u0212\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7D\2\2\u021a"+
		"\u021b\5L\'\2\u021bA\3\2\2\2\u021c\u021e\5\n\6\2\u021d\u021c\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u0222\5R*\2\u0220\u0222\7\62"+
		"\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\7f\2\2\u0224\u0229\5d\63\2\u0225\u0226\7?\2\2\u0226\u0228\7@\2"+
		"\2\u0227\u0225\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022e\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7/\2\2\u022d"+
		"\u022f\5b\62\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u0231\7A\2\2\u0231C\3\2\2\2\u0232\u0234\5\n\6\2\u0233\u0232"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\26\f\2"+
		"\u0236\u0237\5B\"\2\u0237E\3\2\2\2\u0238\u023d\5H%\2\u0239\u023a\7B\2"+
		"\2\u023a\u023c\5H%\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023eG\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0243\5J&\2\u0241\u0242\7D\2\2\u0242\u0244\5L\'\2\u0243\u0241\3\2\2\2"+
		"\u0243\u0244\3\2\2\2\u0244I\3\2\2\2\u0245\u024a\7f\2\2\u0246\u0247\7?"+
		"\2\2\u0247\u0249\7@\2\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024bK\3\2\2\2\u024c\u024a\3\2\2\2"+
		"\u024d\u0250\5N(\2\u024e\u0250\5\u00be`\2\u024f\u024d\3\2\2\2\u024f\u024e"+
		"\3\2\2\2\u0250M\3\2\2\2\u0251\u025d\7=\2\2\u0252\u0257\5L\'\2\u0253\u0254"+
		"\7B\2\2\u0254\u0256\5L\'\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u025a\u025c\7B\2\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025e\3\2\2\2\u025d\u0252\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0260\7>\2\2\u0260O\3\2\2\2\u0261\u0262\7f\2\2\u0262Q\3\2\2"+
		"\2\u0263\u0265\5V,\2\u0264\u0266\5T+\2\u0265\u0264\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u026c\3\2\2\2\u0267\u0269\5Z.\2\u0268\u026a\5T+\2\u0269"+
		"\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0263\3\2"+
		"\2\2\u026b\u0267\3\2\2\2\u026cS\3\2\2\2\u026d\u026e\7?\2\2\u026e\u0270"+
		"\7@\2\2\u026f\u026d\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272U\3\2\2\2\u0273\u0274\b,\1\2\u0274\u0275\5X-\2\u0275"+
		"\u027b\3\2\2\2\u0276\u0277\f\3\2\2\u0277\u0278\7C\2\2\u0278\u027a\5X-"+
		"\2\u0279\u0276\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027cW\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0280\7f\2\2\u027f\u0281"+
		"\5\\/\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281Y\3\2\2\2\u0282\u0283"+
		"\t\4\2\2\u0283[\3\2\2\2\u0284\u0285\7F\2\2\u0285\u0286\5^\60\2\u0286\u0287"+
		"\7E\2\2\u0287]\3\2\2\2\u0288\u0289\b\60\1\2\u0289\u028a\5`\61\2\u028a"+
		"\u0290\3\2\2\2\u028b\u028c\f\3\2\2\u028c\u028d\7B\2\2\u028d\u028f\5`\61"+
		"\2\u028e\u028b\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291_\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u029a\5R*\2\u0294\u0297"+
		"\7I\2\2\u0295\u0296\t\5\2\2\u0296\u0298\5R*\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0293\3\2\2\2\u0299\u0294\3\2"+
		"\2\2\u029aa\3\2\2\2\u029b\u02a0\5p9\2\u029c\u029d\7B\2\2\u029d\u029f\5"+
		"p9\2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1c\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\7;\2\2\u02a4"+
		"\u02a6\5f\64\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a8\7<\2\2\u02a8e\3\2\2\2\u02a9\u02ae\5h\65\2\u02aa\u02ab"+
		"\7B\2\2\u02ab\u02ad\5h\65\2\u02ac\u02aa\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b3\3\2\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b1\u02b2\7B\2\2\u02b2\u02b4\5j\66\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b7\5j\66\2\u02b6\u02a9\3\2"+
		"\2\2\u02b6\u02b5\3\2\2\2\u02b7g\3\2\2\2\u02b8\u02ba\5\20\t\2\u02b9\u02b8"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\5R*\2\u02bc"+
		"\u02bd\5J&\2\u02bdi\3\2\2\2\u02be\u02c0\5\20\t\2\u02bf\u02be\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\5R*\2\u02c2\u02c3\7h\2"+
		"\2\u02c3\u02c4\5J&\2\u02c4k\3\2\2\2\u02c5\u02c6\5\u0094K\2\u02c6m\3\2"+
		"\2\2\u02c7\u02c8\5\u0094K\2\u02c8o\3\2\2\2\u02c9\u02ce\7f\2\2\u02ca\u02cb"+
		"\7C\2\2\u02cb\u02cd\7f\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfq\3\2\2\2\u02d0\u02ce\3\2\2\2"+
		"\u02d1\u02d2\t\6\2\2\u02d2s\3\2\2\2\u02d3\u02d4\7g\2\2\u02d4\u02db\5v"+
		"<\2\u02d5\u02d8\7;\2\2\u02d6\u02d9\5x=\2\u02d7\u02d9\5|?\2\u02d8\u02d6"+
		"\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dc\7<\2\2\u02db\u02d5\3\2\2\2\u02db\u02dc\3\2\2\2\u02dcu\3\2\2\2\u02dd"+
		"\u02de\5p9\2\u02dew\3\2\2\2\u02df\u02e4\5z>\2\u02e0\u02e1\7B\2\2\u02e1"+
		"\u02e3\5z>\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2"+
		"\2\u02e4\u02e5\3\2\2\2\u02e5y\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8"+
		"\7f\2\2\u02e8\u02e9\7D\2\2\u02e9\u02ea\5|?\2\u02ea{\3\2\2\2\u02eb\u02ef"+
		"\5\u00be`\2\u02ec\u02ef\5t;\2\u02ed\u02ef\5~@\2\u02ee\u02eb\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef}\3\2\2\2\u02f0\u02f9\7=\2\2\u02f1"+
		"\u02f6\5|?\2\u02f2\u02f3\7B\2\2\u02f3\u02f5\5|?\2\u02f4\u02f2\3\2\2\2"+
		"\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fa"+
		"\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02f1\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fc\3\2\2\2\u02fb\u02fd\7B\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2"+
		"\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7>\2\2\u02ff\177\3\2\2\2\u0300\u0302"+
		"\5\n\6\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0304\7g\2\2\u0304\u0305\7\36\2\2\u0305\u0306\7f\2\2\u0306\u0307\5\u0082"+
		"B\2\u0307\u0081\3\2\2\2\u0308\u030c\7=\2\2\u0309\u030b\5\u0084C\2\u030a"+
		"\u0309\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0310\7>\2\2\u0310"+
		"\u0083\3\2\2\2\u0311\u0314\5\u0086D\2\u0312\u0314\7A\2\2\u0313\u0311\3"+
		"\2\2\2\u0313\u0312\3\2\2\2\u0314\u0085\3\2\2\2\u0315\u0316\5\u0088E\2"+
		"\u0316\u0317\7A\2\2\u0317\u0329\3\2\2\2\u0318\u031a\5\24\13\2\u0319\u031b"+
		"\7A\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0329\3\2\2\2\u031c"+
		"\u031e\5$\23\2\u031d\u031f\7A\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2"+
		"\2\2\u031f\u0329\3\2\2\2\u0320\u0322\5\34\17\2\u0321\u0323\7A\2\2\u0322"+
		"\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0329\3\2\2\2\u0324\u0326\5\u0080"+
		"A\2\u0325\u0327\7A\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329"+
		"\3\2\2\2\u0328\u0315\3\2\2\2\u0328\u0318\3\2\2\2\u0328\u031c\3\2\2\2\u0328"+
		"\u0320\3\2\2\2\u0328\u0324\3\2\2\2\u0329\u0087\3\2\2\2\u032a\u032d\5\u008a"+
		"F\2\u032b\u032d\5\u008cG\2\u032c\u032a\3\2\2\2\u032c\u032b\3\2\2\2\u032d"+
		"\u0089\3\2\2\2\u032e\u0330\5\n\6\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0331\3\2\2\2\u0331\u0332\5R*\2\u0332\u0333\5\u008eH\2\u0333"+
		"\u008b\3\2\2\2\u0334\u0336\5\n\6\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u0338\5R*\2\u0338\u0339\5\u0090I\2\u0339"+
		"\u008d\3\2\2\2\u033a\u033b\7f\2\2\u033b\u033c\7;\2\2\u033c\u033e\7<\2"+
		"\2\u033d\u033f\5\u0092J\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u008f\3\2\2\2\u0340\u0341\5F$\2\u0341\u0091\3\2\2\2\u0342\u0343\7\16"+
		"\2\2\u0343\u0344\5|?\2\u0344\u0093\3\2\2\2\u0345\u0349\7=\2\2\u0346\u0348"+
		"\5\u0096L\2\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2"+
		"\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034d"+
		"\7>\2\2\u034d\u0095\3\2\2\2\u034e\u0352\5\u0098M\2\u034f\u0352\5\u009c"+
		"O\2\u0350\u0352\5\b\5\2\u0351\u034e\3\2\2\2\u0351\u034f\3\2\2\2\u0351"+
		"\u0350\3\2\2\2\u0352\u0097\3\2\2\2\u0353\u0354\5\u009aN\2\u0354\u0355"+
		"\7A\2\2\u0355\u0099\3\2\2\2\u0356\u0358\5\20\t\2\u0357\u0356\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\5R*\2\u035a\u035b\5F$\2"+
		"\u035b\u009b\3\2\2\2\u035c\u03c5\5\u0094K\2\u035d\u035e\7\4\2\2\u035e"+
		"\u0361\5\u00be`\2\u035f\u0360\7J\2\2\u0360\u0362\5\u00be`\2\u0361\u035f"+
		"\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\7A\2\2\u0364"+
		"\u03c5\3\2\2\2\u0365\u0366\7\30\2\2\u0366\u0367\5\u00b6\\\2\u0367\u036a"+
		"\5\u009cO\2\u0368\u0369\7\21\2\2\u0369\u036b\5\u009cO\2\u036a\u0368\3"+
		"\2\2\2\u036a\u036b\3\2\2\2\u036b\u03c5\3\2\2\2\u036c\u036d\7\27\2\2\u036d"+
		"\u036e\7;\2\2\u036e\u036f\5\u00aeX\2\u036f\u0370\7<\2\2\u0370\u0371\5"+
		"\u009cO\2\u0371\u03c5\3\2\2\2\u0372\u0373\7\64\2\2\u0373\u0374\5\u00b6"+
		"\\\2\u0374\u0375\5\u009cO\2\u0375\u03c5\3\2\2\2\u0376\u0377\7\17\2\2\u0377"+
		"\u0378\5\u009cO\2\u0378\u0379\7\64\2\2\u0379\u037a\5\u00b6\\\2\u037a\u037b"+
		"\7A\2\2\u037b\u03c5\3\2\2\2\u037c\u037d\7\61\2\2\u037d\u0387\5\u0094K"+
		"\2\u037e\u0380\5\u009eP\2\u037f\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0385\5\u00a2"+
		"R\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0388\3\2\2\2\u0386"+
		"\u0388\5\u00a2R\2\u0387\u037f\3\2\2\2\u0387\u0386\3\2\2\2\u0388\u03c5"+
		"\3\2\2\2\u0389\u038a\7\61\2\2\u038a\u038b\5\u00a4S\2\u038b\u038f\5\u0094"+
		"K\2\u038c\u038e\5\u009eP\2\u038d\u038c\3\2\2\2\u038e\u0391\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2"+
		"\2\2\u0392\u0394\5\u00a2R\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u03c5\3\2\2\2\u0395\u0396\7+\2\2\u0396\u0397\5\u00b6\\\2\u0397\u039b"+
		"\7=\2\2\u0398\u039a\5\u00aaV\2\u0399\u0398\3\2\2\2\u039a\u039d\3\2\2\2"+
		"\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u03a1\3\2\2\2\u039d\u039b"+
		"\3\2\2\2\u039e\u03a0\5\u00acW\2\u039f\u039e\3\2\2\2\u03a0\u03a3\3\2\2"+
		"\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a1"+
		"\3\2\2\2\u03a4\u03a5\7>\2\2\u03a5\u03c5\3\2\2\2\u03a6\u03a7\7,\2\2\u03a7"+
		"\u03a8\5\u00b6\\\2\u03a8\u03a9\5\u0094K\2\u03a9\u03c5\3\2\2\2\u03aa\u03ac"+
		"\7&\2\2\u03ab\u03ad\5\u00be`\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2"+
		"\u03ad\u03ae\3\2\2\2\u03ae\u03c5\7A\2\2\u03af\u03b0\7.\2\2\u03b0\u03b1"+
		"\5\u00be`\2\u03b1\u03b2\7A\2\2\u03b2\u03c5\3\2\2\2\u03b3\u03b5\7\6\2\2"+
		"\u03b4\u03b6\7f\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7"+
		"\3\2\2\2\u03b7\u03c5\7A\2\2\u03b8\u03ba\7\r\2\2\u03b9\u03bb\7f\2\2\u03ba"+
		"\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03c5\7A"+
		"\2\2\u03bd\u03c5\7A\2\2\u03be\u03bf\5\u00ba^\2\u03bf\u03c0\7A\2\2\u03c0"+
		"\u03c5\3\2\2\2\u03c1\u03c2\7f\2\2\u03c2\u03c3\7J\2\2\u03c3\u03c5\5\u009c"+
		"O\2\u03c4\u035c\3\2\2\2\u03c4\u035d\3\2\2\2\u03c4\u0365\3\2\2\2\u03c4"+
		"\u036c\3\2\2\2\u03c4\u0372\3\2\2\2\u03c4\u0376\3\2\2\2\u03c4\u037c\3\2"+
		"\2\2\u03c4\u0389\3\2\2\2\u03c4\u0395\3\2\2\2\u03c4\u03a6\3\2\2\2\u03c4"+
		"\u03aa\3\2\2\2\u03c4\u03af\3\2\2\2\u03c4\u03b3\3\2\2\2\u03c4\u03b8\3\2"+
		"\2\2\u03c4\u03bd\3\2\2\2\u03c4\u03be\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c5"+
		"\u009d\3\2\2\2\u03c6\u03c7\7\t\2\2\u03c7\u03c9\7;\2\2\u03c8\u03ca\5\20"+
		"\t\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cc\5\u00a0Q\2\u03cc\u03cd\7f\2\2\u03cd\u03ce\7<\2\2\u03ce\u03cf\5"+
		"\u0094K\2\u03cf\u009f\3\2\2\2\u03d0\u03d5\5p9\2\u03d1\u03d2\7X\2\2\u03d2"+
		"\u03d4\5p9\2\u03d3\u03d1\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2"+
		"\2\u03d5\u03d6\3\2\2\2\u03d6\u00a1\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03d9"+
		"\7\25\2\2\u03d9\u03da\5\u0094K\2\u03da\u00a3\3\2\2\2\u03db\u03dc\7;\2"+
		"\2\u03dc\u03de\5\u00a6T\2\u03dd\u03df\7A\2\2\u03de\u03dd\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\7<\2\2\u03e1\u00a5\3\2"+
		"\2\2\u03e2\u03e7\5\u00a8U\2\u03e3\u03e4\7A\2\2\u03e4\u03e6\5\u00a8U\2"+
		"\u03e5\u03e3\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8"+
		"\3\2\2\2\u03e8\u00a7\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03ec\5\20\t\2"+
		"\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee"+
		"\5V,\2\u03ee\u03ef\5J&\2\u03ef\u03f0\7D\2\2\u03f0\u03f1\5\u00be`\2\u03f1"+
		"\u00a9\3\2\2\2\u03f2\u03f4\5\u00acW\2\u03f3\u03f2\3\2\2\2\u03f4\u03f5"+
		"\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7"+
		"\u03f9\5\u0096L\2\u03f8\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03f8"+
		"\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u00ab\3\2\2\2\u03fc\u03fd\7\b\2\2\u03fd"+
		"\u03fe\5\u00bc_\2\u03fe\u03ff\7J\2\2\u03ff\u0407\3\2\2\2\u0400\u0401\7"+
		"\b\2\2\u0401\u0402\5P)\2\u0402\u0403\7J\2\2\u0403\u0407\3\2\2\2\u0404"+
		"\u0405\7\16\2\2\u0405\u0407\7J\2\2\u0406\u03fc\3\2\2\2\u0406\u0400\3\2"+
		"\2\2\u0406\u0404\3\2\2\2\u0407\u00ad\3\2\2\2\u0408\u0415\5\u00b2Z\2\u0409"+
		"\u040b\5\u00b0Y\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u040e\7A\2\2\u040d\u040f\5\u00be`\2\u040e\u040d\3\2\2\2"+
		"\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412\7A\2\2\u0411\u0413"+
		"\5\u00b4[\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\3\2\2"+
		"\2\u0414\u0408\3\2\2\2\u0414\u040a\3\2\2\2\u0415\u00af\3\2\2\2\u0416\u0419"+
		"\5\u009aN\2\u0417\u0419\5\u00b8]\2\u0418\u0416\3\2\2\2\u0418\u0417\3\2"+
		"\2\2\u0419\u00b1\3\2\2\2\u041a\u041c\5\20\t\2\u041b\u041a\3\2\2\2\u041b"+
		"\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\5R*\2\u041e\u041f\5J&\2"+
		"\u041f\u0420\7J\2\2\u0420\u0421\5\u00be`\2\u0421\u00b3\3\2\2\2\u0422\u0423"+
		"\5\u00b8]\2\u0423\u00b5\3\2\2\2\u0424\u0425\7;\2\2\u0425\u0426\5\u00be"+
		"`\2\u0426\u0427\7<\2\2\u0427\u00b7\3\2\2\2\u0428\u042d\5\u00be`\2\u0429"+
		"\u042a\7B\2\2\u042a\u042c\5\u00be`\2\u042b\u0429\3\2\2\2\u042c\u042f\3"+
		"\2\2\2\u042d\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u00b9\3\2\2\2\u042f"+
		"\u042d\3\2\2\2\u0430\u0431\5\u00be`\2\u0431\u00bb\3\2\2\2\u0432\u0433"+
		"\5\u00be`\2\u0433\u00bd\3\2\2\2\u0434\u0435\b`\1\2\u0435\u0436\7;\2\2"+
		"\u0436\u0437\5R*\2\u0437\u0438\7<\2\2\u0438\u0439\5\u00be`\23\u0439\u0442"+
		"\3\2\2\2\u043a\u043b\t\7\2\2\u043b\u0442\5\u00be`\21\u043c\u043d\t\b\2"+
		"\2\u043d\u0442\5\u00be`\20\u043e\u0442\5\u00c0a\2\u043f\u0440\7!\2\2\u0440"+
		"\u0442\5\u00c2b\2\u0441\u0434\3\2\2\2\u0441\u043a\3\2\2\2\u0441\u043c"+
		"\3\2\2\2\u0441\u043e\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0498\3\2\2\2\u0443"+
		"\u0444\f\17\2\2\u0444\u0445\t\t\2\2\u0445\u0497\5\u00be`\20\u0446\u0447"+
		"\f\16\2\2\u0447\u0448\t\n\2\2\u0448\u0497\5\u00be`\17\u0449\u0451\f\r"+
		"\2\2\u044a\u044b\7F\2\2\u044b\u0452\7F\2\2\u044c\u044d\7E\2\2\u044d\u044e"+
		"\7E\2\2\u044e\u0452\7E\2\2\u044f\u0450\7E\2\2\u0450\u0452\7E\2\2\u0451"+
		"\u044a\3\2\2\2\u0451\u044c\3\2\2\2\u0451\u044f\3\2\2\2\u0452\u0453\3\2"+
		"\2\2\u0453\u0497\5\u00be`\16\u0454\u0455\f\f\2\2\u0455\u0456\t\13\2\2"+
		"\u0456\u0497\5\u00be`\r\u0457\u0458\f\n\2\2\u0458\u0459\t\f\2\2\u0459"+
		"\u0497\5\u00be`\13\u045a\u045b\f\t\2\2\u045b\u045c\7W\2\2\u045c\u0497"+
		"\5\u00be`\n\u045d\u045e\f\b\2\2\u045e\u045f\7Y\2\2\u045f\u0497\5\u00be"+
		"`\t\u0460\u0461\f\7\2\2\u0461\u0462\7X\2\2\u0462\u0497\5\u00be`\b\u0463"+
		"\u0464\f\6\2\2\u0464\u0465\7O\2\2\u0465\u0497\5\u00be`\7\u0466\u0467\f"+
		"\5\2\2\u0467\u0468\7P\2\2\u0468\u0497\5\u00be`\6\u0469\u046a\f\4\2\2\u046a"+
		"\u046b\7I\2\2\u046b\u046c\5\u00be`\2\u046c\u046d\7J\2\2\u046d\u046e\5"+
		"\u00be`\5\u046e\u0497\3\2\2\2\u046f\u0470\f\3\2\2\u0470\u0471\t\r\2\2"+
		"\u0471\u0497\5\u00be`\3\u0472\u0473\f\33\2\2\u0473\u0474\7C\2\2\u0474"+
		"\u0497\7f\2\2\u0475\u0476\f\32\2\2\u0476\u0477\7C\2\2\u0477\u0497\7-\2"+
		"\2\u0478\u0479\f\31\2\2\u0479\u047a\7C\2\2\u047a\u047c\7!\2\2\u047b\u047d"+
		"\5\u00ceh\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2"+
		"\2\u047e\u0497\5\u00c6d\2\u047f\u0480\f\30\2\2\u0480\u0481\7C\2\2\u0481"+
		"\u0482\7*\2\2\u0482\u0497\5\u00d4k\2\u0483\u0484\f\27\2\2\u0484\u0485"+
		"\7C\2\2\u0485\u0497\5\u00ccg\2\u0486\u0487\f\26\2\2\u0487\u0488\7?\2\2"+
		"\u0488\u0489\5\u00be`\2\u0489\u048a\7@\2\2\u048a\u0497\3\2\2\2\u048b\u048c"+
		"\f\25\2\2\u048c\u048e\7;\2\2\u048d\u048f\5\u00b8]\2\u048e\u048d\3\2\2"+
		"\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0497\7<\2\2\u0491\u0492"+
		"\f\22\2\2\u0492\u0497\t\16\2\2\u0493\u0494\f\13\2\2\u0494\u0495\7\34\2"+
		"\2\u0495\u0497\5R*\2\u0496\u0443\3\2\2\2\u0496\u0446\3\2\2\2\u0496\u0449"+
		"\3\2\2\2\u0496\u0454\3\2\2\2\u0496\u0457\3\2\2\2\u0496\u045a\3\2\2\2\u0496"+
		"\u045d\3\2\2\2\u0496\u0460\3\2\2\2\u0496\u0463\3\2\2\2\u0496\u0466\3\2"+
		"\2\2\u0496\u0469\3\2\2\2\u0496\u046f\3\2\2\2\u0496\u0472\3\2\2\2\u0496"+
		"\u0475\3\2\2\2\u0496\u0478\3\2\2\2\u0496\u047f\3\2\2\2\u0496\u0483\3\2"+
		"\2\2\u0496\u0486\3\2\2\2\u0496\u048b\3\2\2\2\u0496\u0491\3\2\2\2\u0496"+
		"\u0493\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2"+
		"\2\2\u0499\u00bf\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049c\7;\2\2\u049c"+
		"\u049d\5\u00be`\2\u049d\u049e\7<\2\2\u049e\u04b1\3\2\2\2\u049f\u04b1\7"+
		"-\2\2\u04a0\u04b1\7*\2\2\u04a1\u04b1\5r:\2\u04a2\u04b1\7f\2\2\u04a3\u04a4"+
		"\5R*\2\u04a4\u04a5\7C\2\2\u04a5\u04a6\7\13\2\2\u04a6\u04b1\3\2\2\2\u04a7"+
		"\u04a8\7\62\2\2\u04a8\u04a9\7C\2\2\u04a9\u04b1\7\13\2\2\u04aa\u04ae\5"+
		"\u00ceh\2\u04ab\u04af\5\u00d6l\2\u04ac\u04ad\7-\2\2\u04ad\u04af\5\u00d8"+
		"m\2\u04ae\u04ab\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0"+
		"\u049b\3\2\2\2\u04b0\u049f\3\2\2\2\u04b0\u04a0\3\2\2\2\u04b0\u04a1\3\2"+
		"\2\2\u04b0\u04a2\3\2\2\2\u04b0\u04a3\3\2\2\2\u04b0\u04a7\3\2\2\2\u04b0"+
		"\u04aa\3\2\2\2\u04b1\u00c1\3\2\2\2\u04b2\u04b3\5\u00ceh\2\u04b3\u04b4"+
		"\5\u00c4c\2\u04b4\u04b5\5\u00caf\2\u04b5\u04bc\3\2\2\2\u04b6\u04b9\5\u00c4"+
		"c\2\u04b7\u04ba\5\u00c8e\2\u04b8\u04ba\5\u00caf\2\u04b9\u04b7\3\2\2\2"+
		"\u04b9\u04b8\3\2\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04b2\3\2\2\2\u04bb\u04b6"+
		"\3\2\2\2\u04bc\u00c3\3\2\2\2\u04bd\u04bf\7f\2\2\u04be\u04c0\5\u00d0i\2"+
		"\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c8\3\2\2\2\u04c1\u04c2"+
		"\7C\2\2\u04c2\u04c4\7f\2\2\u04c3\u04c5\5\u00d0i\2\u04c4\u04c3\3\2\2\2"+
		"\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c1\3\2\2\2\u04c7\u04ca"+
		"\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cd\3\2\2\2\u04ca"+
		"\u04c8\3\2\2\2\u04cb\u04cd\5Z.\2\u04cc\u04bd\3\2\2\2\u04cc\u04cb\3\2\2"+
		"\2\u04cd\u00c5\3\2\2\2\u04ce\u04d0\7f\2\2\u04cf\u04d1\5\u00d2j\2\u04d0"+
		"\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\5\u00ca"+
		"f\2\u04d3\u00c7\3\2\2\2\u04d4\u04f0\7?\2\2\u04d5\u04da\7@\2\2\u04d6\u04d7"+
		"\7?\2\2\u04d7\u04d9\7@\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da"+
		"\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc\u04da\3\2"+
		"\2\2\u04dd\u04f1\5N(\2\u04de\u04df\5\u00be`\2\u04df\u04e6\7@\2\2\u04e0"+
		"\u04e1\7?\2\2\u04e1\u04e2\5\u00be`\2\u04e2\u04e3\7@\2\2\u04e3\u04e5\3"+
		"\2\2\2\u04e4\u04e0\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6"+
		"\u04e7\3\2\2\2\u04e7\u04ed\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\7?"+
		"\2\2\u04ea\u04ec\7@\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed"+
		"\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2"+
		"\2\2\u04f0\u04d5\3\2\2\2\u04f0\u04de\3\2\2\2\u04f1\u00c9\3\2\2\2\u04f2"+
		"\u04f4\5\u00d8m\2\u04f3\u04f5\5(\25\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5"+
		"\3\2\2\2\u04f5\u00cb\3\2\2\2\u04f6\u04f7\5\u00ceh\2\u04f7\u04f8\5\u00d6"+
		"l\2\u04f8\u00cd\3\2\2\2\u04f9\u04fa\7F\2\2\u04fa\u04fb\5&\24\2\u04fb\u04fc"+
		"\7E\2\2\u04fc\u00cf\3\2\2\2\u04fd\u04fe\7F\2\2\u04fe\u0501\7E\2\2\u04ff"+
		"\u0501\5\\/\2\u0500\u04fd\3\2\2\2\u0500\u04ff\3\2\2\2\u0501\u00d1\3\2"+
		"\2\2\u0502\u0503\7F\2\2\u0503\u0506\7E\2\2\u0504\u0506\5\u00ceh\2\u0505"+
		"\u0502\3\2\2\2\u0505\u0504\3\2\2\2\u0506\u00d3\3\2\2\2\u0507\u050e\5\u00d8"+
		"m\2\u0508\u0509\7C\2\2\u0509\u050b\7f\2\2\u050a\u050c\5\u00d8m\2\u050b"+
		"\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d\u0507\3\2"+
		"\2\2\u050d\u0508\3\2\2\2\u050e\u00d5\3\2\2\2\u050f\u0510\7*\2\2\u0510"+
		"\u0514\5\u00d4k\2\u0511\u0512\7f\2\2\u0512\u0514\5\u00d8m\2\u0513\u050f"+
		"\3\2\2\2\u0513\u0511\3\2\2\2\u0514\u00d7\3\2\2\2\u0515\u0517\7;\2\2\u0516"+
		"\u0518\5\u00b8]\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519"+
		"\3\2\2\2\u0519\u051a\7<\2\2\u051a\u00d9\3\2\2\2\u009d\u00de\u00e2\u0102"+
		"\u0108\u0111\u0116\u011a\u0123\u0128\u012b\u0130\u0134\u0138\u0142\u014a"+
		"\u0151\u0155\u015b\u015f\u0162\u0165\u016e\u0174\u0179\u017c\u0182\u0186"+
		"\u018b\u018f\u0198\u019f\u01a8\u01af\u01b3\u01be\u01c1\u01c5\u01cd\u01d2"+
		"\u01d6\u01d9\u01df\u01e5\u01ea\u01f0\u01f8\u0201\u0204\u020c\u0216\u021d"+
		"\u0221\u0229\u022e\u0233\u023d\u0243\u024a\u024f\u0257\u025b\u025d\u0265"+
		"\u0269\u026b\u0271\u027b\u0280\u0290\u0297\u0299\u02a0\u02a5\u02ae\u02b3"+
		"\u02b6\u02b9\u02bf\u02ce\u02d8\u02db\u02e4\u02ee\u02f6\u02f9\u02fc\u0301"+
		"\u030c\u0313\u031a\u031e\u0322\u0326\u0328\u032c\u032f\u0335\u033e\u0349"+
		"\u0351\u0357\u0361\u036a\u0381\u0384\u0387\u038f\u0393\u039b\u03a1\u03ac"+
		"\u03b5\u03ba\u03c4\u03c9\u03d5\u03de\u03e7\u03eb\u03f5\u03fa\u0406\u040a"+
		"\u040e\u0412\u0414\u0418\u041b\u042d\u0441\u0451\u047c\u048e\u0496\u0498"+
		"\u04ae\u04b0\u04b9\u04bb\u04bf\u04c4\u04c8\u04cc\u04d0\u04da\u04e6\u04ed"+
		"\u04f0\u04f4\u0500\u0505\u050b\u050d\u0513\u0517";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}