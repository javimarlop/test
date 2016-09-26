package main;

import interfaces.Jugable;
import repaso.JuegoAdivinaImpar;
import repaso.JuegoAdivinaNumero;
import repaso.JuegoAdivinaPar;
import juegos.letras.JuegoAhorcado;
import leerConsola.Leer;

public class Aplicacion {
	
	public static void main(String[] args){
		while(true){
			Jugable juego = eligeJuego();
			
			juego.muestraNombre();
			juego.muestraInfo();
			juego.juega();
			
			System.out.println("¿Quieres jugar mas? (s/n)");
			String entrada = Leer.leerTexto();

			if(!entrada.equalsIgnoreCase("s")){
				break;
			}
			
		}
		
		Leer.cerrarScanner();
	}
	
	public static Jugable eligeJuego(){
		JuegoAdivinaNumero jAdivinaNumero = new JuegoAdivinaNumero(3);
		JuegoAdivinaPar jAdivinaNumeroPar = new JuegoAdivinaPar(3);
		JuegoAdivinaImpar jAdivinaNumeroImpar = new JuegoAdivinaImpar(3);
		JuegoAhorcado jAhorcado = new JuegoAhorcado(100,"Texto");
		
		Jugable[] juegos = new Jugable[4];
		
		juegos[0] = jAdivinaNumero;
		juegos[1] = jAdivinaNumeroPar;
		juegos[2] = jAdivinaNumeroImpar;
		juegos[3] = jAhorcado;
		
		System.out.println("Elige un juego entre estos:");
		
		for(int i=0;i<juegos.length;i++){
			System.out.print((i+1) + " - ");
			juegos[i].muestraNombre();
		}
		
		while(true){
			try{
				int numJuego = Leer.leerEntero();
				return juegos[numJuego-1];
			}catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Introduce un numero valido!!");
			}
		}
		
		
	}

}
