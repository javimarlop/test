package test;

public class Fecha{
	
private int ano = 0;
private int mes = 1;
private int dia = 1;
public static final int MESES_ANO = 12;

// A year will be a leap year if it is divisible by 4 but not by 100. 
// If a year is divisible by 4 and by 100, it is not a leap year unless it is also divisible by 400
public static boolean esBisiesto(int ano) {if (ano%4 == 0 && ano%100 == 0) {return true;
} else {return false;}}

// why the second function?
public boolean esBisiesto() {if (ano%4 == 0 && ano%100 == 0) {return true;
} else {return false;}}

public Fecha(){}

public Fecha(int ano, int mes, int dia){
	this.ano = ano;
	this.dia = dia;
	
}

// why this?
public Fecha(Fecha f) {
	  this.dia = f.dia;
	        this.mes = f.mes;
	        this.ano = f.ano;
	 }

public void setAno(int ano){
	this.ano = ano;
}

public int getAno(){
	return ano;
}

public void setMes(int mes){
	this.mes = mes;
}

public int getMes(){
	return mes;
}

public void setDia(int dia){
	this.dia = dia;
}

public int getDia(){
	return dia;
}

//Why this?
public void set(int ano, int mes, int dia){
    this.ano = ano;
    this.mes = mes;
    this.dia = dia;
    }

//Why this?
 public void set(Fecha f) {
	 this.dia = f.dia;
     this.mes = f.mes;
     this.ano = f.ano;
     }

 public String toString() {
	  //System.out.println(dia + mes + ano);
	  return dia + "/" + mes + "/" + ano;
	 }
 
//Why this?
 public boolean equals(Object O) {
	 if (O instanceof Fecha) {
		 Fecha Ex = (Fecha) O;
		 if (Ex.dia == dia && Ex.mes == mes && Ex.ano == ano) {
			 return true;
		 } else {return false;}
 }
return false;
 }

}
