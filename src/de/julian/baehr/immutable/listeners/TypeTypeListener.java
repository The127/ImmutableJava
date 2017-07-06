package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ArrayDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassOrInterfaceTypeContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassOrInterfaceTypeListContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimitiveTypeContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeTypeContext;
import de.julian.baehr.immutable.listeners.exceptions.ListenerException;
import de.julian.baehr.immutable.models.MTypeType;

public class TypeTypeListener extends ImmutableBaseListener<MTypeType> {

	private final boolean arraysAllowed;
	
	public TypeTypeListener(boolean arraysAllowed){
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterTypeType(TypeTypeContext ctx) {
		enterHere(ctx.arrayDeclaration());
		if(getResult() == null)
			setResult(new MTypeType(0));
		enterHere(ctx.cType);
		enterHere(ctx.pType);
	}
	
	@Override
	public void enterArrayDeclaration(ArrayDeclarationContext ctx) {
		int dimension = (ctx.getText() != null) ? (ctx.getText().length() / 2) : 0;
		if(!arraysAllowed && dimension > 0)
			throw new ListenerException("Arrays not allowed here.", ctx);
		setResult(new MTypeType(dimension));
	}
	
	@Override
	public void enterPrimitiveType(PrimitiveTypeContext ctx) {
		getResult().setPrimitive(ctx.getText(), ctx);
	}
	
	@Override
	public void enterClassOrInterfaceTypeList(ClassOrInterfaceTypeListContext ctx) {
		enterHere(ctx.classOrInterfaceTypeList());
		enterHere(ctx.classOrInterfaceType());
	}
	
	@Override
	public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
		getResult().addClassOrInterfaceType(ctx.id.getText());
		enterThere(ctx.typeArguments(), new TypeArgumentsListener(arraysAllowed))
			.ifResult(talResult -> {
				getResult().addTypeParameters(talResult.toString());
			});
	}
}
