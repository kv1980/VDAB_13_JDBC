package singletonmagic8ball;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef vraag op:");
        for (String vraag ; !(vraag = sc.nextLine()).equals("stop") ; ) {
            Magic8Ball.INSTANCE.geefAntwoord();
            System.out.println("Geef vraag op: ");
        }
    }
}
