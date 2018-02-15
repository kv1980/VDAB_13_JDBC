package facadeleningen;

import java.math.BigDecimal;

public class Loon {
    private final BigDecimal maandwedde;
    
    public Loon(BigDecimal bedrag){
        this.maandwedde = bedrag;
    }

    public BigDecimal getBedrag() {
        return maandwedde;
    }
}