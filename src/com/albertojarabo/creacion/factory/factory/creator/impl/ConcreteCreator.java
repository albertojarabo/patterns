package com.albertojarabo.creacion.factory.factory.creator.impl;

import com.albertojarabo.creacion.factory.bean.Product;
import com.albertojarabo.creacion.factory.bean.impl.ConcreteProduct;
import com.albertojarabo.creacion.factory.factory.creator.Creator;

public class ConcreteCreator extends Creator {

	@Override
	public Product factoryMethod() {
		Product product = new ConcreteProduct();
		return product;
	}
	
	public ConcreteCreator() {};

//	public ConcreteCreator(String kk) {};
}
