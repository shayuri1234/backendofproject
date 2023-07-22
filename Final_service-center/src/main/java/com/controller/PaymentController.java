package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Payment;
import com.service.PaymentService;

@RestController

public class PaymentController {

	   @Autowired
	  PaymentService paymentserv;
	  
		@PostMapping("/savepayment")
		public Payment savePayment(@RequestBody Payment payment) {
	      return  paymentserv.savePayment(payment);
		
	    }
		
		@GetMapping("getpayment/{id}")
		public Payment getPaymentByid(int id) {
			// TODO Auto-generated method stub
			return paymentserv.getPaymentByid(id);
		}


		/*@PutMapping("/update")
		public Payment updatePayment(Payment payment) {
			// TODO Auto-generated method stub
			return paymentserv.updatePayment(payment);
		}*/

		/*@DeleteMapping("/delete{id}")
		public Payment deletePayment(int id) {
			// TODO Auto-generated method stub
			return paymentserv.deletePayment(id);
		}*/

		/*@Mapping("display/{id}")
		public Payment displayPayment(int id) {
			// TODO Auto-generated method stub
			return paymentserv.displayPayment(id);
		}*/

}

