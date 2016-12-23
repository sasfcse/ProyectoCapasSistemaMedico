
package proyecto;

import clases.especialidades;
import clases.medicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import repositorios.repositorio_especialidad;
import repositorios.repositoriomedicos;


public class medico extends javax.swing.JFrame {
     conexion con=new conexion();
     repositorio_especialidad resp = new repositorio_especialidad();
     repositoriomedicos remed=new repositoriomedicos();
     
    public medico() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cargartipodemedico();
        txtcg_tipo.setVisible(false);
        txtid_medico.setVisible(false);
        btnuevo.setEnabled(false);
        btmodificar.setEnabled(false);
        bteliminar.setEnabled(false);
        
    }

public void cargartipodemedico(){
    List<especialidades> esp = resp.getEspecialidad();
    DefaultComboBoxModel dcb = new DefaultComboBoxModel();
    for(especialidades espe: esp){
        dcb.addElement(espe);
    }
    cbespecialidad.setModel(dcb);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtconsulta = new javax.swing.JTextField();
        btsalir = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();
        txtid_medico = new javax.swing.JTextField();
        btregistro = new javax.swing.JButton();
        jpanelimprimir = new javax.swing.JPanel();
        txtdomicilio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txte_mail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmedico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        cbespecialidad = new javax.swing.JComboBox<>();
        txtcg_tipo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo citas.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnuevo.setText("NUEVO");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 209, -1, -1));

        btguardar.setText("GUARDAR");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 209, -1, -1));

        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 209, -1, -1));

        btmodificar.setText("MODIFICAR");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 209, -1, -1));

        jLabel8.setText("BUSCAR:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 270, -1, -1));
        getContentPane().add(txtconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 267, 312, -1));

        btsalir.setText("SALIR");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 209, -1, -1));

        btbuscar.setText("CONSULTAR");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 266, -1, -1));
        getContentPane().add(txtid_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 267, 25, -1));

        btregistro.setText("REGISTROS");
        btregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistroActionPerformed(evt);
            }
        });
        getContentPane().add(btregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 209, -1, -1));

        jpanelimprimir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpanelimprimir.add(txtdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 147, 145, -1));

        jLabel2.setText("CEDULA:");
        jpanelimprimir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 74, -1, -1));

        jLabel7.setText("ESPECIALIDAD:");
        jpanelimprimir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 150, -1, -1));
        jpanelimprimir.add(txte_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 109, 179, -1));

        jLabel3.setText("MEDICO:");
        jpanelimprimir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 112, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICOS");
        jpanelimprimir.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 22, 639, 31));

        jLabel5.setText("TELEFONO:");
        jpanelimprimir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 74, -1, -1));

        jLabel6.setText("E-MAIL:");
        jpanelimprimir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 112, -1, -1));

        txtmedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmedicoKeyTyped(evt);
            }
        });
        jpanelimprimir.add(txtmedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 109, 145, -1));

        jLabel4.setText("DOMICILIO:");
        jpanelimprimir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, -1, -1));
        jpanelimprimir.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 71, 178, -1));

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        jpanelimprimir.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 71, 145, -1));

        cbespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbespecialidadActionPerformed(evt);
            }
        });
        jpanelimprimir.add(cbespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 147, 130, -1));
        jpanelimprimir.add(txtcg_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 145, 28, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo citas.jpg"))); // NOI18N
        jpanelimprimir.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 350));

        getContentPane().add(jpanelimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 340));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MEDICO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 639, 31));

        jLabel10.setText("CEDULA:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 73, -1, -1));

        jLabel11.setText("MEDICO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 111, -1, -1));

        jLabel12.setText("DOMICILIO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 149, -1, -1));

        jLabel13.setText("TELEFONO:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 73, -1, -1));

        jLabel14.setText("E-MAIL:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 111, -1, -1));

        jLabel15.setText("ESPECIALIDAD:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 149, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        // FUNCION GUARDAR
     
        especialidades esp = (especialidades)cbespecialidad.getSelectedItem();
        medicos med = new medicos (txtcedula.getText(),txtmedico.getText(),txtdomicilio.getText(),txt_telefono.getText(),txte_mail.getText(),esp);
        remed.guardar(med);
        Limpiar();
    }//GEN-LAST:event_btguardarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        // FUNCION BUSCAR / CONSULTAR
    
        btmodificar.setEnabled(true);
        btguardar.setEnabled(false);
        bteliminar.setEnabled(true);
        btsalir.setEnabled(false);
        //bloquear campo de texto
        txtcedula.setEnabled(false);
        txtmedico.setEnabled(false);
        
         medicos med =remed.getMedico(txtconsulta.getText());
         txtid_medico.setText(Integer.toString(med.getId_medico()));
         txtcedula.setText(med.getCedula());
         txtmedico.setText(med.getNombre());
         txtdomicilio.setText(med.getDomicilio());
         txt_telefono.setText(med.getTelefono());
         txte_mail.setText(med.getE_mail());
         cbespecialidad.setSelectedItem(med.getEspecialidad());
        
         
        
    }//GEN-LAST:event_btbuscarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // FUNCION ELIMINAR
        btnuevo.setEnabled(true);
        btguardar.setEnabled(true);
        btsalir.setEnabled(true);
        
        remed.eliminar(Integer.parseInt(txtid_medico.getText()));
        Limpiar();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // FUNCION MODIFICAR
        btguardar.setEnabled(false);
        btsalir.setEnabled(true);
        btnuevo.setEnabled(true);
        bteliminar.setEnabled(false);
        // BLOQUEO DE TEXTO
        txtcedula.setEnabled(false);
        txtmedico.setEnabled(false);
        cbespecialidad.setEnabled(false);
        
        especialidades esp = (especialidades)cbespecialidad.getSelectedItem();
        medicos med = new medicos (Integer.parseInt(txtid_medico.getText()),txtdomicilio.getText(),txt_telefono.getText(),txte_mail.getText(),esp);
        remed.modificar(txtcedula.getText(),med);
        Limpiar();
    }//GEN-LAST:event_btmodificarActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        // FUNCION NUEVO
        //ACTIVAFR BOTONES
        bteliminar.setEnabled(false);
        btmodificar.setEnabled(false);
        btguardar.setEnabled(true);
        bteliminar.setEnabled(false);
        txtcedula.setEnabled(true);
        txtmedico.setEnabled(true);
        //CAMPO DE TEXTO VACIO
        txtmedico.setText("");
        cbespecialidad.setSelectedIndex(-1);
        txtcedula.setText("");
        txtconsulta.setText("");
        txtdomicilio.setText("");
        txte_mail.setText("");
        txt_telefono.setText("");
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // FUNCION SALIR
         menu me = new menu();
         me.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistroActionPerformed
        // MOSTRAR REGISTRO
        tabla_de_medicos tbmed = new tabla_de_medicos();
        tbmed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btregistroActionPerformed

    private void cbespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbespecialidadActionPerformed
       
    }//GEN-LAST:event_cbespecialidadActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(e<'0'|| e>'9'){evt.consume();}
        if(txtcedula.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtmedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmedicoKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(!(e<'0'|| e>'9')){evt.consume();}
        if(txtmedico.getText().length()==50){evt.consume();}
    }//GEN-LAST:event_txtmedicoKeyTyped
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btregistro;
    private javax.swing.JButton btsalir;
    private javax.swing.JComboBox<String> cbespecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanelimprimir;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcg_tipo;
    private javax.swing.JTextField txtconsulta;
    private javax.swing.JTextField txtdomicilio;
    private javax.swing.JTextField txte_mail;
    private javax.swing.JTextField txtid_medico;
    private javax.swing.JTextField txtmedico;
    // End of variables declaration//GEN-END:variables
   
      private void Limpiar() {
        txtmedico.setText("");
        cbespecialidad.setSelectedIndex(-1);
        txtcedula.setText("");
        txtconsulta.setText("");
        txtdomicilio.setText("");
        txte_mail.setText("");
        txt_telefono.setText("");
    }
}
