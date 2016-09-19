
public class Alumno extends Persona 
					implements Hablador {
	
	String carrera;
	String curso;
	
	public Alumno(String nombre, int etad, String carrera, String curso) {
		super(nombre, etad);
		this.carrera = carrera;
		this.curso = curso;
	}
	
	public void hablar () {System.out.println("Hola, soy un Alumno y sé hablar");
	}
	
	

}
