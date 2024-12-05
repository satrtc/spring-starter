package com.sat_spring_rtc.BasicSpringConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String state, String city) {};

@Configuration
public class AppConfig {

	
	@Bean
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
}
