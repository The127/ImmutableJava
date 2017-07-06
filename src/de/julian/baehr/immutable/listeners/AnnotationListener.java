package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.AnnotationContext;
import de.julian.baehr.immutable.generated.JavaParser.ElementValueContext;
import de.julian.baehr.immutable.generated.JavaParser.ElementValuePairContext;
import de.julian.baehr.immutable.generated.JavaParser.ElementValuePairsContext;
import de.julian.baehr.immutable.models.MAnnotation;

public class AnnotationListener extends ImmutableBaseListener<MAnnotation>{
	
	@Override
	public void enterAnnotation(AnnotationContext ctx) {
		setResult(new MAnnotation(ctx.annotationName().getText()));
		enterHere(ctx.elementValue());
		enterHere(ctx.elementValuePairs());
	}
	
	@Override
	public void enterElementValue(ElementValueContext ctx) {
		enterThere(ctx, new ElementValueListener(true, null))
			.ifResult(getResult()::setElementValue);
	}
	
	@Override
	public void enterElementValuePairs(ElementValuePairsContext ctx) {
		enterHere(ctx.elementValuePair());
	}
	
	@Override
	public void enterElementValuePair(ElementValuePairContext ctx) {
		enterThere(ctx.elementValue(), new ElementValueListener(true, null)).ifResult(res -> {
			getResult().addElementValuePair(ctx.Identifier().getText(), res);
		});
	}
}
