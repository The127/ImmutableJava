package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.SwitchLabelContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MSwitchLabel;

public class SwitchLabelListener extends ImmutableBaseListener<MSwitchLabel>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public SwitchLabelListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterSwitchLabel(SwitchLabelContext ctx) {
		setResult(new MSwitchLabel());
		enterThere(ctx.constantExpression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setConstantExpression);
		if(ctx.enumConstantName() != null)
			getResult().setEnumConstantName(ctx.enumConstantName().getText());
	}
}
