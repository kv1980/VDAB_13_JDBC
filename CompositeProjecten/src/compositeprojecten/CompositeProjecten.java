package compositeprojecten;

import java.math.BigDecimal;

public class CompositeProjecten {

    public static void main(String[] args) {
        Grondstofkost GK1 = new Grondstofkost(BigDecimal.valueOf(1),1);
        Arbeidskost AK1 = new Arbeidskost(BigDecimal.valueOf(2),2);
        Projectkost PK1 = new Projectkost();
        PK1.addKost(GK1);
        PK1.addKost(AK1);
        Grondstofkost GK2 = new Grondstofkost(BigDecimal.valueOf(3),3);
        Arbeidskost AK2 = new Arbeidskost(BigDecimal.valueOf(4),4);
        Projectkost PK2 = new Projectkost();
        PK2.addKost(GK2);
        PK2.addKost(AK2);
        Projectkost PK3 = new Projectkost();
        PK3.addKost(PK1);
        PK3.addKost(PK2);
        System.out.println(PK3.getKosten());
    }
}