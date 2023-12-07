package com.ml.creational.singletonOne;

/**
 * init on-demand.
 * 
 * the difference between early-init and init-on-demand is that, in early init the INSTANCE is getting initialized at the time
 * of class loading itself. While in later case, initialization is taking place when getInstance() method is getting invoked.
 * */
public class Singleton {
    private String name;
    private String email;
    
    private Singleton() {}
    
    private static class SingletonHolder{
	private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
	return SingletonHolder.INSTANCE;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
	return "Singleton [name=" + name + ", email=" + email + "]";
    }
    
}
