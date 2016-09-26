package test;

public class DatosPersonales{

	private String nombreAve;
	private String nombreDueno;
	
	public DatosPersonales(String nombreAve, String nombreDueno){
		super(); // por que?
		setNombreAve(nombreAve);
		setNombreDueno(nombreDueno);		
	}

	public String getNombreAve() {
		return nombreAve;
	}

	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}
	
}
