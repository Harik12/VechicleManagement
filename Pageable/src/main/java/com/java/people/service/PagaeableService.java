package com.java.people.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.java.people.dao.PageableDao;
import com.java.people.entity.Person;
@Service
public class PagaeableService {
	@Autowired
	private PageableDao pageableDao;

	public List<Person> getByLname(String lname, PageRequest pageRequest) {
		
		return pageableDao.getByLname(lname, pageRequest) ;
	}

}
