package test;

public class Canario extends Ave {

	float tamaño;
	
	public Canario(String sexo , int edad){
		super(sexo,edad);
	}
	
	public Canario(String sexo , int edad, float tamaño){
		super(sexo,edad);
		this.tamaño = tamaño;
	}
	
	public void altura(float tamaño){
		if(tamaño>30){
			System.out.println("Alto");
		}
		if(tamaño<30 && tamaño>15){
			System.out.println("Mediano");
		}
		if(tamaño<15){
			System.out.println("Bajo");
		}
	}
	
	public void altura(){
		if(this.tamaño>=30){
			System.out.println("Alto");
		}
		if(this.tamaño<30 && this.tamaño>15){
			System.out.println("Mediano");
		}
		if(this.tamaño<=15){
			System.out.println("Bajo");
		}
	}
	
	public void cantar(){
		
	}
}
