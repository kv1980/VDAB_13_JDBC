package be.vdab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persoon {

    private final String voornaam;
    private final String familienaam;
    private final String titel;

    public Persoon(String voornaam, String familienaam, String titel) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.titel = titel;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getTitel() {
        return titel;
    }
    public String maakBriefHoofding(Algoritme algoritme) {
        StringBuilder builder = new StringBuilder();
        builder.append("Dentergem,");
        LocalDate vandaag = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        builder.append(formatter.format(vandaag));
        builder.append("\n");
        builder.append(algoritme.getAanspreking(this));
        builder.append("\n");
        return builder.toString();
    }
}
