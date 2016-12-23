
package proyecto;

import clases.cita;
import clases.especialidades;
import clases.medicos;
import clases.pacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import repositorios.repositorio_especialidad;
import repositorios.repositoriocitas;
import repositorios.repositoriomedicos;
import repositorios.repositoriopacientes;

public class citas extends javax.swing.JFrame {
    conexion con=new conexion();
    repositoriopacientes repac =new repositoriopacientes();
    repositorio_especialidad resp = new repositorio_especialidad();
    repositoriomedicos remed = new repositoriomedicos();
    repositoriocitas recit =new repositoriocitas();
    pacientes pac ;
    public citas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cargarcbespecialidades();
  
      
        txtid_citas.setEnabled(false);
     
        txtpaciente.setEnabled(false);
        btnuevo.setEnabled(false);
        btmodificar.setEnabled(false);
        bteliminar.setEnabled(false);
    }
    
     public void cargarcbmedico(){
         especialidades esp = (especialidades)cbespecialidad.getSelectedItem();
        List<medicos> med = remed.getMedicos(esp.getId_especialidad());
    DefaultComboBoxModel dcb = new DefaultComboBoxModel();
    for(medicos medico: med){
        dcb.addElement(medico);
    }
    cbmedico.setModel(dcb);
    }
     
    public void cargarcbespecialidades(){
         List<especialidades> esp = resp.getEspecialidad();
    DefaultComboBoxModel dcb = new DefaultComboBoxModel();
    for(especialidades espec: esp){
        dcb.addElement(espec);
    }
    cbespecialidad.setModel(dcb);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dtfecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpaciente = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btctc = new javax.swing.JButton();
        txthora = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtid_citas = new javax.swing.JTextField();
        cbespecialidad = new javax.swing.JComboBox();
        cbmedico = new javax.swing.JComboBox();
        btguardar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();
        btconsultar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtbuscar_consulta = new javax.swing.JTextField();
        bnfactura = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("PRECIO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CITAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        jLabel10.setText("MEDICO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 272, -1, -1));

        jLabel3.setText("N° CITAS:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 85, -1, -1));
        getContentPane().add(dtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, -1));

        jLabel9.setText("N° CEDULA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 234, -1, -1));

        jLabel4.setText("FECHA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 120, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo _clinica_imprecion.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 82, -1, -1));

        jLabel5.setText("HORA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 158, -1, -1));

        jLabel7.setText("ESPECIALIDAD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 272, -1, -1));
        getContentPane().add(txtpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 150, -1));

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 231, 130, -1));

        jLabel6.setText("PACIENTE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 234, -1, -1));

        btctc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btctcActionPerformed(evt);
            }
        });
        getContentPane().add(btctc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 20, 20));
        getContentPane().add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 152, 130, -1));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 307, 104, -1));
        getContentPane().add(txtid_citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 82, 50, -1));

        cbespecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbespecialidadItemStateChanged(evt);
            }
        });
        cbespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbespecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(cbespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 269, 120, -1));

        cbmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmedicoActionPerformed(evt);
            }
        });
        getContentPane().add(cbmedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 269, 130, -1));

        btguardar.setText("GUARDAR");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        btsalir.setText("SALIR");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        btmodificar.setText("MODIFICAR");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        btnuevo.setText("NUEVO");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        btconsultar.setText("CONSULTAR");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        jLabel11.setText("BUSCAR:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        txtbuscar_consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscar_consultaKeyTyped(evt);
            }
        });
        getContentPane().add(txtbuscar_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 254, -1));

        bnfactura.setText("FACTURA");
        bnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(bnfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo citas.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cargarcomboxespecialidad(){
   
}
    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        // FUNCION GUARDAR
        especialidades esp = (especialidades)cbespecialidad.getSelectedItem();
        medicos med =(medicos)cbmedico.getSelectedItem();
       
        cita cit = new cita(Convertirfecha(),txthora.getText(),txtprecio.getText(),esp,med,pac);
        recit.guardar(cit);
        Limpiar();
    }//GEN-LAST:event_btguardarActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        // TODO add your handling code here:
        //ACTIVAR TEXTO
        txtcedula.setEnabled(true);
        txtpaciente.setEnabled(true);
        jLabel12.setEnabled(true);
        btguardar.setEnabled(true);
        btmodificar.setEnabled(false);
        bteliminar.setEnabled(false);
        //LLENAR NUEVO TEXTO
        Limpiar();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        // CONSULTAR
        btmodificar.setEnabled(true);
        bteliminar.setEnabled(true);
        btguardar.setEnabled(false);
        cita cit =(cita) recit.getCita(txtbuscar_consulta.getText());
        txtid_citas.setText(Integer.toString(cit.getId_citas()));
        dtfecha.setDate(cit.getFecha());
        txthora.setText(cit.getHora());
        txtpaciente.setText(cit.getPaciente().getNombres());
        txtcedula.setText(cit.getPaciente().getCedula());
        txtprecio.setText(cit.getPrecio());
        cbespecialidad.setSelectedItem(cit.getEspecialidad());
        cbmedico.setSelectedItem(cit.getMedico());
        
    }//GEN-LAST:event_btconsultarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // funcion eliminar
        btnuevo.setEnabled(true);
        btguardar.setEnabled(true);
        btsalir.setEnabled(true);
        
        recit.eliminar(Integer.parseInt(txtid_citas.getText()));
        Limpiar();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // funcion modificar
         btguardar.setEnabled(true);
        btsalir.setEnabled(true);
        btnuevo.setEnabled(true);
        bteliminar.setEnabled(false);
        
        especialidades esp = (especialidades)cbespecialidad.getSelectedItem();
        medicos med =(medicos)cbmedico.getSelectedItem();
       
        cita cit = new cita(Integer.parseInt(txtid_citas.getText()),Convertirfecha(),txthora.getText(),txtprecio.getText(),esp,med,pac);
        recit.modificar(cit);
        Limpiar();
    }//GEN-LAST:event_btmodificarActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // IR AL MENU 
          menu me = new menu();
         me.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void txtbuscar_consultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscar_consultaKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(e<'0'|| e>'9'){evt.consume();}
        if(txtbuscar_consulta.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txtbuscar_consultaKeyTyped

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(e<'0'|| e>'9'){evt.consume();}
        if(txtcedula.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(e<'0'|| e>'9'){evt.consume();}
        if(txtprecio.getText().length()==4){evt.consume();}
    }//GEN-LAST:event_txtprecioKeyTyped

    private void btctcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btctcActionPerformed
        // consulta de nombre
       pac=repac.getPaciente(txtcedula.getText());
       txtpaciente.setText(pac.getNombres());
    }//GEN-LAST:event_btctcActionPerformed

    private void cbespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbespecialidadActionPerformed
        // CARGAR COMBOX ESPECIALIAD
        
        if (cbespecialidad.getSelectedIndex()!=-1){
            cargarcbmedico();
            especialidades esp = (especialidades) cbespecialidad.getSelectedItem();
            txtprecio.setText(esp.getPago());
        }
    }//GEN-LAST:event_cbespecialidadActionPerformed

    private void cbespecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbespecialidadItemStateChanged
        //
    }//GEN-LAST:event_cbespecialidadItemStateChanged

    private void cbmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmedicoActionPerformed
        // llenar combox medico
        
    }//GEN-LAST:event_cbmedicoActionPerformed

    private void bnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnfacturaActionPerformed
        // TODO add your handling code here:
         factura_citas fct = new factura_citas();
         fct.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bnfacturaActionPerformed

 
//validar fecha
    public java.sql.Date Convertirfecha(){
        java.sql.Date fecha =new java.sql.Date(dtfecha.getDate().getTime());
        return fecha;
            
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnfactura;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton btctc;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
    private javax.swing.JComboBox cbespecialidad;
    private javax.swing.JComboBox cbmedico;
    private com.toedter.calendar.JDateChooser dtfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbuscar_consulta;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtid_citas;
    private javax.swing.JTextField txtpaciente;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables

private void Limpiar() {
      
        txtid_citas.setText("");
        txthora.setText("");
        txtpaciente.setText("");
        txtprecio.setText("");
        txtcedula.setText("");
        cbmedico.setSelectedIndex(-1);
        txtbuscar_consulta.setText("");
        cbespecialidad.setSelectedIndex(-1);
        dtfecha.setDate(null);

    }
}
