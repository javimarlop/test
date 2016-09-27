package model.vo;

public class Pais {

	private String nombre;
	private String continente;
	private long populacion;
	
	public Pais(String nombre, String continente, long populacion) {
		this.nombre = nombre;
		this.continente = continente;
		this.populacion = populacion;
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

	public long getPopulacion() {
		return populacion;
	}

	public void setPopulacion(long populacion) {
		this.populacion = populacion;
	}
	
	
}
