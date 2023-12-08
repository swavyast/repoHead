package com.ml.creational.abstractFactory.Classes;

public class Students {
    
    private long id;
    private String name;
    private double fee;
    private boolean noDues;
    private double balance;
    
    public Students() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public boolean isNoDues() {
        return noDues;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
	return "Students [id=" + id + ", name=" + name + ", fee=" + fee + ", noDues=" + noDues + ", balance=" + balance
		+ "]";
    }

}
