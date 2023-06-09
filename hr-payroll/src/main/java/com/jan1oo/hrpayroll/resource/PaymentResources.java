package com.jan1oo.hrpayroll.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jan1oo.hrpayroll.entities.Payment;
import com.jan1oo.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResources {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId,@PathVariable Integer days){
		Payment payment = paymentService.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
	
}
