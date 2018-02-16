package eiland;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public enum InwonerFactory {
    INSTANCE;

    public void vul(List<Inwoner> inwonerLijst) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/cursist/Documents/NetBeansProjects/Eiland/eilandbewoners.txt"))) {
            String bestandsregel = reader.readLine();
            while (bestandsregel != null) {
                String naamInwoner = bestandsregel.substring(bestandsregel.indexOf(",") + 1);
                char soortInwoner = bestandsregel.charAt(0);                
                switch (soortInwoner) {
                    case 'V':
                        inwonerLijst.add(new Vogel(naamInwoner));
                        break;
                    case 'Z':
                        inwonerLijst.add(new Zoogdier(naamInwoner));
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                bestandsregel = reader.readLine();
            }
        } catch (IOException ex) {
            System.err.println("File not found");
        }
    }
}
