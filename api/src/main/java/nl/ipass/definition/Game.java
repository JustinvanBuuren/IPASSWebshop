package nl.ipass.definition;

public class Game {
    private String publicId;
    private String titel;
    private BestelStatus bestelStatus;
    private Double prijs;
    private String genre;
    private String platform;
    private Integer voorraad;
    private String omschrijving;

    public String getPublicId() {
        return this.publicId;
    }

    public void setPublicId(String publicId) throws IllegalArgumentException {
        if(publicId.length() != 256) {
            throw new IllegalArgumentException("Ongeldige public id.");
        }
        this.publicId = publicId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) throws IllegalArgumentException {
        if(titel.length() == 0 || titel.length() > 128) {
            throw new IllegalArgumentException("De titel mag niet leeg zijn en mag niet langer zijn dan 128 karakters.");
        }
        this.titel = titel;
    }

    public BestelStatus getBestelStatus() {
        return bestelStatus;
    }

    public void setBestelStatus(BestelStatus bestelStatus) {
        this.bestelStatus = bestelStatus;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) throws IllegalArgumentException {
        if(prijs < 0) {
            throw new IllegalArgumentException("De prijs mag niet lager zijn dan 0.");
        }
        this.prijs = prijs;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) throws IllegalArgumentException {
        if(genre.length() == 0 || genre.length() > 64) {
            throw new IllegalArgumentException("De genre mag niet langer zijn en mag niet langer zijn dan 64 karakters.");
        }
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) throws IllegalArgumentException {
        if(platform.length() == 0 || platform.length() > 64) {
            throw new IllegalArgumentException("Platform mag niet leeg zijn en mag niet langer zijn dan 64 karakters.");
        }
        this.platform = platform;
    }

    public Integer getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(Integer voorraad) throws IllegalArgumentException {
        if(voorraad < 0) {
            throw new IllegalArgumentException("Voorraad mag niet lager zijn dan 0.");
        }
        this.voorraad = voorraad;
    }

    public String getOmschrijving() {
        return this.omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String toString() {
        return "@Game:[titel: " + getTitel()+
                ", bestelStatus: " + getBestelStatus() +
                ", prijs: " + getPrijs() +
                ", genre: " + getGenre() +
                ", platform: " + getPlatform() +
                ", voorraad: " + getVoorraad();
    }
}
