package auto;

public enum Motor {
    INSTANCE;
    private boolean gestart;
    
    public void starten(){
        gestart = true;
        System.out.println("gestart");
    }
    
    public void stoppen() {
        if (gestart){
            gestart = false;
            System.out.println("gestopt");
        }
    }
}
