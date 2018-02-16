package builderinwoners;

public class Main {

    public static void main(String[] args) {
        Inwoner inwonerA = new Inwoner();
        inwonerA.metVoornaam("Kristof")
                .metFamilienaam("Vermeulen");
        System.out.println(inwonerA.toString());
        
        Inwoner.InwonerBuilder builder = new Inwoner.InwonerBuilder();
        Inwoner inwonerB = builder.metVoornaam("Kristof")
                                .metFamilienaam("Vermeulen")
                                .maakInwoner();
        System.out.println(inwonerB.toString());
    }
}