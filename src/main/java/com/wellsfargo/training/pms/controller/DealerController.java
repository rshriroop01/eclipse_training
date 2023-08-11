package com.wellsfargo.training.pms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.training.pms.model.Address;
import com.wellsfargo.training.pms.model.Dealer;
import com.wellsfargo.training.pms.model.DealerAddress;
import com.wellsfargo.training.pms.service.DealerService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value="/api")

public class DealerController {
	
	@Autowired
	private DealerService dservice;
	@PostMapping("/dealers")
	public Dealer createDealer(@Validated @RequestBody Dealer dealer){
		
		
		Dealer d=new Dealer();
		d.setEmail(dealer.getEmail());
		d.setFname(dealer.getFname());
		d.setLname(dealer.getLname());
		d.setPassword(dealer.getPassword());
		d.setDob(dealer.getDob());
		d.setPhoneNo(dealer.getPhoneNo());
		
		Address a=new Address();
		a.setStreet(dealer.getAddress().getStreet());
		a.setCity(dealer.getAddress().getCity());
		a.setPincode(dealer.getAddress().getPincode());
		d.setAddress(a);
		a.setDealer(d);
		
		
		
		final Dealer  newDealer=dservice.registerDealer(dealer);
		return dealer;
		
	}

}
