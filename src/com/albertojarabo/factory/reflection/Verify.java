package com.albertojarabo.factory.reflection;

public class Verify {
	
	private boolean correct = true;
	
	public static VerifyConstructor constructor(Class<?> clazz) {
		
		VerifyConstructor verify = new VerifyConstructor();
		verify.setConstructors(clazz.getConstructors());
		
		return verify;
	}
	
	public boolean check() {
		return correct;
	}
	
	protected Verify() {}
	
	protected void setCorrect(boolean correct) {
		this.correct = correct;
	}

}
