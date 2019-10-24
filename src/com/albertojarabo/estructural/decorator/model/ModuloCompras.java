package com.albertojarabo.estructural.decorator.model;

import com.albertojarabo.estructural.decorator.model.iface.Modular;

public class ModuloCompras extends ModularDecorator {

	public ModuloCompras(Modular modular) {
		super(modular);
	}

	@Override
	public String getDescripcion() {
		return getModular().getDescripcion() + " + Módulo de compras";
	}

	@Override
	public float getPrecio() {
		return getModular().getPrecio() + 450;
	}

}
