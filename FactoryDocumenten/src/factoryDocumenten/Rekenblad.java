package factoryDocumenten;

public class Rekenblad extends Document{
    public Rekenblad(String bestandsnaam){
        super(bestandsnaam);
    }

    @Override
    public void print() {
        System.out.println("een afdruk van het Rekenblad: "+bestandsnaam);
    }

    @Override
    public void printPreview() {
        System.out.println("een afdrukvoorbeeld van het Rekenblad: "+bestandsnaam);
    }
}