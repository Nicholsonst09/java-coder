package ejercicios.objetos;

public class Estudiante {
	private int califLengua;
	private int califMatematica;
	private int califGeografia;
	private String nombre;
	


	public void promediarMaterias() {
		float promedio = ((float)(getCalifGeografia()+(float)getCalifLengua()+(float)getCalifMatematica())/3);
		System.out.println("Estimado "+ getNombre() + " su calificación promedio es " + promedio +".");
	}
	
	
	public int getCalifLengua() {
		return califLengua;
	}
	public void setCalifLengua(int califLengua) {
		this.califLengua = califLengua;
	}
	public int getCalifMatematica() {
		return califMatematica;
	}
	public void setCalifMatematica(int califMatematica) {
		this.califMatematica = califMatematica;
	}
	public int getCalifGeografia() {
		return califGeografia;
	}
	public void setCalifGeografia(int califGeografia) {
		this.califGeografia = califGeografia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
