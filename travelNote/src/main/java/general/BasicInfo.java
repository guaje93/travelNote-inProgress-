package general;

import java.util.ArrayList;

public class BasicInfo {

	private String country;
	private String language;
	private String capital;
	private String currency;
	private String continent;
	private String religion;
	private String neighbours;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(String neighbours) {
		this.neighbours = neighbours;
	}
	public BasicInfo(String country, String language, String capital, String currency, String continent,
			String religion, String neighbours) {
		
		this.country = country;
		this.language = language;
		this.capital = capital;
		this.currency = currency;
		this.continent = continent;
		this.religion = religion;
		this.neighbours = neighbours;
	}
	
	
	
	
	
}
