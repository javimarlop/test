package repaso;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidasIniciales, int numero) {
		super(vidasIniciales, numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean ValidaNumero(int numeroEntrada){
//		if(numAdivinar%2!=0){
//			return true;
//		}
//		System.out.println("El numero no es impar!");
//		return false;
		return numeroEntrada%2!=0?true:false;
	}
	
}

