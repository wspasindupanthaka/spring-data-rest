package com.pasindu.springdatarest.repository;

import com.pasindu.springdatarest.entity.Employee;
import com.pasindu.springdatarest.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author pasindu
 * @project jpa-example
 * @on 2020-01-01
 * @at 7:05 PM
 */
@RepositoryRestResource(collectionResourceRel = "review", path = "review")
public interface ReviewRepository extends JpaRepository<Review, Long>
{

}
