package com.ml.creational.abstractFactory.drivers;

import com.ml.creational.abstractFactory.Classes.FactoryProvider;
import com.ml.creational.abstractFactory.Classes.OfflineRegular;
import com.ml.creational.abstractFactory.Classes.OfflineWeekend;
import com.ml.creational.abstractFactory.Classes.OnlineRegular;
import com.ml.creational.abstractFactory.Classes.OnlineWeekend;
import com.ml.creational.abstractFactory.enums.Mode;
import com.ml.creational.abstractFactory.enums.Presence;
import com.ml.creational.abstractFactory.interfaces.AbstractFactory;
import com.ml.creational.abstractFactory.interfaces.Student;

public class RegistrationDriver {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

	AbstractFactory<Student> af = FactoryProvider.getFactory("student");
	//Creating an instance of OnlineRegular student.
	System.out.println("\n_______________________*_______________________\n");
	Student s1 = af.create(Mode.ONLINE, Presence.REGULAR);
	System.out.println(s1+"\n"); //Students [id=0, name=null, fee=0.0, noDues=false, balance=0.0] <- toString method from Students.class
	OnlineRegular or = (OnlineRegular) s1; //no error, that means s1 is of type OnlineRegular only.
	System.out.println(s1.getMode()+"\n");
	System.out.println(s1.getPresence()+"\n");
	System.out.println(s1==or);
	System.out.println();
	System.out.println(or+"\n");
	System.out.println(s1.getClass()+"\n");
	System.out.println(or.getClass()+"\n");
	
	//Creating an instance of OnlineWeekend student
	System.out.println("\n_______________________*_______________________\n");
	Student s2 = af.create(Mode.ONLINE, Presence.WEEKEND);
	System.out.println(s2+"\n");
	OnlineWeekend ow = (OnlineWeekend) s2;
	System.out.println(s2.getMode()+"\n");
	System.out.println(s2.getPresence()+"\n");
	System.out.println(s2==ow);
	System.out.println();
	System.out.println(ow+"\n");
	System.out.println(s2.getClass()+"\n");
	System.out.println(ow.getClass()+"\n");
	
	//Creating an instance of offline regular student.
	System.out.println("\n_______________________*_______________________\n");
	Student s3 = af.create(Mode.OFFLINE, Presence.REGULAR);
	System.out.println(s3+"\n");
	OfflineRegular ofr = (OfflineRegular) s3;
	System.out.println(s3.getMode()+"\n");
	System.out.println(s3.getPresence()+"\n");
	System.out.println(s3==ofr);
	System.out.println();
	System.out.println(s3.getClass()+"\n");
	System.out.println(ofr.getClass()+"\n");
	
	//Creating an instance of OfflineWeekend student.
	System.out.println("\n_______________________*_______________________\n");
	Student s4 = af.create(Mode.OFFLINE, Presence.WEEKEND);
	System.out.println(s4+"\n");
	OfflineWeekend ofw = (OfflineWeekend) s4;
	System.out.println(s4.getMode()+"\n");
	System.out.println(s4.getPresence()+"\n");
	System.out.println(s4==ofw);
	System.out.println();
	System.out.println(s4.getClass()+"\n");
	System.out.println(ofw.getClass()+"\n");
    }
}
