package de.julian.baehr.immutable.models;

public class MTypeArguments {

	private MTypeType typeType;
	private String extendsOrSuperString = "";
	private boolean wildCard = false;
	
	public void setTypeType(MTypeType typeType){
		this.typeType = typeType;
	}
	
	public void setExtendsOrSuperString(String extendsOrSuper){
		this.extendsOrSuperString = extendsOrSuper;
	}
	
	public void useWilidCard(){
		wildCard = true;
	}
	
	@Override
	public String toString() {
		if(wildCard)
			return "<?" + 
				ModelUtil.ifNotNull(extendsOrSuperString, () -> " " + extendsOrSuperString + " " + typeType.toString()) + ">";
		else
			return "<" + typeType.toString() + ">";
	}
}
