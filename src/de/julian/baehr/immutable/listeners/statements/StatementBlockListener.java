package de.julian.baehr.immutable.listeners.statements;

import de.julian.baehr.immutable.generated.JavaParser.StatementBlockContext;
import de.julian.baehr.immutable.listeners.BlockListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.statements.MStatementBlock;

public class StatementBlockListener extends ImmutableBaseListener<MStatementBlock>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public StatementBlockListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterStatementBlock(StatementBlockContext ctx) {
		setResult(new MStatementBlock());
		enterThere(ctx.block(), new BlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setBlock);
	}
}
