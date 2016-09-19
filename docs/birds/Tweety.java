package birds;

public class Tweety extends Canario {

	public int numMovies;

	public Tweety(char sex, int age, double size, int numMovies) {
		super(sex, age, size);
		this.numMovies = numMovies;
	}
    
	public void sing(){System.out.println("I'm a tweety");}
}
