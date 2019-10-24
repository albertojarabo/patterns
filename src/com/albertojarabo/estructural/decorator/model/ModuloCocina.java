package com.albertojarabo.estructural.decorator.model;

import com.albertojarabo.estructural.decorator.model.iface.Modular;

public class ModuloCocina extends ModularDecorator {

	public ModuloCocina(Modular modular) {
		super(modular);
	}

	@Override
	public String getDescripcion() {
		return getModular().getDescripcion() + " + Módulo de cocina";
	}

	@Override
	public float getPrecio() {
		return getModular().getPrecio() + 850;
	}

}
