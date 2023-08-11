package com.wellsfargo.training.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.training.pms.model.Product;
import com.wellsfargo.training.pms.repo.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
/*
 * A service layer is an additional layer in an MVC application that 
 * mediates communication between a controller and repository layer. 
 * The service layer contains business logic. 
 * In particular, it contains validation logic. */

/* @Service annotation allows developers to add business functionalities.
 *  @Transactional annotation allows to manage Database transactions efficiently */

public class ProductService {


	@Autowired
	private ProductRepo prepo;
	public Product saveProduct(Product p){
		return prepo.save(p);
		}
		
	public List<Product> listAll(){
		return prepo.findAll();
	}
}
