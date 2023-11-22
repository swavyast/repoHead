package com.ml.creational.abstractFactory;

import com.ml.creational.abstractFactory.interfaces.ModeOfEducation;
import com.ml.creational.abstractFactory.interfaces.StudentRegistration;
import com.ml.creational.abstractFactory.interfaces.TypeOfStudent;

public class OnlineStudent implements ModeOfEducation, StudentRegistration {

    @Override
    public TypeOfStudent getStudentType(Student s) {

	return s.getTos();
    }

    @Override
    public Student registerStudent(Student s) {

	return null;
    }

}
