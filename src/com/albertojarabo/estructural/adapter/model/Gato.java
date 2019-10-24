package com.albertojarabo.estructural.adapter.model;

import com.albertojarabo.estructural.adapter.model.iface.IGato;

public class Gato implements IGato {

	public String maullar() {
		return "Meeeoow";
	}
	
	public String comer() {
		 return "crunch crunch!";
	}
	
	public String chillar() {
		return "MEEEOOW!!!";		
	}
}
