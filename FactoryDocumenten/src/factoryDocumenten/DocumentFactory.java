package factoryDocumenten;

public enum DocumentFactory {
    INSTANCE;
    
    public Document open(String bestandsnaam){
        String extensie = bestandsnaam.substring(bestandsnaam.lastIndexOf(".")+1);
        switch (extensie){
            case "xlsx" :
            case "xls" :
                return new Rekenblad(bestandsnaam);
            case "docx" :
            case "doc" : 
                return new Tekst(bestandsnaam);
            case "pptx" :
            case "ppt" :
                return new Presentatie(bestandsnaam);
            default :
                throw new IllegalArgumentException();
        }
    } 
}
