package birds;

public class Main {

	public static void main(String[] args) {
		/*
		 * EX2 Canario bird1 = new Canario('M', 8); Parrot bird2 = new
		 * Parrot('F', 5, 'N', "yellow"); bird1.WhoIM(); bird2.WhoIM(); Tweety
		 * tweet1 = new Tweety ('M', 2, 20, 100); tweet1.MeasureHeight();
		 * //Parrot parro1 = new Parrot ('F', 5, 'N', "yellow");
		 * //parro1.WhereAreYouFrom(); System.out.println(Bird.num); tweet1.size
		 * = 30; tweet1.MeasureHeight(); //parro1.region = 'W';
		 * //parro1.WhereAreYouFrom();
		 */

		// ex 3
		Tweety[] TweetArray = new Tweety[3];// calls the array constructor
		TweetArray[0] = new Tweety('M', 2, 20, 100);
		TweetArray[1] = new Tweety('F', 3, 30, 10);
		TweetArray[2] = new Tweety('F', 8, 50, 5);

		// better use a for loop
		TweetArray[0].names.setBirdName("ciccio");
		// if names were public TweetArray[0].names.ownerName = ""
		TweetArray[0].names.setOwnerName("caio");
		TweetArray[1].names.setBirdName("billo");
		TweetArray[1].names.setOwnerName("barbaro");
		TweetArray[2].names.setBirdName("amigo");
		TweetArray[2].names.setOwnerName("ametz");

		Parrot parro1 = new Parrot('F', 5, 'N', "yellow");
		parro1.sing();

		for (Tweety t : TweetArray) {
			t.sing();
		}

//		TweetArray[0].sing();
//		TweetArray[1].sing();
//		TweetArray[2].sing();

		Bird gigio = TweetArray[0];
		System.out.println(gigio.names.getBirdName());
		System.out.println(gigio.names.getOwnerName());
	}

}
