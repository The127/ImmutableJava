package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MTypeParameters {

	public class MTypeParameter {
		private List<MTypeType> typeBounds = new LinkedList<>();
		private String identifier;
		
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}
		
		public void addTypeBound(MTypeType typeType){
			typeBounds.add(typeType);
		}
		
		@Override
		public String toString() {
			return new StringBuilder()
					.append(identifier)
					.append(!typeBounds.isEmpty() ? " extends " + ModelUtil.concat(" & ", typeBounds) : "")
					.toString();
		}
	}
	
	private List<MTypeParameter> typeParameters = new LinkedList<>();
	
	public void addTypeParameter(MTypeParameter parameter){
		typeParameters.add(parameter);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("<")
				.append(ModelUtil.concat(", ", typeParameters))
				.append(">")
				.toString();
	}
}
