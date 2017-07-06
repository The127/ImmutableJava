package de.julian.baehr.immutable.models;

public class MTypeArgumentsOrDiamond {

	private MTypeArguments arguments;
	
	public void setArguments(MTypeArguments arguments) {
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
