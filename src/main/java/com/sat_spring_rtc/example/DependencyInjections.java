package com.sat_spring_rtc.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class DependencyInjections {
	public static void main(String[] args)
	{
		var context=new AnnotationConfigApplicationContext(YourBusinessClass.class);
		System.out.println(context.getBean(YourBusinessClass.class));
	}
}
