// Generated from AllowedImports.g4 by ANTLR 4.4

	package de.julian.baehr.immutable.allow.generated;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AllowedImportsParser}.
 */
public interface AllowedImportsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AllowedImportsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull AllowedImportsParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AllowedImportsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull AllowedImportsParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AllowedImportsParser#subPackages}.
	 * @param ctx the parse tree
	 */
	void enterSubPackages(@NotNull AllowedImportsParser.SubPackagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AllowedImportsParser#subPackages}.
	 * @param ctx the parse tree
	 */
	void exitSubPackages(@NotNull AllowedImportsParser.SubPackagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AllowedImportsParser#listOfNames}.
	 * @param ctx the parse tree
	 */
	void enterListOfNames(@NotNull AllowedImportsParser.ListOfNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AllowedImportsParser#listOfNames}.
	 * @param ctx the parse tree
	 */
	void exitListOfNames(@NotNull AllowedImportsParser.ListOfNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allowMultipleClasses}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void enterAllowMultipleClasses(@NotNull AllowedImportsParser.AllowMultipleClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allowMultipleClasses}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void exitAllowMultipleClasses(@NotNull AllowedImportsParser.AllowMultipleClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allowSomePackage}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void enterAllowSomePackage(@NotNull AllowedImportsParser.AllowSomePackageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allowSomePackage}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void exitAllowSomePackage(@NotNull AllowedImportsParser.AllowSomePackageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allowSingleClass}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void enterAllowSingleClass(@NotNull AllowedImportsParser.AllowSingleClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allowSingleClass}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void exitAllowSingleClass(@NotNull AllowedImportsParser.AllowSingleClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allowSubPackages}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void enterAllowSubPackages(@NotNull AllowedImportsParser.AllowSubPackagesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allowSubPackages}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void exitAllowSubPackages(@NotNull AllowedImportsParser.AllowSubPackagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AllowedImportsParser#fullyQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterFullyQualifiedName(@NotNull AllowedImportsParser.FullyQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AllowedImportsParser#fullyQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitFullyQualifiedName(@NotNull AllowedImportsParser.FullyQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allowAllPackage}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void enterAllowAllPackage(@NotNull AllowedImportsParser.AllowAllPackageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allowAllPackage}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 */
	void exitAllowAllPackage(@NotNull AllowedImportsParser.AllowAllPackageContext ctx);
}