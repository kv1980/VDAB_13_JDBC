package factoryDocumenten;

public class Tekst extends Document{
    public Tekst(String bestandsnaam){
        super(bestandsnaam);
    }

    @Override
    public void print() {
        System.out.println("een afdruk van de Tekst: "+bestandsnaam);
    }

    @Override
    public void printPreview() {
        System.out.println("een afdrukvoorbeeld van de Tekst: "+bestandsnaam);
    }
}