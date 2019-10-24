package com.albertojarabo.estructural.facade;

import com.albertojarabo.estructural.facade.model.Camion;
import com.albertojarabo.estructural.facade.model.Coche;
import com.albertojarabo.estructural.facade.model.Mecanico;
import com.albertojarabo.estructural.facade.model.Moto;

public class Main {

	/*
	 * Existe una interfaz que implementan tres clases concretas. Existen clases
	 * base para los elementos que componen dichas clases concretas. Existe una
	 * clase que realiza operaciones sobre dichas clases base. Esta misma clase
	 * contiene la implementación del patron facade.
	 *
	 * Esta clase ejemplifica el uso del patrón Facade para representar la
	 * simplicidad de uso de clases que lo implementan. Para ello se instancian 3
	 * objetos diferentes de tipo vehiculo y un mecánico que realiza distintas
	 * tareas sobre ellos. En una parte del código se escriben las lineas necesarias
	 * para cubrir todas las operaciones del mecánico sobre los vehiculos. En la
	 * última parte del código se escriben la lineas necesarias con el patron facade
	 * implementado. Finalmente se muestra el resultado de la operativa por
	 * pantalla.
	 */

	public static void main(String[] args) {

		Coche c = new Coche();
		Moto m = new Moto();
		Camion cm = new Camion();

		Mecanico me = new Mecanico();

		// Sin FACADE
		System.out.println("SIN FACADE");
		System.out.println("----------");
		System.out.println();

		me.atenderCoche(c);
		me.montarCoche(c);

		me.atenderMoto(m);
		me.revisarAceite(m);
		me.cambiarRuedas(m);

		me.atenderCamion(cm);
		me.revisarTara(cm);

		System.out.println();
		System.out.println();

		// Con FACADE
		System.out.println("CON FACADE");
		System.out.println("----------");
		System.out.println();

		me.atender(c);
		me.atender(m);
		me.atender(cm);
	}

}
