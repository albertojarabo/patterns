package com.albertojarabo.estructural.composite.model;

import com.albertojarabo.estructural.composite.model.iface.Tasable;

public class Electrodomestico implements Tasable {

	private String nombre;
	private float valor;
	
	@Override
	public float getValor() {
		return valor;
	}

	public Electrodomestico(String nombre, float valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
}
