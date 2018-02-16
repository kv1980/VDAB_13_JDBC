package eiland;

import java.util.ArrayList;
import java.util.List;

public enum Eiland {
    INSTANCE;
    
    private final Vulkaan vulkaan = new Vulkaan();
    private final List<Inwoner> inwonerLijst = new ArrayList<>();

    public void bevolkMetBevreesdeInwoners() {
        InwonerFactory.INSTANCE.vul(inwonerLijst); 
        inwonerLijst.forEach((eenInwoner) -> {
            vulkaan.addObserver(eenInwoner);
        });
    }

    public void doeVulkaanUitbarsten() {
        vulkaan.barstUit();
    }
}
