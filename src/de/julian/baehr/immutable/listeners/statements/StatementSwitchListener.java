package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementSwitchContext;
import de.julian.baehr.immutable.generated.JavaParser.SwitchBlockStatementGroupContext;
import de.julian.baehr.immutable.generated.JavaParser.SwitchLabelContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.ParExpressionListener;
import de.julian.baehr.immutable.listeners.SwitchBlockStatementGroupListener;
import de.julian.baehr.immutable.listeners.SwitchLabelListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementSwitch;

public class StatementSwitchListener extends ImmutableBaseListener<MStatementSwitch>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementSwitchListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementSwitch(StatementSwitchContext ctx) {
		setResult(new MStatementSwitch());
		enterThere(ctx.parExpression(), new ParExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setParExpression);
		enterHere(ctx.switchBlockStatementGroup());
		enterHere(ctx.switchLabel());
	}
	
	@Override
	public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
		enterThere(ctx, new SwitchBlockStatementGroupListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addBlockStatementGroup);
	}
	
	@Override
	public void enterSwitchLabel(SwitchLabelContext ctx) {
		enterThere(ctx, new SwitchLabelListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addLabel);
	}
}
