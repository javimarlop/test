package test;

public class Canario extends Ave {

	float tamano;
	boolean canta;
	
	public Canario(char sexo , int edad, boolean canta){
		super(sexo,edad);
		this.canta = canta;
	}
	
	public Canario(char sexo , int edad, float tamano){
		super(sexo,edad);
		this.tamano = tamano;
	}
	
	public void altura(float tamano){
		if(tamano>30){
			System.out.println("Alto");
		}
		if(tamano<30 && tamano>15){
			System.out.println("Mediano");
		}
		if(tamano<15){
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
