package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.NormalTypeArgumentContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeArgumentsContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeArgumentsListContext;
import de.julian.baehr.immutable.generated.JavaParser.WildcardTypeArgumentContext;
import de.julian.baehr.immutable.models.MTypeArguments;

public class TypeArgumentsListener extends ImmutableBaseListener<MTypeArguments> {

	private boolean areArraysAllowed;
	
	public TypeArgumentsListener(boolean areArraysAllowed){
		this.areArraysAllowed = areArraysAllowed;
	}
	
	@Override
	public void enterTypeArguments(TypeArgumentsContext ctx) {
		setResult(new MTypeArguments());
		enterHere(ctx.typeArgumentsList());
	}
	
	@Override
	public void enterTypeArgumentsList(TypeArgumentsListContext ctx) {
		enterHere(ctx.typeArgument());
		enterHere(ctx.typeArgumentsList());
	}
	
	@Override
	public void enterNormalTypeArgument(NormalTypeArgumentContext ctx) {
		enterThere(ctx.typeType(), new TypeTypeListener(areArraysAllowed))
			.ifResult(getResult()::setTypeType);
	}
	
	@Override
	public void enterWildcardTypeArgument(WildcardTypeArgumentContext ctx) {
		getResult().useWilidCard();
		if(ctx.keyWord != null && !ctx.keyWord.equals(""))
			getResult().setExtendsOrSuperString(ctx.keyWord.getText());
		enterThere(ctx.typeType(), new TypeTypeListener(areArraysAllowed))
			.ifResult(getResult()::setTypeType);
	}
}
