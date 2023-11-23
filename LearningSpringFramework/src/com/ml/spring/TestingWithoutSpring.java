package com.ml.spring;

public class TestingWithoutSpring {

    public static void main(String[] args) {

	System.out.println("\nMain method in TestingWithoutSpring\n");
	One one = new One();
	one.setId(100);
	one.setName("Himanshu");
	one.setAge(1000);
	one.setEmail("noemail@email.com");
	one.setPhone(1234567890L);
	System.out.println(one + "\n");

	Two two = new Two();
	two.setId(200);
	two.setName("Hemant");
	two.setAge(2000);
	two.setEmail("official@email.com");
	two.setPhone(6789123450L);
	System.out.println(two + "\n");

	Three three = new Three(one);
	three.setTwo(two);

	System.out.println(three);
    }

}
