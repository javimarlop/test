package test;

public class Ave {

	String sexo;
	int edad;
	static int numAves;
	
	public Ave(String sexo , int edad){
		this.sexo = sexo;
		this.edad = edad;
		numAves+=1;
	}
	
	public static void numAves(){
		System.out.println(numAves);
	}
	
	public void quienSoy(){
		System.out.println(this.sexo);
		System.out.println(this.edad);
	}
}
