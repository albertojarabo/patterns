package com.albertojarabo.estructural.decorator.model;

import com.albertojarabo.estructural.decorator.model.iface.Modular;

public class ModuloDesplazamiento extends ModularDecorator {

	public ModuloDesplazamiento(Modular modular) {
		super(modular);
	}

	@Override
	public String getDescripcion() {
		return getModular().getDescripcion() + " + Módulo de desplazamiento";
	}

	@Override
	public float getPrecio() {
		return getModular().getPrecio() + 150;
	}

}
