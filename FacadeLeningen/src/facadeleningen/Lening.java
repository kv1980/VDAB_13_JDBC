package facadeleningen;

import java.math.BigDecimal;

public class Lening {
    private final BigDecimal bedrag;

    public Lening(BigDecimal bedrag) {
        this.bedrag = bedrag;
    }

    public BigDecimal getBedrag() {
        return bedrag;
    }
}