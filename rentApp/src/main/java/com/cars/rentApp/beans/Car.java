package com.cars.rentApp.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("car")
public class Car extends Vehicule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int numbreOfSeats;
	public Car(long id, int numbreOfSeats) {
		this.id = id;
		this.numbreOfSeats = numbreOfSeats;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String plateNumber, int numbreOfSeats) {
		super(plateNumber);
		this.numbreOfSeats = numbreOfSeats;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumbreOfSeats() {
		return numbreOfSeats;
	}
	public void setNumbreOfSeats(int numbreOfSeats) {
		this.numbreOfSeats = numbreOfSeats;
	}
	
	
}
