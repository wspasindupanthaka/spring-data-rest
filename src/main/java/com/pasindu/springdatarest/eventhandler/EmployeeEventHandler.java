package com.pasindu.springdatarest.eventhandler;

import com.pasindu.springdatarest.entity.Employee;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

/**
 * @author pasindu
 * @project spring-data-rest
 * @on 2020-01-02
 * @at 10:05 PM
 */
@Component
@RepositoryEventHandler
public class EmployeeEventHandler
{
	@HandleBeforeCreate
	public void handleEmployeeSave(Employee e) {
		System.out.println("This is called");
		e.setName( "Overriding Name" );
	}


}
