package com.cars.rentApp.jmsClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.cars.rentApp.beans.MessageStorage;
import com.cars.rentApp.beans.Vehicule;
import com.cars.rentApp.service.VehiculeService;



@Component
public class JmsConsumer {
 @Autowired
 private MessageStorage vehiculeStorage;
 @Autowired
 private VehiculeService vehiculeService;
 @JmsListener(destination = "${gkz.activemq.queue}", containerFactory="jsaFactory")
 public void receive(Vehicule vehicule){
	 vehiculeStorage.add(vehicule);
 }
}
