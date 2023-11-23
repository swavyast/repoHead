package com.ml.creational.abstractFactory1;

/**
 * Concrete factory named Male
 * */
public class Male implements Human<Male> {

    @Override
    public Male create(int age) {
	if(age<=5) {
	    return new MaleChild();
	}else if(age>5&&age<=18) {
	    return new YoungGuy();
	}else if(age>18&&age<=50) {
	    return new GrownMan();
	}else if(age>50) {
	    return new OldMan();
	}
	return new Male();
    }

}
