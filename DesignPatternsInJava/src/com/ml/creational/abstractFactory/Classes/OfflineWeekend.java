package com.ml.creational.abstractFactory.Classes;

import com.ml.creational.abstractFactory.enums.Mode;
import com.ml.creational.abstractFactory.enums.Presence;
import com.ml.creational.abstractFactory.interfaces.Student;

public class OfflineWeekend implements Student {
    
    private static final Mode mode = Mode.OFFLINE;
    private static final Presence presence = Presence.WEEKEND;

    @Override
    public Mode getMode() {
	
	return mode;
    }

    @Override
    public Presence getPresence() {
	
	return presence;
    }

}
