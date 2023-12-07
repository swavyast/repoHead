package com.ml.creational.singletonOne;

public class Singleton {
    private String name;
    private String email;
    
    private Singleton() {}
    
    private static class SingletonHolder{
	private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
	return SingletonHolder.instance;
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
