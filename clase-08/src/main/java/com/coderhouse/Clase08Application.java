package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner{
	
	@Autowired
	private DaoFactory dao;
	

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		try {
			Curso curso1 = new Curso("Solidity");
			Curso curso2 = new Curso("Rust");
			Curso curso3 = new Curso("Java");
			
			
			Alumno alumno1 = new Alumno("Nico", "Williams", "456432654", "L5432612");
			Alumno alumno2 = new Alumno("Victoria", "Flynn", "2438765", "L5432613");
			Alumno alumno3 = new Alumno("Peter", "Knofer", "89987313", "L5432614");
			
			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);
			
			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

}
