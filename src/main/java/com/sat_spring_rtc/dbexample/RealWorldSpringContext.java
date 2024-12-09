package com.sat_spring_rtc.dbexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContext {

	public static void main(String[] args)
	{
		var context=new AnnotationConfigApplicationContext(RealWorldSpringContext.class);
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
	}
}