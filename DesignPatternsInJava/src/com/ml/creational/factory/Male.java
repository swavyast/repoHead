package com.ml.creational.factory;

public class Male {

    public String SIGN = "male genitals";

    public static Male createMale(String type, int age) {
	if (type.equalsIgnoreCase("female")) {
	    return null;
	} else if (type.equalsIgnoreCase("male")) {
	    if (age <= 5) {
		return new MaleChild();
	    }
	}
	return null;
    }
    
    @Override
    public String toString() {
	return "Male [SIGN=" + SIGN + "]";
    }

}