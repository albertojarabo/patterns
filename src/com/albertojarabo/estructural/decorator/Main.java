package com.albertojarabo.estructural.decorator;

import com.albertojarabo.estructural.decorator.model.ModuloCocina;
import com.albertojarabo.estructural.decorator.model.ModuloCompras;
import com.albertojarabo.estructural.decorator.model.ModuloDesplazamiento;
import com.albertojarabo.estructural.decorator.model.ModuloLimpieza;
import com.albertojarabo.estructural.decorator.model.ModuloMasajes;
import com.albertojarabo.estructural.decorator.model.ModuloPlancha;
import com.albertojarabo.estructural.decorator.model.RobotXiaomiau;
import com.albertojarabo.estructural.decorator.model.iface.Modular;

public class Main {

	/*
	 * Existe una interfaz para homogeneizar las clases modulares.
	 * Existe una clase abstracta que implementa la interfaz.
	 * Existe una clase base que hereda de la clase abstracta y va a servir para ampliar con el Decorator.
	 * Existe una clase Decorator que implementa la interfaz con objetivo de ampliar las funcionalidades de la clase base.
	 * Existen seis clases que heredan del Decorator.
	 * Existen dos clases que implementan cada una de las clases abstractas anteriores.
	 * Existe un enumerado para delimitar las opciones.
	 *
	 * Esta clase ejemplifica el uso del patrón Decorator para ampliar la funcionalidad del objeto concreto Robot.
	 * Para ello se instancia la clase base Modular RobotXiaomiau, que va ampliando gracias a clases que heredan del decorador, identificadas
	 * en el ejemplo como módulos.
	 * Finalmente se muestra el resultado de dicha ampliación, obteniendo de la variable 'robot' valores dependientes de los módulos que la decoran.
	 */
	
	public static void main(String[] args) {
		Modular robot = new RobotXiaomiau();
		robot = new ModuloDesplazamiento(robot);
		robot = new ModuloCocina(robot);
		robot = new ModuloLimpieza(robot);
		robot = new ModuloPlancha(robot);
		robot = new ModuloCompras(robot);
		//robot = new ModuloMasajes(robot);
		
		
		System.out.println("El pack final es: " + robot.getDescripcion());
		System.out.println("El precio es: " + robot.getPrecio());
	}
}
