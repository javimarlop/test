package birds;

public class PersonalData {

	private String birdName;
	private String ownerName;

	public PersonalData(String birdName, String ownerName) {
		super();
		setBirdName(birdName);
		setOwnerName(ownerName);
	}

	public String getBirdName() {
		return birdName;
	}

	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
