package webshop;

public class Account {
	private String voornaam;
	private String adres;
	private int telefoonnr;
	private int geboortedatum;
	private String geslacht;
	private String achternaam;
	private String email;
	
	
	public Account(String voornaam, String adres, int telefoonnr, int geboortedatum, String geslacht, String achternaam,
			String email) {
		super();
		this.voornaam = voornaam;
		this.adres = adres;
		this.telefoonnr = telefoonnr;
		this.geboortedatum = geboortedatum;
		this.geslacht = geslacht;
		this.achternaam = achternaam;
		this.email = email;
	}
	
	
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getTelefoonnr() {
		return telefoonnr;
	}
	public void setTelefoonnr(int telefoonnr) {
		this.telefoonnr = telefoonnr;
	}
	public int getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(int geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	public String getGeslacht() {
		return geslacht;
	}
	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
