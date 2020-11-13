package com.cars.rentApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cars.rentApp.beans.MessageStorage;
 
 
@Configuration
public class BeanConfiguration {
 
  @Bean
  public MessageStorage customerStorage() {
    return new MessageStorage();
  }
}