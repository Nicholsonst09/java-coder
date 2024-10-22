package ejercicios.objetos;

public class Animal {
	private String especie;
	private int edad;
	
	public void mostrarDatosAnimal() {
		System.out.println("El "+getEspecie()+" tiene como máximo "+ getEdad()+" años de edad.");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
}
