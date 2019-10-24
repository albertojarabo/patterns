package com.albertojarabo.builder;

import com.albertojarabo.builder.bean.Pizza;
import com.albertojarabo.builder.builder.Cocina;
import com.albertojarabo.builder.builder.PizzaBuilder;
import com.albertojarabo.builder.builder.impl.PizzaBarbacoaBuilder;
import com.albertojarabo.builder.builder.impl.PizzaCarbonaraBuilder;
import com.albertojarabo.builder.builder.impl.PizzaHawaianaBuilder;

public class Main {

	public static void main(String[] args) {
		
		PizzaBuilder pizzaBuilder = new PizzaBarbacoaBuilder();
		Cocina cocina = new Cocina(pizzaBuilder);
		cocina.crearPizza();
		Pizza pizza = cocina.getPizza();
		
		System.out.println(pizza.toString());
		
		/********************/
		
		pizzaBuilder = new PizzaCarbonaraBuilder();
		cocina = new Cocina(pizzaBuilder);
		cocina.crearPizza();
		pizza = cocina.getPizza();
		
		System.out.println(pizza.toString());
		
		/********************/
		
		pizzaBuilder = new PizzaHawaianaBuilder();
		cocina = new Cocina(pizzaBuilder);
		cocina.crearPizza();
		pizza = cocina.getPizza();
		
		System.out.println(pizza.toString());
	}
	
}
