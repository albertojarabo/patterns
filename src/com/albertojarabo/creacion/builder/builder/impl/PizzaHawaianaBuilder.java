package com.albertojarabo.creacion.builder.builder.impl;

import com.albertojarabo.creacion.builder.builder.PizzaBuilder;

public class PizzaHawaianaBuilder extends PizzaBuilder {

	@Override
	public void buildMasa() {
		pizza.setMasa("Clásica");
	}

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("bacon, piña");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("Tomate y queso");
	}

}
