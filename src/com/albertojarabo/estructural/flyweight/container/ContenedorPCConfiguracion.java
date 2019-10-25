package com.albertojarabo.estructural.flyweight.container;

import java.util.HashMap;
import java.util.Map;

import com.albertojarabo.estructural.flyweight.model.CantidadRAM;
import com.albertojarabo.estructural.flyweight.model.CapacidadDisco;
import com.albertojarabo.estructural.flyweight.model.PCConfiguracion;
import com.albertojarabo.estructural.flyweight.model.TipoDisco;
import com.albertojarabo.estructural.flyweight.model.TipoProcesador;

public class ContenedorPCConfiguracion {

	private static Map<String, PCConfiguracion> configuraciones = new HashMap<>();
	
	public static PCConfiguracion getPCConfiguracion(String modelo, TipoProcesador tipoProcesador, TipoDisco tipoDisco, CapacidadDisco capacidadDisco, CantidadRAM cantidadRam) {
		String key = new StringBuilder(modelo).append(tipoProcesador.name()).append(tipoDisco.name()).append(capacidadDisco.name()).append(cantidadRam.name()).toString();
		
		if (!configuraciones.containsKey(key)) {
			configuraciones.put(key, new PCConfiguracion(modelo, tipoProcesador, cantidadRam, tipoDisco, capacidadDisco));
		}
		
		return configuraciones.get(key);
	}
}
