package test;

public class Operaciones {
	
	public boolean esPrimo(int numero){
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

	public static int mostrarDivisores2(int numero){
		if(numero==0){
			System.out.println("No ceros!");
			//return numero;
		}else{
			for(int i=2;i<numero+1;i++){
				if(numero%i == 0){
					return i;	
				}
			}				
		}
		System.out.println("Sin divisores!");
		return numero;
	}

	public static int test(int numero){
		
		for(int i=1;i<numero+1;i++){
			return i+numero;
		}
		return numero;
	}
	
//	public static void main(String[] args){
//		Operaciones op = new Operaciones();
//		System.out.println(op.esPrimo(10));
//	}
	
}
