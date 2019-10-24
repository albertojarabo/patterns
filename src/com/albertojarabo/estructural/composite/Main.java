package com.albertojarabo.estructural.composite;

import com.albertojarabo.estructural.composite.model.Casa;
import com.albertojarabo.estructural.composite.model.Electrodomestico;
import com.albertojarabo.estructural.composite.model.Enseres;
import com.albertojarabo.estructural.composite.model.Mobiliario;

public class Main {
	
	/*
	 * Existe una interfaz que implementan cuatro clases concretas.
	 * Existe una de esas cuatro clases que se va a "componer" elementos de las otras tres.
	 *
	 * Esta clase ejemplifica el uso del patrón Composite para generar una estructura compleja de clases simples y similares.
	 * Para ello se instancia un objeto Casa al que se le van adhiriendo otros tipos de objetos que comparten características comunes
	 * como el valor de tasación, para finalizar realizando una tasación completa del contenido del inmueble.
	 * Finalmente se muestra el resultado de la agregación de valores de cada auno de los componentes que integran la casa.
	 */

	public static void main(String[] args) {
		Casa casa = new Casa();
		
		casa.addEnseres(new Enseres("Joyas", 3500f));
		casa.addEnseres(new Enseres("Ropa", 8000f));
		casa.addEnseres(new Enseres("Calzado", 3000f));

		casa.addMueble(new Mobiliario("Sofá", 1500f));
		casa.addMueble(new Mobiliario("Cama", 1200f));
		casa.addMueble(new Mobiliario("Mesa", 800f));
		casa.addMueble(new Mobiliario("Sillas ", 600f));
		casa.addMueble(new Mobiliario("Armario", 1500f));

		casa.addElectrodomestico(new Electrodomestico("Frigorífico", 1200f));
		casa.addElectrodomestico(new Electrodomestico("Horno", 600f));
		casa.addElectrodomestico(new Electrodomestico("Microondas", 150f));
		casa.addElectrodomestico(new Electrodomestico("Lavavajillas", 700f));
		casa.addElectrodomestico(new Electrodomestico("Lavadora", 800f));
		casa.addElectrodomestico(new Electrodomestico("TV", 700f));
		casa.addElectrodomestico(new Electrodomestico("PlayStation", 300f));
		casa.addElectrodomestico(new Electrodomestico("PC", 1000f));
		
		System.out.println("La tasación del contenido de la casa asciende a " + casa.getValor() + " €");
	}
}
