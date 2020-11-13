package com.cars.rentApp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeVehicule", discriminatorType = DiscriminatorType.STRING)
public abstract class Vehicule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String plateNumber;
	private String model;
	private Float price;
	private Boolean rented;
	@OneToMany(mappedBy = "vehicule", orphanRemoval = true)
	@JsonIgnore
	private List<Rent> rents = new ArrayList<Rent>();

	public Boolean getRented() {
		return rented;
	}

	public void setRented(Boolean rented) {
		this.rented = rented;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public List<Rent> getRents() {
		return rents;
	}

	public Vehicule(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public void setRents(List<Rent> rents) {
		this.rents = rents;
	}

	public Vehicule(long id, String plateNumber) {
		this.id = id;
		this.plateNumber = plateNumber;
	}

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

}
