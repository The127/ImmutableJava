package de.julian.baehr.immutable.models;

public class MInnerCreator {

	private String id;
	private MNonWildcardTypeArgumentsOrDiamond argumentsOrDiamond;
	private MClassCreatorRest rest;
	
	public void setRest(MClassCreatorRest rest) {
		this.rest = rest;
	}
	
	public void setArgumentsOrDiamond(MNonWildcardTypeArgumentsOrDiamond argumentsOrDiamond) {
		this.argumentsOrDiamond = argumentsOrDiamond;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id + " " + ModelUtil.ifNotNull(argumentsOrDiamond, () -> argumentsOrDiamond.toString() + " ") + rest.toString();
	}
}
