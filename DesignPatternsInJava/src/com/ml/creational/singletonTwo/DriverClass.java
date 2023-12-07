package com.ml.creational.singletonTwo;

public class DriverClass {

    public static void main(String[] args) {
	
	System.out.println("***Double check Locking Singleton Pattern***\n");
	SingletonWithDoubleCheckLocking s1 = SingletonWithDoubleCheckLocking.getInstance();
	System.out.println(s1);
	System.out.println("\n***Draconian Singleton Pattern***");
	DraconianSingleton ds = DraconianSingleton.getInstance();
	System.out.println("\n"+ds);
    }

}
