package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Serv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String service;
	
	@OneToOne
	private Technician technician;
	
   @OneToOne
   private UserLogin log;
	
	public Serv(int id, String service, Technician technician, UserLogin log) {
	super();
	this.id = id;
	this.service = service;
	this.technician = technician;
	this.log = log;
	}


	public UserLogin getLog() {
	return log;
	}

	public void setLog(UserLogin log) {
	this.log = log;
	}


	public Serv() {
		super();
	}

	public Serv(int id, String service, Technician technician) {
		super();
		this.id = id;
		this.service = service;
		this.technician = technician;
	}


	public Serv(int id, String service) {
		super();
		this.id = id;
		this.service = service;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Technician getTechnician() {
		return technician;
	}

	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

}










