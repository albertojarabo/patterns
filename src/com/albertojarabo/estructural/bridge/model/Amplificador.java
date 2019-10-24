package com.albertojarabo.estructural.bridge.model;

public abstract class Amplificador {

	private Entrada entrada;
	private Salida salida;
	
	public Amplificador(Entrada entrada, Salida salida) {
		this.entrada = entrada;
		this.salida = salida;
	}
	
	public abstract void amplifica();
	
	public Entrada obtenerEntrada() {
		return entrada;
	}
	
	public Salida obtenerSalida() {
		return salida;
	}
	
	public String proyectarSalida() {
		return salida.mostrarSalida();
	}

}
