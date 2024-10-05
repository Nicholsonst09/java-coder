package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		// Validar día de la semana usando if else if

		/*
		String nombreDelDia;

		switch (nroDia) {
		case 1:
			nombreDelDia = "Lunes";
			break;
		case 2:
			nombreDelDia = "Martes";
			break;
		case 3:
			nombreDelDia = "Miércoles";
			break;
		case 4:
			nombreDelDia = "Jueves";
			break;
		case 5:
			nombreDelDia = "Viernes";
			break;
		case 6:
			nombreDelDia = "Sábado";
			break;
		case 7:
			nombreDelDia = "Domingo";
			break;
		default:
			nombreDelDia = "Día inválido";
			break;

		}

		System.out.println("El día de la semana que correponde al "
				+ "número " + nroDia + " es " + nombreDelDia +".");
		
		int nroA = 1;
		int nroB = 2;
		
		boolean condicion = nroA > nroB;
		 */
		
		/*int nro1 = 107;
		int nro2 = 108;
		
		String mensaje = (nro1 > nro2) ? "El primer número es mayor al segundo" : "El primer número es menor al segundo.";
		
		System.out.println(mensaje);*/
		
		double min = 3.75d;
		double max = 120.9d;
		
		int rango = (int) max - (int) min + 1;
		
		int random = 0;
		
		random = (int) (Math.random() * rango) + (int) min; 
		
		System.out.println("El número generado es "+random);
		
		
	}

}
