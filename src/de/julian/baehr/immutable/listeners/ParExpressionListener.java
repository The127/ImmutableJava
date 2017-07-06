package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ParExpressionContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MParExpression;

public class ParExpressionListener extends ImmutableBaseListener<MParExpression>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ParExpressionListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterParExpression(ParExpressionContext ctx) {
		setResult(new MParExpression());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
