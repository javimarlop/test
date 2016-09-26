package database;

public class Pais {

private String nombre;
private String continente;
private long population;

public Pais(String nombre, String continente, long population){
	this.nombre = nombre;
	this.continente = continente;
	this.population = population;
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getContinente() {
	return continente;
}

public void setContinente(String continente) {
	this.continente = continente;
}

public long getPopulation() {
	return population;
}

public void setPopulation(long population) {
	this.population = population;
}

}
