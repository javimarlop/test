package test;

public abstract class Ave {

	private char sexo;
	int edad;
	static int numAves;
	public DatosPersonales nombres = new DatosPersonales(null,null); //por defecto toma valor null como objeto si no pones el igual.
	
	
	public Ave(char sexo , int edad){
		//this.sexo = sexo;
		setSexo(sexo);
		this.edad = edad;
		numAves+=1;
	}
	
	public void setSexo(char sexo) {
		if (sexo != 'M' && sexo != 'F') {
			System.out.println("not valid sex");
		} else {
			this.sexo = sexo;
		}
	}

	public char getSexo() {
		return this.sexo;
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
