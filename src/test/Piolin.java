package test;

public class Piolin extends Canario {

	int numPel;
	
	public Piolin(String sexo , int edad, float tamaño, int numPel){
		super(sexo,edad,tamaño);
		this.numPel = numPel;
	}
	
	public void cantar(){
		System.out.println("Pio-pio soy un Piolín");		
	}
}
