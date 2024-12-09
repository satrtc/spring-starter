package com.sat_spring_rtc.dbexample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

	public MongoDbDataService() {
		System.out.println("mongo initialised");
	}
	@Override
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55};
	}

}
