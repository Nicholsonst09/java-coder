package com.coderhouse.inicio;

public class Clase01 {

	public static void main(String[] args) {
		
		//Calculadora
		
		float nro1 = 11.5f;
		float nro2 = 14.5f;
		float resultado;		
		
		resultado = nro1 + nro2;

		String frase = "La suma de nuestras edades es: ";
				
		resultado ++;		
		
		if (nro1 < nro2)
		{
			System.out.println(frase + resultado);
		}
		else 
		{
			System.out.println("El primer número debe ser menor al segundo");
		}
	}

}
