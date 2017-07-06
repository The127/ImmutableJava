package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.CreatedNameContext;
import de.julian.baehr.immutable.generated.JavaParser.CreatedNamePartContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimitiveTypeContext;
import de.julian.baehr.immutable.models.MCreatedName;
import de.julian.baehr.immutable.models.MTypeArgumentsOrDiamond;

public class CreatedNameListener extends ImmutableBaseListener<MCreatedName>{

	private boolean areArraysAllowed;
	
	public CreatedNameListener(boolean areArraysAllowed){
		this.areArraysAllowed = areArraysAllowed;
	}
	
	@Override
	public void enterCreatedName(CreatedNameContext ctx) {
		setResult(new MCreatedName());
		enterHere(ctx.primitiveType());
		enterHere(ctx.createdNamePart());
	}
	
	@Override
	public void enterPrimitiveType(PrimitiveTypeContext ctx) {
		getResult().setPrimitiveType(ctx.getText());
	}
	
	@Override
	public void enterCreatedNamePart(CreatedNamePartContext ctx) {
		String id = ctx.Identifier().getText();
		MTypeArgumentsOrDiamond argumentsOrDiamond = null;
		TypeArgumentsOrDiamonListener listener = enterThere(ctx.typeArgumentsOrDiamond(), new TypeArgumentsOrDiamonListener(areArraysAllowed));
		if(listener.hasResult())
			argumentsOrDiamond = listener.getResult();
		MCreatedName.MCreatedNamePart createdNamePart = getResult().new MCreatedNamePart(id, argumentsOrDiamond);
		getResult().addCreatedNamePart(createdNamePart);
	}
}
