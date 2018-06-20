package com.java.people.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.java.people.entity.Person;

public interface PageableDao extends CrudRepository<Person, Integer> {

	List<Person> getByLname(String lname,Pageable pageable);

}
