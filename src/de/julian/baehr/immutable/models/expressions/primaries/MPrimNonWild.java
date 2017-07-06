package de.julian.baehr.immutable.models.expressions.primaries;

import de.julian.baehr.immutable.models.MArguments;
import de.julian.baehr.immutable.models.MExplicitGenericInvocationSuffix;
import de.julian.baehr.immutable.models.MNonWildcardTypeArguments;

public class MPrimNonWild extends MPrimary {

	private MNonWildcardTypeArguments nonWildcardTypeArguments;
	private MExplicitGenericInvocationSuffix explicitGenericInvocationSuffix;
	private MArguments arguments;
	
	public void setNonWildcardTypeArguments(MNonWildcardTypeArguments nonWildcardTypeArguments) {
		this.nonWildcardTypeArguments = nonWildcardTypeArguments;
	}
	
	public void setExplicitGenericInvocationSuffix(MExplicitGenericInvocationSuffix explicitGenericInvocationSuffix) {
		this.explicitGenericInvocationSuffix = explicitGenericInvocationSuffix;
	}
	
	public void setArguments(MArguments arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		if(arguments != null)
			return nonWildcardTypeArguments.toString() + " this " + arguments.toString();
		else
			return nonWildcardTypeArguments.toString() + " " + explicitGenericInvocationSuffix.toString();
	}
}
