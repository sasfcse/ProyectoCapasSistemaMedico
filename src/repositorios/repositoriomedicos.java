
package repositorios;

import clases.especialidades;
import clases.medicos;
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
 * @author usuario
 */
public class repositoriomedicos {
    
    conexion con=new conexion();
     
     //guardar
     public void guardar (medicos med){
     PreparedStatement pstm = null;
        try{
            Connection conex = conexion.open();
              pstm = conex.prepareStatement("INSERT INTO medicos(cedula,nombre,domicilio,telefono,e_mail,id_especialidad )VALUES(?,?,?,?,?,?)");          
              pstm.setString(1, med.getCedula());
              pstm.setString(2, med.getNombre()); 
              pstm.setString(3, med.getDomicilio());
              pstm.setString(4, med.getTelefono());
              pstm.setString(5, med.getE_mail());
              pstm.setInt(6, med.getEspecialidad().getId_especialidad());
              
              pstm.execute();
              JOptionPane.showMessageDialog(null,"registro grabado exitosamente");
              
            }catch (SQLException exc){
                 System.out.println("Error: " + exc.getMessage() );  
        }    
     }
     //consultar
     public List<medicos> getMedicos(int id){
        Connection conex ;
        
        List<medicos>  me = new ArrayList <medicos>();
        try{
            String query = "SELECT medicos.*, especialidades.* FROM medicos inner join especialidades on (medicos.id_especialidad=especialidades.id_especialidad ) where medicos.id_especialidad=? ";
            conex = conexion.open();
            
            PreparedStatement pst = conex.prepareCall(query);
            pst.setInt(1, id);
            ResultSet rst= pst.executeQuery();
            while (rst.next()){
               especialidades esp =new especialidades(rst.getInt(8),rst.getString(9),rst.getString(10));
                medicos med = new medicos(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),esp);
                me.add(med);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return me;
    }
     //eliminar
     public void eliminar (int id){
         PreparedStatement pst = null;
        try{
            Connection conex = conexion.open();
            pst = conex.prepareStatement("delete from medicos where id_medico=?");
            pst.setInt(1, id);
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"registro elimidado exitosamente");
            
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
     }
     //modificar
     public void modificar(String cedula,medicos med){
         PreparedStatement pst = null;
        try{
            Connection conex = conexion.open();
            pst=conex.prepareStatement("update medicos set domicilio=?,telefono=?,e_mail=?,id_especialidad=? where id_medico=?" );
              
              pst.setString(1, med.getDomicilio());
              pst.setString(2, med.getTelefono());
              pst.setString(3, med.getE_mail());
              pst.setInt(4, med.getEspecialidad().getId_especialidad());
              pst.setInt(5, med.getId_medico());
         
              pst.execute();
              JOptionPane.showMessageDialog(null,"registro grabado exitosamente");
             
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
     }
     
     //consultar datos
      public medicos getMedico(String cedula){
         medicos med=null;
         String sql="";
         sql="SELECT medicos.*,especialidades.* FROM medicos "
                 +"INNER JOIN especialidades on medicos.id_especialidad=especialidades.id_especialidad where medicos.cedula = ?";
         try{
          Connection conex = conexion.open();
          PreparedStatement pst=conex.prepareStatement(sql);
          pst.setString(1,cedula);
          
          pst.execute();
          ResultSet rs = pst.executeQuery();
          while (rs.next()){
                especialidades esp = new especialidades(rs.getInt(8),rs.getString(9),rs.getString(10));
                med=new medicos(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),esp);
          }
             
          return med ;
         }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }  
    return null;     
    }
      //_________________________________________________________________________________________________
      public List<medicos> getMedicoss(int Valor,String param){
        medicos medi=null;
        List<medicos>  me = new ArrayList <medicos>();
        String sql = getSql(Valor, param);
        try{
            Connection conex = conexion.open();
           PreparedStatement pst=conex.prepareStatement(sql);
           
            ResultSet rst= pst.executeQuery();
            while (rst.next()){
               especialidades esp =new especialidades(rst.getInt(8),rst.getString(9),rst.getString(10));
               medi = new medicos(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),esp);
                me.add(medi);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return me;
    }
      //__________________________________________________________________________________________________
       public String getSql(int Valor,String param){
      
       String sql="";
       if (Valor ==  0){
            sql="SELECT medicos.*, especialidades.* FROM medicos inner join especialidades on (medicos.id_especialidad=especialidades.id_especialidad )";
        }
        else{
            if (Valor == 1){
           sql="SELECT medicos.*, especialidades.* FROM medicos inner join especialidades on (medicos.id_especialidad=especialidades.id_especialidad )"
                 + "where medicos.cedula= '" +param+ "'";
            }
            if (Valor == 2){
            sql="SELECT medicos.*, especialidades.* FROM medicos inner join especialidades on (medicos.id_especialidad=especialidades.id_especialidad )"
                 + "where especialidades.descripcion = '" + param + "'";
                    }
        }
       return sql;
       }
}
