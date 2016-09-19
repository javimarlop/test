
public class tv extends Aparato
				implements Hablador{
	
	boolean teletexto;
	int antiguedad;
	
	public tv(double consumo, double precio, boolean teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}
	

	public void hablar () {System.out.println("Hola, soy una TV y sé hablar");
	}
	
	
	
	
	
	

}
