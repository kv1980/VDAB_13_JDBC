package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    
    private static final String URL = "jdbc:mysql://localhost/bieren?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String UPDATE_BROUWER_2 =
            "update bieren set brouwerid = 2 where brouwerid = 1 AND alcohol >= 8.5";
    private static final String UPDATE_BROUWER_3 =
            "update bieren set brouwerid = 3 where brouwerid = 1";
    private static final String DELETE_BROUWER_1 =
            "delete from brouwers where id = 1";
    
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                Statement statement = connection.createStatement()){
            statement.addBatch(UPDATE_BROUWER_2);
            statement.addBatch(UPDATE_BROUWER_3);
            statement.addBatch(DELETE_BROUWER_1);
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connection.setAutoCommit(false);
            statement.executeBatch();
            connection.commit();
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}