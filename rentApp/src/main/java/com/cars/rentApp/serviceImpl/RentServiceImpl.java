package com.cars.rentApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.rentApp.beans.Rent;
import com.cars.rentApp.repository.RentRepository;
import com.cars.rentApp.service.RentService;

@Service
public class RentServiceImpl implements RentService {
	@Autowired
	private RentRepository RentRepository;

	@Override
	public List<Rent> findAll() {
		// TODO Auto-generated method stub
		return (List<Rent>) RentRepository.findAll();
	}
}
