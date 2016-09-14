package test;

import java.util.Arrays;

public class Operaciones {
	
	public static boolean esPrimo(int numero){
		if(numero==0){
			System.out.println("No ceros!");
			return false;
		}else{
			for(int i=2;i<numero;i++){
				if(numero%i ==0){
					return false;
				}
			}
		}
		return true;
	}

	public static void mostrarDivisoresPrimos(int numero){
		if(numero==0){
			System.out.println("No ceros!");
		}else{
			for(int i=1;i<numero+1;i++){
				if(numero%i == 0){
					if(esPrimo(i)){
					System.out.println(i);
					}
				}
			}				
		}
	}
	
	public static void mostrarDivisores(int numero){
		if(numero==0){
			System.out.println("No ceros!");
		}else{
			for(int i=1;i<numero+1;i++){
				if(numero%i == 0){
					System.out.println(i);	
				}
			}				
		}
	}

	public static String mostrarDivisores2(int numero){
		if(numero==0){
			System.out.println("No ceros!");
			//return numero;
		}else{
			int[] res = new int[numero];
			int j = -1;
			for(int i=1;i<numero+1;i++){
				if(numero%i == 0){
					++j;
					res[j] = i;
						
				}
			}
			return Arrays.toString(res);
		}
		System.out.println("Sin divisores!");
		return String.valueOf(numero);
	}

	
//	public static void main(String[] args){
//		Operaciones op = new Operaciones();
//		System.out.println(op.esPrimo(10));
//	}
	
}
