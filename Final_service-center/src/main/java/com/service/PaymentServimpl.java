package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PaymentRepo;
import com.model.Payment;


@Service
public class PaymentServimpl implements PaymentService {

	  @Autowired
	  PaymentRepo paymentrepo;
	
	@Override
	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentrepo.save(payment);
	}

	@Override
	public Payment getPaymentByid(int id) {
		// TODO Auto-generated method stub
		return paymentrepo.getPaymentById(id);
	}

	/*@Override
	public Payment updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentrepo.(payment);
	}*/

	/*@Override
	public Payment displayPayment(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	/*@Override
	public Payment updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentrepo.updatePayment(payment);
	}*/

	/*
	@Override
	public Payment deletePayment(int id) {
		// TODO Auto-generated method stub
		return paymentserv.deletePayment(id);
	}

	@Override
	public Payment displayPayment(int id) {
		// TODO Auto-generated method stub
		return paymentrepo.displaypayment(id);
	}*/

	
}
