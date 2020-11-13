package com.cars.rentApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cars.rentApp.beans.Car;
import com.cars.rentApp.beans.Vehicule;
import com.cars.rentApp.jmsClient.JmsProducer;
import com.cars.rentApp.service.CarService;

@RestController
@CrossOrigin
@RequestMapping("/cars")
public class CarRest {
    @Autowired
    private CarService carService;
    @Autowired
	  JmsProducer jmsProducer;
    @GetMapping("/")
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carService.findAll();
	}
	@PutMapping("/{plateNumber}")
	public void rent(@PathVariable String plateNumber,@RequestParam String louer) {
		// TODO Auto-generated method stub
		carService.rent(plateNumber,louer);
		
	}

	@PostMapping(value="/save")
	public void save(@RequestBody Car car) {
		carService.save(car);		
	}
	

	@PostMapping(value="/activemq-save")
	  public Vehicule postCustomer(@RequestBody Car  car){
		carService.save(car);
	    jmsProducer.send(car);
	    return car;
	  }
	
	 @Transactional
	  @DeleteMapping("/{id}")
	  public void delete(@PathVariable Long id) {
		  carService.delete(id);
	  }


}
