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
            connection.setAutoCommit(false);
            System.out.println(statement.executeUpdate(UPDATE_BROUWER_2));
            System.out.println(statement.executeUpdate(UPDATE_BROUWER_3));
            System.out.println(statement.executeUpdate(DELETE_BROUWER_1));
            connection.commit();
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}