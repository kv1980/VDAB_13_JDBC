package factoryCadeaus;

import java.time.LocalDate;

public class Kind {
    private final String naam;
    private final LocalDate geboortedatum;
    
    public Kind(String naam, LocalDate geboortedatum){
        this.naam = naam;
        this.geboortedatum = geboortedatum;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public String getNaam() {
        return naam;
    }
}