package com.ml.pojo;

public abstract class Bank {
    
    private String name;
    private String ifsc;
    private String address;
    private int postalCode;
    private boolean swiftEnabled;
    
    public Account createAccount(Account ac) {
	return ac;
    }
}
