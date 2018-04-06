package general;

public class Director {

	private Country thailand = new Country();

	public Country getThailand() {
		return thailand;
	}

	public Director() {

		thailand.basicInfo = new BasicInfo("Tajlandia", "tajski", "Bangkok", "Bat", "Azja", "Buddyzm",
				"Laos, Birma, Malezja, Kambodża");

	}

}
