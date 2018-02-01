package compositeprojecten;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Projectkost implements Kost {
    private final List<Kost> lijstMetKosten = new ArrayList<>();
    public void addKost(Kost eenKost){
        lijstMetKosten.add(eenKost);
    }
    @Override
    public BigDecimal getKosten() {
        BigDecimal totaleKost = BigDecimal.ZERO;
        for (Kost kost : lijstMetKosten){
            totaleKost = totaleKost.add(kost.getKosten());
        }
        return totaleKost;
    }
}