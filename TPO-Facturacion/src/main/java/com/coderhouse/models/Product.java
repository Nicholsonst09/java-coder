package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Brand")
	private String marca;
	
	@Column(name = "Retail_Price", nullable = false)
	private double price;

	public Product() {
		super();
	}

	public Product(String name, String marca, double price) {
		super();
		this.name = name;
		this.marca = marca;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", marca=" + marca + ", price=" + price + "]";
	}	
	
}
