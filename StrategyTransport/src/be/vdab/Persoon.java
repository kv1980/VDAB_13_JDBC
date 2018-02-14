package be.vdab;
public class Persoon {
    public void steekMeerOver(TransportMiddel transportmiddel){
        StringBuilder builder = new StringBuilder();
        builder.append("1. Inpakken\n");
        builder.append("2. ");
        builder.append(transportmiddel.kiesTransportMiddel());
        builder.append("\n");
        builder.append("3. Uitpakken");
        System.out.println(builder.toString());
    }
}