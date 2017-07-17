package de.julian.baehr.immutable.models;

public class MClassCreatorRest {

	private MArguments arguments;
	private MClassBody body;
	
	public void setArguments(MArguments arguments) {
		this.arguments = arguments;
	}
	
	public void setBody(MClassBody body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return arguments.toString() 
				+ " " + ModelUtil.ifNotNull(body, () -> body.toString()) ;
	}
}
