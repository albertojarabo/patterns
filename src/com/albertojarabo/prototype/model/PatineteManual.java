package com.albertojarabo.prototype.model;

public class PatineteManual extends Patinete {

	public static PatineteManual getPrototype() {
		PatineteManual pm = new PatineteManual();
		pm.setAlto(140);
		pm.setAncho(35);
		pm.setLargo(85);
		pm.setColor("Negro");
		pm.setPeso(4.3f);
		
		return pm;
	}

	@Override
	public String toString() {
		return "PatineteManual [getAlto()=" + getAlto() + ", getLargo()=" + getLargo() + ", getAncho()=" + getAncho()
				+ ", getPeso()=" + getPeso() + ", getColor()=" + getColor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
