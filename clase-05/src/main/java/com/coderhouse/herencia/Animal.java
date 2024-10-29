package com.coderhouse.herencia;

public class Animal {
	
	private String nombre;
	private String raza;
	private int edad;
	private boolean mamifero;
	private String alimentacion;
	
	public void caminar() {
		System.out.println(getNombre() +" está caminando!");
	}
	
	public void comer() {
		System.out.println(getNombre() +" está comiendo!");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMamifero() {
		return mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", mamifero=" + mamifero
				+ ", alimentacion=" + alimentacion + "]";
	}
	
	
}
