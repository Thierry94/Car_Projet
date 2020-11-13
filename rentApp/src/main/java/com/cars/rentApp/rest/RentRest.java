package com.cars.rentApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.rentApp.beans.Rent;
import com.cars.rentApp.service.RentService;

@RestController
@CrossOrigin
@RequestMapping("/rent")
public class RentRest implements RentService {
	@Autowired
	private RentService rentService;

	@GetMapping("/")
	public List<Rent> findAll() {
		// TODO Auto-generated method stub
		return rentService.findAll();
	}

}
