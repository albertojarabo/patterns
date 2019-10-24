package com.albertojarabo.estructural.bridge.model.impl;

import com.albertojarabo.estructural.bridge.model.Amplificador;
import com.albertojarabo.estructural.bridge.model.Entrada;
import com.albertojarabo.estructural.bridge.model.Salida;

public class AmplificadorAudio extends Amplificador {

	public AmplificadorAudio(Entrada entrada, Salida salida) {
		super(entrada, salida);
	}

	@Override
	public void amplifica() {
		switch (obtenerEntrada().getDatos()) {
		case AUDIO:
		case AUDIO_Y_VIDEO: {
			System.out.println("Amplificando audio de " + obtenerEntrada().getNombreEntrada());
			System.out.println(proyectarSalida());
			break;
		}
		default:
			System.out.println("No reconozco el dispositivo de entrada.");
		}
	}

	@Override
	public String toString() {
		return "AmplificadorAudio [" + obtenerEntrada() + ", " + obtenerSalida() + "]";
	}

}
