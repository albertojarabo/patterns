package com.albertojarabo.estructural.facade.model;

import com.albertojarabo.estructural.facade.operations.CambiarRuedas;
import com.albertojarabo.estructural.facade.operations.MontarCoche;
import com.albertojarabo.estructural.facade.operations.RevisarAceite;
import com.albertojarabo.estructural.facade.operations.RevisarTara;

public class Mecanico {

	MontarCoche montarCoche;
	CambiarRuedas cambiarRuedas;
	RevisarTara revisarTara;
	RevisarAceite revisarAceite;

	public void atenderCoche(Coche c) {
		System.out.println("Atendiendo a coche");
	}

	public void atenderMoto(Moto m) {
		System.out.println("Atendiendo a moto");
	}

	public void atenderCamion(Camion c) {
		System.out.println("Atendiendo a moto");
	}

	public void atender(Vehiculo v) {
		if (v instanceof Coche) {
			atenderCoche((Coche) v);
			montarCoche.montarCoche((Coche) v);
		} else if (v instanceof Moto) {
			atenderMoto((Moto) v);
			cambiarRuedas.cambiarRuedas((Moto) v);
			revisarAceite.revisarAceite((Moto) v);
		} else if (v instanceof Camion) {
			atenderCamion((Camion) v);
			revisarTara.revisarTara((Camion) v);
		}
	}
	
	public void montarCoche(Coche c) {
		montarCoche.montarCoche(c);
	}
	
	public void cambiarRuedas(Moto m) {
		cambiarRuedas.cambiarRuedas(m);
	}
	
	public void revisarAceite(Moto m) {
		revisarAceite.revisarAceite(m);
	}
	
	public void revisarTara(Camion c) {
		revisarTara.revisarTara(c);
	}

	public Mecanico() {
		montarCoche = new MontarCoche();
		cambiarRuedas = new CambiarRuedas();
		revisarTara = new RevisarTara();
		revisarAceite = new RevisarAceite();
	}

	public MontarCoche getMontarCoche() {
		return montarCoche;
	}

	public void setMontarCoche(MontarCoche montarCoche) {
		this.montarCoche = montarCoche;
	}

	public CambiarRuedas getCambiarRuedas() {
		return cambiarRuedas;
	}

	public void setCambiarRuedas(CambiarRuedas cambiarRuedas) {
		this.cambiarRuedas = cambiarRuedas;
	}

	public RevisarTara getRevisarTara() {
		return revisarTara;
	}

	public void setRevisarTara(RevisarTara revisarTara) {
		this.revisarTara = revisarTara;
	}

	public RevisarAceite getRevisarAceite() {
		return revisarAceite;
	}

	public void setRevisarAceite(RevisarAceite revisarAceite) {
		this.revisarAceite = revisarAceite;
	}

}
