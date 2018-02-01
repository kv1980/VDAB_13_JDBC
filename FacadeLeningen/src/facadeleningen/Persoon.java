package facadeleningen;

import java.util.ArrayList;
import java.util.List;

public class Persoon {
    private final Loon zijnLoon;
    private final Rekening zijnRekening;
    private final List<Lening> zijnLeningen = new ArrayList<>();

    public Persoon(Loon zijnLoon, Rekening zijnRekening) {
        this.zijnLoon = zijnLoon;
        this.zijnRekening = zijnRekening;
    }
    
    public void addLening(Lening eenLening){
        zijnLeningen.add(eenLening);
    }

    public Loon getZijnLoon() {
        return zijnLoon;
    }

    public Rekening getZijnRekening() {
        return zijnRekening;
    }

    public List<Lening> getZijnLeningen() {
        return zijnLeningen;
    }
}