package factoryCadeaus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public enum CadeauFactory {
    INSTANCE;
    public Cadeau maakCadeau(Kind kind){
        LocalDate nu = LocalDate.now();
        LocalDate geboortedatum = kind.getGeboortedatum();
        long leeftijd = ChronoUnit.YEARS.between(geboortedatum, nu);
        if (leeftijd <= 5){
            return new Pop(BigDecimal.valueOf(20.50));
        }
        else {
            if (leeftijd <=12) {
                return new Gezelschapspel(BigDecimal.valueOf(25.10));
            }
            else {
                return new Boekenbon(BigDecimal.valueOf(15.35));
            }
        }
    }
}