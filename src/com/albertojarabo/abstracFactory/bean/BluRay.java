package com.albertojarabo.abstracFactory.bean;

public abstract class BluRay extends Disco {

	public abstract boolean tieneVideo4K();

	@Override
	public void showDatos() {
		super.showDatos();
		System.out.println("Tiene video en 4K: " + tieneVideo4K());
	}
	
}
