package com.albertojarabo.estructural.composite.model;

import java.util.ArrayList;
import java.util.List;

import com.albertojarabo.estructural.composite.model.iface.Tasable;

public class Casa implements Tasable {

	List<Mobiliario> muebles;
	List<Enseres> enseres;
	List<Electrodomestico> electrodomesticos;

	@Override
	public float getValor() {
		float valor = 0f;
		if (muebles.size() > 0) {
			valor += muebles.stream().map(x -> x.getValor()).reduce((v1, v2) -> v1 + v2).orElse(null);
		}
		if (enseres.size() > 0) {
			valor += enseres.stream().map(x -> x.getValor()).reduce((v1, v2) -> v1 + v2).orElse(null);
		}
		if (electrodomesticos.size() > 0) {
			valor += electrodomesticos.stream().map(x -> x.getValor()).reduce((v1, v2) -> v1 + v2).orElse(null);
		}
		return valor;
	}

	public Casa() {
		muebles = new ArrayList<>();
		enseres = new ArrayList<>();
		electrodomesticos = new ArrayList<>();
	}
	
	public void addMueble(Mobiliario m) {
		muebles.add(m);
	}
	
	public void addEnseres(Enseres e) {
		enseres.add(e);
	}
	
	public void addElectrodomestico(Electrodomestico e) {
		electrodomesticos.add(e);
	}
}
