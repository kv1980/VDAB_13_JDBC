package eiland;

import java.util.Observable;

public class Vulkaan extends Observable {

    String naam;
    String[] mogelijkeActiviteiten = new String[]{"inactief", "actief"};
    int huidigeActiviteit;

    public void barstUit() {
        this.huidigeActiviteit = 1;
        System.out.println("De vulkaan is nu " + mogelijkeActiviteiten[huidigeActiviteit] + "!");
        System.out.println("-------------------------------------------------------------------------------------");
        setChanged();
        notifyObservers();
    }
}
