package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.FinallyBlockContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MFinallyBlock;

public class FinallyBlockListener extends ImmutableBaseListener<MFinallyBlock>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public FinallyBlockListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterFinallyBlock(FinallyBlockContext ctx) {
		setResult(new MFinallyBlock());
		enterThere(ctx.block(), new BlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setBlock);
	}
}
