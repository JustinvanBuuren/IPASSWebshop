package nl.ipass.definition;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BestelStatus {
    @JsonProperty("leverbaar")
    LEVERBAAR("leverbaar"),
    @JsonProperty("nietleverbaar")
    NIETLEVERBAAR("nietleverbaar"),
    @JsonProperty("tijdelijkuitverkocht")
    TIJDELIJKUITVEROCHT("tijdelijkuitverkocht"),
    @JsonProperty("preorder")
    PREORDER("preorder");

    private String bestelStatus;

    BestelStatus(String bestelStatus) {
        this.bestelStatus = bestelStatus;
    }

    public String getBestelStatus() {
        return this.bestelStatus;
    }
}
