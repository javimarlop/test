package test;

public class Profesor extends Persona implements Hablador{
	
	int despacho;
	String email;
	
	public Profesor(String nombre, int edad, int despacho, String email){
		super(nombre,edad);
		this.despacho = despacho;
		this.email = email;
	}

	public void hablar () {}
	
}
