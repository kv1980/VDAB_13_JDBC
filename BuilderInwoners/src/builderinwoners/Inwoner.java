package builderinwoners;

public class Inwoner {
    private String voornaam;
    private String familienaam;
    private int aantalKinderen;
    private int aantalKeerVerhuisd;
    private boolean gehuwd;
    private boolean gescheiden; 

    public Inwoner() {
    }

    public Inwoner metVoornaam(String voornaam) {
        this.voornaam = voornaam;
        return this;
    }

    public Inwoner metFamilienaam(String familienaam) {
        this.familienaam = familienaam;
        return this;
    }

    public void setAantalKinderen(int aantalKinderen) {
        this.aantalKinderen = aantalKinderen;
    }

    public void setAantalKeerVerhuisd(int aantalKeerVerhuisd) {
        this.aantalKeerVerhuisd = aantalKeerVerhuisd;
    }

    public void setGehuwd(boolean gehuwd) {
        this.gehuwd = gehuwd;
    }

    public void setGescheiden(boolean gescheiden) {
        this.gescheiden = gescheiden;
    }
    
    @Override
    public String toString(){
        return voornaam+' '+familienaam;
    }
    
    private Inwoner(String voornaam, String familienaam, int aantalKinderen, int aantalKeerVerhuisd, boolean gehuwd, boolean gescheiden) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
        this.aantalKeerVerhuisd = aantalKeerVerhuisd;
        this.gehuwd = gehuwd;
        this.gescheiden = gescheiden;
    }   
    
    public static class InwonerBuilder {
        private String voornaam;
        private String familienaam;
        private int aantalKinderen;
        private int aantalKeerVerhuisd;
        private boolean gehuwd;
        private boolean gescheiden; 
    
        public InwonerBuilder metVoornaam(String voornaam){
            this.voornaam = voornaam;
            return this;
        }
    
        public InwonerBuilder metFamilienaam(String familienaam) {
            this.familienaam = familienaam;
            return this;
        }
    
        public InwonerBuilder metAantalKinderen(int aantalKinderen) {
            this.aantalKinderen = aantalKinderen;
            return this;
        }
    
        public InwonerBuilder metAantalKeerVerhuisd(int aantalKeerVerhuisd){
            this.aantalKeerVerhuisd = aantalKeerVerhuisd;
            return this;
        }
    
        public InwonerBuilder metGehuwd(boolean gehuwd){
            this.gehuwd = gehuwd;
            return this;
        }
    
        public InwonerBuilder metGescheiden(boolean gescheiden){
            this.gescheiden = gescheiden;
            return this;
        }
    
        public Inwoner maakInwoner(){
            return new Inwoner(voornaam, familienaam, aantalKinderen,aantalKeerVerhuisd, gehuwd, gescheiden);
        }
    }
}