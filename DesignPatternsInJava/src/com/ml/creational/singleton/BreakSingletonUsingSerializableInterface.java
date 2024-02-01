package com.ml.creational.singleton;

import java.io.Serializable;

public class BreakSingletonUsingSerializableInterface implements Serializable {
	private static final BreakSingletonUsingSerializableInterface INSTANCE = new BreakSingletonUsingSerializableInterface();
	private BreakSingletonUsingSerializableInterface() {}
	public static BreakSingletonUsingSerializableInterface getInstance() {
		
		return INSTANCE;
	}

}
