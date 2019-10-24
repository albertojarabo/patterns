package com.albertojarabo.estructural.bridge.model.impl;

import com.albertojarabo.estructural.bridge.model.Amplificador;
import com.albertojarabo.estructural.bridge.model.Entrada;
import com.albertojarabo.estructural.bridge.model.Informacion;
import com.albertojarabo.estructural.bridge.model.Salida;

public class AmplificadorVideo extends Amplificador {

	public AmplificadorVideo(Entrada entrada, Salida salida) {
		super(entrada, salida);
	}

	@Override
	public void amplifica() {
		switch (obtenerEntrada().getDatos()) {
		case VIDEO:
			System.out.println("Amplificando video de " + obtenerEntrada().getNombreEntrada());
			System.out.println(proyectarSalida());
			break;
		case AUDIO_Y_VIDEO:
			String mostrarSalida = "";
			if (obtenerSalida().getDatos() == Informacion.AUDIO_Y_VIDEO) {
				mostrarSalida = "Amplificando audio y video de ";
			} else {
				mostrarSalida = "Amplificando video de ";
			}
			System.out.println(mostrarSalida + obtenerEntrada().getNombreEntrada());
			System.out.println(proyectarSalida());
			break;
		default:
			System.out.println("No reconozco el dispositivo de entrada.");
		}
	}

	@Override
	public String toString() {
		return "AmplificadorVideo [" + obtenerEntrada() + ", " + obtenerSalida() + "]";
	}

	
}
