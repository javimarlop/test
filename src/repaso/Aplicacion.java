package repaso;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JuegoAdivinaNumero j1 = new JuegoAdivinaNumero(3,3);
		JuegoAdivinaPar j2 = new JuegoAdivinaPar(3,4);
		JuegoAdivinaImpar j3 = new JuegoAdivinaImpar(3,7);
		
		
		//Juego j2 = new Juego(6);
		j1.Juega();
		j2.Juega();
		j3.Juega();
		
//		Juego j1 = new Juego(5);
//		Juego j2 = new Juego(3);
//		
//		j1.QuitaVida(j1);
//		j1.MuestraVidasRestantes();
//		j1.ReiniciaPartida();
//		j1.MuestraVidasRestantes();
//		
//		j1.ActualizaRecord();
//		j2.ActualizaRecord();
//		
//		Juego.muestraRecord();
	}

}
