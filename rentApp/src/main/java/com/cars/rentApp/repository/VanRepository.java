package com.cars.rentApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cars.rentApp.beans.Van;

@Repository
public interface VanRepository extends CrudRepository<Van, Long> {

	public Van  findByPlateNumber(String plateNumber);

}
