package test;

public class Bedel extends Persona implements Hablador{

	String turno;
	int antiguedad;
	
	public Bedel(String nombre, int edad, String turno, int antiguedad){

		super(nombre,edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
		
	}
	
	public void hablar () {
		System.out.println("Hola, soy una Bedel y se hablar");
	}
	
}
