package be.vdab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrangement eenArrangement = new Bungalow();
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Wenst u een BBQ bij uw bungalow? (j/n)");
            if ("j".equals(sc.next())){
                eenArrangement = new MetBBQ(eenArrangement);
            }
            System.out.println("Wenst u fietsen bij uw bungalow? (j/n)");
            if ("j".equals(sc.next())){
                eenArrangement = new MetFietsen(eenArrangement);
            }
        }
        System.out.println("-----------TAKEN-PERSONEEL-----------");
        System.out.println(eenArrangement.getTaak());
    }  
}