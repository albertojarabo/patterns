package com.albertojarabo.estructural.facade.model;

public class Coche implements Vehiculo {

	private Rueda[] ruedas = new Rueda[4];
	private Asiento[] asientos = new Asiento[5];
	private Motor motor;
	private Chasis chasis;
	
	public Coche() {
		
		for (int i=0;i<ruedas.length;i++) {
			ruedas[i] = new Rueda();
		}

		for (int i=0;i<asientos.length;i++) {
			asientos[i] = new Asiento();
		}

		motor = new Motor();
		chasis = new Chasis();
	}


	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public Asiento[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[] asientos) {
		this.asientos = asientos;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	
	
}
