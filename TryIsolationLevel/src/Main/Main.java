package Main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    
    private static final String URL = "jdbc:mysql://localhost/tuincentrum?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String UPDATE_PRIJS =
            "update planten set verkoopprijs = ? where id = ? and ? <= verkoopprijs*1.1";
    private static final String SELECT_PLANT =
            "select id from planten where id = ?";
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Geef id in: ");
            Integer plantId = sc.nextInt();
            System.out.print("Geef nieuwe verkoopprijs in: ");
            BigDecimal nieuweVerkoopprijs = sc.nextBigDecimal();
            try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                    PreparedStatement statementUpdate = connection.prepareStatement(UPDATE_PRIJS)){
                statementUpdate.setBigDecimal(1,nieuweVerkoopprijs);
                statementUpdate.setInt(2,plantId);
                statementUpdate.setBigDecimal(3, nieuweVerkoopprijs);
                connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
                connection.setAutoCommit(false);
                if (statementUpdate.executeUpdate()==0){
                   try (PreparedStatement statementSelect = connection.prepareStatement(SELECT_PLANT)){
                       statementSelect.setInt(1,plantId);
                       try (ResultSet resultSet = statementSelect.executeQuery()){
                           System.out.println(resultSet.next()?"Nieuwe verkoopprijs is te hoog.":"Plantrecord werd niet gevonden.");
                       }
                   } 
                }
                connection.commit();
            } catch(SQLException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}