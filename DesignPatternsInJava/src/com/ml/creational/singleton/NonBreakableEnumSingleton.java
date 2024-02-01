package com.ml.creational.singleton;

public enum NonBreakableEnumSingleton{	//enums are by default Serializable and Non-Cloneable

	INSTANCE;
	
	public static NonBreakableEnumSingleton getInstance() {
		
		return INSTANCE;
	}
}
