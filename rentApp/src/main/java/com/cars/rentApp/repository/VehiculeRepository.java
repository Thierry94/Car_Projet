package com.cars.rentApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cars.rentApp.beans.Vehicule;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule,Long> {

}
