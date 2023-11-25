package com.ml.creational.factory;

public class Female {
    
    public String SIGN="female genitals";

    public static Female createFemale(String type, int age) {
	if(type.equalsIgnoreCase("male")) {
	    return null;
	}else if(type.equalsIgnoreCase("female")) {
	    if(age<=5) {
		return new GirlChild();
	    }
	}
	return null;
    }
    
    @Override
    public String toString() {
	return "Female [SIGN=" + SIGN + "]";
    }
}
