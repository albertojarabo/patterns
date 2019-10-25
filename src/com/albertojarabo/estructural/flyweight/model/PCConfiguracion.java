package com.albertojarabo.estructural.flyweight.model;

public class PCConfiguracion {

	private String modelo;
	private CantidadRAM ram;
	private TipoDisco tipoDisco;
	private CapacidadDisco capacidadDisco;
	private TipoProcesador procesador;
	
	private static int contador = 0;

	public CantidadRAM getRam() {
		return ram;
	}

	public TipoDisco getTipoDisco() {
		return tipoDisco;
	}

	public CapacidadDisco getCapacidadDisco() {
		return capacidadDisco;
	}

	public TipoProcesador getProcesador() {
		return procesador;
	}
	
	public String getModelo() {
		return modelo;
	}

	public PCConfiguracion(String modelo, TipoProcesador procesador, CantidadRAM ram, TipoDisco tipoDisco, CapacidadDisco capacidadDisco) {
		super();
		this.modelo = modelo;
		this.procesador = procesador;
		this.ram = ram;
		this.tipoDisco = tipoDisco;
		this.capacidadDisco = capacidadDisco;
		
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}
}
