package be.vdab;

import java.util.Observable;
import java.util.Observer;

public class Technieker implements Observer {
    private final String naam;

    public Technieker(String naam) {
        this.naam = naam;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof FotoKopieMachine){
            FotoKopieMachine machine = (FotoKopieMachine)o;
            System.out.println("Technieker "+naam+" zal machine met serienummer "+machine.getSerienummer()+" nakijken.");
        }
    }
}