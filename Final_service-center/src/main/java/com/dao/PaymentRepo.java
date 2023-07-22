package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.model.Admin;
import com.model.Payment;


public interface PaymentRepo  extends JpaRepository<Payment, Integer> {

	Payment getPaymentById(int id);

	//Payment updatePayment(Payment payment);

	//Payment updatePayment(Payment payment);

	//Payment deletePayment(int id);
	
	//Payment displaypayment(int id);

}
