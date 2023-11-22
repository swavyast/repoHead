package com.ml.creational.abstractFactory;

import com.ml.creational.abstractFactory.interfaces.ModeOfEducation;
import com.ml.creational.abstractFactory.interfaces.TypeOfStudent;

public class WeekendStudent implements TypeOfStudent {

    @Override
    public ModeOfEducation getModeOfEducation(Student s) {
	// TODO Auto-generated method stub
	return s.getMoe();
    }
    

}
