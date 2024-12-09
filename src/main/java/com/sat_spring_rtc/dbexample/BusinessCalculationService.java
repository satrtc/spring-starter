package com.sat_spring_rtc.dbexample;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BusinessCalculationService {
	
	
	public String toString()
	{
		return "This is business service";
	}
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		System.out.println("business calculation initialised");
		this.dataService=dataService;
	}
public int findMax()
{
	return Arrays.stream(dataService.retrieveData()).max().orElse(0);
}


}
