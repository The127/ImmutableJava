package de.julian.baehr.immutable.models;

public class MNonWildcardTypeArguments {

	private MTypeList list;
	
	public void setList(MTypeList list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "< " + list.toString() + " >";
	}
}
