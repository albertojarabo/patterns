package com.albertojarabo.estructural.bridge;

import com.albertojarabo.estructural.bridge.model.Amplificador;
import com.albertojarabo.estructural.bridge.model.impl.AmplificadorAudio;
import com.albertojarabo.estructural.bridge.model.impl.AmplificadorVideo;
import com.albertojarabo.estructural.bridge.model.impl.EntradaAudioCD;
import com.albertojarabo.estructural.bridge.model.impl.EntradaVideoDVD;
import com.albertojarabo.estructural.bridge.model.impl.SalidaCadenaMusica;
import com.albertojarabo.estructural.bridge.model.impl.SalidaTVFULLHD;

public class Main {
	
	/*
	 * Existen tres clases abstractas para estructurar el problema.
	 * Existen dos clases que implementan cada una de las clases abstractas anteriores.
	 * Existe un enumerado para delimitar las opciones.
	 *
	 * Esta clase ejemplifica el uso del patrón Bridge para desacoplar las implementaciones de sus abstracciones.
	 * Para ello se instancia un amplificador de cada tipo y se le cargan como parámetros implementaciones de ejemplo de manera
	 * que pueda comprobarse su comportamiento.
	 * Finalmente se muestra el resultado de la combinación de instanciaciones de las distintas implementaciones.
	 */

	public static void main(String[] args) {
		Amplificador amplificadorMusica = new AmplificadorAudio(new EntradaAudioCD("The Beattles"), new SalidaCadenaMusica("JVC High Fidelity Music System"));
		System.out.println(amplificadorMusica);
		amplificadorMusica.amplifica();
		System.out.println();
		Amplificador amplificadorCine = new AmplificadorVideo(new EntradaAudioCD("The Beattles"), new SalidaCadenaMusica("JVC High Fidelity Music System"));
		System.out.println(amplificadorCine);
		amplificadorCine.amplifica();
		System.out.println();
		amplificadorCine = new AmplificadorVideo(new EntradaVideoDVD("Alien"), new SalidaCadenaMusica("JVC High Fidelity Music System"));
		System.out.println(amplificadorCine);
		amplificadorCine.amplifica();

		System.out.println();
		amplificadorCine = new AmplificadorVideo(new EntradaVideoDVD("Alien"), new SalidaTVFULLHD("TV LG LED FullHD"));
		System.out.println(amplificadorCine);
		amplificadorCine.amplifica();

	}
}
