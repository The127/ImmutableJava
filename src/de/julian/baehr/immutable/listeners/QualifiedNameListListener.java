package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.QualifiedNameContext;
import de.julian.baehr.immutable.generated.JavaParser.QualifiedNameListContext;
import de.julian.baehr.immutable.models.MQualifiedNameList;

public class QualifiedNameListListener extends ImmutableBaseListener<MQualifiedNameList>{

	@Override
	public void enterQualifiedNameList(QualifiedNameListContext ctx) {
		setResult(new MQualifiedNameList());
		enterHere(ctx.qualifiedName());
	}
	
	@Override
	public void enterQualifiedName(QualifiedNameContext ctx) {
		getResult().add(ctx.getText());
	}
}
