package com.albertojarabo.creacion.factory.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class VerifyConstructor extends Verify {

	private Constructor[] constructors;
	
	public Verify hasOnlyEmptyPublic() {
		setCorrect(constructors != null && constructors.length == 1 && Modifier.isPublic(constructors[0].getModifiers()));

		return this;
	}

	protected Constructor[] getConstructors() {
		return constructors;
	}

	protected void setConstructors(Constructor[] constructors) {
		this.constructors = constructors;
	}
	
	protected VerifyConstructor() {}
}
