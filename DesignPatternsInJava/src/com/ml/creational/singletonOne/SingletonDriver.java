package com.ml.creational.singletonOne;

public class SingletonDriver {

    public static void main(String[] args) {

	Singleton s = Singleton.getInstance();
	
	//The constructor Singleton() is not visible
	//Singleton s1 = new Singleton();
	System.out.println(s);
	s.setEmail("noone@nothing.com");
	s.setName("nobody");
	System.out.println(s);
	
	Singleton s2 = Singleton.getInstance();
	System.out.println(s2);
	s2.setEmail("iams2bro@s2mail.com");
	System.out.println(s2);
	System.out.print("Are we same : ");
	System.out.print(s==s2);
	System.out.println(", We are same. Changing me will change you as well");
    }

}
