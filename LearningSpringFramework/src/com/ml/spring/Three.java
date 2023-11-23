package com.ml.spring;

public class Three {

    private One one;
    private Two two;

    public Three(One one) {
	System.out.println("\nOne-parameterised constructor in One\n");
	this.one = one;
    }

    static {
	System.out.println("Static block in Three");
    }

    public void setTwo(Two two) {
	this.two = two;
    }

    @Override
    public String toString() {
	return "Three [one=" + one + ", two=" + two + "]";
    }

}
