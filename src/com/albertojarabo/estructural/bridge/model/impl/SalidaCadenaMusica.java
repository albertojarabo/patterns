package com.albertojarabo.estructural.bridge.model.impl;

import com.albertojarabo.estructural.bridge.model.Informacion;
import com.albertojarabo.estructural.bridge.model.Salida;

public class SalidaCadenaMusica extends Salida {

	public SalidaCadenaMusica(String nombreSalida) {
		super(nombreSalida, Informacion.AUDIO);
	}


}
