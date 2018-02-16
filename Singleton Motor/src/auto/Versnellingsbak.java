package auto;

public enum Versnellingsbak {
    INSTANCE;
    private int positie = 0;
    
    public void hogerSchakelen(){
        if (positie<5) {
            ++positie;
            System.out.println("De versnellingsbak staat in positie "+positie);
        }
    }
    
    public void lagerSchakelen(){
        if (positie>0){
            --positie;
            System.out.println("De versnellingsbak staat in positie "+positie);
        }
    }
    
    public void inAchteruitZetten(){
        positie = -1;
        System.out.println("De versnellingsbak staat in positie "+positie);
    }
}
