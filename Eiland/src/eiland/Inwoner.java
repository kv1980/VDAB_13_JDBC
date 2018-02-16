package eiland;

import java.util.Observer;

public abstract class Inwoner implements Observer {

    protected final String naam;

    public Inwoner(String naam) {
        this.naam = naam;
    }
    
    public void maakBevreesd(Vulkaan vulkaan){
        vulkaan.addObserver(this);
    }
}
