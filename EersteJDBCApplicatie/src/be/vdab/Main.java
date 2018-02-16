package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String URL = "jdbc:mysql://localhost/tuincentrum?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "VDABcursist2018";
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
            System.out.println("Connectie geopend."); //ZO KORT MOGELIJK !!!!!!!
        } catch (SQLException ex){
            System.err.println("Connectie niet geopend.");
        } 
    }
}