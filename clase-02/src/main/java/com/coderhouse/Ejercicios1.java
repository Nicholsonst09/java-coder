package com.coderhouse;

public class Ejercicios1 {
	public static void main(String[] args) {
		int [] intarray;
		intarray = new int [5];
		intarray [0] = 45;
		intarray [1] = 216;
		intarray [2] = 672;
		intarray [3] = 1;
		intarray [4] = 938;
		
		double suma = 0.0;
		int mayor;
		for (int i = 0; i < intarray.length;i++) {
			if (intarray[i] > intarray[i+1]) {
				mayor = intarray[i];
			}
			
			suma= suma + intarray[i];
		}
		double promedio = suma / 5;
		
		System.out.println("La suma de todos los elementos del arreglo es: " + promedio);
	}
}
