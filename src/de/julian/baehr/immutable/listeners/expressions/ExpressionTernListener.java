package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionTernContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionTern;

public class ExpressionTernListener extends ImmutableBaseListener<MExpressionTern> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionTernListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionTern(ExpressionTernContext ctx) {
		setResult(new MExpressionTern());
		enterThere(ctx.exp1, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr1);
		enterThere(ctx.exp2, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr2);
		enterThere(ctx.exp3, new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpr3);
	}
}
