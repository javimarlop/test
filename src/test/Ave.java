package test;

public abstract class Ave {

	String sexo;
	int edad;
	static int numAves;
	DatosPersonales nombres;
	
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
	
	public abstract void cantar();
	
}
