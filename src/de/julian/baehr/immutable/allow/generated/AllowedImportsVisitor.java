// Generated from AllowedImports.g4 by ANTLR 4.4

	package de.julian.baehr.immutable.allow.generated;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AllowedImportsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AllowedImportsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AllowedImportsParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull AllowedImportsParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AllowedImportsParser#subPackages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPackages(@NotNull AllowedImportsParser.SubPackagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AllowedImportsParser#listOfNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfNames(@NotNull AllowedImportsParser.ListOfNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allowMultipleClasses}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowMultipleClasses(@NotNull AllowedImportsParser.AllowMultipleClassesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allowSomePackage}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowSomePackage(@NotNull AllowedImportsParser.AllowSomePackageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allowSingleClass}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowSingleClass(@NotNull AllowedImportsParser.AllowSingleClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allowSubPackages}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowSubPackages(@NotNull AllowedImportsParser.AllowSubPackagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AllowedImportsParser#fullyQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullyQualifiedName(@NotNull AllowedImportsParser.FullyQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allowAllPackage}
	 * labeled alternative in {@link AllowedImportsParser#allowedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowAllPackage(@NotNull AllowedImportsParser.AllowAllPackageContext ctx);
}