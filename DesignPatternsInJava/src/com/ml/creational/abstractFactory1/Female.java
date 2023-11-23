package com.ml.creational.abstractFactory1;

/**
 * Concrete factory named Female
 * */
public class Female implements Human<Female> {

    @Override
    public Female create(int age) {
	if(age<=5) {
	    return new FemaleChild();
	}else if(age>5&&age<=18) {
	    return new YoungGirl();
	}else if(age>18&&age<=50) {
	    return new GrownWoman();
	}else if(age>50) {
	    return new OldWoman();
	}
	return new Female();
    }

}
