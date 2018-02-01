package factoryDocumenten;

public class Main {


    public static void main(String[] args) {
        Document document = DocumentFactory.INSTANCE.open("oefening.xls");
        document.print();
    }
    
}
