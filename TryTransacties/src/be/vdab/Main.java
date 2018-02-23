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
            = "update planten set verkoopprijs = verkoopprijs * 1.1 where verkoopprijs >= 100";
    private static final String UPDATE_PRIJS_LAGER_DAN_100
            = "update planten set verkoopprijs = verkoopprijs * 1.05 where verkoopprijs < 100";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();) {
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED); // gewoon updates uitvoeren in deze transactie
            connection.setAutoCommit(false); // database moet alle statements of geen enkel statement (bij rollback) uitvoeren
            statement.addBatch(UPDATE_PRIJS_HOGER_DAN_100); // alle insert, update and delete statements in één netwerkpakket
            statement.addBatch(UPDATE_PRIJS_LAGER_DAN_100);
            int[] aantalGewijzigdeRecords = statement.executeBatch(); // stuur statements als één netwerkpakket door en krijg één netwerkpakket als array terug
            System.out.println(aantalGewijzigdeRecords[0]+" planten met prijs 10% verhoogd");
            System.out.println(aantalGewijzigdeRecords[1]+" planten met prijs 5% verhoogd");
            connection.commit();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}