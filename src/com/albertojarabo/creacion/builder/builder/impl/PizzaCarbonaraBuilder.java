package com.albertojarabo.creacion.builder.builder.impl;

import com.albertojarabo.creacion.builder.builder.PizzaBuilder;

public class PizzaCarbonaraBuilder extends PizzaBuilder {

	@Override
	public void buildMasa() {
		pizza.setMasa("Clásica");
	}

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("Queso, bacon, champiñón y cebolla.");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("Nata");
	}

}
