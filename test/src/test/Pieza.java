package test;

public abstract class Pieza { //las clases abstractas no se pueden instanciar
	
	String color;
	String posicion;
	boolean comida;
	
	// creamos un constructor para que sea heredado por las clases hijas	
	public Pieza(String color, String posicion, boolean comida) {
		super();
		this.color = color;
		this.posicion = posicion;
		this.comida = comida;
	}

	public abstract void mover(); //asi obligamos a que se sobreescriba el método

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
