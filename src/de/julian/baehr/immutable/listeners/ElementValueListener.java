package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ElementValueContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MElementValue;

public class ElementValueListener extends ImmutableBaseListener<MElementValue> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ElementValueListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterElementValue(ElementValueContext ctx) {
		setResult(new MElementValue());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
		enterThere(ctx.annotation(), new AnnotationListener())
			.ifResult(getResult()::setAnnotation);
		enterThere(ctx.elementValueArrayInitializer(), new ElementValueArrayInitializerListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setValueArrayInitializer);
	}
}
