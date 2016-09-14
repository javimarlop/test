package test;

import java.util.Arrays;

public class Operaciones {
	
	int valor; //hace falta definirla aquí (en la clase fuera del constructor) para que se vea al instanciar la clase.
	
	public Operaciones(){
		this.valor = 10; //se pone this. para que ese valor vaya a la variable de clase.
	}
	
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

	public void fibonacci (int num){
		long a = 0, b = 1;

		for (int i = 1; i <= num; i++) {
		    a = a + b;
		    b = a - b;
		    System.out.println(a); 
		}
		}

	public void fibonacci2 (int num){
		long a = 0, b = 1;

		for (int i = 1; i <= num; i++) {
		    a = a + b;
		    b = a - b;
		    System.out.println(a); 
		}
		}
	
		public void factorial (int nume){
			 int k = 1;
			 for (int i = 1; i <= nume; i++) {
			  //k =( k * i);
			  k *= i;
			 }
			  System.out.println(k);
			}
		
//	public static void main(String[] args){
//		Operaciones op = new Operaciones();
//		System.out.println(op.esPrimo(10));
//	}
	
}
