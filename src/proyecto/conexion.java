
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection conex = null;
    public Connection conexion(){
        String cadena = "jdbc:postgresql://localhost:5432/proyecto";
        String user = "postgres";
        String pass = "christian1995";
        try{
            Class.forName("org.postgresql.Driver");
            conex = DriverManager.getConnection(cadena,user,pass);
            if(conex !=null){
                System.out.print("Conectando a base de datos...");  
            }
            //java.sql.Statement st = conex.createStatement();
            
        }
        catch(Exception exc){
            System.out.println("Error: " + exc.getMessage() );
        }
        return conex;
    }
}
