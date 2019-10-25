package com.albertojarabo.estructural.flyweight.model.iface;

import com.albertojarabo.estructural.flyweight.model.CantidadRAM;
import com.albertojarabo.estructural.flyweight.model.CapacidadDisco;
import com.albertojarabo.estructural.flyweight.model.TipoDisco;
import com.albertojarabo.estructural.flyweight.model.TipoProcesador;

public interface IPC {
	
	public TipoProcesador getTipoProcesador();
	public TipoDisco getTipoDisco();
	public CapacidadDisco getCapacidadDisco();
	public CantidadRAM getCantidadRam();

}
