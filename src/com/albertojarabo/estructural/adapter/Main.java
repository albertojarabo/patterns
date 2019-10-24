package com.albertojarabo.estructural.adapter;

import com.albertojarabo.estructural.adapter.model.Gato;
import com.albertojarabo.estructural.adapter.model.Vaca;

public class Main {

	/*
	 * Existen dos clases para representar a sendos animales.
	 * Existen dos clases adaptador que "adaptan" los métodos de uno de los animales para ser utilizados desde el otro animal.
	 *
	 * Esta clase ejemplifica el uso del patrón Adaptar para adaptar ambas clases de animales.
	 * Para ello se instancia un animal de cada tipo. Después se instancia un adaptador de cada tipo (de un animal hacia el otro)
	 * Finalmente se muestra el resultado de la combinación de adaptaciones de un tipo al otro, del otro al uno y del uno al otro con el otro desde el uno.
	 * Se puede observar el comportamiento del gato cuando se dice que es vaca y se intenta que dé leche.
	 * Como curiosidad: Se puede observar el comportamiento de un adaptador aplicado sobre el otro.
	 */
	
	public static void main(String[] args) {
		Gato gato = new Gato();
		Vaca vaca = new Vaca();
		
		System.out.println("El gato come: " + gato.comer());
		System.out.println("El gato maulla: " + gato.maullar());
		System.out.println("El gato chilla: " + gato.chillar());
		System.out.println();

		System.out.println("La vaca pasta: " + vaca.pastar());
		System.out.println("La vaca muge: " + vaca.mugir());
		System.out.println("La vaca chilla: " + vaca.chillar());
		System.out.println("La vaca da leche: " + vaca.darLeche());
		System.out.println();
		
		GatoToVacaAdapter gatoVaca = new GatoToVacaAdapter(gato);
		System.out.println("El gatoVaca pasta: " + gatoVaca.pastar());
		System.out.println("El gatoVaca muge: " + gatoVaca.mugir());
		System.out.println("El gatoVaca chilla: " + gatoVaca.chillar());
		System.out.println("El gatoVaca da leche: " + gatoVaca.darLeche());
		System.out.println();
		
		VacaToGatoAdapter vacaGato = new VacaToGatoAdapter(vaca);
		System.out.println("La vacaGato come: " + vacaGato.comer());
		System.out.println("La vacaGato maulla: " + vacaGato.maullar());
		System.out.println("La vacaGato chilla: " + vacaGato.chillar());
		System.out.println();
	
		GatoToVacaAdapter gatoVacaFromVacaGato = new GatoToVacaAdapter(vacaGato);
		System.out.println("El gatoVacaFromVacaGato pasta: " + gatoVacaFromVacaGato.pastar());
		System.out.println("El gatoVacaFromVacaGato muge: " + gatoVacaFromVacaGato.mugir());
		System.out.println("El gatoVacaFromVacaGato chilla: " + gatoVacaFromVacaGato.chillar());
		System.out.println("El gatoVacaFromVacaGato da leche: " + gatoVacaFromVacaGato.darLeche());
		System.out.println();
	}
}
