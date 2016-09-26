package test;

public class Lavadora extends Aparato{

	float alto;
	float ancho;
	
	public Lavadora(float consumo, float precio, float alto, float ancho){
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
		
	}
	
}
