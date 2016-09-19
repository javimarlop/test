
public class Bedel extends Persona
					implements Hablador {
	
	int turno;
	int antiguedad;
	public Bedel(String nombre, int etad, int turno, int antiguedad) {
		super(nombre, etad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}
	
	public void hablar () {System.out.println("Hola, soy un Bedel y sé hablar" + ", mi turno es " + this.turno);
	}

}
