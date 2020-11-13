package com.cars.rentApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cars.rentApp.beans.Rent;

@Repository
public interface RentRepository extends CrudRepository<Rent,Long> {

}
