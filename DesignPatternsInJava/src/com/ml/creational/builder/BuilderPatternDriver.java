package com.ml.creational.builder;

public class BuilderPatternDriver {

    public static void main(String[] args) {

	User user = new User.UserBuilder(1010L, "Himanshu", 9898989898L)
		.forGender("Male")
		.forEmail("himanshu@example.com")
		.forPassword("passWord@123")
		.build();
	System.out.println(user.getId());
	System.out.println(user.getName());
	System.out.println(user.getGender());
	System.out.println(user.getPhone());
	System.out.println(user.getEmail());
	System.out.println(user.getPassword());
	System.out.println("\n****************************\n");
	System.out.println(user);
    }

}