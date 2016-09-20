package Exceptions;

public class Fecha {
	private int ano = 0;
	private int mes = 1;
	private int dia = 1;
	public static final int MESES_ANO = 12;
	
	// A year will be a leap year if it is divisible by 4 but not by 100. 
	// If a year is divisible by 4 and by 100, it is not a leap year unless it is also divisible by 400
	public static boolean esBisiesto(int ano) {if (ano%4 == 0 && ano%100 == 0) {return true;
	} else {return false;}}
	
	public boolean esBisiesto() {if (ano%4 == 0 && ano%100 == 0) {return true;
	} else {return false;}}
	
	//3 constructures
	public Fecha(){};

	public Fecha(int ano, int mes, int dia) throws FechaException {
		this.ano = ano;
		this.mes = mes; 
		this.dia = dia;
	if (esBisiesto(ano) == false && mes == 2 && dia > 28) {throw new FechaException("el dia de fevrero no es cierto, es un año bisiesto");}
	if (mes == 2 && dia>29) {throw new FechaException("el dia de fevrero no es cierto");}
	if (mes == 4 && dia>30) {throw new FechaException("el dia de abril no es cierto");}
	if (mes == 6 && dia>30) {throw new FechaException("el dia de ekain no es cierto");}
	if (mes == 9 && dia>30) {throw new FechaException("el dia de septiembre no es cierto");}
	if (mes == 11 && dia>29) {throw new FechaException("el dia de noviembre no es cierto");}
	}
	
	public Fecha(Fecha f) throws FechaException {
		this.dia = f.dia;
        this.mes = f.mes;
        this.ano = f.ano;
        if (esBisiesto(ano) == false && mes == 2 && dia > 28) {throw new FechaException("el dia de fevrero no es cierto, es un año bisiesto");}
    	if (mes == 2 && dia>29) {throw new FechaException("el dia de fevrero no es cierto");}
    	if (mes == 4 && dia>30) {throw new FechaException("el dia de abril no es cierto");}
    	if (mes == 6 && dia>30) {throw new FechaException("el dia de ekain no es cierto");}
    	if (mes == 9 && dia>30) {throw new FechaException("el dia de septiembre no es cierto");}
    	if (mes == 11 && dia>29) {throw new FechaException("el dia de noviembre no es cierto");}
    	}
	
	//settter of empty Fecha
	public void set(int ano, int mes, int dia) throws FechaException {
	   this.ano = ano;
	   this.mes = mes;
	   this.dia = dia;
	   if (esBisiesto(ano) == false && mes == 2 && dia > 28) {throw new FechaException("el dia de fevrero no es cierto, es un año bisiesto");}
		if (mes == 2 && dia>29) {throw new FechaException("el dia de fevrero no es cierto");}
		if (mes == 4 && dia>30) {throw new FechaException("el dia de abril no es cierto");}
		if (mes == 6 && dia>30) {throw new FechaException("el dia de ekain no es cierto");}
		if (mes == 9 && dia>30) {throw new FechaException("el dia de septiembre no es cierto");}
		if (mes == 11 && dia>29) {throw new FechaException("el dia de noviembre no es cierto");}
		}
	
	public void set(Fecha f) throws FechaException {
	                          this.dia = f.dia;
			                  this.mes = f.mes;
			                  this.ano = f.ano;
			                if (esBisiesto(ano) == false && mes == 2 && dia > 28) {throw new FechaException("el dia de fevrero no es cierto, es un año bisiesto");}
			              	if (mes == 2 && dia>29) {throw new FechaException("el dia de fevrero no es cierto");}
			              	if (mes == 4 && dia>30) {throw new FechaException("el dia de abril no es cierto");}
			              	if (mes == 6 && dia>30) {throw new FechaException("el dia de ekain no es cierto");}
			              	if (mes == 9 && dia>30) {throw new FechaException("el dia de septiembre no es cierto");}
			              	if (mes == 11 && dia>29) {throw new FechaException("el dia de noviembre no es cierto");}
			              	}
	
	public void setAno(int ano) {this.ano = ano;}
	public int getAno() {return ano;
	}
	
	public void setMes(int mes) throws FechaException {
		this.mes = mes;
		if (esBisiesto(ano) == false && mes == 2 && dia > 28) {throw new FechaException("el dia de fevrero no es cierto, es un año bisiesto");}
		if (mes == 2 && dia>29) {throw new FechaException("el dia de fevrero no es cierto");}
		if (mes == 4 && dia>30) {throw new FechaException("el dia de abril no es cierto");}
		if (mes == 6 && dia>30) {throw new FechaException("el dia de ekain no es cierto");}
		if (mes == 9 && dia>30) {throw new FechaException("el dia de septiembre no es cierto");}
		if (mes == 11 && dia>29) {throw new FechaException("el dia de noviembre no es cierto");}
		}
	
	public int getMes(){return mes;}
	
	public void setDia(int dia) {this.dia = dia;}
	public int getDia(){return dia;}
	
	
	public String toString() {
		//System.out.println(dia + mes + ano);
		return dia + "/" + mes + "/" + ano;
	}
	
	public boolean equals(Object O) {if (O instanceof Fecha) { Fecha Ex = (Fecha) O;
		                                if (Ex.dia == dia && Ex.mes == mes && Ex.ano == ano) {return true;
		                                } else {return false;}
		                                }
	return false;
		                                }
}
