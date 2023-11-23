package com.ml.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestingWithSpring {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
	One o= (One) context.getBean("one");	//accessing bean using assigned bean name.
	Two t= context.getBean(Two.class);	//accessing bean using class name.( confirms that the bean is created for the class itself )
	Three th= (Three)context.getBean("getThree");	//accessing bean using default bean name.
	
	System.out.println("\n**********************************************\n");
	System.out.println(o+"\n");
	System.out.println(t+"\n");
	System.out.println(th+"\n");

	System.out.println(context.containsBean("One"));	//false
	System.out.println(context.containsBean("two"));	//true
	System.out.println(context.containsBean("getThree"));	//true
    }

}
