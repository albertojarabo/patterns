package com.albertojarabo.builder.builder;

import com.albertojarabo.builder.bean.Pizza;

public class Cocina {
	
	PizzaBuilder pizzaBuilder;
	Pizza pizza;
	
	public Cocina(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public void crearPizza() {
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildIngredientes();
		pizzaBuilder.buildSalsa();
	}
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

}
