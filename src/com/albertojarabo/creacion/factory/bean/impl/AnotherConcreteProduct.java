package com.albertojarabo.creacion.factory.bean.impl;

import com.albertojarabo.creacion.factory.bean.Product;

public class AnotherConcreteProduct implements Product {

	@Override
	public void operation() {
		System.out.println("Operacion de otro producto concreto");
	}

}
