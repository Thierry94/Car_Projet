package com.cars.rentApp.jmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.cars.rentApp.beans.Vehicule;
 
@Component
public class JmsProducer {
  @Autowired
  JmsTemplate jmsTemplate;
  
  @Value("${gkz.activemq.queue}")
  String queue;
  
  public void send(Vehicule vehicule){
	
    jmsTemplate.convertAndSend(queue, vehicule);
  }
}