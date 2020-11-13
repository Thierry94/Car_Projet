package com.cars.rentApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.rentApp.beans.Car;
import com.cars.rentApp.repository.CarRepository;
import com.cars.rentApp.service.CarService;

@Service
public class CarServiceImp implements CarService {
	@Autowired
	private CarRepository carRepository;

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

	@Override
	public void rent(String PlateNumber,String louer) {
		// TODO Auto-generated method stub
		var car = carRepository.findByPlateNumber(PlateNumber);
		if (car != null && !car.getRented() && louer.equalsIgnoreCase("true")) {
			car.setRented(true);
			carRepository.save(car);
		}
	}

	@Override
	public void save(Car car) {
		carRepository.save(car);
		
	}

	@Override
	public void delete(Long id) {
		carRepository.deleteById(id);
	}
}
