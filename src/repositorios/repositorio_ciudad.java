
package repositorios;

import clases.ciudades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.conexion;

/**
 *
 * @author HewPack
 */
public class repositorio_ciudad {
    conexion con = new conexion();
    
    public List<ciudades> getCiudades(){
        Connection conex ;
        
        List<ciudades>  ciud = new ArrayList <ciudades>();
        try{
            String query = "SELECT * FROM ciudades";
            conex = conexion.open();
            PreparedStatement pst = conex.prepareCall(query);
            
            ResultSet rst= pst.executeQuery();
            while (rst.next()){
                ciudades ciu = new ciudades(rst.getInt(1),rst.getString(2));
                ciud.add(ciu);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return ciud;
    }
}
