package com.sat_spring_rtc.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class YourBusinessClass {
	
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;
	
	public String toString() {
		return "Using: "+dependency1.printName()+ " and: "+dependency2;
	}

}

@Component
 class Dependency1{
	String printName() {
		return "Hello";
	}
}

@Component
class Dependency2{
	
}
