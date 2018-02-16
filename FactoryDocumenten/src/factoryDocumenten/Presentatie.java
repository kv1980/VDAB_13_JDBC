package factoryDocumenten;

public class Presentatie extends Document{
    public Presentatie(String bestandsnaam){
        super(bestandsnaam);
    }

    @Override
    public void print() {
        System.out.println("een afdruk van de Presentatie: "+bestandsnaam);
    }

    @Override
    public void printPreview() {
        System.out.println("een afdrukvoorbeeld van de Presentatie: "+bestandsnaam);
    }
}