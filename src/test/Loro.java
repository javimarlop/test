package test;

public class Loro extends Ave {
	
	String region;
	String color;
	
	public Loro(String sexo , int edad, String region, String color){
		super(sexo,edad);
		this.region = region;
		this.color = color;
	}
	
	public void deDondeEres(){
		switch(this.region){
		case "N":
			System.out.println("Norte");
			break;
		case "S":
			System.out.println("Sur");
			break;
		case "E":
			System.out.println("Este");
			break;
		case "O":
			System.out.println("Oeste");
			break;
		}
	}
	
	public void deDondeEres(String region){
		switch(region){
		case "N":
			System.out.println("Norte");
			break;
		case "S":
			System.out.println("Sur");
			break;
		case "E":
			System.out.println("Este");
			break;
		case "O":
			System.out.println("Oeste");
			break;
		}
	}
	
	public void cantar(){
		System.out.println("Piiio-piiiio loro bonito");	
	}

}
