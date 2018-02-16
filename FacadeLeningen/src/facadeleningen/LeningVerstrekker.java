package facadeleningen;

import java.math.BigDecimal;

public class LeningVerstrekker {
    public boolean checkMogelijkheidLening(Persoon eenPersoon){
        return  eenPersoon.getZijnLoon().getBedrag().compareTo(BigDecimal.valueOf(2500)) >= 0
                && eenPersoon.getZijnRekening().getSaldo().compareTo(BigDecimal.ZERO) > 0
                && eenPersoon.getZijnLeningen().isEmpty();
    }
}