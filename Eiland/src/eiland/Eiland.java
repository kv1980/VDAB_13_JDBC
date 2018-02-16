package eiland;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Eiland {

    private final Vulkaan vulkaan = new Vulkaan();
    //private final List<Inwoner> inwonerLijst = new ArrayList<>();

    public void bevolkMetInwoners(String bestandsnaam) {
        try (BufferedReader reader = new BufferedReader(new FileReader(bestandsnaam))) {
            String bestandsregel = reader.readLine();
            while (bestandsregel != null) {
                Inwoner inwoner = InwonerFactory.INSTANCE.maakInwoner(bestandsregel);
                //inwonerLijst.add(inwoner);
                vulkaan.addObserver(inwoner);
                bestandsregel = reader.readLine();
            }
        } catch (IOException ex) {
            System.err.println("File not found");
        }
    }

    public void doeVulkaanUitbarsten() {
        vulkaan.barstUit();
    }
}
