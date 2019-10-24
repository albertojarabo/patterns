package com.albertojarabo.creacion.singleton;

public final class Libreta {

	private String propietario;
	private String contenido;
	
	private static Libreta libreta;
	
	private Libreta() {}
	
	public static Libreta getInstance() {
		if (libreta == null) {
			libreta = new Libreta();
		}
		return libreta;
	}
	
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Libreta [propietario=" + propietario + ", contenido=" + contenido + "]";
	}
	
	
}
