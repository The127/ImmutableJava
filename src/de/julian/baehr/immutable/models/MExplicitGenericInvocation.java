package de.julian.baehr.immutable.models;

public class MExplicitGenericInvocation {

	private MNonWildcardTypeArguments arguments;
	private MExplicitGenericInvocationSuffix explicitGenericInvocationSuffix;
	
	public void setExplicitGenericInvocationSuffix(MExplicitGenericInvocationSuffix explicitGenericInvocationSuffix) {
		this.explicitGenericInvocationSuffix = explicitGenericInvocationSuffix;
	}
	
	public void setArguments(MNonWildcardTypeArguments arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		return arguments.toString() + " " + explicitGenericInvocationSuffix.toString();
	}
}
