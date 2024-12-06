package com.sat_spring_rtc.BasicSpringConfigs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String state, String city) {};
record Person(String name, int age) {};

@Configuration
public class AppConfig {

	
	@Bean(name="myname")
	@Primary
	public String name()
	{
		return "Hye you are talking to Satyam";
	}
	
	@Bean
	public int age()
	{
		return 23;
	}
	
	@Bean
	public Address address()
	{
		return new Address("UP", "Chitrakoot");
	}

	@Bean
	@Qualifier("name2.0")
	public String name2()
	{
		return "Hye you are talking to Satyam 2.0";
	}
	

	
	@Bean(name="personDetails")
	public Person person(String mname, int age)
	{
		return new Person(mname, age);
	}
	
}
