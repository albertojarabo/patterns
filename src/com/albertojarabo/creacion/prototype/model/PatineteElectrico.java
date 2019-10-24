package com.albertojarabo.creacion.prototype.model;

public class PatineteElectrico extends Patinete {

	private int potencia; // W
	private float autonomia; // Km
	
	public static PatineteElectrico getPrototype() {
		PatineteElectrico pe = new PatineteElectrico();
		pe.setAlto(140);
		pe.setAncho(35);
		pe.setLargo(85);
		pe.setColor("Negro");
		pe.setPeso(10f);
		pe.setAutonomia(25);
		pe.setPotencia(500);
		
		return pe;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public float getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public String toString() {
		return "PatineteElectrico [getPotencia()=" + getPotencia() + ", getAutonomia()=" + getAutonomia() + ", getAlto()=" + getAlto()
				+ ", getLargo()=" + getLargo() + ", getAncho()=" + getAncho() + ", getPeso()=" + getPeso()
				+ ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
