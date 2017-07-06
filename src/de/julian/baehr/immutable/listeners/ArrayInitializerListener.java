package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ArrayInitializerContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableInitializerContext;
import de.julian.baehr.immutable.models.MArrayInitializer;
import de.julian.baehr.immutable.models.MConstructor;

public class ArrayInitializerListener extends ImmutableBaseListener<MArrayInitializer>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ArrayInitializerListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterArrayInitializer(ArrayInitializerContext ctx) {
		setResult(new MArrayInitializer());
		enterHere(ctx.variableInitializer());
	}
	
	@Override
	public void enterVariableInitializer(VariableInitializerContext ctx) {
		enterThere(ctx, new VariableInitializerListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::add);
	}
}
