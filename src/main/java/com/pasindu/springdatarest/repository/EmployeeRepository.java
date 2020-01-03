package com.pasindu.springdatarest.repository;

import com.pasindu.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * @author pasindu
 * @project jpa-example
 * @on 2020-01-01
 * @at 7:05 PM
 */
@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
	@RestResource(path = "/nameStartsWith", rel = "/nameStartsWith")
	List<Employee> findByNameStartsWith(@Param("name") String name);
	//http://localhost:8080/employee/search/nameStartsWith?name=Pasindu

}
