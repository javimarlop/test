package test;

public class Loro extends Ave {
	
	private char region;
	String color;
	
	public Loro(char sexo , int edad, char region, String color){
		super(sexo,edad);
		//this.region = region; //wrong since it is private
		setRegion(region);
		this.color = color;
	}

	public void deDondeEres() {

		// can use case/break syntax, more efficient
		if (region == 'N') {
			System.out.println("Nord");
		}
		if (region == 'S') {
			System.out.println("Sud");
		}
		if (region == 'W') {
			System.out.println("West");
		}
		if (region == 'E') {
			System.out.println("East");
		} else {
			System.out.println("Unknown");
		}
	}

	public void setRegion(char region) {
		if (region != 'N' && region != 'S' && region != 'W' && region != 'E') {
			System.out.println("not a valid region");
		} else {
			this.region = region;
		}
	}// look at the colors if in doubt with "this"

	public char getRegion() {
		return this.region;
	}
	
//	public void deDondeEres(){
//		switch(this.region){
//		case 'N':
//			System.out.println("Norte");
//			break;
//		case 'S':
//			System.out.println("Sur");
//			break;
//		case 'E':
//			System.out.println("Este");
//			break;
//		case 'O':
//			System.out.println("Oeste");
//			break;
//		}
//	}
	
	public void deDondeEres(char region){
		switch(region){
		case 'N':
			System.out.println("Norte");
			break;
		case 'S':
			System.out.println("Sur");
			break;
		case 'E':
			System.out.println("Este");
			break;
		case 'O':
			System.out.println("Oeste");
			break;
		}
	}
	
	@Override
	public void cantar(){
		System.out.println("Piiio-piiiio loro bonito");	
	}

}
