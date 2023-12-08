package com.ml.creational.abstractFactory.factories;

import com.ml.creational.abstractFactory.Classes.OnlineRegular;
import com.ml.creational.abstractFactory.Classes.OnlineWeekend;
import com.ml.creational.abstractFactory.Classes.OfflineRegular;
import com.ml.creational.abstractFactory.Classes.OfflineWeekend;
import com.ml.creational.abstractFactory.enums.Mode;
import com.ml.creational.abstractFactory.enums.Presence;
import com.ml.creational.abstractFactory.interfaces.AbstractFactory;
import com.ml.creational.abstractFactory.interfaces.Student;

public class StudentFactory implements AbstractFactory<Student> {

    @Override
    public Student create(Mode mode, Presence presence) {
	if(mode.equals(Mode.ONLINE)&&presence.equals(Presence.REGULAR)) {
	    return new OnlineRegular();
	    }else if(mode.equals(Mode.ONLINE)&&presence.equals(Presence.WEEKEND)){
		return new OnlineWeekend();
	    }else if(mode.equals(Mode.OFFLINE)&&presence.equals(Presence.REGULAR)) {
		return new OfflineRegular();
	    }else if(mode.equals(Mode.OFFLINE)&&presence.equals(Presence.WEEKEND)){
		return new OfflineWeekend();
	    }
	return null;
    }

}
