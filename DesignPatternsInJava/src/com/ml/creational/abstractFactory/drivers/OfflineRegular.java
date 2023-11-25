package com.ml.creational.abstractFactory.drivers;

import com.ml.creational.abstractFactory.OfflineStudent;
import com.ml.creational.abstractFactory.Student;

public class OfflineRegular extends OfflineStudent {

    private String msg;
    @Override
    public Student registerStudent(Student s) {

	msg=s.getName()+" is Offline student and attends regular classes";
	System.out.println(msg);
	return s;
    }


}
