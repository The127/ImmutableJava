package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.TypeArgumentsOrDiamondContext;
import de.julian.baehr.immutable.models.MTypeArgumentsOrDiamond;

public class TypeArgumentsOrDiamonListener extends ImmutableBaseListener<MTypeArgumentsOrDiamond>{

	private boolean areArraysAllowed;
	
	public TypeArgumentsOrDiamonListener(boolean areArraysAllowed){
		this.areArraysAllowed = areArraysAllowed;
	}
	
	@Override
	public void enterTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
		setResult(new MTypeArgumentsOrDiamond());
		enterThere(ctx.typeArguments(), new TypeArgumentsListener(areArraysAllowed))
			.ifResult(getResult()::setArguments);
	}
}
