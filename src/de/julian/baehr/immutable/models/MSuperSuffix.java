package de.julian.baehr.immutable.models;

public class MSuperSuffix {

	private MArguments arguments;
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setArguments(MArguments arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		return ModelUtil.ifNotNull(id, () -> "." + id + " ") 
				+ ModelUtil.ifNotNull(arguments, () -> arguments.toString());
	}
}
