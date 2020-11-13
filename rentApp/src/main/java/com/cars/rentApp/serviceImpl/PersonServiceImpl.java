package com.cars.rentApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.rentApp.beans.Person;
import com.cars.rentApp.repository.PersonRepository;
import com.cars.rentApp.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return (List<Person>) personRepository.findAll();
	}

}
