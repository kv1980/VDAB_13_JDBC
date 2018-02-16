package eiland;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Eiland {

    public static void main(String[] args) {
        Vulkaan vulkaanEtna = new Vulkaan("Etna");
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/cursist/Documents/NetBeansProjects/Eiland/Eilandbewoners.txt"))){
            String bestandsregel = reader.readLine();
            while (bestandsregel != null){
                Inwoner inwoner = InwonerFactory.INSTANCE.maakInwoner(bestandsregel);
                vulkaanEtna.addObserver(inwoner);
                bestandsregel = reader.readLine();
            }
        }
        catch (IOException ex){
            System.err.println("File not found");
        }
        vulkaanEtna.barstUit();
    }
}