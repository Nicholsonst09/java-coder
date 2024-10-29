package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alumnos")
public class Alumno {
	@Id   //Indica que va a ser la Primary Key de la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Indica que va a ser autoincremental
	private Long id;
	
	
	private String nombre;
	private String apellido;
	@Column(unique = true, nullable = false)
	private String dni;
	@Column(unique = true, nullable = false)
	private String legajo;
	
	
	@ManyToMany(mappedBy = "alumnos",fetch = FetchType.EAGER) 
	
	private List<Curso> cursos = new ArrayList<>();

	
	
	private LocalDateTime createdAt = LocalDateTime.now();


	

	public Alumno() {
		super();
	}


	public Alumno(String nombre, String apellido, String dni, String legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getLegajo() {
		return legajo;
	}


	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo="
				+ legajo + ", cursos=" + cursos + ", createdAt=" + createdAt + "]";
	}
	
	
	
	

}
