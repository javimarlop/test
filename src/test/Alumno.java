package test;

public class Alumno extends Persona implements Hablador {

	String carrera;
	int curso;
	
	public Alumno(String nombre, int edad, String carrera, int curso){
		super(nombre,edad);
		this.carrera = carrera;
		this.curso = curso;
	}
	
	//public void hablar () {}
	public void hablar () {
		System.out.println("Hola, soy una Alumno y sé hablar");
	}
}
