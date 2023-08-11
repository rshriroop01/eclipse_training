package com.wellsfargo.training.pms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* The @Entity annotation specifies that the class is an entity and 
 * is mapped to a database table.*/
@Entity
public class Product {
	/*The @Id annotation specifies the primary key of an entity and the @GeneratedValue provides for 
	 * the specification of generation strategies for the values of primary keys. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pid;
	private String name;
	private String brand;
	private String madein;
	private float price;
	public Product() {
		
		
		// TODO Auto-generated constructor stub
	}
	public Product(Long pid, String name, String brand, String madein, float price) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getmadein() {
		return madein;
	}
	public void setmadein(String madein) {
		this.madein = madein;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	
	

}
