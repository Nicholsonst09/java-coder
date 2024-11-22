package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sales")
public class Sale {
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	
	@Column(name = "Total", nullable = false)
	private double total;
	
	@Column(name = "Store")
	private String store;
	
	@ManyToOne
	@JoinColumn(name = "product_id",referencedColumnName = "id", nullable = false)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "client_id",referencedColumnName = "id", nullable = false)
	private Client client;

	public Sale() {
		super();
	}

	public Sale(double total, String store, Product product, Client client) {
		super();
		this.total = total;
		this.store = store;
		this.product = product;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", total=" + total + ", store=" + store + ", product=" + product + ", client="
				+ client + "]";
	}	
	
}
