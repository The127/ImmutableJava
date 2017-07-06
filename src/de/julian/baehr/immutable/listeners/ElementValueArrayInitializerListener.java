package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ElementValueArrayInitializerContext;
import de.julian.baehr.immutable.generated.JavaParser.ElementValueContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MElementValueArrayInitializer;

public class ElementValueArrayInitializerListener extends ImmutableBaseListener<MElementValueArrayInitializer>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ElementValueArrayInitializerListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
		setResult(new MElementValueArrayInitializer());
		enterHere(ctx.elementValue());
	}
	
	@Override
	public void enterElementValue(ElementValueContext ctx) {
		enterThere(ctx, new ElementValueListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addElementValue);
	}
}
