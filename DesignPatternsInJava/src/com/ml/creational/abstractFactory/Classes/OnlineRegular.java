package com.ml.creational.abstractFactory.Classes;

import com.ml.creational.abstractFactory.enums.Mode;
import com.ml.creational.abstractFactory.enums.Presence;
import com.ml.creational.abstractFactory.interfaces.Student;

public class OnlineRegular extends Students implements Student {

    private static final Mode mode = Mode.ONLINE;
    private static final Presence presence = Presence.REGULAR;

    public OnlineRegular() {
    }

    @Override
    public Mode getMode() {

	return mode;
    }

    @Override
    public Presence getPresence() {

	return presence;
    }

}
