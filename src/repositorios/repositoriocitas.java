
package repositorios;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import clases.cita;
import clases.especialidades;
import clases.medicos;
import clases.pacientes;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyecto.conexion;
import sun.util.resources.cldr.saq.CalendarData_saq_KE;

/**
 *
 * @author usuario
 */
public class repositoriocitas {
    repositoriopacientes repa = new repositoriopacientes();
    conexion con=new conexion();
     //guardar
      public void guardar(cita cit){
          PreparedStatement pstm = null;
        try{
              Connection conex = conexion.open();
              pstm = conex.prepareStatement("INSERT INTO citas(fecha,hora,precio,id_especialidad,id_medico,id_paciente )VALUES(?,?,?,?,?,?)");          
              pstm.setDate(1,cit.getFecha());
              pstm.setString(2, cit.getHora());
              pstm.setString(3, cit.getPrecio());
              pstm.setInt(4, cit.getEspecialidad().getId_especialidad());
              pstm.setInt(5, cit.getMedico().getId_medico());
              pstm.setInt(6, cit.getPaciente().getId_personas());
              pstm.execute();
              
              JOptionPane.showMessageDialog(null,"registro grabado exitosamente");
              
            }catch (SQLException exc){
                 System.out.println("Error: " + exc.getMessage() );
                 System.out.println(exc.getMessage());
        }
      }
      
      //eliminar
      public void eliminar (int id){
          PreparedStatement pst = null;
        try{
            Connection conex = conexion.open();
            pst = conex.prepareStatement("delete from citas where id_citas=?");
            pst.setInt(1, id);
            
            JOptionPane.showMessageDialog(null,"registro elimidado exitosamente");
            
            pst.executeQuery();
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
      }
      
      //modificar
      public void modificar( cita cit ){
          PreparedStatement pst = null;
        try{
            Connection conex = conexion.open();
            pst=conex.prepareStatement("update citas set fecha=?,hora=? ,id_especialidad=? ,id_medico=?where id_citas=?");
             
              pst.setDate(1, cit.getFecha());
              pst.setString(2, cit.getHora());
              pst.setInt(3, cit.getEspecialidad().getId_especialidad());
              pst.setInt(4, cit.getMedico().getId_medico());
              pst.setInt(5, cit.getId_citas());

              pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"registro grabado exitosamente");
              
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }   
      }
      //consultar
      public cita getCita(String cedula){
         cita cit=null;
         String sql="";
         sql="SELECT  clientes.*,medicos.*,especialidades.*,citas.* from citas "
                 + "inner join clientes on ( citas.id_paciente = clientes.id_cliente)"
                 + "inner join medicos on (  citas.id_medico = medicos.id_medico)"
                 + "inner join especialidades on ( citas.id_especialidad = especialidades.id_especialidad) "
                 + "where clientes.cedula=?";
         try{
          Connection conex = conexion.open();
          PreparedStatement pst=conex.prepareStatement(sql);
          pst.setString(1,cedula);
          
          pst.execute();
          ResultSet rs = pst.executeQuery();
          while (rs.next()){
                pacientes pac = repa.getPaciente(rs.getString(2));
                especialidades esp =new especialidades(rs.getInt(21),rs.getString(22),rs.getString(23));
                medicos med = new medicos(rs.getInt(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),esp);

                cit = new cita (rs.getInt(24),rs.getDate(25),rs.getString(26),rs.getString(27), esp, med,pac);
          }
             
          return cit ;
         }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }  
    return null;     
    }
      
     //___________________________________________________________
      public List<cita> getCitas(int Valor,String param){
          cita cit=null;  
          List<cita> cits = new ArrayList<cita>();
          String sql = getSql(Valor, param);
         try{
             
          Connection conex = conexion.open();
          PreparedStatement pst=conex.prepareStatement(sql);
          
          
          pst.execute();
          ResultSet rs = pst.executeQuery();
          while (rs.next()){
                pacientes pac = repa.getPaciente(rs.getString(2));
                especialidades esp =new especialidades(rs.getInt(21),rs.getString(22),rs.getString(23));
                medicos med = new medicos(rs.getInt(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),esp);

                cit = new cita (rs.getInt(24),rs.getDate(25),rs.getString(26),rs.getString(27), esp, med,pac);
                cits.add(cit);
          }
             
          return cits ;
         }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }  
    return null;     
    }
      
      //______________________________________
       public String getSql(int Valor,String param){
      
       String sql="";
       if (Valor ==  0){
            sql="SELECT  clientes.*,medicos.*,especialidades.*,citas.* from citas "
                 + "inner join clientes on ( citas.id_paciente = clientes.id_cliente)"
                 + "inner join medicos on (  citas.id_medico = medicos.id_medico)"
                 + "inner join especialidades on ( citas.id_especialidad = especialidades.id_especialidad)";
        }
        else{
            if (Valor == 1){
           sql="SELECT  clientes.*,medicos.*,especialidades.*,citas.* from citas "
                 + "inner join clientes on ( citas.id_paciente = clientes.id_cliente)"
                 + "inner join medicos on (  citas.id_medico = medicos.id_medico)"
                 + "inner join especialidades on ( citas.id_especialidad = especialidades.id_especialidad) "
                 + "where clientes.cedula= '" +param+ "'";
            }
            if (Valor == 2){
            sql="SELECT  clientes.*,medicos.*,especialidades.*,citas.* from citas "
                 + "inner join clientes on ( citas.id_paciente = clientes.id_cliente)"
                 + "inner join medicos on (  citas.id_medico = medicos.id_medico)"
                 + "inner join especialidades on ( citas.id_especialidad = especialidades.id_especialidad) "
                 + "where especialidades.descripcion = '" + param + "'";
                    }
        }
       return sql;
       }
}
