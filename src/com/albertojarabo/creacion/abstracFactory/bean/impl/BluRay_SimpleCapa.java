package com.albertojarabo.creacion.abstracFactory.bean.impl;

import com.albertojarabo.creacion.abstracFactory.bean.BluRay;

public class BluRay_SimpleCapa extends BluRay {

	
	@Override
	public boolean tieneVideo4K() {
		return false;
	}

	@Override
	public String getCapacidad() {
		return "25GB";
	}

	@Override
	public String getNombre() {
		return "BluRay Simple capa";
	}

	@Override
	public String getPrecio() {
		return "0.50€";
	}

}
