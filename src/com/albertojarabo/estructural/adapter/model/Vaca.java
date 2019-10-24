package com.albertojarabo.estructural.adapter.model;

import com.albertojarabo.estructural.adapter.model.iface.IVaca;

public class Vaca implements IVaca {

	public String mugir() {
		return "Moooooo!";
	}
	
	public String pastar() {
		return "Yum yum!";
	}
	
	public String chillar() {
		return "MOOOOOO!!";
	}
	
	public String darLeche() {
		return "glu glu glu...";
	}
}
