package com.albertojarabo.abstracFactory.bean.impl;

import com.albertojarabo.abstracFactory.bean.DVD;

public class DVD_DobleCapa extends DVD {

	
	@Override
	public String calidadVideo() {
		return "480p";
	}

	@Override
	public String getCapacidad() {
		return "9.2GB";
	}

	@Override
	public String getNombre() {
		return "DVD Doble capa";
	}

	@Override
	public String getPrecio() {
		return "0.15€";
	}

}
