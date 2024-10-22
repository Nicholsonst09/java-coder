package ejercicios;

import ejercicios.objetos.Animal;
import ejercicios.objetos.CuentaBancaria;
import ejercicios.objetos.Estudiante;
import ejercicios.objetos.Persona;

public class Ejercicios {
	public static void main(String[] args) {
	/*
	//Mostrando datos de Persona
		Persona persona1 = new Persona();
		
		try {
			persona1.setNombre("Peter");
			persona1.setEdad(17);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		persona1.mostrarDatos();
	 */
		
	//Mostrando datos de cuenta bancaria
		CuentaBancaria cb1 = new CuentaBancaria();
		try {
			cb1.setNroCuenta(290834);
			cb1.setSaldo(-918275);
			cb1.setTitular("William Wellington");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		cb1.mostrarDatosCuenta();
		cb1.mostrarDeudor();
		
		
		
		
	  //Mostrando animal 
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		try {
			animal1.setEspecie("Mamífero");
			animal1.setEdad(35);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			animal2.setEspecie("Ave");
			animal2.setEdad(3);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		animal1.mostrarDatosAnimal();
		animal2.mostrarDatosAnimal();
		
		Estudiante est1 = new Estudiante();
		try {
			est1.setCalifGeografia(9);
			est1.setCalifLengua(9);
			est1.setCalifMatematica(8);
			est1.setNombre("Roberto Petinato");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		est1.promediarMaterias();
	}
	
	
}
