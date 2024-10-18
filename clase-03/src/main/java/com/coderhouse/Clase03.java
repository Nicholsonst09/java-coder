package com.coderhouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clase03 {

	public static void main(String[] args) {
		/*
		 * int [] intarray; intarray = new int [15]; intarray[10] = 875; intarray[0] =
		 * 40; intarray[8] = 771; intarray[4] = 1025; intarray[14] = 251;
		 * 
		 * System.out.println("Elemento en el índice 10: " + intarray[10]);
		 * System.out.println("Elemento en el índice 0: " + intarray[0]);
		 * System.out.println("Elemento en el índice 8: " + intarray[8]);
		 * System.out.println("Elemento en el índice 4: " + intarray[4]);
		 * System.out.println("Elemento en el índice 15: " + intarray[14]);
		 */

		/*
		List<String> listaEstudiantes = new ArrayList();
		listaEstudiantes.add("Bruno");
		listaEstudiantes.add("Juan");
		listaEstudiantes.add("Pedro");
		listaEstudiantes.add("Marisa");
		listaEstudiantes.add("Lucía");
		listaEstudiantes.add("Patricia");
		listaEstudiantes.add("Rodrigo");
		listaEstudiantes.add("Penelope");

		Iterator<String> iterator = listaEstudiantes.iterator();
		
		System.out.println("Cantidad de estudiantes para iterar: " + listaEstudiantes.size());
		while (iterator.hasNext()) {
			String nombre = iterator.next();
			System.out.println("Nombre: " + nombre);
			iterator.remove();
		}
		System.out.println("Cantidad de estudiantes final:" + listaEstudiantes.size());
		*/
		int random = 0;
		random = (int) Math.random();
		System.out.println(random);
//		List<Integer> numeros = new ArrayList();
//		
//		
//		for (int i=0;i<9;i++) {
//			numeros.add(random);
//		}
//		
//		System.out.println("Lista");
//		for (int numero : numeros) {			
//			System.out.println("- " + numero);
//		}	
		
	}

}
