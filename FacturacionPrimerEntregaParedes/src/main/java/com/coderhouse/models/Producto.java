package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {
	@Id   //Indica que va a ser la Primary Key de la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Indica que va a ser autoincremental
	private Long id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Marca")
	private String marca;
	
	@Column(name = "Precio menor", nullable = false)
	private double precio;
	
	

	public Producto() {
		super();
	}	
	

	public Producto(String nombre, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	//Ver despues si se agrega precio mayor si existe, rubro, fecha de creacion
	
	
	
	
}
