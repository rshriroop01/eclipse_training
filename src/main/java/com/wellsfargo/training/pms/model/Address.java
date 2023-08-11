package com.wellsfargo.training.pms.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long addressId;
	
	private @NonNull String street;
	private @NonNull String city;
	private @NonNull int pincode;
	
	/*
     * Modeling with foreign key relationship in JPA.
     * Place @OneToOne on the primary class entity field Dealer.
     * Place @JoinColumn to configure foreign key column dealer_id in the Address class that maps to the primary key
     * column of Dealer class. 
     */
	@OneToOne
	@JoinColumn(name="dealer_id")
	private Dealer dealer;
	
	
}
