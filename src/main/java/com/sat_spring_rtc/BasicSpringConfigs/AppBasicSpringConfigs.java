package com.sat_spring_rtc.BasicSpringConfigs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppBasicSpringConfigs {
public static void main(String[] args)
{
	
	var context=new AnnotationConfigApplicationContext(AppConfig.class);
	var str=context.getBean("myname");
	System.out.println("User:"+str);
	System.out.println("Age:"+context.getBean("age"));
	System.out.println(context.getBean("address"));
	
	//person bean that uses other bean internally for its implementation
	System.out.println("Person Details:"+context.getBean("personDetails"));
	System.out.println(context.getBean(String.class));
//	String beans[]=context.getBeanDefinitionNames();
//	for (String beanName : beans) {
//		System.out.println(beanName);
//	}
}
}
