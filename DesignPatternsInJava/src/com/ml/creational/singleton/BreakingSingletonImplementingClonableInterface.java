package com.ml.creational.singleton;

public class BreakingSingletonImplementingClonableInterface implements Cloneable {

	private static final BreakingSingletonImplementingClonableInterface INSTANCE = new BreakingSingletonImplementingClonableInterface();
	private BreakingSingletonImplementingClonableInterface() {}
	public static BreakingSingletonImplementingClonableInterface getInstance() {
		
		return INSTANCE;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		if(INSTANCE!=null) {
//			throw new IllegalStateException();
//		}
		return super.clone();
	}
}
