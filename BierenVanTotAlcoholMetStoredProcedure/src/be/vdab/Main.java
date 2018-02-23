package be.vdab;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static final String URL = "jdbc:mysql://localhost/bieren?useSSL=false&noAccessToProcedureBodies=true";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String CALL_BIEREN_TUSSEN_ALCOHOLPERCENTAGE
            = "{call bierenTussenAlcoholPercentage(?,?)}";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Geef minimale alcoholpercentage op: ");
            BigDecimal minAlc = scanner.nextBigDecimal();
            System.out.print("Geef maximale alcoholpercentage op: ");
            BigDecimal maxAlc = scanner.nextBigDecimal();
            try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
                    CallableStatement statement = connection.prepareCall(CALL_BIEREN_TUSSEN_ALCOHOLPERCENTAGE)){
                statement.setBigDecimal(1,minAlc);
                statement.setBigDecimal(2,maxAlc);
                try (ResultSet resultSet = statement.executeQuery()){
                    boolean erIsEenRecord = false;
                    while (resultSet.next()){
                        erIsEenRecord = true;
                        System.out.println(resultSet.getString("biernaam")+" van brouwer "+resultSet.getString("brouwernaam")+" heeft "+resultSet.getBigDecimal("alcohol")+"% alcohol.");
                    }
                    if (!erIsEenRecord){
                        System.out.println("Uw zoektocht heeft geen records opgeleverd.");
                    }
                }                
            } catch (SQLException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}