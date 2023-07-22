package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
    private int id;
    private String type;
    private int amount;
    

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payment(int id, String type,int amount) {
		super();
		this.id = id;
		this.type = type;
		this.amount=amount;
	}
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
    

	@Override
	public String toString() {
		return "Payment [id=" + id + ", type=" + type + ",amount="+amount+"]";
	}
	
    
    
}
