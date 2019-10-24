package com.albertojarabo.creacion.abstracFactory;

import com.albertojarabo.creacion.abstracFactory.bean.BluRay;
import com.albertojarabo.creacion.abstracFactory.bean.DVD;
import com.albertojarabo.creacion.abstracFactory.factory.DiscoFactory;
import com.albertojarabo.creacion.abstracFactory.factory.impl.DiscoDobleCapaFactory;
import com.albertojarabo.creacion.abstracFactory.factory.impl.DiscoSimpleCapaFactory;

public class Main {

	public static void main(String[] args) {
		
		DiscoFactory discoFactory = new DiscoSimpleCapaFactory();
		DVD dvd = discoFactory.createDVD();
		BluRay bluRay = discoFactory.createBluRay();
		
		dvd.showDatos();
		bluRay.showDatos();
		
		discoFactory = new DiscoDobleCapaFactory();
		dvd = discoFactory.createDVD();
		bluRay = discoFactory.createBluRay();
		
		dvd.showDatos();
		bluRay.showDatos();
	}
}
