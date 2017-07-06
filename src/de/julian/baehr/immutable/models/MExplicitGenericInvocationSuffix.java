package de.julian.baehr.immutable.models;

public class MExplicitGenericInvocationSuffix {

	private MSuperSuffix superSuffix;
	private String id;
	private MArguments arguments;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setArguments(MArguments arguments) {
		this.arguments = arguments;
	}
	
	public void setSuperSuffix(MSuperSuffix superSuffix) {
		this.superSuffix = superSuffix;
	}
	
	@Override
	public String toString() {
		if(superSuffix != null)
			return "super " + superSuffix.toString();
		else
			return id + " " + arguments.toString();
	}
}
