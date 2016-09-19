package birds;

public class Parrot extends Bird {

	// public char region;
	private char region;
	public String color;

	public Parrot(char sex, int age, char region, String color) {
		super(sex, age);
		// this.region = region;
		setRegion(region);
		this.color = color;
	}

	public void WhereAreYouFrom() {

		// can use case/break syntax, more efficient
		if (region == 'N') {
			System.out.println("Nord");
		}
		if (region == 'S') {
			System.out.println("Sud");
		}
		if (region == 'W') {
			System.out.println("West");
		}
		if (region == 'E') {
			System.out.println("East");
		} else {
			System.out.println("Unknown");
		}
	}

	public void setRegion(char region) {
		if (region != 'N' && region != 'S' && region != 'W' && region != 'E') {
			System.out.println("not valid region");
		} else {
			this.region = region;
		}
	}// look at the colors if in doubt with "this"

	public char getRegion() {
		return this.region;
	}

	@Override
	public void sing() {
		System.out.println("I'm a parrot");
	}

}
