package webshop;

public class Order {
	private String klantnaam;
	private int ordenummer;
	private String klantadres;
	
	
	
	public Order(String klantnaam, int ordenummer, String klantadres) {
		super();
		this.klantnaam = klantnaam;
		this.ordenummer = ordenummer;
		this.klantadres = klantadres;
		
	}
	public String getKlantnaam() {
		return klantnaam;
	}
	public void setKlantnaam(String klantnaam) {
		this.klantnaam = klantnaam;
	}
	public int getOrdenummer() {
		return ordenummer;
	}
	public void setOrdenummer(int ordenummer) {
		this.ordenummer = ordenummer;
	}
	public String getKlantadres() {
		return klantadres;
	}
	public void setKlantadres(String klantadres) {
		this.klantadres = klantadres;
	}

}
