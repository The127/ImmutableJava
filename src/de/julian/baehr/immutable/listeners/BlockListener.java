package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.BlockContext;
import de.julian.baehr.immutable.generated.JavaParser.BlockStatementContext;
import de.julian.baehr.immutable.models.MBlock;
import de.julian.baehr.immutable.models.MConstructor;

public class BlockListener extends ImmutableBaseListener<MBlock>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public BlockListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterBlock(BlockContext ctx) {
		setResult(new MBlock());
		enterHere(ctx.blockStatement());
	}
	
	@Override
	public void enterBlockStatement(BlockStatementContext ctx) {
		enterThere(ctx, new BlockStatementListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addStatemetn);
	}
}
