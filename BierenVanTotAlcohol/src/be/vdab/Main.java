package be.vdab;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static final String URL = "jdbc:mysql://localhost/bieren?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SELECT_BIEREN =
            "select naam, alcohol from bieren where alcohol between ? and ? "+
            "order by alcohol, naam";
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Geef een minimale alcoholpercentage op:");
            BigDecimal minAlcohol = sc.nextBigDecimal();
            System.out.print("Geef een maximale alcoholpercentage op:");
            BigDecimal maxAlcohol = sc.nextBigDecimal();
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    PreparedStatement statement = connection.prepareStatement(SELECT_BIEREN)) {
                statement.setBigDecimal(1, minAlcohol);
                statement.setBigDecimal(2, maxAlcohol);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()){
                    while (resultSet.next()){
                        System.out.println(resultSet.getString("naam")+": "+resultSet.getBigDecimal("alcohol"));
                    }
                }
                else {
                    System.out.println("no records found");
                }
            }
            catch (SQLException ex){
                System.err.println(ex.getMessage());
            }
            
        }
    }
}