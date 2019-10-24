package com.albertojarabo.estructural.adapter;

import com.albertojarabo.estructural.adapter.model.iface.IGato;
import com.albertojarabo.estructural.adapter.model.iface.IVaca;

public class VacaToGatoAdapter implements IGato {

	private IVaca vaca;
	
	public VacaToGatoAdapter(IVaca vaca) {
		this.vaca = vaca;
	}

	@Override
	public String maullar() {
		return vaca.mugir();
	}

	@Override
	public String comer() {
		return vaca.pastar();
	}

	@Override
	public String chillar() {
		return vaca.chillar();
		
	}
	
}
