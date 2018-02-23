package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String URL = "jdbc:mysql://localhost/bieren?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SELECT_AANTAL_BIEREN_PER_BROUWER
            =   "select brouwers.naam as brouwernaam, count(bieren.brouwerid) as aantalBieren " +
                "from bieren " +
                "inner join brouwers " +
                "on bieren.brouwerid = brouwers.id "+
                "group by brouwerid";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_AANTAL_BIEREN_PER_BROUWER);
            while (resultSet.next()){
                System.out.println(resultSet.getString("brouwernaam")+":  "+resultSet.getInt("aantalBieren"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}