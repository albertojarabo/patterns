package com.albertojarabo.estructural.flyweight;

import com.albertojarabo.estructural.flyweight.factory.FactoriaPC;
import com.albertojarabo.estructural.flyweight.model.CantidadRAM;
import com.albertojarabo.estructural.flyweight.model.CapacidadDisco;
import com.albertojarabo.estructural.flyweight.model.PC;
import com.albertojarabo.estructural.flyweight.model.PCConfiguracion;
import com.albertojarabo.estructural.flyweight.model.PCPesado;
import com.albertojarabo.estructural.flyweight.model.TipoDisco;
import com.albertojarabo.estructural.flyweight.model.TipoProcesador;

public class Main {
	
	/*
	 * Existe una interfaz que define la estructura de una clase.
	 * Existe una clase que implementa dicha interfaz y tiene como propiedad un identificador y otra clase compuesta.
	 * Existe una clase, la compuesta, que contiene propiedades de otras cuantro clases también definidas.
	 * Existe una clase Contenedor que va a almacenar distintas instancias de la clase anterior, la compuesta.
	 * Existe una clase que tiene propiedades de las cuatro clases comentadas y una propiedad identificador.
	 * Existe una clase Factoria que va a instanciar objetos de la clase que implementa la interfaz.
	 *
	 * Esta clase ejemplifica el uso del patrón Flyweight para representar la optimización de recursos que implica su uso. 
	 * En el método sinPatron, se instancian miles de elementos de la clase PCPesado, que contiene propiedades cuyos 
	 * valores están repetidos miles de veces en memoria.
	 * En el método conPatron, se utiliza la Factoria para crear varias configuraciones de un PC, que serán las únicas existentes,
	 * y de cuya gestión se encargará el Contenedor. La clase Factoría creará PCs (ligeros) que estarán formados por un identificador
	 * único y una configuración.
	 * De esta forma (conPatron), se eliminan de memoria múltiples repeticiones de valores en las propiedades de los miles de objetos que
	 * se han construido, optimizando los recursos del sistema.
	 */

	private static void sinPatron() {

		Runtime runtime = Runtime.getRuntime();

		System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) + "b");

		PCPesado[] ristraPCsPesados = new PCPesado[100000];

		for (int i = 0; i < 100000; i++) {
			switch (i % 6) {
			case 0:
				ristraPCsPesados[i] = new PCPesado(i, "BásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásicoBásico", TipoProcesador.I3, TipoDisco.HDD,
						CapacidadDisco.DISCO_512GB, CantidadRAM.RAM_8GB);
				break;
			case 1:
				ristraPCsPesados[i] = new PCPesado(i, "OfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimáticaOfimática", TipoProcesador.I3, TipoDisco.SSD,
						CapacidadDisco.DISCO_256GB, CantidadRAM.RAM_8GB);
				break;
			case 2:
				ristraPCsPesados[i] = new PCPesado(i, "Gamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low CostGamer Low Cost", TipoProcesador.I5, TipoDisco.HDD,
						CapacidadDisco.DISCO_2TB, CantidadRAM.RAM_8GB);
				break;
			case 3:
				ristraPCsPesados[i] = new PCPesado(i, "Gamer Mid Cost", TipoProcesador.I5, TipoDisco.SSD,
						CapacidadDisco.DISCO_512GB, CantidadRAM.RAM_16GB);
				break;
			case 4:
				ristraPCsPesados[i] = new PCPesado(i, "Hardocore Gamer", TipoProcesador.I7, TipoDisco.SSD,
						CapacidadDisco.DISCO_1TB, CantidadRAM.RAM_16GB);
				break;
			case 5:
				ristraPCsPesados[i] = new PCPesado(i, "Developer", TipoProcesador.I9, TipoDisco.SSD,
						CapacidadDisco.DISCO_2TB, CantidadRAM.RAM_32GB);
				break;
			}
		}

		System.out.println("Configuraciones creadas: " + PCPesado.getContador());
		System.out.println("Memoria total: " + runtime.totalMemory());
		System.out.println("Memoria libre: " + runtime.freeMemory());
		System.out.println("Memoria usada tras invocacion SIN PATRON: "
				+ (runtime.totalMemory() - runtime.freeMemory()) / 1048576 + "Mb");

		for (PCPesado pc: ristraPCsPesados) {
			System.out.println(Integer.toHexString(pc.getModelo().hashCode()));
		}
	}

	private static void conPatron() {

		Runtime runtime = Runtime.getRuntime();

		System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) + "b");

		FactoriaPC.crearPC(1, "Básico", TipoProcesador.I3, TipoDisco.HDD, CapacidadDisco.DISCO_512GB,
				CantidadRAM.RAM_8GB);
		FactoriaPC.crearPC(2, "Ofimática", TipoProcesador.I3, TipoDisco.SSD, CapacidadDisco.DISCO_256GB,
				CantidadRAM.RAM_8GB);
		FactoriaPC.crearPC(3, "Gamer Low Cost", TipoProcesador.I5, TipoDisco.HDD, CapacidadDisco.DISCO_2TB,
				CantidadRAM.RAM_8GB);
		FactoriaPC.crearPC(4, "Gamer Mid Cost", TipoProcesador.I5, TipoDisco.SSD, CapacidadDisco.DISCO_512GB,
				CantidadRAM.RAM_16GB);
		FactoriaPC.crearPC(5, "Hardocore Gamer", TipoProcesador.I7, TipoDisco.SSD, CapacidadDisco.DISCO_1TB,
				CantidadRAM.RAM_16GB);
		FactoriaPC.crearPC(6, "Developer", TipoProcesador.I9, TipoDisco.SSD, CapacidadDisco.DISCO_2TB,
				CantidadRAM.RAM_32GB);

		PC[] ristraPCs = new PC[100000];

		for (int i = 0; i < 100000; i++) {
			switch (i % 6) {
			case 0:
				ristraPCs[i] = FactoriaPC.crearPC(7 + i, "Básico", TipoProcesador.I3, TipoDisco.HDD,
						CapacidadDisco.DISCO_512GB, CantidadRAM.RAM_8GB);
				break;
			case 1:
				ristraPCs[i] = FactoriaPC.crearPC(7 + i, "Ofimática", TipoProcesador.I3, TipoDisco.SSD,
						CapacidadDisco.DISCO_256GB, CantidadRAM.RAM_8GB);
				break;
			case 2:
				ristraPCs[i] = FactoriaPC.crearPC(7 + i, "Gamer Low Cost", TipoProcesador.I5, TipoDisco.HDD,
						CapacidadDisco.DISCO_2TB, CantidadRAM.RAM_8GB);
				break;
			case 3:
				ristraPCs[i] = FactoriaPC.crearPC(7 + i, "Gamer Mid Cost", TipoProcesador.I5, TipoDisco.SSD,
						CapacidadDisco.DISCO_512GB, CantidadRAM.RAM_16GB);
				break;
			case 4:
				ristraPCs[i] = FactoriaPC.crearPC(7 + i, "Hardocore Gamer", TipoProcesador.I7, TipoDisco.SSD,
						CapacidadDisco.DISCO_1TB, CantidadRAM.RAM_16GB);
				break;
			case 5:
				ristraPCs[i] = FactoriaPC.crearPC(7 + i, "Developer", TipoProcesador.I9, TipoDisco.SSD,
						CapacidadDisco.DISCO_2TB, CantidadRAM.RAM_32GB);
				break;
			}
		}

		System.out.println("Configuraciones creadas: " + PCConfiguracion.getContador());
		System.out.println("Memoria total: " + runtime.totalMemory());
		System.out.println("Memoria libre: " + runtime.freeMemory());
		System.out.println("Memoria usada tras invocacion CON PATRON: "
				+ (runtime.totalMemory() - runtime.freeMemory()) / 1048576 + "Mb");
	}

	public static void main(String[] args) {
		System.gc();
		sinPatron();
//		conPatron();
	}
}
