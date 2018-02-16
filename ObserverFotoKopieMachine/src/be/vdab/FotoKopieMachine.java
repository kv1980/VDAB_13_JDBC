package be.vdab;

import java.util.Observable;

public class FotoKopieMachine extends Observable{
    private final String serienummer;
    private int aantalGenomenKopies;
    private final int LIMIET = 10000;

    public FotoKopieMachine(String serienummer) {
        this.serienummer = serienummer;
    }

    public String getSerienummer() {
        return serienummer;
    }

    public int getAantalGenomenKopies() {
        return aantalGenomenKopies;
    }
    
    public void neemKopies(int aantal){
        aantalGenomenKopies += aantal;
        if (aantalGenomenKopies > LIMIET){
            setChanged();
            notifyObservers();
            aantalGenomenKopies = 0;
        }
    }
}