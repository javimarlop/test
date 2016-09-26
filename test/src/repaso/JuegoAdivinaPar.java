package repaso;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

	public JuegoAdivinaPar(int vidasIniciales) {
		super(vidasIniciales);
	}

	@Override
	public boolean validaNumero(int numeroEntrada) {
		/*if(numeroEntrada%2==0){
			return true;
		}else{
			return false;
		}*/
		return numeroEntrada%2==0?true:false;
	}
	
	@Override
	public void reiniciarPartida() {
		do{
			super.reiniciarPartida();
		}while(numero%2!=0);
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero PAR");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Tienes " + getVidasIniciales() + " para acertar un numero PAR del 1 al 10");		
	}
}
