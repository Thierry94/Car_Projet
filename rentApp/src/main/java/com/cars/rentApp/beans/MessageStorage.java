package com.cars.rentApp.beans;

import java.util.ArrayList;
import java.util.List;
 
public class MessageStorage {
  private List<Vehicule> vehicules = new ArrayList<Vehicule>();
  
  public void add(Vehicule vehicule) {
	  vehicules.add(vehicule);
  }
  
  public void clear() {
	  vehicules.clear();
  }
  
  public List<Vehicule> getAll(){
    return vehicules;
  }
}