package be.vdab;
public class Main {
    public static void main(String[] args) {
        Technieker willy = new Technieker("Willy");
        FotoKopieMachine machientje = new FotoKopieMachine("A0123456789");
        machientje.addObserver(willy);
        for (int i = 0 ; i < 1000 ; i++){
            machientje.neemKopies(20);
        }
    } 
}