package com.albertojarabo.creacion.factory.factory.creator.impl;

import com.albertojarabo.creacion.factory.bean.Product;
import com.albertojarabo.creacion.factory.bean.impl.AnotherConcreteProduct;
import com.albertojarabo.creacion.factory.factory.creator.Creator;

public class AnotherConcreteCreator extends Creator {

	@Override
	public Product factoryMethod() {
		Product product = new AnotherConcreteProduct();
		return product;
	}
	
	

}
