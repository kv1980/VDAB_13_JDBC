package auto;

public class Auto {

    public static void main(String[] args) {
        Motor.INSTANCE.starten();
        Versnellingsbak.INSTANCE.hogerSchakelen();
        Versnellingsbak.INSTANCE.hogerSchakelen();
        Versnellingsbak.INSTANCE.hogerSchakelen();
        Versnellingsbak.INSTANCE.lagerSchakelen();
        Versnellingsbak.INSTANCE.inAchteruitZetten();
        Versnellingsbak.INSTANCE.hogerSchakelen();
        Motor.INSTANCE.stoppen();
    }
    
}
