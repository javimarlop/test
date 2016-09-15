package test;

public class Canario extends Ave {

	float tama�o;
	
	public Canario(String sexo , int edad){
		super(sexo,edad);
	}
	
	public Canario(String sexo , int edad, float tama�o){
		super(sexo,edad);
		this.tama�o = tama�o;
	}
	
	public void altura(float tama�o){
		if(tama�o>30){
			System.out.println("Alto");
		}
		if(tama�o<30 && tama�o>15){
			System.out.println("Mediano");
		}
		if(tama�o<15){
			System.out.println("Bajo");
		}
	}
	
	public void altura(){
		if(this.tama�o>=30){
			System.out.println("Alto");
		}
		if(this.tama�o<30 && this.tama�o>15){
			System.out.println("Mediano");
		}
		if(this.tama�o<=15){
			System.out.println("Bajo");
		}
	}
}
