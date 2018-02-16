package factoryDocumenten;

public abstract class Document {
   protected String bestandsnaam;
    
    public Document(String bestandsnaam){
        this.bestandsnaam = bestandsnaam;
    }
    
    public abstract void print();
    
    public abstract void printPreview();
}
