package de.julian.baehr.immutable.models;

public class MNonWildcardTypeArgumentsOrDiamond {

	private MNonWildcardTypeArguments arguments;
	
	public void setArguments(MNonWildcardTypeArguments arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		if(arguments != null)
			return arguments.toString();
		else
			return "<>";
	}
}
