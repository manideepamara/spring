package com.training.org;

import org.springframework.context.ApplicationListener;

public class UserEventProcessor implements ApplicationListener<EmployeeEvent>{

	@Override
	public void onApplicationEvent(EmployeeEvent event) {
		EmployeeEvent event1=(EmployeeEvent) event;
		System.out.println("event is "+event1.getEventType()+" name is "+event1.getEmployee());
	}
	
	
}
