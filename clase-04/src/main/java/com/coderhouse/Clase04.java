package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {
	public static void main(String[] args) throws Exception {
		Perro perro1 = new Perro();

		try {

			perro1.setNombre("Junior");
			perro1.setColor("Negro");
			perro1.setTamano("Chico");
			perro1.setRaza("Caniche");
			perro1.setEdad(21);

			System.out.println("Perro: " + perro1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] razas = new String[] { "Chihuahua", "Caniche", "Dalmata", "Bull Dog", "Bull Terrier",
				"Ovejero Aleman" };
		
		
		double radio = 4d;		
		System.out.println("El área del círculo con radio " + radio + "\n es igual a " 
							+ calcularAreaCirculo(radio));

	}
	static final double PI;
	static final double PO;
	
	
	static {
		PI = 3.1415926535897932384626433832795; PO = 4.32;
	}
	
	private static double calcularAreaCirculo (double radio) {
		return PI * Math.pow(radio, 2);
	}
}
