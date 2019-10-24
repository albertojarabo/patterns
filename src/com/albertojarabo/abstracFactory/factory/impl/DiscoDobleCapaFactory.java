package com.albertojarabo.abstracFactory.factory.impl;

import com.albertojarabo.abstracFactory.bean.BluRay;
import com.albertojarabo.abstracFactory.bean.DVD;
import com.albertojarabo.abstracFactory.bean.impl.BluRay_DobleCapa;
import com.albertojarabo.abstracFactory.bean.impl.DVD_DobleCapa;
import com.albertojarabo.abstracFactory.factory.DiscoFactory;

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
