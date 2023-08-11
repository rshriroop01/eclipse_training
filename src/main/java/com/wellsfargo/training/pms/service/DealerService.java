package com.wellsfargo.training.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.training.pms.model.Dealer;
import com.wellsfargo.training.pms.repo.DealerRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DealerService {
	@Autowired
	private DealerRepo drepo;
	public Dealer registerDealer(Dealer d) {
		return drepo.save(d);
	}

}
