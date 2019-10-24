package com.albertojarabo.prototype.model;

import com.albertojarabo.prototype.Prototipable;

public abstract class Patinete implements Prototipable {
	
	private int alto; //cm
	private int largo; //cm
	private int ancho; //cm
	private float peso; //kg
	
	private String color;
			
	public Patinete clone() throws CloneNotSupportedException {
		return (Patinete) super.clone();
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
