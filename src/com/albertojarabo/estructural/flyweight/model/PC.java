package com.albertojarabo.estructural.flyweight.model;

import com.albertojarabo.estructural.flyweight.model.iface.IPC;

public class PC implements IPC {

	private int id;
	private PCConfiguracion configuracion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PCConfiguracion getConfiguracion() {
		return configuracion;
	}
	public void setConfiguracion(PCConfiguracion configuracion) {
		this.configuracion = configuracion;
	}
	@Override
	public TipoProcesador getTipoProcesador() {
		return configuracion.getProcesador();
	}
	@Override
	public TipoDisco getTipoDisco() {
		return configuracion.getTipoDisco();
	}
	@Override
	public CapacidadDisco getCapacidadDisco() {
		return configuracion.getCapacidadDisco();
	}
	@Override
	public CantidadRAM getCantidadRam() {
		return configuracion.getRam();
	}
	
	public PC(int id, PCConfiguracion configuracion) {
		super();
		this.id = id;
		this.configuracion = configuracion;
	}
	
}
