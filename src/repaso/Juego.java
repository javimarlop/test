package repaso;

import java.util.Scanner;

public class Juego {
	
	//public int numVidas;
	private int numVidas;
	static private int record = 0;
	
	public Juego(int vidasIniciales){
		
		this.numVidas = vidasIniciales;
		final int vidasInicio = vidasIniciales;
	}

	public void MuestraVidasRestantes(){
		System.out.println(numVidas);
	}
	
	public boolean QuitaVida(Juego j){
		j.numVidas -=1;
		if(j.numVidas>0){
			return true;
		} else{
			System.out.println("Juego terminado.");
		}
		return false;
	}
	
	public static void main(String[] args) {
		Juego j1 = new Juego(5);
		
		j1.MuestraVidasRestantes();
		j1.numVidas-=1;
		j1.MuestraVidasRestantes();
		
		Juego j2 = new Juego(5);
		j2.MuestraVidasRestantes();
		j1.MuestraVidasRestantes();
	}
	
}
