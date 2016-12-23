
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
     public static String url= "jdbc:postgresql://localhost:5432/proyecto";
    public static String user = "postgres";
    public static String password = "emelecmivida";
    
    public static Connection open()throws SQLException{
        Connection conex = null;
        
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
      
    }
}
