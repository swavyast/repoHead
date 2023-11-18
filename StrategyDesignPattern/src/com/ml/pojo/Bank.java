package com.ml.pojo;

public abstract class Bank {
    
    private String name;
    
    public Account createAccount(Account ac) {
	return ac;
    }
}
