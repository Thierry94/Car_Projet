package com.cars.rentApp.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("van")
public class Van  extends Vehicule{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int maxWeight;
	public Van(long id, int maxWeight) {
		this.id = id;
		this.maxWeight = maxWeight;
	}
	public Van() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Van(String plateNumber, int maxWeight) {
		super(plateNumber);
		this.maxWeight = maxWeight;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
}
