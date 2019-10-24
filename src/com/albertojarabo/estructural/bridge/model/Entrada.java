package com.albertojarabo.estructural.bridge.model;

public abstract class Entrada {
	
	private String nombreEntrada;
	private Informacion datos;
	
	public Entrada(String nombreEntrada, Informacion datos) {
		this.nombreEntrada = nombreEntrada;
		this.datos = datos;
	}

	public Informacion getDatos() {
		return this.datos;
	}
	
	public String getNombreEntrada() {
		return this.nombreEntrada;
	}
	
	public abstract String enviarSenal();

	@Override
	public String toString() {
		return "Entrada [nombreEntrada=" + nombreEntrada + ", datos=" + datos + "]";
	}
	
}
