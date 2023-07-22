package com.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Technician {
	
	@Id
	private int tid;
	private String tname;
	private String temail;
	
	private String tspecialization;
	

	@OneToOne
	private Payment payment;
	

	public Technician(int tid, String tname, String temail, String tspecialization, Payment payment) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.temail = temail;
		this.tspecialization = tspecialization;
		this.payment = payment;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Technician() {
		super();
	}

	public Technician(int tid, String tname, String temail,  String tspecialization) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.temail = temail;
		this.tspecialization = tspecialization;
	}

	@Override
	public String toString() {
		return "Technician [tid=" + tid + ", tname=" + tname + ", temail=" + temail + ", tspecialization="
				+ tspecialization + "]";
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	
	public String getTspecialization() {
		return tspecialization;
	}

	public void setTspecialization(String tspecialization) {
		this.tspecialization = tspecialization;
	}

	
	
	
}

