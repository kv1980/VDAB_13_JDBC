package builderxyz;

//import java.text.DecimalFormat;

public class Coordinaten {
    private final double x;
    private final double y;
    private final double z;
    //private static final DecimalFormat DECIMALFORMAT = new DecimalFormat("#0.00");
    
    private Coordinaten(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override 
    public String toString(){
        return String.format("De coördinaten (x,y,z) zijn %5.2f - %5.2f - %5.2f", x, y, z);
        //return "De coördinaten (X - Y - Z) zijn "+DECIMALFORMAT.format(x)+" - "+DECIMALFORMAT.format(y)+" - "+DECIMALFORMAT.format(z);
    }
    
    public static class CoordinatenBuilder {
        private double x;
        private double y;
        private double z;
        
        public CoordinatenBuilder metX(double x){
            this.x = x;
            return this;
        }
        
        public CoordinatenBuilder metY(double y){
            this.y = y;
            return this;
        }
        
        public CoordinatenBuilder metZ(double z){
            this.z = z;
            return this;
        }
        
        public Coordinaten maakCoordinaten(){
            return new Coordinaten(x,y,z);
        }
    }
}
