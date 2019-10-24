package com.albertojarabo.creacion.factory;

import com.albertojarabo.creacion.factory.bean.Product;
import com.albertojarabo.creacion.factory.factory.ProductFactory;
import com.albertojarabo.creacion.factory.factory.creator.Creator;
import com.albertojarabo.creacion.factory.factory.creator.impl.AnotherConcreteCreator;
import com.albertojarabo.creacion.factory.factory.creator.impl.ConcreteCreator;


/*
 * Existe una interface que define los métodos de un producto genérico.
 * Existen dos clases que implementan la interfaz anterior para dos productos específicos.
 * Existe una clase abstracta llamada Creator que define la operación de creación de Producto genérico (factoría)
 * Existen clases concretas para distintas factorías de distintos tipos de productos.
 * Existe una clase que engloba en sus métodos la llamada a la factoría concreta para la creación de producto específico.
 *
 * Esta clase ejemplifica el uso del patrón Factory Method para dos productos específicos diferentes englobados en la clase genérica de producto.
 * Para ello se instancian las dos factorías de creación de productos concretos y se hace uso de la clase principal de factoría,
 * pasándole como parámetro la clase específica de construcción de cada tipo de producto
 */

public class Main {

	
	public static void main(String[] args) {
				
		UseFactory(new ConcreteCreator());

		/*********************/

		UseFactory(new AnotherConcreteCreator());
		
	}
	
	private static void UseFactory(Creator creator) {
		ProductFactory productFactory = new ProductFactory(creator);
		Product product = productFactory.createProduct();		
		product.operation();	
	}
}
