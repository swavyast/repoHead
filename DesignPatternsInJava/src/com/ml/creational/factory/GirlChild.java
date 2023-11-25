package com.ml.creational.factory;

public class GirlChild extends Female {
    
    private String name;
    private int age;
    private String complex;
    
    public GirlChild() {}
    protected GirlChild(String name, int age, String complex) {
	super();
	this.name = name;
	this.age = age;
	this.complex = complex;
    }
    @Override
    public String toString() {
	return "GirlChild [name=" + name + ", age=" + age + ", complex=" + complex + "]";
    }

}