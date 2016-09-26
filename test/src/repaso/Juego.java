package repaso;

public abstract class Juego {
	
	//public int numVidas;
	private int VidasRestantes;
	static private int record = 0;
	final int vidasIniciales;
	
	//public abstract void juega();
	
	public static void muestraRecord(){
		System.out.println(record);
	}
	
	public Juego(int vidasIniciales){
		
		this.VidasRestantes = vidasIniciales;
		this.vidasIniciales = vidasIniciales;
	}

	public void muestraVidasRestantes(){
		System.out.println(VidasRestantes);
	}
	
	public boolean quitarVida(){ // creo que hay error...
		VidasRestantes -=1;
		if(VidasRestantes>0){
			return true;
		} else{
			System.out.println("Juego terminado.");
		}
		return false;
	}
	
	public void actualizaRecord(){
		if(this.VidasRestantes==record){
			System.out.println("Has empatado con el record!");
		}
		if(this.VidasRestantes>record){
			record = VidasRestantes;
			System.out.println("Se ha batido el record! El nuevo valor es: "+ record);
		}
	}
	
	public int reiniciaPartida(){

		return this.VidasRestantes = vidasIniciales;
		
	}
	
//	public static void main(String[] args) {
//		Juego j1 = new Juego(5);
//		
//		j1.MuestraVidasRestantes();
//		j1.numVidas-=1;
//		j1.MuestraVidasRestantes();
//		
//		Juego j2 = new Juego(5);
//		j2.MuestraVidasRestantes();
//		j1.MuestraVidasRestantes();
//	}
	
}
