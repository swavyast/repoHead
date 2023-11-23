package com.ml.spring;

public class One {

    private int id;
    private String name;
    private int age;
    private String email;
    private long phone;

    public One() {

	System.out.println("\nDefault constructor in One\n");
    }

    public One(int id, String name, int age, String email, long phone) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.email = email;
	this.phone = phone;
    }

    static {
	System.out.println("Static block in One");
    }

    public void setId(int id) {
	this.id = id;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public void setPhone(long phone) {
	this.phone = phone;
    }

    @Override
    public String toString() {
	return "One [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + "]";
    }

}
