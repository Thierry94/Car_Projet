package com.cars.rentApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cars.rentApp.beans.Vehicule;
import com.cars.rentApp.repository.VehiculeRepository;
import com.cars.rentApp.service.VehiculeService;

@Service
public class VehiculeServiceImpl implements VehiculeService{
@Autowired
private VehiculeRepository vehiculeRepository;

@Override
public List<Vehicule> findAll() {
	// TODO Auto-generated method stub
	return (List<Vehicule>) vehiculeRepository.findAll();
	
}

@Override
public void save(Vehicule vehicule) {
	// TODO Auto-generated method stub
	vehiculeRepository.save(vehicule);
}
@Override
public void delete(Long id) {
	vehiculeRepository.deleteById(id);
}


}
