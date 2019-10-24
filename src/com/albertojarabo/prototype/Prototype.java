package com.albertojarabo.prototype;

public enum Prototype {

	PATINETE_ELECTRICTO("Patinete Eléctrico"), PATINETE_MANUAL("Patinete Manual");

	private String value;

	private Prototype(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
