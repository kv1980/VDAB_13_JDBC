package facadeleningen;

import java.math.BigDecimal;

public class FacadeLeningen {

    public static void main(String[] args) {
       Persoon Kristof = new Persoon(new Loon(BigDecimal.valueOf(2500)),new Rekening());
       Kristof.getZijnRekening().storten(BigDecimal.valueOf(100));
       //Kristof.getZijnLeningen().add(new Lening(BigDecimal.valueOf(250000)));
       LeningVerstrekker Bart = new LeningVerstrekker();
       if (Bart.checkMogelijkheidLening(Kristof)){
           System.out.println("lening goedgekeurd");
       }
       else {
           System.out.println("Lening niet goedgekeurd");
       }
    }
}