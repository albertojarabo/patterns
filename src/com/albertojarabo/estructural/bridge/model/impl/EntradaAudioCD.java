package com.albertojarabo.estructural.bridge.model.impl;

import com.albertojarabo.estructural.bridge.model.Entrada;
import com.albertojarabo.estructural.bridge.model.Informacion;

public class EntradaAudioCD extends Entrada {

	public EntradaAudioCD(String nombreEntrada) {
		super(nombreEntrada, Informacion.AUDIO);
	}

	@Override
	public String enviarSenal() {
		return "Reproduciendo Audio CD...";
	}

}
