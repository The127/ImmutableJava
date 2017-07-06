package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.TypeBoundContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeParameterContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeParametersContext;
import de.julian.baehr.immutable.generated.JavaParser.TypeTypeContext;
import de.julian.baehr.immutable.models.MTypeParameters;

public class TypeParametersListener extends ImmutableBaseListener<MTypeParameters>{

	private class TypeParameterListener extends ImmutableBaseListener<MTypeParameters.MTypeParameter>{
		@Override
		public void enterTypeParameter(TypeParameterContext ctx) {
			setResult(TypeParametersListener.this.getResult().new MTypeParameter());
			getResult().setIdentifier(ctx.Identifier().getText());
			enterHere(ctx.typeBound());
		}
		
		@Override
		public void enterTypeBound(TypeBoundContext ctx) {
			enterHere(ctx.typeType());
		}
		
		@Override
		public void enterTypeType(TypeTypeContext ctx) {
			enterThere(ctx, new TypeTypeListener(TypeParametersListener.this.arraysAllowed))
				.ifResult(getResult()::addTypeBound);
		}
	}
	
	private final boolean arraysAllowed;
	
	public TypeParametersListener(boolean arraysAllowed) {
		this.arraysAllowed = arraysAllowed;
	}
	
	@Override
	public void enterTypeParameters(TypeParametersContext ctx) {
		setResult(new MTypeParameters());
		enterHere(ctx.typeParameter());
	}
	
	@Override
	public void enterTypeParameter(TypeParameterContext ctx) {
		enterThere(ctx, new TypeParameterListener())
			.ifResult(getResult()::addTypeParameter);
	}
}
