package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionAutoCpyContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.SpecialParametersListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionAutoCpy;

public class ExpressionAutoCpyListener extends ImmutableBaseListener<MExpressionAutoCpy>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionAutoCpyListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionAutoCpy(ExpressionAutoCpyContext ctx) {
		setResult(new MExpressionAutoCpy(ctx.Identifier().getText()));
		enterThere(ctx.specialParameters(), new SpecialParametersListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setSpecialParameters);
	}
}
