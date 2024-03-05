package crudsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Miguel Antonio
 */
public class CConnection {
    
    public static Connection getconec(){
       
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=school;"
                + "user=soporte;"
                + "password=soporte;"
                + "loginTimeout=30;"
                + "TrustServerCertificate=True";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
}
