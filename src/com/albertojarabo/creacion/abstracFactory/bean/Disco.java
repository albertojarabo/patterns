package com.albertojarabo.creacion.abstracFactory.bean;

public abstract class Disco {

	public abstract String getCapacidad();
	public abstract String getNombre();
	public abstract String getPrecio();
	
	public void showDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Capacidad: " + getCapacidad());
		System.out.println("Precio: " + getPrecio());
	}
}
