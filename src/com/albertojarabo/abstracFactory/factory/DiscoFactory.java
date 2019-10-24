package com.albertojarabo.abstracFactory.factory;

import com.albertojarabo.abstracFactory.bean.BluRay;
import com.albertojarabo.abstracFactory.bean.DVD;

public interface DiscoFactory {

	public abstract DVD createDVD();
	public abstract BluRay createBluRay();
	
}
