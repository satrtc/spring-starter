package com.sat_spring_rtc.BasicSpringConfigs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppBasicSpringConfigs {
public static void main(String[] args)
{
	
	var context=new AnnotationConfigApplicationContext(AppConfig.class);
//	var str=context.getBean("name");
//	System.out.println("User:"+str);
//	System.out.println("Age:"+context.getBean("age"));
//	System.out.println(context.getBean("address"));
	
	//person bean that uses other bean internally for its implementation
//	System.out.println(context.getBean("personDetails"));
	String beans[]=context.getBeanDefinitionNames();
	for (String beanName : beans) {
		System.out.println(beanName);
	}
}
}
