package be.vdab;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        KopieMachine eenMachine = new KopieMachine("A0012598");
        eenMachine.addObserver(new Technieker("Gerard"));
        Random random = new Random();
        for (int i = 0 ; i < 500 ; i++ ){
            int aantal = random.nextInt(10)+1;
            eenMachine.neemKopies(aantal);
        }
    }
}