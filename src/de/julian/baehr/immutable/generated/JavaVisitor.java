// Generated from Java.g4 by ANTLR 4.4

	package de.julian.baehr.immutable.generated;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclarationSemicolon}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclarationSemicolon(@NotNull JavaParser.ClassBodyDeclarationSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSemicolon}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSemicolon(@NotNull JavaParser.StatementSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(@NotNull JavaParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(@NotNull JavaParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementStatemenExpression}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementStatemenExpression(@NotNull JavaParser.StatementStatemenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull JavaParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarImport(@NotNull JavaParser.StarImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildcardTypeArgument}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardTypeArgument(@NotNull JavaParser.WildcardTypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationSubType}
	 * labeled alternative in {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationSubType(@NotNull JavaParser.MemberDeclarationSubTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(@NotNull JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionEquals}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEquals(@NotNull JavaParser.ExpressionEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethod(@NotNull JavaParser.AnnotationMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primSuper}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimSuper(@NotNull JavaParser.PrimSuperContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull JavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeElementRestType}
	 * labeled alternative in {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRestType(@NotNull JavaParser.AnnotationTypeElementRestTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull JavaParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementThrow}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementThrow(@NotNull JavaParser.StatementThrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionPre}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPre(@NotNull JavaParser.ExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifierList(@NotNull JavaParser.VariableModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(@NotNull JavaParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(@NotNull JavaParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(@NotNull JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionPrimary}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPrimary(@NotNull JavaParser.ExpressionPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(@NotNull JavaParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(@NotNull JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(@NotNull JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationVariableModifier}
	 * labeled alternative in {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationVariableModifier(@NotNull JavaParser.AnnotationVariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeElementRestMethod}
	 * labeled alternative in {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRestMethod(@NotNull JavaParser.AnnotationTypeElementRestMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull JavaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstant(@NotNull JavaParser.AnnotationConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleModifer}
	 * labeled alternative in {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleModifer(@NotNull JavaParser.SimpleModiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionArray}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArray(@NotNull JavaParser.ExpressionArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primThis}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimThis(@NotNull JavaParser.PrimThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalTypeArgument}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTypeArgument(@NotNull JavaParser.NormalTypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleVariableModifier}
	 * labeled alternative in {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVariableModifier(@NotNull JavaParser.SimpleVariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull JavaParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMethodCall}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMethodCall(@NotNull JavaParser.ExpressionMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionPost}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPost(@NotNull JavaParser.ExpressionPostContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(@NotNull JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(@NotNull JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDotSuperSuffix}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDotSuperSuffix(@NotNull JavaParser.ExpressionDotSuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAddSub}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAddSub(@NotNull JavaParser.ExpressionAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclarationType}
	 * labeled alternative in {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclarationType(@NotNull JavaParser.InterfaceMemberDeclarationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(@NotNull JavaParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primVClass}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimVClass(@NotNull JavaParser.PrimVClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgumentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsList(@NotNull JavaParser.TypeArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(@NotNull JavaParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(@NotNull JavaParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#bracketExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(@NotNull JavaParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull JavaParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionTern}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionTern(@NotNull JavaParser.ExpressionTernContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDotId}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDotId(@NotNull JavaParser.ExpressionDotIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull JavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(@NotNull JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSynchronized}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSynchronized(@NotNull JavaParser.StatementSynchronizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(@NotNull JavaParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull JavaParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(@NotNull JavaParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAndAnd}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAndAnd(@NotNull JavaParser.ExpressionAndAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleClassModifer}
	 * labeled alternative in {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleClassModifer(@NotNull JavaParser.SimpleClassModiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull JavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(@NotNull JavaParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull JavaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull JavaParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull JavaParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(@NotNull JavaParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(@NotNull JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAutoCpy}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAutoCpy(@NotNull JavaParser.ExpressionAutoCpyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(@NotNull JavaParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(@NotNull JavaParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionInstanceof}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInstanceof(@NotNull JavaParser.ExpressionInstanceofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionXor}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionXor(@NotNull JavaParser.ExpressionXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(@NotNull JavaParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionLessGreaterEqual}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLessGreaterEqual(@NotNull JavaParser.ExpressionLessGreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull JavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(@NotNull JavaParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementTry}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTry(@NotNull JavaParser.StatementTryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(@NotNull JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(@NotNull JavaParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(@NotNull JavaParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(@NotNull JavaParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(@NotNull JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationMember}
	 * labeled alternative in {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationMember(@NotNull JavaParser.MemberDeclarationMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclarationMember}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclarationMember(@NotNull JavaParser.ClassBodyDeclarationMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementTryResources}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTryResources(@NotNull JavaParser.StatementTryResourcesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticImportMany}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportMany(@NotNull JavaParser.StaticImportManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionCast}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCast(@NotNull JavaParser.ExpressionCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(@NotNull JavaParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclarationStaticBlock}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclarationStaticBlock(@NotNull JavaParser.ClassBodyDeclarationStaticBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(@NotNull JavaParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#createdNamePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedNamePart(@NotNull JavaParser.CreatedNamePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(@NotNull JavaParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMath}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMath(@NotNull JavaParser.ExpressionMathContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull JavaParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssert}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssert(@NotNull JavaParser.StatementAssertContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDotNewWildInner}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDotNewWildInner(@NotNull JavaParser.ExpressionDotNewWildInnerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(@NotNull JavaParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#specialParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialParameters(@NotNull JavaParser.SpecialParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionCtor}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCtor(@NotNull JavaParser.ExpressionCtorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDotExplGenInvoc}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDotExplGenInvoc(@NotNull JavaParser.ExpressionDotExplGenInvocContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimExpression(@NotNull JavaParser.PrimExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(@NotNull JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionOrOr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrOr(@NotNull JavaParser.ExpressionOrOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(@NotNull JavaParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionLessGreater}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLessGreater(@NotNull JavaParser.ExpressionLessGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(@NotNull JavaParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull JavaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull JavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDotThis}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDotThis(@NotNull JavaParser.ExpressionDotThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(@NotNull JavaParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(@NotNull JavaParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primNonWild}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimNonWild(@NotNull JavaParser.PrimNonWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(@NotNull JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNot(@NotNull JavaParser.ExpressionNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#specialParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialParameter(@NotNull JavaParser.SpecialParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(@NotNull JavaParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAnd(@NotNull JavaParser.ExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonSimpleModifier}
	 * labeled alternative in {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonSimpleModifier(@NotNull JavaParser.NonSimpleModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclarationMember}
	 * labeled alternative in {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclarationMember(@NotNull JavaParser.InterfaceMemberDeclarationMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImport(@NotNull JavaParser.StaticImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull JavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primLiteral}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimLiteral(@NotNull JavaParser.PrimLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationModifer}
	 * labeled alternative in {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationModifer(@NotNull JavaParser.AnnotationModiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(@NotNull JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(@NotNull JavaParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIdentifierStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIdentifierStatement(@NotNull JavaParser.StatementIdentifierStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceTypeList(@NotNull JavaParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(@NotNull JavaParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(@NotNull JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primClass}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimClass(@NotNull JavaParser.PrimClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMulDivMod}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMulDivMod(@NotNull JavaParser.ExpressionMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleClassImport}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleClassImport(@NotNull JavaParser.SingleClassImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull JavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primId}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimId(@NotNull JavaParser.PrimIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull JavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOr(@NotNull JavaParser.ExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull JavaParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(@NotNull JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx);
}