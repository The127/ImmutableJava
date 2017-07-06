package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.AnnotationConstantContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationConstantRestContext;
import de.julian.baehr.immutable.models.MAnnotationConstant;

public class AnnotationConstantListener extends ImmutableBaseListener<MAnnotationConstant>{

	@Override
	public void enterAnnotationConstant(AnnotationConstantContext ctx) {
		setResult(new MAnnotationConstant());
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterHere(ctx.annotationConstantRest());
		enterThere(ctx.typeType(), new TypeTypeListener(true))
			.ifResult(getResult()::setTypeType);
	}
	
	@Override
	public void enterAnnotationConstantRest(AnnotationConstantRestContext ctx) {
		enterThere(ctx.variableDeclarators(), new VariableDeclaratorsListener(true, null))//no auto cpy
			.ifResult(getResult()::setVariableDeclaration);
	}
}
