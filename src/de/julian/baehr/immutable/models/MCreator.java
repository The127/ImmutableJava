package de.julian.baehr.immutable.models;

public class MCreator {

	private MNonWildcardTypeArguments arguments;
	private MCreatedName createdName;
	private MArrayCreatorRest arrayCreatorRest;
	private MClassCreatorRest rest;
	
	public void setArrayCreatorRest(MArrayCreatorRest arrayCreatorRest) {
		this.arrayCreatorRest = arrayCreatorRest;
	}
	
	public void setRest(MClassCreatorRest rest) {
		this.rest = rest;
	}
	
	public void setCreatedName(MCreatedName createdName) {
		this.createdName = createdName;
	}
	
	public void setArguments(MNonWildcardTypeArguments arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		return ModelUtil.ifNotNull(arguments, () -> arguments.toString() + " ")
				+ createdName.toString()
				+ " "
				+ ModelUtil.ifNotNull(arrayCreatorRest, () -> arrayCreatorRest.toString())
				+ " "
				+ ModelUtil.ifNotNull(rest, () -> rest.toString());
	}
}
