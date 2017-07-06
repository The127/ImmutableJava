package de.julian.baehr.immutable.listeners;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.generated.JavaParser.AnnotationTypeDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationTypeElementRestTypeContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.EnumDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.InterfaceDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.InterfaceMemberDeclarationTypeContext;
import de.julian.baehr.immutable.generated.JavaParser.MemberDeclarationSubTypeContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeDeclarationContext;
import de.julian.baehr.immutable.models.MType;

public class TypeDeclarationListener extends ImmutableBaseListener<MType>{

	@Override
	public void enterTypeDeclaration(TypeDeclarationContext ctx) {
		//automatically chooses right type since others will be null
		enterHere(ctx.classDeclaration());
		enterHere(ctx.enumDeclaration());
		enterHere(ctx.interfaceDeclaration());
		enterHere(ctx.annotationTypeDeclaration());
	}
	
	@Override
	public void enterAnnotationTypeElementRestType(AnnotationTypeElementRestTypeContext ctx) {
		enterHere(ctx.classDeclaration());
		enterHere(ctx.enumDeclaration());
		enterHere(ctx.interfaceDeclaration());
		enterHere(ctx.annotationTypeDeclaration());
	}
	
	@Override
	public void enterInterfaceMemberDeclarationType(InterfaceMemberDeclarationTypeContext ctx) {
		enterHere(ctx.classDeclaration());
		enterHere(ctx.enumDeclaration());
		enterHere(ctx.interfaceDeclaration());
		enterHere(ctx.annotationTypeDeclaration());
	}
	
	@Override
	public void enterMemberDeclarationSubType(MemberDeclarationSubTypeContext ctx) {
		enterHere(ctx.classDeclaration());
		enterHere(ctx.enumDeclaration());
		enterHere(ctx.interfaceDeclaration());
		enterHere(ctx.annotationTypeDeclaration());
	}
	
	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		enterDeclaration(ctx, new ClassDeclarationListener());
	}
	
	@Override
	public void enterEnumDeclaration(EnumDeclarationContext ctx) {
		enterDeclaration(ctx, new EnumDeclarationListener());
	}
	
	@Override
	public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		enterDeclaration(ctx, new InterfaceDeclarationListener());
	}
	
	@Override
	public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
		enterDeclaration(ctx, new AnnotationTypeDeclarationListener());
	}
	
	private void enterDeclaration(ParserRuleContext ctx, ImmutableBaseListener<? extends MType> listener){
		enterThere(ctx, listener).ifResult(this::setResult);
	}
}
