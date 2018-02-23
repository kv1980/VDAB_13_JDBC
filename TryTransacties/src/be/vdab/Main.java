package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String URL = "jdbc:mysql://localhost/tuincentrum?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String UPDATE_PRIJS_HOGER_DAN_100
            = "update planten set verkoopprijs = verkoopprijs / 1.1 where verkoopprijs >= 100";
    private static final String UPDATE_PRIJS_LAGER_DAN_100
            = "update planten set verkoopprijs = verkoopprijs / 1.05 where verkoopprijs < 100";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();) {
            connection.setAutoCommit(false);
            System.out.println(statement.executeUpdate(UPDATE_PRIJS_HOGER_DAN_100));
            System.out.println(statement.executeUpdate(UPDATE_PRIJS_LAGER_DAN_100));
            connection.commit();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}