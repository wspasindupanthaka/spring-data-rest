package com.pasindu.springdatarest.config;

import com.pasindu.springdatarest.eventhandler.EmployeeEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pasindu
 * @project spring-data-rest
 * @on 2020-01-02
 * @at 10:11 PM
 */
@Configuration
public class RepositoryConfiguration
{

	@Bean
	EmployeeEventHandler personEventHandler()
	{
		return new EmployeeEventHandler();
	}
}
