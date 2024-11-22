package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincremental
	private Long id;
	
	@Column(nullable = false)
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(       //Genero una tabla nueva que va a contener:
			name = "curso_alumno",  //Nombre de la nueva tabla 
			joinColumns = @JoinColumn(name = "curso_id"),    //ahora para unir las columnas indico que una columna va a ser esa
			inverseJoinColumns = @JoinColumn(name = "alumno_id")  //y esta va a ser la otra 
			)
	private List<Alumno> alumnos = new ArrayList<>();
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Categoria categoria;
	
	public Curso() {  //Es el constructor por defecto, le indico como quiero que se construya todo
		super();
	}	
	

	public Curso(String nombre, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
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


	public List<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}
}
