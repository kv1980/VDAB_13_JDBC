package factoryCadeaus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Kind> kinderen = new ArrayList<>();
        kinderen.add(new Kind("Arjen",LocalDate.of(2004,8,20)));
        kinderen.add(new Kind("Jelke",LocalDate.of(2006,6,11)));
        kinderen.add(new Kind("Ilke",LocalDate.of(2012,4,11)));
        
        BigDecimal totalePrijs = BigDecimal.ZERO;
        for (Kind kind : kinderen) {
            Cadeau cadeau = CadeauFactory.INSTANCE.maakCadeau(kind);
            System.out.println(kind.getNaam()+" krijgt een "+cadeau.getClass().getSimpleName()+" ter waarde van "+cadeau.getPrijs()+" EUR.");
            totalePrijs = totalePrijs.add(cadeau.getPrijs());
        }
        System.out.println("\nDe kerstman zal in totaal "+totalePrijs+" EUR moeten ophoesten.");
    }
}