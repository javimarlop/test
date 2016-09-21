package repaso;

public abstract class Juego {
	
	//public int numVidas;
	private int numVidas;
	static private int record = 0;
	final int vidasInicio;
	
	public abstract void Juega();
	
	public static void muestraRecord(){
		System.out.println(record);
	}
	
	public Juego(int vidasIniciales){
		
		this.numVidas = vidasIniciales;
		this.vidasInicio = vidasIniciales;
	}

	public void MuestraVidasRestantes(){
		System.out.println(numVidas);
	}
	
	public boolean QuitaVida(){
		numVidas -=1;
		if(numVidas>0){
			return true;
		} else{
			System.out.println("Juego terminado.");
		}
		return false;
	}
	
	public void ActualizaRecord(){
		if(this.numVidas==record){
			System.out.println("Se ha alcanzado el record!");
		}
		if(this.numVidas>record){
			record = numVidas;
			System.out.println("Se ha batido el record! El nuevo valor es: "+ record);
		}
	}
	
	public int ReiniciaPartida(){

		return this.numVidas = vidasInicio;
		
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
