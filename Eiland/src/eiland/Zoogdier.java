package eiland;

import java.util.Observable;

public class Zoogdier extends Inwoner {

    public Zoogdier(String naam) {
        super(naam);
    }

    @Override
    public void update(Observable observable, Object object) {
        if (!(observable instanceof Vulkaan)) {
            throw new IllegalArgumentException();
        }
        Vulkaan vulkaan = (Vulkaan) observable;
        System.out.println(naam + " kruipt nu onder de grond.");
    }
}
