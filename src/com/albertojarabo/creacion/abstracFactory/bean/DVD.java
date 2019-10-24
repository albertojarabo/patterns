package com.albertojarabo.creacion.abstracFactory.bean;

public abstract class DVD extends Disco {

	public abstract String calidadVideo();
	
	@Override
	public void showDatos() {
		super.showDatos();
		System.out.println("Calidad de video: " + calidadVideo());
	}
	
}
