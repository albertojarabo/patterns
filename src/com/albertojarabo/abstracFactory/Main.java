package com.albertojarabo.abstracFactory;

import com.albertojarabo.abstracFactory.bean.BluRay;
import com.albertojarabo.abstracFactory.bean.DVD;
import com.albertojarabo.abstracFactory.factory.DiscoFactory;
import com.albertojarabo.abstracFactory.factory.impl.DiscoDobleCapaFactory;
import com.albertojarabo.abstracFactory.factory.impl.DiscoSimpleCapaFactory;

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
