package test;

public class Piolin extends Canario {

	int numPel;
	
	public Piolin(String sexo , int edad, float tama�o, int numPel){
		super(sexo,edad,tama�o);
		this.numPel = numPel;
	}
	
	public void cantar(){
		System.out.println("Pio-pio soy un Piol�n");		
	}
}
