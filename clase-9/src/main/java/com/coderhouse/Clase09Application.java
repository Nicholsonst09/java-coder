package com.coderhouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase09Application implements CommandLineRunner{
	
	@Autowired
	private DaoFactory dao;
	

	public static void main(String[] args) {
		SpringApplication.run(Clase09Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		try {
			Categoria cat1 = new Categoria("Programacion FrontEnd");
			Categoria cat2 = new Categoria("Programacion BackEnd");
			
			Curso curso1 = new Curso("HTML", cat1);
			Curso curso2 = new Curso("Rust", cat2);
			Curso curso3 = new Curso("Java", cat2);
			
			
			Alumno alumno1 = new Alumno("Nico", "Williams", 456432654, "L5432612");
			Alumno alumno2 = new Alumno("Victoria", "Flynn", 2438765, "L5432613");
			Alumno alumno3 = new Alumno("Peter", "Knofer", 89987313, "L5432614");
			
			
			dao.createCategoria(cat1);
			dao.createCategoria(cat2);
			
			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);
			
			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);	
			
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno1.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno3.getId());
			
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno3.getId());
			
			dao.inscribirAlumnoEnCurso(curso3.getId(), alumno2.getId());
		
//			dao.inscribirAlumnoEnCurso(curso4.getId(), alumno1.getId());
//			dao.inscribirAlumnoEnCurso(curso5.getId(), alumno3.getId());
			
			System.out.println("Mostrar lista de Categorias");
			List<Categoria> categorias = dao.getAllCategorias();
			categorias.forEach(categoria -> System.out.println(categoria.toString()));		
			System.out.println("----------------");
			
			System.out.println("Mostrar lista de cursos");
			List<Curso> cursos = dao.getAllCursos();
			cursos.forEach(curso -> System.out.println(curso.toString()));		
			System.out.println("----------------");
			
			System.out.println("Mostrar lista de todos los alumnos");
			List<Alumno> alumnos = dao.getAllAlumnos();
			alumnos.forEach(alumno -> System.out.println(alumno.toString()));		
			System.out.println("----------------");			
			
			
			System.out.println("Lista de Cursos con alumnos inscriptos:");
			cursos = dao.getAllCursos();
			cursos.forEach(curso -> {
				System.out.println("Curso: " + curso.getNombre());
				curso.getAlumnos().forEach(alumno -> 
						System.out.println("     Alumno Inscripto: " + alumno.getNombre() + " " + alumno.getApellido()));				
			});
			System.out.println("---------------");
			
		} catch (Exception e) { 
			e.printStackTrace(System.err);
		}
	}

}
