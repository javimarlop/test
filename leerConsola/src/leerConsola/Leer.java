package leerConsola;


import java.util.Scanner;

public class Leer {
	private static Scanner entrada = null;
	
	/**
	 * Metodo que obtiene un metodo por consola y lo devuelve
	 * @return devuelve un entero o un -1 si el valor introducido no es correcto
	 * @author Javier
	 */

	public static int leerEntero(){
		
		try{
		  entrada=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.
		   
		  System.out.print("Adivine un numero entre el 0 y el 10: ");
		   
		  return entrada.nextInt();
		} catch (Exception e){
			System.out.print("No has introducido un numero y te quito una vida.");
			e.printStackTrace();
			return -1; // para que nunca acierte por defecto si no mete numero
		} 
		}	
		
	
	public static void cerrarScanner(){
		if(entrada!=null){
			entrada.close();
	}
	
}
	
}
