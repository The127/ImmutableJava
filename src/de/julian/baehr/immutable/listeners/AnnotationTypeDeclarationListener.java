package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.AnnotationConstantContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationMethodContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationMethodOrConstantRestContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationTypeBodyContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationTypeDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationTypeElementDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationTypeElementRestMethodContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationTypeElementRestTypeContext;
import de.julian.baehr.immutable.models.MTypeAnnotation;

public class AnnotationTypeDeclarationListener extends ImmutableBaseListener<MTypeAnnotation>{

	@Override
	public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
		setResult(new MTypeAnnotation(ctx.name.getText()));
		enterThere(ctx.modifiers, new ModifierListener(getResult()));
		enterHere(ctx.annotationTypeBody());
	}
	
	@Override
	public void enterAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
		enterHere(ctx.annotationTypeElementDeclaration());
	}
	
	@Override
	public void enterAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
		enterHere(ctx.annotationTypeElementRest());
	}
	
	@Override
	public void enterAnnotationTypeElementRestMethod(AnnotationTypeElementRestMethodContext ctx) {
		enterHere(ctx.annotationMethodOrConstantRest());
	}
	
	@Override
	public void enterAnnotationTypeElementRestType(AnnotationTypeElementRestTypeContext ctx) {
		enterThere(ctx, new TypeDeclarationListener()).ifResult(getResult()::addSubType);
	}
	
	@Override
	public void enterAnnotationMethodOrConstantRest(AnnotationMethodOrConstantRestContext ctx) {
		enterHere(ctx.annotationMethod());
		enterHere(ctx.annotationConstant());
	}
	
	@Override
	public void enterAnnotationMethod(AnnotationMethodContext ctx) {
		enterThere(ctx, new AnnotationMethodListener(true)).ifResult(getResult()::addAnnotationMethod);
	}
	
	@Override
	public void enterAnnotationConstant(AnnotationConstantContext ctx) {
		enterThere(ctx, new AnnotationConstantListener()).ifResult(getResult()::addAnnotationConstant);
	}
}
