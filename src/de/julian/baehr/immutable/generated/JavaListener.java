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
	 * Enter a parse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull JavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull JavaParser.MemberDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull JavaParser.AnnotationTypeElementRestContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull JavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull JavaParser.PrimaryContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JavaParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JavaParser.StatementContext ctx);
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
	 * Enter a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull JavaParser.InterfaceMemberDeclarationContext ctx);
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