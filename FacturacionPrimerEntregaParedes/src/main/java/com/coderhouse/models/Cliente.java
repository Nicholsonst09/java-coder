package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {
	@Id   //Indica que va a ser la Primary Key de la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Indica que va a ser autoincremental
	private Long id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Domicilio")
	private String domicilio;
	
	@Column(name = "Teléfono")
	private String telefono;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Cuit", unique = true, nullable = false)
	private String cuit;
	

	public Cliente() {
		super();
	}	
	

	public Cliente(String nombre, String domicilio, String telefono, String email, String cuit) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
		this.cuit = cuit;
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono
				+ ", email=" + email + ", cuit=" + cuit + "]";
	}	
	

}
