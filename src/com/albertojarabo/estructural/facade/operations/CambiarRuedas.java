package com.albertojarabo.estructural.facade.operations;

import java.util.Arrays;

import com.albertojarabo.estructural.facade.model.Moto;

public class CambiarRuedas {

	public void cambiarRuedas(Moto m) {
		Arrays.asList(m.getRuedas()).forEach(rueda -> rueda.montarRueda());
	}
}
