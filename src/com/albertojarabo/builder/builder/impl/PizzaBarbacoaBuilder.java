package com.albertojarabo.builder.builder.impl;

import com.albertojarabo.builder.builder.PizzaBuilder;

public class PizzaBarbacoaBuilder extends PizzaBuilder {

	@Override
	public void buildMasa() {
		pizza.setMasa("Fina");
	}

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("Queso, pollo y bacon.");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("Barbacoa");
	}

}
