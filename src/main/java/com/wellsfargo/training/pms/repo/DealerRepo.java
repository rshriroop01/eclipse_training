package com.wellsfargo.training.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.training.pms.model.Dealer;

public interface DealerRepo extends JpaRepository<Dealer, Long> {

}
