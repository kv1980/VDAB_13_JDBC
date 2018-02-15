package compositeprojecten;
import java.math.BigDecimal;
public class Arbeidskost implements Kost {
    private final BigDecimal uurloon;
    private final double aantalUren;
    public Arbeidskost(BigDecimal uurloon, double aantalUren) {
        this.uurloon = uurloon;
        this.aantalUren = aantalUren;
    }
    @Override
    public BigDecimal getKosten() {
        return uurloon.multiply(BigDecimal.valueOf(aantalUren));
    }
}