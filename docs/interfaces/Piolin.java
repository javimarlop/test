
public class Piolin extends Canario
					implements Hablador{
	
	int NumPeli;

	public Piolin(char sexo, int etad, boolean canta, int numPeli) {
		super(sexo, etad, canta);
		NumPeli = numPeli;
	}
	
	public void hablar () {System.out.println("Hola, soy un Piolin y sé hablar");
	}
	
	

}
