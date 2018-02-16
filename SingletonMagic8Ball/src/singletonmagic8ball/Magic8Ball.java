package singletonmagic8ball;

import java.util.Random;

public enum Magic8Ball {
    INSTANCE;
    private final String[] mogelijkeAntwoorden = new String[]{"Zoals ik het zie, ja.","Het is zeker.",
                                                    "Hoogstwaarschijnlijk.","Ziet er goed uit",
                                                    "Zonder twijfel.","Ja.","Zeker.","Je mag erop rekenen",
                                                    "Vraag dit later nog eens.","Dit wil je niet weten.",
                                                    "Ik kan dit nu niet voorspellen.","Concentreer je en stel de vraag opnieuw",
                                                    "Je moet er niet op rekenen.","Nee.",
                                                    "Ziet er niet goed uit.","Zeer twijfelachtig"};
    private int laatsteAntwoordIndex = -1; //Best op -1, want nog geen antwoord gegeven.
    
    public void geefAntwoord(){
        Random random = new Random();
        int antwoordIndex = random.nextInt(mogelijkeAntwoorden.length);
        while (antwoordIndex == laatsteAntwoordIndex){
            antwoordIndex = random.nextInt(mogelijkeAntwoorden.length);
        }
        System.out.println(mogelijkeAntwoorden[antwoordIndex]);
        laatsteAntwoordIndex = antwoordIndex;
    }    
}