package webshop;

public class Game {
	private String gamenaam;
	private int voorraad;
	private String gamegenre;
	private double bedrag;
	
	public Game(String gamenaam, int voorraad, String gamegenre, double bedrag) {
		super();
		this.gamenaam = gamenaam;
		this.voorraad = voorraad;
		this.gamegenre = gamegenre;
		this.bedrag = bedrag;
	}
	
	public String getGamenaam() {
		return gamenaam;
	}
	public void setGamenaam(String gamenaam) {
		this.gamenaam = gamenaam;
	}
	public int getVoorraad() {
		return voorraad;
	}
	public void setVoorraad(int voorraad) {
		this.voorraad = voorraad;
	}
	public String getGamegenre() {
		return gamegenre;
	}
	public void setGamegenre(String gamegenre) {
		this.gamegenre = gamegenre;
	}
	public double getBedrag() {
		return bedrag;
	}
	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}
	
	
	
	
	
	
	

}
