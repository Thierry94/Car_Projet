package com.cars.rentApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cars.rentApp.beans.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
