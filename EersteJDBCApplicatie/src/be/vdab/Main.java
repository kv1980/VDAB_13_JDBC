package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:mysql://localhost/tuincentrum?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "VDABcursist2018";
    private static final String UPDATE_PRIJS = "update planten set verkoopprijs = verkoopprijs * 1.1";
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement statement = connection.createStatement()){
            System.out.println(statement.executeUpdate(UPDATE_PRIJS)); //ZO KORT MOGELIJK !!!!!!!
        } catch (SQLException ex){
            System.err.println("Connectie niet geopend.");
        } 
    }
}