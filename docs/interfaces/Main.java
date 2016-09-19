
public class Main {

	public static void main(String[] args) {

		java.lang.Object[] ObArray = new java.lang.Object[12];

		Persona Pe = new Persona("tizio", 25);
		Ave Av = new Ave('M', 8);
		Aparato Ap = new Aparato(200, 100);
		Buitre Bu = new Buitre('M', 10, 25.5, 8.2);
		Canario Ca = new Canario('F', 5, true);
		Loro Lo = new Loro('F', 2, 'N', "Blue");
		Piolin Pi = new Piolin('F', 1, true, 20);
		Alumno Al = new Alumno("tizio", 8, "chimica", "mate");
		Profesor Pr = new Profesor("Villa", 55, 10, "fv@gmail");
		Bedel Be = new Bedel("ste", 33, 4, 20);
		tv tve = new tv(50.2, 103.5, true, 1);
		Radio Ra = new Radio(10.5, 50, true, 30);

		ObArray[0] = Pe;
		ObArray[1] = Av;
		ObArray[2] = Ap;
		ObArray[3] = Bu;
		ObArray[4] = Ca;
		ObArray[5] = Lo;
		ObArray[6] = Pi;
		ObArray[7] = Al;
		ObArray[8] = Pr;
		ObArray[9] = Be;
		ObArray[10] = tve;
		ObArray[11] = Ra;

		for (int ind = 0; ind < ObArray.length; ind++) {
			if (ObArray[ind] instanceof Hablador) {
				Hablador h = (Hablador) ObArray[ind];
				h.hablar()
				;

			} else {System.out.println("no puedo hablar");
			}
		}
		;

	}

}
