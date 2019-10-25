package com.albertojarabo.estructural.flyweight.factory;

import com.albertojarabo.estructural.flyweight.container.ContenedorPCConfiguracion;
import com.albertojarabo.estructural.flyweight.model.CantidadRAM;
import com.albertojarabo.estructural.flyweight.model.CapacidadDisco;
import com.albertojarabo.estructural.flyweight.model.PC;
import com.albertojarabo.estructural.flyweight.model.PCConfiguracion;
import com.albertojarabo.estructural.flyweight.model.TipoDisco;
import com.albertojarabo.estructural.flyweight.model.TipoProcesador;

public class FactoriaPC {

	public static PC crearPC(int id, String modelo, TipoProcesador tipoProcesador, TipoDisco tipoDisco, CapacidadDisco capacidadDisco, CantidadRAM cantidadRam) {
		
		PCConfiguracion pcConfiguracion = ContenedorPCConfiguracion.getPCConfiguracion(modelo, tipoProcesador, tipoDisco, capacidadDisco, cantidadRam);
		
		PC pc = new PC(id, pcConfiguracion);
		
		return pc;
	}
}
