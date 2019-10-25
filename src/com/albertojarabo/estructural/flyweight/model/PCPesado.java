package com.albertojarabo.estructural.flyweight.model;

public class PCPesado {

	private int id;
	private String modelo;
	private CantidadRAM ram;
	private TipoDisco tipoDisco;
	private CapacidadDisco capacidadDisco;
	private TipoProcesador procesador;
	
	private static int contador = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CantidadRAM getRam() {
		return ram;
	}
	public void setRam(CantidadRAM ram) {
		this.ram = ram;
	}
	public TipoDisco getTipoDisco() {
		return tipoDisco;
	}
	public void setTipoDisco(TipoDisco tipoDisco) {
		this.tipoDisco = tipoDisco;
	}
	public CapacidadDisco getCapacidadDisco() {
		return capacidadDisco;
	}
	public void setCapacidadDisco(CapacidadDisco capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}
	public TipoProcesador getProcesador() {
		return procesador;
	}
	public void setProcesador(TipoProcesador procesador) {
		this.procesador = procesador;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public PCPesado(int id, String modelo, TipoProcesador procesador, TipoDisco tipoDisco, CapacidadDisco capacidadDisco, CantidadRAM cantidadRam) {
		this.id = id;
		this.modelo = modelo;
		this.procesador = procesador;
		this.tipoDisco = tipoDisco;
		this.capacidadDisco = capacidadDisco;
		this.ram = cantidadRam;
		
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}
}
