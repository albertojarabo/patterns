package com.albertojarabo.estructural.decorator.model;

import com.albertojarabo.estructural.decorator.model.iface.Modular;

public class ModuloPlancha extends ModularDecorator {

	public ModuloPlancha(Modular modular) {
		super(modular);
	}

	@Override
	public String getDescripcion() {
		return getModular().getDescripcion() + " + Módulo de planchado";
	}

	@Override
	public float getPrecio() {
		return getModular().getPrecio() + 550;
	}

}
