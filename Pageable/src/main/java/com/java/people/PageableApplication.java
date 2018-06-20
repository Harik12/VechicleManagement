package com.java.people;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.java.people.entity.Person;
import com.java.people.service.PagaeableService;

@SpringBootApplication
public class PageableApplication implements CommandLineRunner {
	
	@Autowired
	private PagaeableService pagaeableService;

	public static void main(String[] args) {
		SpringApplication.run(PageableApplication.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		getByLname();
		
	}

	@SuppressWarnings("deprecation")
	private void getByLname() {
		List<Person> list =pagaeableService.getByLname("l",new PageRequest(0, 6, Direction.ASC, "lname"));
		list.forEach(System.out::println);
		
		
	}
	
}
