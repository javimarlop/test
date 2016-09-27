package juegos.letras;

import repaso.Juego;
import interfaces.Jugable;
import leerConsola.Leer;
//import repaso.Juego;

public class JuegoAhorcado extends Juego implements Jugable{

	String palabra;
	
	public JuegoAhorcado(int vidasIniciales, String palabra) {
		super(vidasIniciales);
		this.palabra = palabra;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void juega() {
		reiniciarPartida();
		//String newcadena = cadenaAdivinar;
		// TODO Auto-generated method stub
		
		//char[] stringToCharArray = palabra.toCharArray();
		 
		String palabraOculta = "";
		
//		System.out.print("Palabra a adivinar: ");
//		for (char output : stringToCharArray) {
//		    output = '-';
//			System.out.print(output);
//		}
//		System.out.println("");
		
		do{
		
			System.out.println("Introduce caracter:");
			String letra = Leer.leerTexto();
			
			if(palabra.indexOf(letra)!=-1){
				String palabraAux = "";
				for(int i = 0;i<palabra;i++){
					if(palabra.charAt(i)==(Char).equals(letra)){
						palabraAux = palabraAux + letra;
					} else {
						palabraAux = palabraAux + palabraOculta.charAt(i);
					}
				}
				palabraOculta = palabraAux;
			}
			
		} while(quitarVida());
		Leer.cerrarScanner();
		
	}

	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println("Ahorcado");
		
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out.println("Tienes " + getVidasIniciales() + " oportunidades para acertar la palabra");	
	}

}
