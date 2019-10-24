package com.albertojarabo.creacion.factory.factory;

import com.albertojarabo.creacion.factory.bean.Product;
import com.albertojarabo.creacion.factory.exception.FactoryException;
import com.albertojarabo.creacion.factory.factory.creator.Creator;
import com.albertojarabo.creacion.factory.reflection.Verify;

public class ProductFactory {

	private Creator creator;

	public Product createProduct() {
		return creator.factoryMethod();
	}

	public ProductFactory(Creator creator) throws FactoryException {

		/* Ejemplo para ver como con Reflection podemos controlar los objetos.
		 * Si el Creator tiene algún constructor diferente al public() dará una RuntimeException
		 */

		if (!Verify.constructor(creator.getClass()).hasOnlyEmptyPublic().check()) {
			throw new FactoryException("Not instantiable creator. Constructor not allowed.");
		}

		this.creator = creator;
	}

}
