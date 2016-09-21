package repaso;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego{
	
	int numAdivinar;
	int variableInt;
	
	public JuegoAdivinaNumero(int numVidas, int numAdivinar){
		super(numVidas);
		this.numAdivinar = numAdivinar;
	}
	
//	public void Juega(){
//		
//	}
	
	public int EntrarNumero(){
		
		  //int variableInt;
		
		  Scanner entrada=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.
		   
		  System.out.print("Adivine un numero entre el 0 y el 10: ");
		   
		  return this.variableInt = entrada.nextInt();
	}
	
	public void Juega(){
		
		ReiniciaPartida();
		EntrarNumero();
		
		  if(variableInt==numAdivinar){
			  System.out.println("Acertaste!");
			  ActualizaRecord();
		  }else{
			  if(QuitaVida()){
				  if(variableInt>numAdivinar){
					  System.out.println("El numero es menor del que ha introducido. Intentelo de nuevo!");
					  Juega(); // cambiar por un for loop en base al numero de vidas!
				  } else{
					  System.out.println("El numero es mayor del que ha introducido. Intentelo de nuevo!");
					  Juega();
				  }
			  }
		  }
		
	}

}
