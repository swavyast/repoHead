package com.ml.creational.factory;

public class MaleChild extends Male {
    
    private String name;
    private int age;
    private String complex;
    
    public MaleChild() {}

    protected MaleChild(String name, int age, String complex) {
	super();
	this.name = name;
	this.age = age;
	this.complex = complex;
    }

    @Override
    public String toString() {
	return "MaleChild [name=" + name + ", age=" + age + ", complex=" + complex + "]";
    }
    
}