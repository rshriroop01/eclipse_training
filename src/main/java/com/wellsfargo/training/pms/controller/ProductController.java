package com.wellsfargo.training.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.training.pms.model.Product;
import com.wellsfargo.training.pms.service.ProductService;

/*Spring RestController annotation is used to create RESTful web services using Spring MVC. 
 * Spring RestController takes care of mapping request data to the defined request handler method. 
 * Once response body is generated from the handler method, it converts it to JSON or XML response. 
 * 
 * @RequestMapping - maps HTTP request with a path to a controller 
 * */


/* ResponseEntity represents an HTTP response, including headers, body, and status.
 *  @RequestBody annotation automatically deserializes the JSON into a Java type
 *  */

//Open PostMan, make a POST Request - http://localhost:8085/pms/api/products/
//Select body -> raw -> JSON 
//Insert JSON product object.
@RestController
@RequestMapping(value="/api")
public class ProductController {
	@Autowired
	private ProductService pservice;
	
	@PostMapping("/products")
	public Product saveProduct(@Validated @RequestBody Product p) {
		
		Product p2=pservice.saveProduct(p);
		return p2;
		
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return pservice.listAll();
	}

}
