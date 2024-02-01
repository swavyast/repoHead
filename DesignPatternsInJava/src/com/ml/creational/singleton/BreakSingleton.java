package com.ml.creational.singleton;

public class BreakSingleton {

	private static final BreakSingleton INSTANCE = new BreakSingleton();

	private BreakSingleton() {
//		if(INSTANCE!=null) {
//			throw new IllegalStateException();
//		}
//		null check to ensure singleton pattern doesn't break even after using reflection API.
	}

	public static BreakSingleton getInstance() {

		return INSTANCE;
	}
}
