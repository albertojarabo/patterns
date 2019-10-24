package com.albertojarabo.creacion.builder.builder;

import com.albertojarabo.creacion.builder.bean.Pizza;

public abstract class PizzaBuilder {

	protected Pizza pizza;
	
	public Pizza getPizza()  {
		return pizza;
	}
	
	public abstract void buildMasa();
	public abstract void buildIngredientes();
	public abstract void buildSalsa();
	
	public PizzaBuilder() {
		pizza = new Pizza();
	}
	
}
