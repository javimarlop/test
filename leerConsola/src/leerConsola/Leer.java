package leerConsola;

import java.util.Scanner;

public class Leer {
	
	private static Scanner entrada = null;
	
	/**
	 * Metodo que obtiene un entero por consola y lo devuelve
	 * @author Alberto
	 * @return devuelve un nuemero entero o un -1 si el valor introducido por consola es incorrecto
	 */
	public static int leerEntero(){
		try{
			entrada = new Scanner(System.in);
			return entrada.nextInt();
		}catch (Exception e) {
			//System.out.println("No has introducido un numero, te quito una vida por listo");
			return -1; // asi no es un numero correcto por defecto
		}
	}
	
	public static char leerTexto(){
		try{
//			String entrada = new Scanner(System.in);
//			return entrada = Scanner.next();//.charAt(0);
		}catch (Exception e) {
			//System.out.println("No has introducido un numero, te quito una vida por listo");
			return ' ';
		}		
	}
	
	public static void cerrarScanner(){
		if(entrada!=null){
			entrada.close();
		}
	}

}
