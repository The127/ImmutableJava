package de.julian.baehr.immutable.models;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MVariableDeclarators {

private List<MVaraibleDeclarator> variableInitializers = new LinkedList<>();
	
	public class MVaraibleDeclarator{
		private MVariableDeclaratorId id;
		private MVariableInitializer initializer = null;
		
		public void setInitializer(MVariableInitializer initializer) {
			this.initializer = initializer;
		}
		
		public void setId(MVariableDeclaratorId id) {
			this.id = id;
		}
		
		public boolean hasInitializer(){
			return initializer != null;
		}
		
		public MVariableDeclaratorId getId() {
			return id;
		}
		
		@Override
		public String toString() {
			return id.toString() + ModelUtil.ifNotNull(initializer, () -> " = " + initializer.toString());
		}
	}

	public List<MVaraibleDeclarator> getVariableInitializers() {
		return Collections.unmodifiableList(variableInitializers);
	}
	
	public void add(MVaraibleDeclarator declarator){
		variableInitializers.add(declarator);
	}
	
	@Override
		public String toString() {
			return new StringBuilder()
					.append(ModelUtil.concat(", ", variableInitializers))
					.toString();
		}
}
