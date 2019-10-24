package com.albertojarabo.creacion.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	private static Map<String, Object> prototypes = new HashMap<>();

	public static void addPrototype(Prototype prototype, Object object) {
		prototypes.put(prototype.getValue(), object);
	}

	public static Object getPrototype(Prototype prototype) throws CloneNotSupportedException {
		Object o = prototypes.get(prototype.getValue());
		if (o != null) {
			return ((Prototipable)o).clone();
		} else return null;
	}
	
}
