package ejercicios.objetos;

public class Persona {
	private String nombre;
	private int edad;
	
	public void mostrarDatos() {
		int edad = getEdad();
		if (edad >= 18) {
			System.out.println(getNombre()+" tiene "+ getEdad()+ " años de edad.");		
		}else {
			System.out.println(getNombre()+" no cumple con la mayoría de edad.");					
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
