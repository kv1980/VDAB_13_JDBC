package be.vdab;

import java.util.Observable;
import java.util.Observer;

public class Technieker implements Observer {
    //MEMBERS
    private final String naam;
    //CONSTRUCTOR
    public Technieker(String naam) {
        this.naam = naam;
    }
    //GETTERS
    public String getPersoneelsnummer() {
        return naam;
    }
    //OVERRIDE METHOD
    @Override
    public void update(Observable o, Object o1) {
        if(!(o instanceof KopieMachine)){
            throw new IllegalArgumentException();
        }
        KopieMachine eenMachine = (KopieMachine)o;
        String mededeling = String.format("%s, kopiemachine %s heeft met %d pagina's een nieuwe onderhoudsbeurt nodig."
                ,naam, eenMachine.getSerienummer(),eenMachine.getAantalGenomenKopies());
        System.out.println(mededeling);
    }
}