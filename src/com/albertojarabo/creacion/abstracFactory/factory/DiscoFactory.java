package com.albertojarabo.creacion.abstracFactory.factory;

import com.albertojarabo.creacion.abstracFactory.bean.BluRay;
import com.albertojarabo.creacion.abstracFactory.bean.DVD;

public interface DiscoFactory {

	public abstract DVD createDVD();
	public abstract BluRay createBluRay();
	
}
