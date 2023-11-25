package com.ml.creational.factory;

public class FactoryPatternDriver {

    public static void main(String[] args) {
	Male m= Male.createMale("male", 5);
	Female f=Female.createFemale("female", 4);
	System.out.println(m);
	System.out.println(f);
	System.out.println(m.SIGN);
	System.out.println(f.SIGN);

    }

}
