package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final String URL = "jdbc:mysql://localhost/tuincentrum?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    
    private static final String INSERT_SOORT
            = "insert into soort(naam) value (?)";

    public static void main(String[] args) {
        Set<String> soortnamen = new LinkedHashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Geef nieuwe soorten op tot je 'stop' ingeeft.");
            for (String soortnaam; !"stop".equalsIgnoreCase(soortnaam = scanner.nextLine());) {
                soortnamen.add(soortnaam);
            }
        }
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement statement = connection.prepareStatement(INSERT_SOORT)) {
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connection.setAutoCommit(false);
            for (String soortnaam : soortnamen) {
                statement.setString(1, soortnaam);
                statement.addBatch();
            }
            int[] aantalToegevoegdeRecordsPerInsert = statement.executeBatch();
            connection.commit();
            System.out.println(String.format("er werden %d records toegevoegd", aantalToegevoegdeRecordsPerInsert.length));
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
