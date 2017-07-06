// Generated from Java.g4 by ANTLR 4.4

	package de.julian.baehr.immutable.generated;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclarationSemicolon}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarationSemicolon(@NotNull JavaParser.ClassBodyDeclarationSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclarationSemicolon}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarationSemicolon(@NotNull JavaParser.ClassBodyDeclarationSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSemicolon}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSemicolon(@NotNull JavaParser.StatementSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSemicolon}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSemicolon(@NotNull JavaParser.StatementSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(@NotNull JavaParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(@NotNull JavaParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(@NotNull JavaParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(@NotNull JavaParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementStatemenExpression}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementStatemenExpression(@NotNull JavaParser.StatementStatemenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementStatemenExpression}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementStatemenExpression(@NotNull JavaParser.StatementStatemenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull JavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull JavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStarImport(@NotNull JavaParser.StarImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStarImport(@NotNull JavaParser.StarImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildcardTypeArgument}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWildcardTypeArgument(@NotNull JavaParser.WildcardTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildcardTypeArgument}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWildcardTypeArgument(@NotNull JavaParser.WildcardTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclarationSubType}
	 * labeled alternative in {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarationSubType(@NotNull JavaParser.MemberDeclarationSubTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclarationSubType}
	 * labeled alternative in {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarationSubType(@NotNull JavaParser.MemberDeclarationSubTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionEquals}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEquals(@NotNull JavaParser.ExpressionEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionEquals}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEquals(@NotNull JavaParser.ExpressionEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationMethod}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethod(@NotNull JavaParser.AnnotationMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationMethod}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethod(@NotNull JavaParser.AnnotationMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primSuper}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimSuper(@NotNull JavaParser.PrimSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primSuper}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimSuper(@NotNull JavaParser.PrimSuperContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationTypeElementRestType}
	 * labeled alternative in {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRestType(@NotNull JavaParser.AnnotationTypeElementRestTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationTypeElementRestType}
	 * labeled alternative in {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRestType(@NotNull JavaParser.AnnotationTypeElementRestTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull JavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull JavaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementThrow}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementThrow(@NotNull JavaParser.StatementThrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementThrow}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementThrow(@NotNull JavaParser.StatementThrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPre}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPre(@NotNull JavaParser.ExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPre}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPre(@NotNull JavaParser.ExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableModifierList}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifierList(@NotNull JavaParser.VariableModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableModifierList}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifierList(@NotNull JavaParser.VariableModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(@NotNull JavaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(@NotNull JavaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull JavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull JavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPrimary}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPrimary(@NotNull JavaParser.ExpressionPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPrimary}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPrimary(@NotNull JavaParser.ExpressionPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(@NotNull JavaParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(@NotNull JavaParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationVariableModifier}
	 * labeled alternative in {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationVariableModifier(@NotNull JavaParser.AnnotationVariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationVariableModifier}
	 * labeled alternative in {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationVariableModifier(@NotNull JavaParser.AnnotationVariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationTypeElementRestMethod}
	 * labeled alternative in {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRestMethod(@NotNull JavaParser.AnnotationTypeElementRestMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationTypeElementRestMethod}
	 * labeled alternative in {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRestMethod(@NotNull JavaParser.AnnotationTypeElementRestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull JavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull JavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationConstant}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstant(@NotNull JavaParser.AnnotationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationConstant}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstant(@NotNull JavaParser.AnnotationConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleModifer}
	 * labeled alternative in {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleModifer(@NotNull JavaParser.SimpleModiferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleModifer}
	 * labeled alternative in {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleModifer(@NotNull JavaParser.SimpleModiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionArray}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArray(@NotNull JavaParser.ExpressionArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionArray}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArray(@NotNull JavaParser.ExpressionArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primThis}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimThis(@NotNull JavaParser.PrimThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primThis}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimThis(@NotNull JavaParser.PrimThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalTypeArgument}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterNormalTypeArgument(@NotNull JavaParser.NormalTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalTypeArgument}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitNormalTypeArgument(@NotNull JavaParser.NormalTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleVariableModifier}
	 * labeled alternative in {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVariableModifier(@NotNull JavaParser.SimpleVariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleVariableModifier}
	 * labeled alternative in {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVariableModifier(@NotNull JavaParser.SimpleVariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull JavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull JavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMethodCall}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethodCall(@NotNull JavaParser.ExpressionMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMethodCall}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethodCall(@NotNull JavaParser.ExpressionMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPost}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPost(@NotNull JavaParser.ExpressionPostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPost}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPost(@NotNull JavaParser.ExpressionPostContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDotSuperSuffix}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDotSuperSuffix(@NotNull JavaParser.ExpressionDotSuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDotSuperSuffix}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDotSuperSuffix(@NotNull JavaParser.ExpressionDotSuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAddSub}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddSub(@NotNull JavaParser.ExpressionAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAddSub}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddSub(@NotNull JavaParser.ExpressionAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclarationType}
	 * labeled alternative in {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclarationType(@NotNull JavaParser.InterfaceMemberDeclarationTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclarationType}
	 * labeled alternative in {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclarationType(@NotNull JavaParser.InterfaceMemberDeclarationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull JavaParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull JavaParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primVClass}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimVClass(@NotNull JavaParser.PrimVClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primVClass}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimVClass(@NotNull JavaParser.PrimVClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgumentsList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsList(@NotNull JavaParser.TypeArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgumentsList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsList(@NotNull JavaParser.TypeArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(@NotNull JavaParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(@NotNull JavaParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull JavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull JavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(@NotNull JavaParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(@NotNull JavaParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull JavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull JavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionTern}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionTern(@NotNull JavaParser.ExpressionTernContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionTern}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionTern(@NotNull JavaParser.ExpressionTernContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDotId}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDotId(@NotNull JavaParser.ExpressionDotIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDotId}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDotId(@NotNull JavaParser.ExpressionDotIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSynchronized}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSynchronized(@NotNull JavaParser.StatementSynchronizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSynchronized}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSynchronized(@NotNull JavaParser.StatementSynchronizedContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull JavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull JavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull JavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull JavaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull JavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull JavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAndAnd}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAndAnd(@NotNull JavaParser.ExpressionAndAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAndAnd}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAndAnd(@NotNull JavaParser.ExpressionAndAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleClassModifer}
	 * labeled alternative in {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleClassModifer(@NotNull JavaParser.SimpleClassModiferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleClassModifer}
	 * labeled alternative in {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleClassModifer(@NotNull JavaParser.SimpleClassModiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull JavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull JavaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull JavaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull JavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull JavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull JavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull JavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull JavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull JavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull JavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull JavaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAutoCpy}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAutoCpy(@NotNull JavaParser.ExpressionAutoCpyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAutoCpy}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAutoCpy(@NotNull JavaParser.ExpressionAutoCpyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(@NotNull JavaParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(@NotNull JavaParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull JavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull JavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionInstanceof}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInstanceof(@NotNull JavaParser.ExpressionInstanceofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionInstanceof}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInstanceof(@NotNull JavaParser.ExpressionInstanceofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionXor}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionXor(@NotNull JavaParser.ExpressionXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionXor}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionXor(@NotNull JavaParser.ExpressionXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(@NotNull JavaParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(@NotNull JavaParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLessGreaterEqual}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLessGreaterEqual(@NotNull JavaParser.ExpressionLessGreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLessGreaterEqual}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLessGreaterEqual(@NotNull JavaParser.ExpressionLessGreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull JavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull JavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull JavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull JavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementTry}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementTry(@NotNull JavaParser.StatementTryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementTry}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementTry(@NotNull JavaParser.StatementTryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull JavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull JavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(@NotNull JavaParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(@NotNull JavaParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull JavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull JavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclarationMember}
	 * labeled alternative in {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarationMember(@NotNull JavaParser.MemberDeclarationMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclarationMember}
	 * labeled alternative in {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarationMember(@NotNull JavaParser.MemberDeclarationMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclarationMember}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarationMember(@NotNull JavaParser.ClassBodyDeclarationMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclarationMember}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarationMember(@NotNull JavaParser.ClassBodyDeclarationMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementTryResources}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementTryResources(@NotNull JavaParser.StatementTryResourcesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementTryResources}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementTryResources(@NotNull JavaParser.StatementTryResourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticImportMany}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportMany(@NotNull JavaParser.StaticImportManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticImportMany}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportMany(@NotNull JavaParser.StaticImportManyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCast}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCast(@NotNull JavaParser.ExpressionCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCast}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCast(@NotNull JavaParser.ExpressionCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull JavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull JavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclarationStaticBlock}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarationStaticBlock(@NotNull JavaParser.ClassBodyDeclarationStaticBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclarationStaticBlock}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarationStaticBlock(@NotNull JavaParser.ClassBodyDeclarationStaticBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull JavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull JavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#createdNamePart}.
	 * @param ctx the parse tree
	 */
	void enterCreatedNamePart(@NotNull JavaParser.CreatedNamePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#createdNamePart}.
	 * @param ctx the parse tree
	 */
	void exitCreatedNamePart(@NotNull JavaParser.CreatedNamePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull JavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull JavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMath}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMath(@NotNull JavaParser.ExpressionMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMath}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMath(@NotNull JavaParser.ExpressionMathContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull JavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull JavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementAssert}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssert(@NotNull JavaParser.StatementAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementAssert}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssert(@NotNull JavaParser.StatementAssertContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDotNewWildInner}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDotNewWildInner(@NotNull JavaParser.ExpressionDotNewWildInnerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDotNewWildInner}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDotNewWildInner(@NotNull JavaParser.ExpressionDotNewWildInnerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitch(@NotNull JavaParser.StatementSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitch(@NotNull JavaParser.StatementSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#specialParameters}.
	 * @param ctx the parse tree
	 */
	void enterSpecialParameters(@NotNull JavaParser.SpecialParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#specialParameters}.
	 * @param ctx the parse tree
	 */
	void exitSpecialParameters(@NotNull JavaParser.SpecialParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCtor}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCtor(@NotNull JavaParser.ExpressionCtorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCtor}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCtor(@NotNull JavaParser.ExpressionCtorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDotExplGenInvoc}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDotExplGenInvoc(@NotNull JavaParser.ExpressionDotExplGenInvocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDotExplGenInvoc}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDotExplGenInvoc(@NotNull JavaParser.ExpressionDotExplGenInvocContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimExpression(@NotNull JavaParser.PrimExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimExpression(@NotNull JavaParser.PrimExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOrOr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrOr(@NotNull JavaParser.ExpressionOrOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOrOr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrOr(@NotNull JavaParser.ExpressionOrOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(@NotNull JavaParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(@NotNull JavaParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLessGreater}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLessGreater(@NotNull JavaParser.ExpressionLessGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLessGreater}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLessGreater(@NotNull JavaParser.ExpressionLessGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(@NotNull JavaParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(@NotNull JavaParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull JavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull JavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDotThis}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDotThis(@NotNull JavaParser.ExpressionDotThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDotThis}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDotThis(@NotNull JavaParser.ExpressionDotThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(@NotNull JavaParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(@NotNull JavaParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(@NotNull JavaParser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(@NotNull JavaParser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primNonWild}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimNonWild(@NotNull JavaParser.PrimNonWildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primNonWild}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimNonWild(@NotNull JavaParser.PrimNonWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNot(@NotNull JavaParser.ExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNot(@NotNull JavaParser.ExpressionNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#specialParameter}.
	 * @param ctx the parse tree
	 */
	void enterSpecialParameter(@NotNull JavaParser.SpecialParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#specialParameter}.
	 * @param ctx the parse tree
	 */
	void exitSpecialParameter(@NotNull JavaParser.SpecialParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull JavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull JavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAnd(@NotNull JavaParser.ExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAnd(@NotNull JavaParser.ExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonSimpleModifier}
	 * labeled alternative in {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterNonSimpleModifier(@NotNull JavaParser.NonSimpleModifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonSimpleModifier}
	 * labeled alternative in {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitNonSimpleModifier(@NotNull JavaParser.NonSimpleModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceMemberDeclarationMember}
	 * labeled alternative in {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclarationMember(@NotNull JavaParser.InterfaceMemberDeclarationMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceMemberDeclarationMember}
	 * labeled alternative in {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclarationMember(@NotNull JavaParser.InterfaceMemberDeclarationMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImport(@NotNull JavaParser.StaticImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImport(@NotNull JavaParser.StaticImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull JavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primLiteral}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimLiteral(@NotNull JavaParser.PrimLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primLiteral}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimLiteral(@NotNull JavaParser.PrimLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationModifer}
	 * labeled alternative in {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationModifer(@NotNull JavaParser.AnnotationModiferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationModifer}
	 * labeled alternative in {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationModifer(@NotNull JavaParser.AnnotationModiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull JavaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull JavaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIdentifierStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIdentifierStatement(@NotNull JavaParser.StatementIdentifierStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIdentifierStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIdentifierStatement(@NotNull JavaParser.StatementIdentifierStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeList(@NotNull JavaParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeList(@NotNull JavaParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull JavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull JavaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primClass}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimClass(@NotNull JavaParser.PrimClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primClass}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimClass(@NotNull JavaParser.PrimClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMulDivMod}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMulDivMod(@NotNull JavaParser.ExpressionMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMulDivMod}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMulDivMod(@NotNull JavaParser.ExpressionMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleClassImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleClassImport(@NotNull JavaParser.SingleClassImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleClassImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleClassImport(@NotNull JavaParser.SingleClassImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull JavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull JavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primId}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimId(@NotNull JavaParser.PrimIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primId}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimId(@NotNull JavaParser.PrimIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull JavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull JavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOr(@NotNull JavaParser.ExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOr(@NotNull JavaParser.ExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull JavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull JavaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx);
}