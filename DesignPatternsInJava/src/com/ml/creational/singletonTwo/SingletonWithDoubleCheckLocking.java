package com.ml.creational.singletonTwo;

public class SingletonWithDoubleCheckLocking {
    
    //current instance    
    private static volatile SingletonWithDoubleCheckLocking instance;
    private static final String msg="Synchronized instance of SingletonWithDoubleCheckLocking.class";
    
    //private constructor, restricting it's visibility to other classes.
    private SingletonWithDoubleCheckLocking() {}
    
    //method to return the synchronised current instance
    public static SingletonWithDoubleCheckLocking getInstance() {
	if(instance==null) {
	    synchronized (SingletonWithDoubleCheckLocking.class) {
		if(instance==null) {
		    instance=new SingletonWithDoubleCheckLocking();
		}
	    }
	}
	return instance;
    }
    public String toString() {
	return msg;
    }
}
