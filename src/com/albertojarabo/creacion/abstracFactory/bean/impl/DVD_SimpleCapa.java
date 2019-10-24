package com.albertojarabo.creacion.abstracFactory.bean.impl;

import com.albertojarabo.creacion.abstracFactory.bean.DVD;

public class DVD_SimpleCapa extends DVD {

	
	@Override
	public String calidadVideo() {
		return "360p";
	}

	@Override
	public String getCapacidad() {
		return "4.7GB";
	}

	@Override
	public String getNombre() {
		return "DVD Simple capa";
	}

	@Override
	public String getPrecio() {
		return "0.10€";
	}

}
