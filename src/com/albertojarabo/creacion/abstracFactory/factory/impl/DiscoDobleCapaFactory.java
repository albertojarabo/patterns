package com.albertojarabo.creacion.abstracFactory.factory.impl;

import com.albertojarabo.creacion.abstracFactory.bean.BluRay;
import com.albertojarabo.creacion.abstracFactory.bean.DVD;
import com.albertojarabo.creacion.abstracFactory.bean.impl.BluRay_DobleCapa;
import com.albertojarabo.creacion.abstracFactory.bean.impl.DVD_DobleCapa;
import com.albertojarabo.creacion.abstracFactory.factory.DiscoFactory;

public class DiscoDobleCapaFactory implements DiscoFactory {

	@Override
	public DVD createDVD() {
		DVD_DobleCapa dvd = new DVD_DobleCapa();
		return dvd;
	}

	@Override
	public BluRay createBluRay() {
		BluRay_DobleCapa bluRay = new BluRay_DobleCapa();
		return bluRay;
	}

}
