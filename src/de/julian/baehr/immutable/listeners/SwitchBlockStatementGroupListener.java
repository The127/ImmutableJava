package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.BlockStatementContext;
import de.julian.baehr.immutable.generated.JavaParser.SwitchBlockStatementGroupContext;
import de.julian.baehr.immutable.generated.JavaParser.SwitchLabelContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MSwitchBlockStatementGroup;

public class SwitchBlockStatementGroupListener extends ImmutableBaseListener<MSwitchBlockStatementGroup> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public SwitchBlockStatementGroupListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
		setResult(new MSwitchBlockStatementGroup());
		enterHere(ctx.switchLabel());
		enterHere(ctx.blockStatement());
	}
	
	@Override
	public void enterSwitchLabel(SwitchLabelContext ctx) {
		enterThere(ctx, new SwitchLabelListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addSwitchLabel);
	}
	
	@Override
	public void enterBlockStatement(BlockStatementContext ctx) {
		enterThere(ctx, new BlockStatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addBlockStatement);
	}
}
