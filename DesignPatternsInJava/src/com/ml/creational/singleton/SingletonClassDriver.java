package com.ml.creational.singleton;

public class SingletonClassDriver {

    public static void main(String[] args) {
	SingletonClass single = SingletonClass.getInstance();
	single.setId(10123L);
	single.setName("Some Name");
	single.setEmail("someone@example.com");
	single.setPhone("+91-9988776655");
	
	System.out.println(single);
	
	SingletonClass singleton = SingletonClass.getInstance();
	
	//The constructor SingletonClass() is not visible
	//SingletonClass sc = new SingletonClass();
	
	System.out.println(single == singleton);
	System.out.println(single.equals(singleton));
	System.out.println(singleton);
	singleton.setEmail("myname@example.com");
	System.out.println(single);
    }

}
