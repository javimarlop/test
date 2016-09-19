
public class Profesor extends Persona
							   implements Hablador{
	
	int despacho;
	String email;
	
	public Profesor(String nombre, int etad, int despacho, String email) {
		super(nombre, etad);
		this.despacho = despacho;
		this.email = email;
	}
	

	public void hablar () {System.out.println("Hola, soy un Profesor y sé hablar");
	}
	

}
