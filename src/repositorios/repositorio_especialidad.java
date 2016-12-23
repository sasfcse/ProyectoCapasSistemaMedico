
package repositorios;

import clases.especialidades;
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
public class repositorio_especialidad {
    conexion con = new conexion();
    
    public List<especialidades> getEspecialidad(){
        Connection conex ;
        
        List<especialidades>  esp = new ArrayList <especialidades>();
        try{
            String query = "SELECT * FROM especialidades";
            conex = conexion.open();
            PreparedStatement pst = conex.prepareCall(query);
            
            ResultSet rst= pst.executeQuery();
            while (rst.next()){
                especialidades espc = new especialidades (rst.getInt(1),rst.getString(2),rst.getString(3));
                esp.add(espc);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return esp;
    }
}
