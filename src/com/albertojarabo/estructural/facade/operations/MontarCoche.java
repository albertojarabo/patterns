package com.albertojarabo.estructural.facade.operations;

import java.util.Arrays;

import com.albertojarabo.estructural.facade.model.Coche;

public class MontarCoche {

	public void montarCoche(Coche c) {
		c.getMotor().montarMotor();
		Arrays.asList(c.getRuedas()).forEach(rueda -> rueda.montarRueda());
		Arrays.asList(c.getAsientos()).forEach(asiento -> asiento.montarAsiento());
		c.getChasis().montarChasis();
	}
}
