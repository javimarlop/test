package birds;

public  abstract class Bird {

	// public char sex;
	private char sex;
	public int age;

	public static int num = 0;
	
	public PersonalData names = new PersonalData(null, null);
	
	public Bird(char sex, int age) {
		// this.sex = sex;
		setSex(sex);
		this.age = age;

		num++; //counter of created birds
	}

	public static int GetNum() {
		return num;
	}

	public void WhoIM() {
		System.out.println("I'm a bird and my sex is " + this.sex + " and I'm " + this.age);
	}

	public void setSex(char sex) {
		if (sex != 'M' && sex != 'F') {
			System.out.println("not valid sex");
		} else {
			this.sex = sex;
		}
	}

	public char getSex() {
		return this.sex;
	}

	public abstract void sing();
	
}
