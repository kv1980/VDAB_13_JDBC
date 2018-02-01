package factoryCadeaus;

import java.math.BigDecimal;

public abstract class Cadeau {
    protected BigDecimal prijs;
    public Cadeau(BigDecimal prijs){
        this.prijs = prijs;
    }
    public BigDecimal getPrijs(){
        return prijs;
    }
}