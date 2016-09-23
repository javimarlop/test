package repaso;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int numVidas, int numAdivinar) {
		super(numVidas, numAdivinar);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean ValidaNumero(int numAdivinar){
		if(numAdivinar%2!=0){
			return true;
		}
		System.out.println("El numero no es impar!");
		return false;
	}
	
}

