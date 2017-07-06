package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MCreatedName {

	public class MCreatedNamePart {
		private String id;
		private MTypeArgumentsOrDiamond argumentsOrDiamond;
		
		public MCreatedNamePart(String id, MTypeArgumentsOrDiamond argumentsOrDiamond){
			this.id = id;
			this.argumentsOrDiamond = argumentsOrDiamond;
		}
		
		@Override
		public String toString() {
			return id + " " + ModelUtil.ifNotNull(argumentsOrDiamond, () -> argumentsOrDiamond.toString());
		}
	}
	
	private String primitiveType;
	
	private List<MCreatedNamePart> createdNameParts = new LinkedList<>();
	
	public void setPrimitiveType(String primitiveType) {
		this.primitiveType = primitiveType;
	}
	
	public void addCreatedNamePart(MCreatedNamePart createdNamePart){
		createdNameParts.add(createdNamePart);
	}
	
	@Override
	public String toString() {
		if(primitiveType != null)
			return primitiveType;
		else
			return ModelUtil.concat(" . ", createdNameParts);
	}
}
