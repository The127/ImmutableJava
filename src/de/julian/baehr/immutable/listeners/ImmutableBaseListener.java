package de.julian.baehr.immutable.listeners;

import java.util.List;
import java.util.function.Consumer;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.generated.JavaBaseListener;
import de.julian.baehr.immutable.generated.JavaParser.*;

/**
 * This class defines a few helper methods for listeners.
 * @author Julian Sven Bähr 
 * 
 * @param <Result> The type of result for this listener.
 */
public abstract class ImmutableBaseListener <Result> extends JavaBaseListener{

	protected Result result;
	
	/**
	 * Sets the value of the result.
	 * @param result The result value.
	 */
	protected void setResult(Result result){
		this.result = result;
	}
	
	/**
	 * @return true if this listener has a result value.
	 */
	public boolean hasResult(){
		return result != null;
	}
	
	/**
	 * @return the result of this listener.
	 */
	public Result getResult() {
		return result;
	}
	
	/**
	 * Executes the given handler code if this listener has a result value.
	 * @param handler Handler code.
	 */
	public void ifResult(Consumer<Result> handler){
		if(hasResult())
			handler.accept(result);
	}
	
	/**
	 * Enters all the rules in the list with this listener. If the list is null or empty nothing will happen.
	 * @param ctxs A list of rule contexts.
	 */
	public void enterHere(List<? extends ParserRuleContext> ctxs){
		enterThere(ctxs, this);
	}
	
	/**
	 * Enters the rule with this listener. If the ctx is null nothing will happen.
	 * @param ctx The rule context.
	 */
	public void enterHere(ParserRuleContext ctx) {
		enterThere(ctx, this);
	}
	
	/**
	 * Enters all rules in the list with the given listener. If the list is null or empty nothing will happen.
	 * @param ctxs A list of rule contexts.
	 * @param listener The target listener.
	 * @return The given listener.
	 */
	public <Listener extends ImmutableBaseListener<?>> Listener enterThere(List<? extends ParserRuleContext> ctxs, Listener listener){
		if (listener == null)
			throw new NullPointerException("listener is null");
		if(ctxs != null && !ctxs.isEmpty())
			ctxs.forEach(ctx -> enterThere(ctx, listener));
		return listener;
	}
	
	/**
	 * Enters the rule in another listener if the ctx is not null.
	 * @param ctx The rule context.
	 * @param listener The target listener.
	 * @return The given listener.
	 */
	public <Listener extends ImmutableBaseListener<?>> Listener enterThere(ParserRuleContext ctx, Listener listener){
		if (listener == null)
			throw new NullPointerException("listener is null");
		if(ctx != null)
			ctx.enterRule(listener);
		return listener;
	}
	
	@Override
	public void enterBracketExpression(BracketExpressionContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterBrackets(BracketsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterCreatedNamePart(CreatedNamePartContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionAutoCpy(ExpressionAutoCpyContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSpecialParameter(SpecialParameterContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSpecialParameters(SpecialParametersContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotation(AnnotationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationConstant(AnnotationConstantContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationConstantRest(AnnotationConstantRestContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationMethod(AnnotationMethodContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationMethodOrConstantRest(AnnotationMethodOrConstantRestContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationMethodRest(AnnotationMethodRestContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationModifer(AnnotationModiferContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationName(AnnotationNameContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationTypeElementRestMethod(AnnotationTypeElementRestMethodContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationTypeElementRestType(AnnotationTypeElementRestTypeContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterAnnotationVariableModifier(AnnotationVariableModifierContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterArguments(ArgumentsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterArrayCreatorRest(ArrayCreatorRestContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterArrayDeclaration(ArrayDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterArrayInitializer(ArrayInitializerContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterBlock(BlockContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterBlockStatement(BlockStatementContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterCatchClause(CatchClauseContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterCatchType(CatchTypeContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassBody(ClassBodyContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassBodyDeclarationMember(ClassBodyDeclarationMemberContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassBodyDeclarationSemicolon(ClassBodyDeclarationSemicolonContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassBodyDeclarationStaticBlock(ClassBodyDeclarationStaticBlockContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassCreatorRest(ClassCreatorRestContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterClassOrInterfaceTypeList(ClassOrInterfaceTypeListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterCompilationUnit(CompilationUnitContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterConstantDeclarator(ConstantDeclaratorContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterConstantExpression(ConstantExpressionContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterConstDeclaration(ConstDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterConstructorBody(ConstructorBodyContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterCreatedName(CreatedNameContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterCreator(CreatorContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterDefaultValue(DefaultValueContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterElementValue(ElementValueContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterElementValuePair(ElementValuePairContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterElementValuePairs(ElementValuePairsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterEnhancedForControl(EnhancedForControlContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterEnumConstant(EnumConstantContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterEnumConstantName(EnumConstantNameContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterEnumConstants(EnumConstantsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterEnumDeclaration(EnumDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExplicitGenericInvocation(ExplicitGenericInvocationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExplicitGenericInvocationSuffix(ExplicitGenericInvocationSuffixContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionAddSub(ExpressionAddSubContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionAnd(ExpressionAndContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionAndAnd(ExpressionAndAndContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionArray(ExpressionArrayContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionCast(ExpressionCastContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionCtor(ExpressionCtorContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionDotExplGenInvoc(ExpressionDotExplGenInvocContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionDotId(ExpressionDotIdContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionDotNewWildInner(ExpressionDotNewWildInnerContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionDotSuperSuffix(ExpressionDotSuperSuffixContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionDotThis(ExpressionDotThisContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionEquals(ExpressionEqualsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionInstanceof(ExpressionInstanceofContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionLessGreater(ExpressionLessGreaterContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionLessGreaterEqual(ExpressionLessGreaterEqualContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionMath(ExpressionMathContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionMethodCall(ExpressionMethodCallContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionMulDivMod(ExpressionMulDivModContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionNot(ExpressionNotContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionOr(ExpressionOrContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionOrOr(ExpressionOrOrContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionPost(ExpressionPostContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionPrimary(ExpressionPrimaryContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionTern(ExpressionTernContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionXor(ExpressionXorContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionPre(ExpressionPreContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterExpressionList(ExpressionListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterFinallyBlock(FinallyBlockContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterForControl(ForControlContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterForInit(ForInitContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterFormalParameter(FormalParameterContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterFormalParameterList(FormalParameterListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterFormalParameters(FormalParametersContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterForUpdate(ForUpdateContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterGenericConstructorDeclaration(GenericConstructorDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterGenericInterfaceMethodDeclaration(GenericInterfaceMethodDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterGenericMethodDeclaration(GenericMethodDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterInnerCreator(InnerCreatorContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterInterfaceBody(InterfaceBodyContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterInterfaceBodyDeclaration(InterfaceBodyDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterInterfaceMemberDeclarationMember(InterfaceMemberDeclarationMemberContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterInterfaceMemberDeclarationType(InterfaceMemberDeclarationTypeContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterLastFormalParameter(LastFormalParameterContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterLiteral(LiteralContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterMemberDeclarationMember(MemberDeclarationMemberContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterMemberDeclarationSubType(MemberDeclarationSubTypeContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterMethodBody(MethodBodyContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterMethodDeclaration(MethodDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterModifierList(ModifierListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterNonSimpleModifier(NonSimpleModifierContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterNonWildcardTypeArgumentsOrDiamond(NonWildcardTypeArgumentsOrDiamondContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterNormalTypeArgument(NormalTypeArgumentContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterParExpression(ParExpressionContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimClass(PrimClassContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimExpression(PrimExpressionContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimId(PrimIdContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimLiteral(PrimLiteralContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimNonWild(PrimNonWildContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimSuper(PrimSuperContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimThis(PrimThisContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimVClass(PrimVClassContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterPrimitiveType(PrimitiveTypeContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterQualifiedName(QualifiedNameContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterQualifiedNameList(QualifiedNameListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterResource(ResourceContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterResources(ResourcesContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterResourceSpecification(ResourceSpecificationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSimpleClassModifer(SimpleClassModiferContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSimpleModifer(SimpleModiferContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSimpleVariableModifier(SimpleVariableModifierContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSingleClassImport(SingleClassImportContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStarImport(StarImportContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementAssert(StatementAssertContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementBlock(StatementBlockContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementBreak(StatementBreakContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementContinue(StatementContinueContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementDo(StatementDoContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementFor(StatementForContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementIdentifierStatement(StatementIdentifierStatementContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementIf(StatementIfContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementReturn(StatementReturnContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementSemicolon(StatementSemicolonContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementStatemenExpression(StatementStatemenExpressionContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementSwitch(StatementSwitchContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementSynchronized(StatementSynchronizedContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementThrow(StatementThrowContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementTry(StatementTryContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementTryResources(StatementTryResourcesContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementWhile(StatementWhileContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStatementExpression(StatementExpressionContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStaticImport(StaticImportContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterStaticImportMany(StaticImportManyContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSuperSuffix(SuperSuffixContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterSwitchLabel(SwitchLabelContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeArguments(TypeArgumentsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeArgumentsList(TypeArgumentsListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeBound(TypeBoundContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeDeclaration(TypeDeclarationContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeList(TypeListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeParameter(TypeParameterContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeParameters(TypeParametersContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterTypeType(TypeTypeContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterVariableDeclarator(VariableDeclaratorContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterVariableDeclarators(VariableDeclaratorsContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterVariableInitializer(VariableInitializerContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterVariableModifierList(VariableModifierListContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
	
	@Override
	public void enterWildcardTypeArgument(WildcardTypeArgumentContext ctx) {
		throw new RuntimeException("Not implemented here: " + getClass().getName());
	}
}
