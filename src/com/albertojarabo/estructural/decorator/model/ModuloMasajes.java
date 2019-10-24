package com.albertojarabo.estructural.decorator.model;

import com.albertojarabo.estructural.decorator.model.iface.Modular;

public class ModuloMasajes extends ModularDecorator {

	public ModuloMasajes(Modular modular) {
		super(modular);
	}

	@Override
	public String getDescripcion() {
		return getModular().getDescripcion() + " + Módulo de masajes";
	}

	@Override
	public float getPrecio() {
		return getModular().getPrecio() + 650;
	}

}
