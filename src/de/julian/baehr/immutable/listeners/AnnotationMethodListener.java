package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.AnnotationMethodContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationMethodRestContext;
import de.julian.baehr.immutable.generated.JavaParser.DefaultValueContext;
import de.julian.baehr.immutable.models.MAnnotationMethod;

public class AnnotationMethodListener extends ImmutableBaseListener<MAnnotationMethod>{

	private final boolean arraysAllowed;
	
	public AnnotationMethodListener(boolean arraysAllowed){
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterAnnotationMethod(AnnotationMethodContext ctx) {
		setResult(new MAnnotationMethod(ctx.id.getText()));
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterHere(ctx.annotationMethodRest());
		enterThere(ctx.typeType(), new TypeTypeListener(true))
			.ifResult(getResult()::setTypeType);
	}
	
	@Override
	public void enterAnnotationMethodRest(AnnotationMethodRestContext ctx) {
		enterHere(ctx.defaultValue());
	}
	
	@Override
	public void enterDefaultValue(DefaultValueContext ctx) {
		enterThere(ctx.elementValue(), new ElementValueListener(arraysAllowed, null)).ifResult(getResult()::setDefaultValue);
	}
}
