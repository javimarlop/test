package birds;

public class Canario extends Bird {

	public double size;

	public Canario(char sex, int age) {
		super(sex, age);
	}

	// overwriting constructor above
	public Canario(char sex, int age, double size) {
		super(sex, age);
		this.size = size;
		// Bird.num++; WRONG
	}

	public void MeasureHeight() {

		if (size == 0) {
			System.out.println("undefined size");
		}

		else if (size >= 30) {
			System.out.println("Alto");
		} else if (size > 15 && size < 30) {
			System.out.println("Mediano");
		} else if (size <= 15) {
			System.out.println("Bajo");
		}

	}

	@Override //or make canario abstract too
	public void sing() {
		System.out.println("I'm a canario");
	}

}
