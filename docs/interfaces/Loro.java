
public class Loro extends Ave 
				  implements Hablador {
	
	char region;
	String color;
	
	public Loro(char sexo, int etad, char region, String color) {
		super(sexo, etad);
		this.region = region;
		this.color = color;
	}
	

	public void hablar () {System.out.println("Hola, soy un Loro y sé hablar");
	}
	

}
