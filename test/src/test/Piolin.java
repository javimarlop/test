package test;

public class Piolin extends Canario implements Hablador{

	int numPel;
	
	public Piolin(char sexo , int edad, float tamano, int numPel){
		super(sexo,edad,tamano);
		this.numPel = numPel;
	}
	
	public Piolin(char sexo , int edad, boolean canta, int numPel){
		super(sexo,edad,canta);
		this.numPel = numPel;
	}
	
	public void cantar(){
		System.out.println("Pio-pio soy un Piolin");		
	}
	
	public void hablar () {
		System.out.println("Hola, soy un Piolin y se hablar");
	}
}
