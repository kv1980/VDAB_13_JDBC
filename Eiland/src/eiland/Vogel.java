package eiland;

import java.util.Observable;

public class Vogel extends Inwoner {

    public Vogel(String naam) {
        super(naam);
    }

    @Override
    public void update(Observable observable, Object object) {
        if (!(observable instanceof Vulkaan)) {
            throw new IllegalArgumentException();
        }
        Vulkaan vulkaan = (Vulkaan) observable;
        System.out.println(naam + " gaat nu hoger vliegen.");
    }
}
