package test;

public class Buitre extends Ave{
	double velocidadVuelo;
	double peso;
	
	public Buitre(char sexo, int edad, double velocidadVuelo, double peso){
	super(sexo,edad);
	this.velocidadVuelo = velocidadVuelo;
	this.peso = peso;
	}
	
	public void cantar(){}
}
