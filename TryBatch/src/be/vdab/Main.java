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
            = "insert into soorten(naam) values ?";

    public static void main(String[] args) {        
        Set<String> namen = new LinkedHashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Geef nieuwe soorten op tot je 'stop' ingeeft.");
            for (String naam; !"stop".equalsIgnoreCase(naam = scanner.nextLine());) {
                namen.add(naam);
            }
        }
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement statement = connection.prepareStatement(INSERT_SOORT)) {
            for (String naam : namen) {
                statement.setString(1,naam);
                statement.addBatch();
            }
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED); //voor addBatch of erna?
            connection.setAutoCommit(false);
            int[] aantalToegevoegdeRecordsPerInsert = statement.executeBatch();
            connection.commit();
            System.out.println(String.format("er werden %d records toegevoegd",aantalToegevoegdeRecordsPerInsert.length));
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}