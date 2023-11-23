package com.ml.creational.abstractFactory1;

/**
 * Factory Provider for Male and Female(factories).
 */
public class CreateHuman {

    public static Human getHuman(String type) {

	return (type.equalsIgnoreCase("Male"))?new Male():(type.equalsIgnoreCase("Female"))?new Female():null;
    }
}