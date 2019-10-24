package com.albertojarabo.creacion.abstracFactory.factory.impl;

import com.albertojarabo.creacion.abstracFactory.bean.BluRay;
import com.albertojarabo.creacion.abstracFactory.bean.DVD;
import com.albertojarabo.creacion.abstracFactory.bean.impl.BluRay_SimpleCapa;
import com.albertojarabo.creacion.abstracFactory.bean.impl.DVD_SimpleCapa;
import com.albertojarabo.creacion.abstracFactory.factory.DiscoFactory;

public class DiscoSimpleCapaFactory implements DiscoFactory {

	@Override
	public DVD createDVD() {
		DVD_SimpleCapa dvd = new DVD_SimpleCapa();
		return dvd;
	}

	@Override
	public BluRay createBluRay() {
		BluRay_SimpleCapa bluRay = new BluRay_SimpleCapa();
		return bluRay;
	}

}
