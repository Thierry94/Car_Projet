package com.cars.rentApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.rentApp.beans.Van;
import com.cars.rentApp.repository.VanRepository;
import com.cars.rentApp.service.VanService;

@Service
public class VanServiceImpl implements VanService {
	@Autowired
	private VanRepository vanRepository;

	@Override
	public List<Van> findAll() {
		// TODO Auto-generated method stub
		return (List<Van>) vanRepository.findAll();
	}

	@Override
	public void rent(String plateNumber, String louer) {
		var van = vanRepository.findByPlateNumber(plateNumber);
		if (van != null && !van.getRented() && louer.equalsIgnoreCase("true")) {
			van.setRented(true);
			vanRepository.save(van);
		}
	}

	@Override
	public void save(Van van) {
		// TODO Auto-generated method stub
		vanRepository.save(van);
	}

	@Override
	public void delete(Long id) {
		vanRepository.deleteById(id);
		
	}

}
