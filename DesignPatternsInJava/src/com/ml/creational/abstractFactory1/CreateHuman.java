package com.ml.creational.abstractFactory1;

/**
 * Factory Provider for Male and Female(factories).
 */
public class CreateHuman {
    private static boolean flag = false;

    public static Human getHuman(String type) {

	if ("Male".equalsIgnoreCase(type)) {

	    flag = true;
	} else if ("Female".equalsIgnoreCase(type)) {

	    flag = false;
	}

	return (flag) ? new Male() : new Female();
    }

}
