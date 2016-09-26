package repaso;

//import java.util.Scanner;

import leerConsola.Leer;

import java.util.Date;
import java.util.Random;
import interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable{
	
	int numero;
	int variableInt;
	Random random = new Random(new Date().getTime()); //hace muy dificil adivinar el numero
	
	public JuegoAdivinaNumero(int vidasIniciales, int numero){
		super(vidasIniciales);
		this.numero = numero;
	}
	
//	public void juega(){
//		
//	}
	
	public JuegoAdivinaNumero(int vidasIniciales){
		super(vidasIniciales);
		//this.numero = numero;
	}
	
	public boolean validaNumero(int numeroEntrada){
		return true;
	}
	
//	public int entrarNumero(){
//		
//		  //int variableInt;
//		
//		  Scanner entrada=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.
//		   
//		  System.out.print("Adivine un numero entre el 0 y el 10: ");
//		   
//		  return this.variableInt = entrada.nextInt();
//	}
	
	public void juega(){
		
		reiniciarPartida();
		boolean quedanVidas = true;
		
		do{ // la primera vez que pasa no le quita una vida?
		
		int numeroEntrada = Leer.leerEntero();
		
		if(validaNumero(numeroEntrada)){
		if(numeroEntrada==numero){
			System.out.println("Acertaste!");
			actualizaRecord();
			break;
		} else{
			quedanVidas = quitarVida();
			if(quedanVidas){
				System.out.println("Sigue intentandolo. El numero es ");
				if(numeroEntrada>numero){
					System.out.println("menor");
				} else{
					System.out.println("mayor");
				}
			} else{
				System.out.println("Fin del juego.");
			}
		}
		}
		} while(quitarVida());		
		Leer.cerrarScanner();
	
	}
//		if(ValidaNumero(numAdivinar)==false){
//			leerEntero();
			//ReiniciaPartida();
		//}

	@Override
	public void reiniciarPartida() {
		super.reiniciarPartida();
		numero = random.nextInt(11);
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Tienes " + getVidasIniciales() + " para acertar un numero del 1 al 10");		
	}
		
//		entrarNumero();
//		
//			  while(quitaVida()){ // mirar p. 173 tb
//				  if(variableInt>numAdivinar){
//					  System.out.println("El numero es menor del que ha introducido. Intentelo de nuevo!");
//					  entrarNumero(); 
//				  } else if (variableInt<numAdivinar){
//					  System.out.println("El numero es mayor del que ha introducido. Intentelo de nuevo!");
//					  entrarNumero();
//				  } else {
//					  System.out.println("Acertaste!");
//					  actualizaRecord();
//					  break;
//				  }
//			  }
		  
	//}
		
	}


