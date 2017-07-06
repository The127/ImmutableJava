package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionPrimaryContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.expressions.primaries.PrimaryListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionPrimary;

public class ExpressionPrimaryListener extends ImmutableBaseListener<MExpressionPrimary> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionPrimaryListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionPrimary(ExpressionPrimaryContext ctx) {
		setResult(new MExpressionPrimary());
		enterThere(ctx.primary(), new PrimaryListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setPrimary);
	}
}
