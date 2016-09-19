
public class Radio extends Aparato
				implements Hablador{
	
	boolean casette;
	double potencia;
	
	public Radio(double consumo, double precio, boolean casette, double potencia) {
		super(consumo, precio);
		this.casette = casette;
		this.potencia = potencia;
	}
	

	public void hablar () {System.out.println("Hola, soy una Radio y sé hablar");
	}
	

}
