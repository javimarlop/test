package test;

import java.util.Calendar;

public class Fecha {
	private int ano = 0;
	private int mes = 1;
	private int dia = 1;
	public static final int MESES_ANO = 12;
	
	// A year will be a leap year if it is divisible by 4 but not by 100. 
	// If a year is divisible by 4 and by 100, it is not a leap year unless it is also divisible by 400
	public static boolean esBisiesto(int ano) {
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
			return true;//System.out.println("El anio es bisiesto");
		else
			return false; //System.out.println("El anio no es bisiesto");
		}
	
	
	//no recibe params
	public boolean esBisiesto() {
		return esBisiesto(this.ano);
		}
	
	//3 constructures
	
	// en este caso no hace falta la excepcion porque viene de un formato estandar
	public Fecha(){ // fecha de hoy si no pones parametros
		Calendar c = Calendar.getInstance();
		
		this.ano = c.get(Calendar.YEAR);
		this.mes = c.get(Calendar.MONTH+1);
		this.dia = c.get(Calendar.DAY_OF_MONTH);
		
	};
	
	private boolean comprobarMes(int mes){
		if(mes>0 && mes<12){
		return true;
		}else{
			return false;
		}
	}

	private boolean comprobarDia(int dia){
		switch(this.mes){
		case 1: 
			return comprobarLimiteDia(dia, 31);
			// Na hace falta el break porque el return ya rompe la ejecucion.
		case 2:
			if(esBisiesto()){
				return comprobarLimiteDia(dia, 29);
			} else{
				return comprobarLimiteDia(dia, 28);
			}

		case 3:
			return comprobarLimiteDia(dia, 31);
		case 4:
			return comprobarLimiteDia(dia, 30);
		case 5:
			return comprobarLimiteDia(dia, 31);
		case 6:
			return comprobarLimiteDia(dia, 30);
		case 7:
			return comprobarLimiteDia(dia, 31);
		case 8:
			return comprobarLimiteDia(dia, 31);
		case 9:
			return comprobarLimiteDia(dia, 30);
		case 10:
			return comprobarLimiteDia(dia, 31);
		case 11:
			return comprobarLimiteDia(dia, 30);
		case 12:
			return comprobarLimiteDia(dia, 31);
		default:
				return false;
	}
	}
	
	private boolean comprobarLimiteDia(int dia, int diaMaximoMes){
		if(dia>0 && dia<=diaMaximoMes){
			return true;
		}else{
			return false;
		}
		
	}
	
	/**
	 * Constructor que crea una instancia de Fecha con los parametros ano, mes y dia.
	 * @param ano
	 * @param mes
	 * @param dia
	 * @throws FechaException
	 */
	public Fecha(int ano, int mes, int dia) throws FechaException {
		this.ano = ano;
		setMes(mes);//this.mes = mes; 
		setDia(dia);//this.dia = dia;
	}
	
	// no hace falta la excepcion porque ya viene de un objeto fecha
	/**
	 * Constructor a partir de un objeto fecha.
	 * @param f
	 * @throws FechaException
	 */
	public Fecha(Fecha f) throws FechaException {
		this.dia = f.dia;
        this.mes = f.mes;
        this.ano = f.ano;
    	}
	
	//settter of empty Fecha
	public void set(int ano, int mes, int dia) throws FechaException {
	   this.ano = ano;
	   setMes(mes);//this.mes = mes;
	   setDia(dia);//this.dia = dia;

		}
	
	public void set(Fecha f) {
	                          this.dia = f.dia;
			                  this.mes = f.mes;
			                  this.ano = f.ano;
			              	}
	

	
	public void setMes(int mes) throws FechaException {
		if(comprobarMes(mes)){
			this.mes = mes;
			}else{
				throw new FechaException("El mes "+mes+" no esta en los rangos apropiados");
			}
		}
	
	/**
	 * 
	 * @return int
	 */
	public int getMes(){return this.mes;}
	
	public void setAno(int ano) {this.ano = ano;}
	
	public int getAno() {return this.ano;}
	
	public void setDia(int dia) {
		if(comprobarDia(dia)){
			this.dia = dia;
		}else{
			throw new FechaException("El dia "+dia+" no esta en los rangos apropiados");
		}
		}
	
	public int getDia(){return this.dia;}
	
	
	public String toString() {
		//System.out.println(dia + mes + ano);
		return dia + "/" + mes + "/" + ano;
	}
	
	// se puede sobrecargar mas el metodo
	public String toString(String ciudad) {
		return "En " + ciudad;
	}
	
	// Why this?
	public boolean equals(Object O) {
		if (O instanceof Fecha) {
			Fecha f = (Fecha) O;
			if (f.dia == this.dia && f.mes == this.mes && f.ano == this.ano) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
