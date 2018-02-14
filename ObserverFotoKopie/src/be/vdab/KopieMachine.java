package be.vdab;
import java.util.Observable;
public class KopieMachine extends Observable{
    //MEMBERS
    private final String serienummer;
    private int aantalGenomenKopies;
    private static final int LIMIETKOPIES = 1000;
    //CONSTRUCTOR
    public KopieMachine(String serienummer) {
        this.serienummer = serienummer;
    }
    //GETTERS
    public String getSerienummer() {
        return serienummer;
    }
    public int getAantalGenomenKopies() {
        return aantalGenomenKopies;
    }
    //OTHER METHODS
    public void neemKopies(int aantal){
        aantalGenomenKopies += aantal;
        if (aantalGenomenKopies > LIMIETKOPIES){
            setChanged();
            notifyObservers();
            aantalGenomenKopies -= LIMIETKOPIES;
        }
    }
}