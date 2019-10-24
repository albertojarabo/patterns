package com.albertojarabo.prototype;

import com.albertojarabo.prototype.model.PatineteElectrico;
import com.albertojarabo.prototype.model.PatineteManual;


/*
 * Existe una interfaz para implementar los objetos prototipables.
 * Existe una clase abstracta que define los atributos y métodos estandar de un patinete.
 * Existen dos clases que implementan la clase abstracta anterior para dos tipos de patinetes.
 * Existe una clase Factory que define la operación de clonado de objetos a partir de los prototipos entregados.
 * Existe un enumerado para delimitar los prototipos.
 *
 * Esta clase ejemplifica el uso del patrón Prototipo para dos tipos de patinetes diferentes englobados en la clase genérica de patinete.
 * Para ello se construyen en cada clase sendos prototipos, que se entregan a la factoria de prototipos, que generará los clonados de dichos objetos.
 */

public class Main {
	

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeFactory.addPrototype(Prototype.PATINETE_ELECTRICTO, PatineteElectrico.getPrototype());
		PrototypeFactory.addPrototype(Prototype.PATINETE_MANUAL, PatineteManual.getPrototype());
		
		PatineteElectrico pe = (PatineteElectrico)PrototypeFactory.getPrototype(Prototype.PATINETE_ELECTRICTO);
		PatineteManual pm = (PatineteManual)PrototypeFactory.getPrototype(Prototype.PATINETE_MANUAL);

		PatineteElectrico pe2 = (PatineteElectrico)PrototypeFactory.getPrototype(Prototype.PATINETE_ELECTRICTO);
		PatineteManual pm2 = (PatineteManual)PrototypeFactory.getPrototype(Prototype.PATINETE_MANUAL);

		
		System.out.println(pe.toString());
		System.out.println(pm.toString());
		
		System.out.println(pe2.toString());
		System.out.println(pm2.toString());
		
		
	}
}
