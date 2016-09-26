package repaso;

public abstract class Juego {
	
	private int vidasRestantes;
	private int vidasIniciales;
	private static int record = 0;
	
	public Juego(int vidasIniciales){
		vidasRestantes = vidasIniciales;
		this.vidasIniciales = vidasIniciales;
	}
	
	public void mostrarVidas(){
		System.out.println("Te quedan " + vidasRestantes);
	}
	
	public boolean quitarVida(){
		vidasRestantes--;
		
		if(vidasRestantes>0){
			return true;
		}else{
			System.out.println("Juego Terminado");
			return false;
		}
	}
	
	public void reiniciarPartida(){
		vidasRestantes = vidasIniciales;
	}
	
	public void actualizaRecord(){
		if(vidasRestantes == record){
			System.out.println("Has empatado con el record actual");
		}else if(vidasRestantes>record){
			record = vidasRestantes;
			System.out.println("Has batido el record!! el nuevo record es: " + record);
		}
	}
	
	public int getVidasIniciales(){
		return vidasIniciales;
	}

}
