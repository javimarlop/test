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
	
	public boolean ValidaNumero(int numAdivinar){
		return true;
	}
	
	public int EntrarNumero(){
		
		  //int variableInt;
		
		  Scanner entrada=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.
		   
		  System.out.print("Adivine un numero entre el 0 y el 10: ");
		   
		  return this.variableInt = entrada.nextInt();
	}
	
	public void Juega(){
		
		ReiniciaPartida();
		
		if(ValidaNumero(numAdivinar)==false){
			EntrarNumero();
			//ReiniciaPartida();
		}
		
		EntrarNumero();
		
			  do while(QuitaVida()){ // mirar p. 173 tb
				  if(variableInt>numAdivinar){
					  System.out.println("El numero es menor del que ha introducido. Intentelo de nuevo!");
					  EntrarNumero(); 
				  } else if (variableInt<numAdivinar){
					  System.out.println("El numero es mayor del que ha introducido. Intentelo de nuevo!");
					  EntrarNumero();
				  } else {
					  System.out.println("Acertaste!");
					  ActualizaRecord();
					  break;
				  }
			  }
		  
	}
		
	}


