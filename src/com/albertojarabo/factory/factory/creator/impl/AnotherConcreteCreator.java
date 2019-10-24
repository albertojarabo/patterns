package com.albertojarabo.factory.factory.creator.impl;

import com.albertojarabo.factory.bean.Product;
import com.albertojarabo.factory.bean.impl.AnotherConcreteProduct;
import com.albertojarabo.factory.factory.creator.Creator;

public class AnotherConcreteCreator extends Creator {

	@Override
	public Product factoryMethod() {
		Product product = new AnotherConcreteProduct();
		return product;
	}
	
	

}
