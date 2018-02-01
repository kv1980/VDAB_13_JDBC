package compositeprojecten;
import java.math.BigDecimal;
public class Grondstofkost implements Kost {
    private final BigDecimal eenheidsprijs;
    private final double hoeveelheid; 
    public Grondstofkost(BigDecimal eenheidsprijs, double hoeveelheid) {
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }
    @Override
    public BigDecimal getKosten() {
        return eenheidsprijs.multiply(BigDecimal.valueOf(hoeveelheid));
    }
}