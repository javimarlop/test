package test;

public class Radio extends Aparato implements Hablador{

	boolean casette;
	int potencia;
	
	public Radio(double consumo, double precio, boolean casette, int potencia){
		super(consumo, precio);
		this.casette = casette;
		this.potencia = potencia;
	}
	public void hablar () {
		System.out.println("Hola, soy una RADIO y sé hablar");
	}
}
