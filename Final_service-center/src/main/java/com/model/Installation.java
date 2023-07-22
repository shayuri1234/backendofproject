package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Installation {
	
	@OneToOne
	UserLogin userlogin;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String city;
	private long mobile;
	private int pincode;
	private String service;
	
	public Installation() {
		super();
	}

	public Installation(String name, String address, String city, long mobile, int pincode, String service,int id
			) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.mobile = mobile;
		this.pincode = pincode;
		this.service = service;
		this.id = id;
	}
	
	
	

	public Installation(UserLogin userlogin, int id, String name, String address, String city, long mobile, int pincode,
			String service) {
		super();
		this.userlogin = userlogin;
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.mobile = mobile;
		this.pincode = pincode;
		this.service = service;
	}

	public Installation(UserLogin userlogin, String name, String address, String city, long mobile, int pincode,
			String service) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.mobile = mobile;
		this.pincode = pincode;
		this.service = service;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserLogin getUserlogin() {
		return userlogin;
	}

	public void setUserlogin(UserLogin userlogin) {
		this.userlogin = userlogin;
	}

	
	
}