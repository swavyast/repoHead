package com.ml.creational.singleton;

public class SingletonClass {
    
    private long id;
    private String name;
    private String email;
    private String phone;
    private static final SingletonClass instance = new SingletonClass();
    
    private SingletonClass() {} 
    
    public static SingletonClass getInstance() {
	return instance;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
	return "SingletonClass [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }
    
}
