package be.vdab.stereoketen;

public class Stereoketen {
    private final Versterker versterker = new Versterker();
    private final Equalizer equalizer = new Equalizer();
    private final Radio radio = new Radio();
    private final CDspeler cdspeler = new CDspeler();
    private Apparaat huidigeGeluidsbron;
    private boolean gestart;
    
    public void start(){
        versterker.start();
        equalizer.start();
        if (huidigeGeluidsbron != null){
            huidigeGeluidsbron.start();
        }
        gestart = true;
    }
    
    public void stop() {
        versterker.stop();
        equalizer.stop();
        if (huidigeGeluidsbron != null){
            huidigeGeluidsbron.stop();
        }
        gestart = false;
    }
    
    public void kiesRadio() {
        if (gestart){
            if (huidigeGeluidsbron != null){
                huidigeGeluidsbron.stop();
            }
            huidigeGeluidsbron = radio;
            huidigeGeluidsbron.start(); 
        } 
    }
    
    public void kiesCDSpeler() {
        if (gestart){
            if (huidigeGeluidsbron != null){
                huidigeGeluidsbron.stop();
            }
            huidigeGeluidsbron = cdspeler;
            huidigeGeluidsbron.start(); 
           }
    }
}