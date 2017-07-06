package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ArrayInitializerContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableInitializerContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MVariableInitializer;

public class VariableInitializerListener extends ImmutableBaseListener<MVariableInitializer>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public VariableInitializerListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterVariableInitializer(VariableInitializerContext ctx) {
		setResult(new MVariableInitializer());
		enterHere(ctx.arrayInitializer());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
	
	@Override
	public void enterArrayInitializer(ArrayInitializerContext ctx) {
		enterThere(ctx, new ArrayInitializerListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArrayInitializer);
	}
}
