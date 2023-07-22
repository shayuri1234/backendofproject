package com.service;

import com.model.Payment;

public interface PaymentService {
	Payment savePayment(Payment payment);
//	  Payment getPaymentBid(int id);
	 // Payment updatePayment(Payment payment);
	// Payment deletePayment(int id);
	 
	//Payment update(Payment payment);
	//Payment displayPayment(int id);
	Payment getPaymentByid(int id);
}

