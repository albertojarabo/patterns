package com.albertojarabo.estructural.decorator.model;

import com.albertojarabo.estructural.decorator.model.iface.Modular;

public abstract class ModularDecorator implements Modular {

	Modular modular;
	
	public ModularDecorator(Modular modular) {
		this.modular = modular;
	}
	
	public abstract float getPrecio();
	
	public Modular getModular() {
		return modular;
	}
	
	public void setModular(Modular modular) {
		this.modular = modular;
	}
	
}
