package com.cars.rentApp.service;

import java.util.List;

import com.cars.rentApp.beans.Vehicule;

public interface VehiculeService {
 public List<Vehicule> findAll();
 public void save(Vehicule vehicule);
 public void delete(Long id);
}
