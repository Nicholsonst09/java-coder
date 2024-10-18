package com.coderhouse.objetos;

public class Perro {
	
		private static final int EDAD_MAXIMA = 20;
	
		private String nombre;
		private String raza;
		private String color;
		private String tamano;
		private int edad;
		
		String mjeError = "El perro no vive más de " +EDAD_MAXIMA+" años";
		//Metodos
		public void ladrar() {
			System.out.println("El perro "+ getNombre()+" está ladrando!");
		}
		
		public void correr() {
			System.out.println("El perro "+ getNombre()+" está corriendo!");			
		}

		//Getters y setters
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


		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getTamano() {
			return tamano;
		}

		public void setTamano(String tamano) {
			this.tamano = tamano;
		}
		
		public int getEdad() {
			return edad;
		}
		
		public void setEdad(int edad) throws Exception{ 
			if (edad > EDAD_MAXIMA) {	
				throw new Exception (mjeError);
			}else {
				this.edad = edad;		
				
			}
		}

		@Override
		public String toString() {
			return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", edad="
					+ edad + "]";
		}	
		
		
}
