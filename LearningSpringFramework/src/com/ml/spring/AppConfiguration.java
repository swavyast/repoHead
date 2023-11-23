package com.ml.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		//marks this class as configuration class.
public class AppConfiguration {
    
    @Bean("one")	//marks this class(One) as a Bean.
    public One getOne() {
	One o=new One();
	o.setName("Himanshu");
	return o;
    }
    
    @Bean("two")
    public Two getTwo() {
	Two tw=new Two();
	tw.setName("Hemant");
	return tw;
    }
    
    @Bean
    public Three getThree() {
	Three th=new Three(getOne());
	th.setTwo(getTwo());
	return th;
    }

}
