package com.albertojarabo.estructural.adapter;

import com.albertojarabo.estructural.adapter.model.iface.IGato;
import com.albertojarabo.estructural.adapter.model.iface.IVaca;

public class GatoToVacaAdapter implements IVaca {

	private IGato gato;
	
	public GatoToVacaAdapter(IGato gato) {
		this.gato = gato;
	}

	@Override
	public String mugir() {
		return gato.maullar();
	}

	@Override
	public String pastar() {
		return gato.comer();
	}

	@Override
	public String chillar() {
		return gato.chillar();
		
	}

	@Override
	public String darLeche() {
		return gato.chillar();
	}
	
}
