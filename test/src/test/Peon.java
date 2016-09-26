package test;

public class Peon extends Pieza {
	
	// es obligatorio ponerlo ya que esta definido el constructor en la clase padre
	public Peon(String color, String posicion, boolean comida){
		super(color,posicion,comida);
	}

	public void mover(){ //es obligatorio poner este método porque si no da error, al venir de una clase abstracta.
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
