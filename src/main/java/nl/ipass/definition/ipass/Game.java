package nl.ipass.definition.ipass;

import javax.xml.bind.annotation.XmlRootElement;

public class Game {
    private String titel;
    private String bestelStatus;
    private Double prijs;
    private String genre;
    private String platform;
    private Integer voorraad;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBestelStatus() {
        return bestelStatus;
    }

    public void setBestelStatus(String bestelStatus) {
        this.bestelStatus = bestelStatus;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(Integer voorraad) {
        this.voorraad = voorraad;
    }
}
