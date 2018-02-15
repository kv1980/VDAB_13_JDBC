package builderxyz;

public class BuilderXYZ {

    public static void main(String[] args) {
        Coordinaten.CoordinatenBuilder builder = new Coordinaten.CoordinatenBuilder();
        Coordinaten puntA = builder.metX(2.986)
                                   .metY(45.967)
                                   .metZ(33.333)
                                   .maakCoordinaten();
        System.out.println(puntA.toString());
    }
}