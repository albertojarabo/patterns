package com.albertojarabo.creacion.builder.bean;

public class Pizza {

	private String masa;
	private String ingredientes;
	private String salsa;
	protected String getMasa() {
		return masa;
	}
	public void setMasa(String masa) {
		this.masa = masa;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getSalsa() {
		return salsa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	
	@Override
	public String toString() {
		return ("Masa: " + masa + System.lineSeparator()
		+ "Ingredientes: " + ingredientes + System.lineSeparator()
		+ "Salsa: " + salsa + System.lineSeparator());
	}
	
}
