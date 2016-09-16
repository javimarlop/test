package test;

public class Piolin extends Canario {

	int numPel;
	
	public Piolin(char sexo , int edad, float tamano, int numPel){
		super(sexo,edad,tamano);
		this.numPel = numPel;
	}
	
	public void cantar(){
		System.out.println("Pio-pio soy un Piolin");		
	}
}
