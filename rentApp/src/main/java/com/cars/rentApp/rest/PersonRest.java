package com.cars.rentApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.rentApp.beans.Person;
import com.cars.rentApp.service.PersonService;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonRest implements PersonService {
	@Autowired
	private PersonService personService;

	@GetMapping("/")
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personService.findAll();
	}

}
