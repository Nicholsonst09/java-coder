package com.coderhouse;

import com.coderhouse.herencia.Gato;
import com.coderhouse.herencia.Perro;

public class Main {

	public static void main(String[] args) {
		Perro unPerro = new Perro();
		Gato unGato = new Gato();
		
		unPerro.setNombre("Firulai");
		unPerro.setEdad(4);
		unPerro.setMamifero(true);
		unPerro.setRaza("Caniche");
		unPerro.setAlimentacion("Alimento balanceado");
		
		System.out.println(unPerro);
		unPerro.comer();
		unPerro.caminar();
		unPerro.ladrar();
	}
}
