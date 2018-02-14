package be.vdab;
public class Persoon {
    public void steekMeerOver(Algoritme algoritme){
        StringBuilder builder = new StringBuilder();
        builder.append("1. Inpakken\n");
        builder.append("2. ");
        builder.append(algoritme.kiesTransportMiddel(this));
        builder.append("\n");
        builder.append("3. inpakken");
        System.out.println(builder.toString());
    }
}