package com.ml.creational.abstractFactory;

import com.ml.creational.abstractFactory.interfaces.ModeOfEducation;
import com.ml.creational.abstractFactory.interfaces.TypeOfStudent;

public class Student {

    private long id;
    private String name;
    private double fee;
    private boolean noDues;
    private double balance;
    private ModeOfEducation moe;
    private TypeOfStudent tos;

    public Student() {}
    public Student(long id, String name, double fee, boolean noDues, double balance, ModeOfEducation moe,
	    TypeOfStudent tos) {
	this.id = id;
	this.name = name;
	this.fee = fee;
	this.noDues = noDues;
	this.balance = balance;
	this.moe = moe;
	this.tos = tos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public boolean isNoDues() {
        return noDues;
    }

    public void setNoDues(boolean noDues) {
        this.noDues = noDues;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ModeOfEducation getMoe() {
        return moe;
    }

    public void setMoe(ModeOfEducation moe) {
        this.moe = moe;
    }

    public TypeOfStudent getTos() {
        return tos;
    }

    public void setTos(TypeOfStudent tos) {
        this.tos = tos;
    }

    @Override
    public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", noDues=" + noDues + ", balance=" + balance
		+ ", moe=" + moe + ", tos=" + tos + "]";
    }

}
