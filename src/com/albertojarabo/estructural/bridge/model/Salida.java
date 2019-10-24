package com.albertojarabo.estructural.bridge.model;

public abstract class Salida {
	
	private String nombreSalida;
	private Informacion datos;
	
	public Salida(String nombreSalida, Informacion datos) {
		this.datos = datos;
		this.nombreSalida = nombreSalida;
	}

	public String mostrarSalida() {
		return ("Emitiendo en " + nombreSalida);
	}

	public Informacion getDatos() {
		return datos;
	}

	@Override
	public String toString() {
		return "Salida [nombreSalida=" + nombreSalida + ", datos=" + datos + "]";
	}


}
