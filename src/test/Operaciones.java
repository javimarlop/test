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

}
