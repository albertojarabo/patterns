package com.albertojarabo.estructural.decorator.model;

import com.albertojarabo.estructural.decorator.model.iface.Modular;

public class ModuloLimpieza extends ModularDecorator {

	public ModuloLimpieza(Modular modular) {
		super(modular);
	}

	@Override
	public String getDescripcion() {
		return getModular().getDescripcion() + " + Módulo de limpieza";
	}

	@Override
	public float getPrecio() {
		return getModular().getPrecio() + 350;
	}

}
