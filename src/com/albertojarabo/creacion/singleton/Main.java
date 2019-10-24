package com.albertojarabo.creacion.singleton;

public class Main {

	/*
	 * Existe una clase que implementa un método estático getInstance para entregar una única instancia del objeto que implementa.
	 * Dicha clase además protege la creación de nuevos objetos.
	 * Se muestra cómo resulta imposible construir objetos de dicha clase.
	 *
	 * Esta clase ejemplifica el uso del patrón Singleton para una clase Libreta.
	 * Para ello se invoca al método getInstance para varias variables y se modifica información contenida en alguna de estas variables,
	 * obteniendo como resultado que las modificaciones afectan a todas ellas. 
	 */
	
	public static void main(String[] args) {
		
	// Esta operación no se puede realizar
	// Libreta libreta = new Libreta();
	
	Libreta libreta1 = Libreta.getInstance();
	libreta1.setPropietario("Alberto Jarabo");
	libreta1.setContenido("Ejemplificando patrón singleton");
	
	System.out.println("libreta1: " + libreta1);
	
	Libreta libreta2 = Libreta.getInstance();
	
	System.out.println("libreta2: " + libreta2);
	
	Libreta libreta3 = Libreta.getInstance();
	
	libreta3.setPropietario("Mortadelo");
	libreta3.setContenido("Listado de disfraces para hoy...");
	
	System.out.println("libreta3: " + libreta3);
	
	System.out.println("libreta1: " + libreta1);
	}
}
