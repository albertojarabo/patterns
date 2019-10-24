package com.albertojarabo.abstracFactory.bean.impl;

import com.albertojarabo.abstracFactory.bean.DVD;

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
