package com.ml.creational.abstractFactory.Classes;

import com.ml.creational.abstractFactory.factories.StudentFactory;
import com.ml.creational.abstractFactory.interfaces.AbstractFactory;

public class FactoryProvider {
    
    public static AbstractFactory getFactory(String choice){
	
	if("student".equalsIgnoreCase(choice)) {
	    return new StudentFactory();
	}
	return null;
    }

}
