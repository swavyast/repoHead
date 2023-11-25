package com.ml.creational.abstractFactory.drivers;

import com.ml.creational.abstractFactory.OnlineStudent;
import com.ml.creational.abstractFactory.Student;
import com.ml.creational.abstractFactory.WeekendStudent;
import com.ml.creational.abstractFactory.interfaces.ModeOfEducation;
import com.ml.creational.abstractFactory.interfaces.TypeOfStudent;

public class RegistrationDriver {

    public static void main(String[] args) {
	Student s1=new Student();
	//ModeOfEducation moe=new OfflineStudent();
	//TypeOfStudent tos=new RegularStudent();
	ModeOfEducation moe=new OnlineStudent();
	TypeOfStudent tos=new WeekendStudent();
	s1.setId(101L);
	s1.setName("Himanshu");
	s1.setFee(30_000d);
	s1.setBalance(0d);
	s1.setNoDues(true);
	s1.setMoe(moe);
	s1.setTos(tos);
	//OfflineStudent os=new OfflineRegular();
	OnlineStudent os=new OnlineWeekend();
	os.registerStudent(s1);
	System.out.println(s1.getName()+"'s"+ " Student ID is : "+s1.getId() + "\n"
	+"Fee Paid by "+s1.getName()+" is : " +s1.getFee()+"\n"
		+"Fee Balance is : "+ s1.getBalance()+"\nNoDues is : "+ s1.isNoDues());
    }

}
