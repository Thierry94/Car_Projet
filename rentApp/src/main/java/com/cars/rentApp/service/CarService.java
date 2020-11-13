package com.cars.rentApp.service;

import java.util.List;

import com.cars.rentApp.beans.Car;

public interface CarService {
 public List<Car> findAll();
 public void save(Car car);
 public void rent(String plateNumber,String loue);
 public void delete(Long id);
}
