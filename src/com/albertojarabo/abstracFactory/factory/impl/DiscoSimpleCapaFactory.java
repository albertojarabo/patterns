package com.albertojarabo.abstracFactory.factory.impl;

import com.albertojarabo.abstracFactory.bean.BluRay;
import com.albertojarabo.abstracFactory.bean.DVD;
import com.albertojarabo.abstracFactory.bean.impl.BluRay_SimpleCapa;
import com.albertojarabo.abstracFactory.bean.impl.DVD_SimpleCapa;
import com.albertojarabo.abstracFactory.factory.DiscoFactory;

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
