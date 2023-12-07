package com.ml.creational.singletonTwo;

//In this variant, method for getting the instance is synchronised rather than instance itself.
public class DraconianSingleton {
    
    private static final String msg = "instance of DraconianSingleton.class via synchronized method getInstance()";
    
    private static DraconianSingleton instance;
    
    private DraconianSingleton() {}
    
    public static synchronized DraconianSingleton getInstance() {
	if(instance == null) {
	    instance = new DraconianSingleton();
	}
	return instance;
    }
    public String toString() {
	return msg;
    }
}
