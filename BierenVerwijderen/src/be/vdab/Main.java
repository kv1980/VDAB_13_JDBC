package be.vdab;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost/bieren?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String DELETE_ALCOHOL_NULL
            = "delete from bieren where alcohol is null";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement()) {
            System.out.println("#recordes verwijderd: " + statement.executeUpdate(DELETE_ALCOHOL_NULL));
        } catch (SQLException ex) {
            System.err.println("Er is een connectie-fout opgetreden.");
        }
    }
}
