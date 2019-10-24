package com.albertojarabo.estructural.bridge.model.impl;

import com.albertojarabo.estructural.bridge.model.Entrada;
import com.albertojarabo.estructural.bridge.model.Informacion;

public class EntradaVideoDVD extends Entrada {

	public EntradaVideoDVD(String nombreEntrada) {
		super(nombreEntrada, Informacion.AUDIO_Y_VIDEO);
	}

	@Override
	public String enviarSenal() {
		return "Reproduciendo DVD...";
	}

}
