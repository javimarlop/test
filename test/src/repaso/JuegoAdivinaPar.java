package repaso;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	public JuegoAdivinaPar(int vidasIniciales, int numero) {
		super(vidasIniciales, numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean ValidaNumero(int numeroEntrada){
//		if(numeroEntrada%2==0){
//			return true;
//		}
//		System.out.println("El numero no es par!");
//		return false;
		return numeroEntrada%2==0?true:false; // lo mismo que arriba.
	}
	
}
