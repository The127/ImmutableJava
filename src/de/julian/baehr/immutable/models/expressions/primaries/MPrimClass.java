package de.julian.baehr.immutable.models.expressions.primaries;

import de.julian.baehr.immutable.models.MTypeType;

public class MPrimClass extends MPrimary {

	private MTypeType typeType;
	
	public void setTypeType(MTypeType typeType) {
		this.typeType = typeType;
	}
	
	@Override
	public String toString() {
		return typeType.toString() + ".class";
	}
}
