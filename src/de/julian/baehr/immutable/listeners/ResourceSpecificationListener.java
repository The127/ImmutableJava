package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ClassOrInterfaceTypeContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassOrInterfaceTypeListContext;
import de.julian.baehr.immutable.generated.JavaParser.ResourceContext;
import de.julian.baehr.immutable.generated.JavaParser.ResourceSpecificationContext;
import de.julian.baehr.immutable.generated.JavaParser.ResourcesContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MResourceSpecification;

public class ResourceSpecificationListener extends ImmutableBaseListener<MResourceSpecification> {

	private class ResourceListener extends ImmutableBaseListener<MResourceSpecification.MResource> {
		
		private final boolean arraysAllowed;
		private final MConstructor autoCpy;
		
		public ResourceListener(boolean arraysAllowed, MConstructor autoCpy) {
			this.arraysAllowed = arraysAllowed;
			this.autoCpy = autoCpy;
		}
		
		@Override
		public void enterResource(ResourceContext ctx) {
			setResult(ResourceSpecificationListener.this.getResult().new MResource());
			enterThere(ctx.variableModifierList(), new ModifierListener(getResult()));
			enterHere(ctx.classOrInterfaceTypeList());
			enterThere(ctx.variableDeclaratorId(), new VariableDeclaratorIdListener(arraysAllowed))
				.ifResult(getResult()::setId);
			enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
				.ifResult(getResult()::setExpression);
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
					getResult().addTypeArguments(talResult.toString());
				});
		}
	}

	private final MConstructor autoCpy;
	private final boolean arraysAllowed;
	
	public ResourceSpecificationListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterResourceSpecification(ResourceSpecificationContext ctx) {
		setResult(new MResourceSpecification());
		enterHere(ctx.resources());
	}
	
	@Override
	public void enterResources(ResourcesContext ctx) {
		enterHere(ctx.resource());
	}
	
	@Override
	public void enterResource(ResourceContext ctx) {
		enterThere(ctx, new ResourceListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::addResource);
	}
}
