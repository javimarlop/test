package repaso;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int vidasIniciales) {
		super(vidasIniciales);
	}
	
	@Override
	public boolean validaNumero(int numeroEntrada) {
		return numeroEntrada%2!=0?true:false;
	}
	
	@Override
	public void reiniciarPartida() {
		do{
			super.reiniciarPartida();
		}while(numero%2==0);
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero IMPAR");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Tienes " + getVidasIniciales() + " para acertar un numero IMPAR del 1 al 10");		
	}

}
