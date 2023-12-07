package com.ml.creational.builder;

public class User {
    
    private long id;
    private String name;
    private String gender;
    private long phone;
    private String email;
    private String password;
    
    private User(UserBuilder ub) {
	this.id=ub.id;
	this.name=ub.name;
	this.gender=ub.gender;
	this.phone=ub.phone;
	this.email=ub.email;
	this.password=ub.password;
    }
    
    public static class UserBuilder{
	
	    private long id;
	    private String name;
	    private String gender;
	    private long phone;
	    private String email;
	    private String password;
	    
	    public UserBuilder(long id, String name, long phone) {
		this.id=id;
		this.name=name;
		this.phone=phone;
	    }
	    
	    public UserBuilder forGender(String gender) {
		this.gender = gender;
		return this;
	    }
	    
	    public UserBuilder forEmail(String email) {
		this.email=email;
		return this;
	    }
	    
	    public UserBuilder forPassword(String password) {
		this.password=password;
		return this;
	    }
	    
	    public User build() {
		return new User(this);
	    }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", email=" + email
		+ ", password=" + password + "]";
    }

}
