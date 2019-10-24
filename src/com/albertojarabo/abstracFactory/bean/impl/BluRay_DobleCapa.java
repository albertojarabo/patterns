package com.albertojarabo.abstracFactory.bean.impl;

import com.albertojarabo.abstracFactory.bean.BluRay;

public class BluRay_DobleCapa extends BluRay {

	
	@Override
	public boolean tieneVideo4K() {
		return true;
	}

	@Override
	public String getCapacidad() {
		return "50GB";
	}

	@Override
	public String getNombre() {
		return "BluRay Doble capa";
	}

	@Override
	public String getPrecio() {
		return "1.20€";
	}

}
