package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.TypeListContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeTypeContext;
import de.julian.baehr.immutable.models.MTypeList;

public class TypeListListener extends ImmutableBaseListener<MTypeList>{

	private final boolean arraysAllowed;
	
	public TypeListListener(boolean arraysAllowed) {
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterTypeList(TypeListContext ctx) {
		setResult(new MTypeList());
		enterHere(ctx.typeType());
	}
	
	@Override
	public void enterTypeType(TypeTypeContext ctx) {
		enterThere(ctx, new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::addType);
	}
}
