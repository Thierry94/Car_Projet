package com.cars.rentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.rentApp.beans.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
  public Car findByPlateNumber(String PlateNumber);
}
