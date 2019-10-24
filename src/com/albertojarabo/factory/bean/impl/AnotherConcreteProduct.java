package com.albertojarabo.factory.bean.impl;

import com.albertojarabo.factory.bean.Product;

public class AnotherConcreteProduct implements Product {

	@Override
	public void operation() {
		System.out.println("Operacion de otro producto concreto");
	}

}
