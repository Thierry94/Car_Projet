package com.cars.rentApp.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date beginRent;
	private Date endRent;
	@ManyToOne
	private Person person;
	@ManyToOne
	private Vehicule vehicule;
	
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Rent(Date beginRent, Date endRent, Person person) {
		this.beginRent = beginRent;
		this.endRent = endRent;
		this.person = person;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Rent(long id, Date beginRent, Date endRent) {
		this.id = id;
		this.beginRent = beginRent;
		this.endRent = endRent;
	}
	public Rent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getBeginRent() {
		return beginRent;
	}
	public void setBeginRent(Date beginRent) {
		this.beginRent = beginRent;
	}
	public Date getEndRent() {
		return endRent;
	}
	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}

   
}
