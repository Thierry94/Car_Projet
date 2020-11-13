package com.cars.rentApp.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.rentApp.beans.MessageStorage;
import com.cars.rentApp.beans.Vehicule;
import com.cars.rentApp.jmsClient.JmsProducer;
import com.cars.rentApp.service.VehiculeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/vehicule")
public class VehiculeRest {
	@Autowired
	private VehiculeService vehiculeService;
	
	@Autowired
	  JmsProducer jmsProducer;
	  
	  @Autowired
	  private MessageStorage taskStorage;

	@GetMapping("/")
	public List<Vehicule> findAll() {
		return vehiculeService.findAll();
	}
	
	  
	  @GetMapping(value="/activemq-vehicules")
	  public List<Vehicule> getAll(){
	    List<Vehicule> tasks = new ArrayList<Vehicule>(taskStorage.getAll());
	    taskStorage.clear();
	    return tasks;
	  }
	  
	  @Transactional
	  @DeleteMapping("/{id}")
	  public void delete(@PathVariable Long id) {
		  vehiculeService.delete(id);
	  }

}
