package test;

public class Canario extends Ave {

	float tamano;
	boolean canta;
	
	public Canario(char sexo , int edad, boolean canta){
		super(sexo,edad);
		this.canta = canta;
	}
	
	public Canario(char sexo , int edad, float tamaño){
		super(sexo,edad);
		this.tamano = tamaño;
	}
	
	public void altura(float tamaño){
		if(tamano>30){
			System.out.println("Alto");
		}
		if(tamano<30 && tamano>15){
			System.out.println("Mediano");
		}
		if(tamaño<15){
			System.out.println("Bajo");
		}
	}
	
	public void altura(){
		if(this.tamano>=30){
			System.out.println("Alto");
		}
		if(this.tamano<30 && this.tamano>15){
			System.out.println("Mediano");
		}
		if(this.tamano<=15){
			System.out.println("Bajo");
		}
	}
	
	public void cantar(){
		
	}
}
