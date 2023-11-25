package com.ml.creational.abstractFactory.drivers;

import com.ml.creational.abstractFactory.OnlineStudent;
import com.ml.creational.abstractFactory.Student;

public class OnlineWeekend extends OnlineStudent {
    private String msg;
    @Override
    public Student registerStudent(Student s) {

	msg=s.getName()+" is Online student and attends weekend classes";
	System.out.println(msg);
	return s;
    }
}
