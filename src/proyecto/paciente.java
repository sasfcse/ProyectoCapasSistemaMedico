
package proyecto;

import clases.ciudades;
import clases.pacientes;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import repositorios.repositoriopacientes;


public class paciente extends javax.swing.JFrame {
conexion con=new conexion();
     Connection conex=con.conexion();
    repositoriopacientes repac=new repositoriopacientes();
    
    public paciente() {
        initComponents();
        cargarcbciudad();
        txtid_ciudad.setVisible(false);
        txtid_cliente.setVisible(false);
        txtalergias.setEnabled(false);
        
    }
    public void cargarcbciudad(){
    try{
            Statement st = conex.createStatement();
            String sql="Select * from ciudades";
            ResultSet rs = st.executeQuery(sql);
            cb_ciudad.addItem("");
            while(rs.next()){
                cb_ciudad.addItem(rs.getString(2));
            }
            cb_ciudad.setSelectedIndex(-1);
            txtid_ciudad.setText("");
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txt_tipo_sangre = new javax.swing.JTextField();
        txtalergias = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txtdomicilio = new javax.swing.JTextField();
        txtbuscar = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        btconsultar = new javax.swing.JButton();
        cbsexo = new javax.swing.JComboBox<>();
        dtfecha = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txt_e_mail = new javax.swing.JTextField();
        txtid_cliente = new javax.swing.JTextField();
        btregistro = new javax.swing.JButton();
        btsi = new javax.swing.JButton();
        btno = new javax.swing.JButton();
        cb_ciudad = new javax.swing.JComboBox<>();
        txtid_ciudad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PACIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 782, 37));

        jLabel2.setText("CEDULA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 58, -1, -1));

        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 97, -1, -1));

        jLabel4.setText("FECHA NACIMIENTO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, -1, -1));

        jLabel5.setText("SEXO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 175, -1, -1));

        jLabel6.setText("ALTURA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 213, -1, -1));

        jLabel7.setText("PESO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 251, -1, -1));

        jLabel8.setText("TIPO DE SANGRE:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 58, -1, -1));

        jLabel9.setText("ALERGIAS:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 97, -1, -1));

        jLabel10.setText("CIUDAD:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 140, -1, -1));

        jLabel11.setText("TELEFONO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 175, -1, -1));

        jLabel12.setText("DOMICILIO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 213, -1, -1));

        jLabel13.setText("BUSCAR PACIENTE:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

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
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 55, 150, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 94, 150, -1));

        txtaltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtalturaKeyTyped(evt);
            }
        });
        getContentPane().add(txtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 210, 150, -1));

        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });
        txtpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpesoKeyTyped(evt);
            }
        });
        getContentPane().add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 248, 150, -1));
        getContentPane().add(txt_tipo_sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 58, 125, -1));

        txtalergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalergiasActionPerformed(evt);
            }
        });
        txtalergias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtalergiasKeyTyped(evt);
            }
        });
        getContentPane().add(txtalergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 96, 125, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 172, 125, -1));

        txtdomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdomicilioKeyTyped(evt);
            }
        });
        getContentPane().add(txtdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 125, -1));
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 302, 329, -1));

        btnuevo.setText("NUEVO");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 371, -1, -1));

        btguardar.setText("GUARDAR");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 371, -1, -1));

        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 371, -1, -1));

        btmodificar.setText("MODIFICAR");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 371, -1, -1));

        btsalir.setText("SALIR");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        btsalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btsalirKeyTyped(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 371, -1, -1));

        btconsultar.setText("CONSULTAR");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 301, -1, -1));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));
        cbsexo.setSelectedIndex(-1);
        getContentPane().add(cbsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 172, 150, -1));
        getContentPane().add(dtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 134, 150, -1));

        jLabel14.setText("E-MAIL:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 251, -1, -1));
        getContentPane().add(txt_e_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 248, 125, -1));
        getContentPane().add(txtid_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 302, 23, -1));

        btregistro.setText("REGISTRO");
        btregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistroActionPerformed(evt);
            }
        });
        getContentPane().add(btregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 371, -1, -1));

        btsi.setText("SI");
        btsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiActionPerformed(evt);
            }
        });
        getContentPane().add(btsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 93, -1, -1));

        btno.setText("NO");
        btno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoActionPerformed(evt);
            }
        });
        getContentPane().add(btno, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 93, -1, -1));

        cb_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ciudadActionPerformed(evt);
            }
        });
        getContentPane().add(cb_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 134, 125, -1));
        getContentPane().add(txtid_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 134, 22, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo citas.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        // FUNCION GUARDAR
        ciudades ciud = new ciudades(cb_ciudad.getSelectedItem().toString());
        pacientes pac = new pacientes(txtcedula.getText(),txtnombre.getText(),Convertirfecha(),cbsexo.getSelectedItem().toString(),txtaltura.getText(),txtpeso.getText(),txt_tipo_sangre.getText(),txtalergias.getText(),txt_telefono.getText(),txtdomicilio.getText(),txt_e_mail.getText(),ciud);
        
        repac.guardar(pac);
        Limpiar();
    }//GEN-LAST:event_btguardarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // FUNCION ELIMINAR
        btnuevo.setEnabled(true);
        btguardar.setEnabled(true);
        btsalir.setEnabled(true);
         repac.eliminar(Integer.parseInt(txtid_cliente.getText()));
         Limpiar();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        // FUNCION BUSCAR / CONSULTAR
        
        btmodificar.setEnabled(true);
        btguardar.setEnabled(false);
        bteliminar.setEnabled(true);
        btsalir.setEnabled(false);
        btnuevo.setEnabled(true);
        //campo de texto
        txtcedula.setEnabled(false);
        txt_tipo_sangre.setEnabled(false);
        dtfecha.setEnabled(false);
        cbsexo.setEnabled(false);
        
        pacientes pact =(pacientes) repac.getPaciente(txtcedula.getText());
        txtcedula.setText(pact.getCedula());
        txtnombre.setText(pact.getNombres());
        dtfecha.setDate(pact.getFechanacimineto());
        cbsexo.setSelectedItem(pact.getSexo());
        txtaltura.setText(pact.getAltura());
        txtpeso.setText(pact.getPeso());
        txt_tipo_sangre.setText(pact.getTiposangre());
        txtalergias.setText(pact.getAlergias());
        txt_telefono.setText(pact.getTelefono());
        txtdomicilio.setText(pact.getDomicilio());
        txt_e_mail.setText(pact.getE_mail());
        cb_ciudad.setSelectedItem(pact.getCiudad().getNombre());
        
    }//GEN-LAST:event_btconsultarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // FUNCION MODIFICAR
        btguardar.setEnabled(false);
        btsalir.setEnabled(true);
        btnuevo.setEnabled(true);
        bteliminar.setEnabled(false);
       ciudades ciud = new ciudades(cb_ciudad.getSelectedItem().toString());
       pacientes pac = new pacientes(txtcedula.getText(),txtnombre.getText(),Convertirfecha(),cbsexo.getSelectedItem().toString(),txtaltura.getText(),txtpeso.getText(),txt_tipo_sangre.getText(),txtalergias.getText(),txt_telefono.getText(),txtdomicilio.getText(),txt_e_mail.getText(),ciud);
       //repac.modificar(, pac);
    }//GEN-LAST:event_btmodificarActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        //FUNCION NUEVO
        //ACTIVAR TEXTO
        btguardar.setEnabled(true);
        bteliminar.setEnabled(false);
        btmodificar.setEnabled(false);
        txtcedula.setEnabled(true);
        txt_tipo_sangre.setEnabled(true);
        dtfecha.setEnabled(true);
        cbsexo.setEnabled(true);
        //LLENAR NUEVO TEXTO
        Limpiar();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // FUNCION SALIR
        
        menu me = new menu();
         me.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistroActionPerformed
        // TODOS LOS REGISTRO DE LOS CLIENTES
       
        tabla_de_clientes tbclit = new tabla_de_clientes();
        tbclit.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btregistroActionPerformed

    private void btsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiActionPerformed
        // carga texto
        txtalergias.setEnabled(true);
    }//GEN-LAST:event_btsiActionPerformed

    private void btnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoActionPerformed
        // bloquea texto
        txtalergias.setEnabled(false);
    }//GEN-LAST:event_btnoActionPerformed

    private void cb_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ciudadActionPerformed
        // combox ciudad
        if(cb_ciudad.getSelectedIndex() != -1){
        try{
            Statement st =conex.createStatement();
            String sql = "Select * from ciudades where ciudad= '"+cb_ciudad.getSelectedItem().toString()+"'";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()){
                txtid_ciudad.setText(rs.getString(1));
            }
            
        }catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage());
            System.out.println(exc.getMessage());
        }   
       }
    }//GEN-LAST:event_cb_ciudadActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(e<'0'|| e>'9'){evt.consume();}
        if(txtcedula.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
       char e = evt.getKeyChar();
       if(!(e<'0'|| e>'9')){evt.consume();}
       if(txtnombre.getText().length()==50){evt.consume();}
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void txtalturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtalturaKeyTyped
        // TODO add your handling code here
        int k=(int)evt.getKeyChar();
        //Primer if no permite el ingreso de letras y otros símbolos
        if ((k >= 32 && k <= 45) ||(k >= 58 && k <= 126)  ){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            evt.consume();
        }
        //Segundo if no permite el ingreso de "ñ" ," Ñ" ni "/"
        if(k==241 || k==209|| k==47){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            evt.consume();
        }
        
    }//GEN-LAST:event_txtalturaKeyTyped

    private void txtpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesoKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
        //Primer if no permite el ingreso de letras y otros símbolos
        if ((k >= 32 && k <= 45) ||(k >= 58 && k <= 126)  ){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            evt.consume();
        }
        //Segundo if no permite el ingreso de "ñ" ," Ñ" ni "/"
        if(k==241 || k==209|| k==47){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            evt.consume();
        }
    }//GEN-LAST:event_txtpesoKeyTyped

    private void txtalergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalergiasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtalergiasActionPerformed

    private void txtalergiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtalergiasKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
       if(!(e<'0'|| e>'9')){evt.consume();}
       if(txtalergias.getText().length()==50){evt.consume();}
    }//GEN-LAST:event_txtalergiasKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(e<'0'|| e>'9'){evt.consume();}
        if(txt_telefono.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txtdomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdomicilioKeyTyped
        // TODO add your handling code here:
       char e = evt.getKeyChar();
       if(!(e<'0'|| e>'9')){evt.consume();}
       if(txtalergias.getText().length()==50){evt.consume();}
    }//GEN-LAST:event_txtdomicilioKeyTyped

    private void btsalirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btsalirKeyTyped
        // TODO add your handling code here:
        char escTeclapresionada=evt.getKeyChar();
        
        //da click al boton de Aceptar al detectar que se presiono la tecla ENTER.
        if(escTeclapresionada==KeyEvent.VK_ESCAPE){
            //Ejecuta el boton de aceptar (dar click)
            btsalir.doClick();
        }
    }//GEN-LAST:event_btsalirKeyTyped

//validar fecha
    public java.sql.Date Convertirfecha(){
        java.sql.Date fecha =new java.sql.Date(dtfecha.getDate().getTime());
        return fecha;
            
    }
    
    
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
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btno;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btregistro;
    private javax.swing.JButton btsalir;
    private javax.swing.JButton btsi;
    private javax.swing.JComboBox<String> cb_ciudad;
    private javax.swing.JComboBox<String> cbsexo;
    private com.toedter.calendar.JDateChooser dtfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_e_mail;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tipo_sangre;
    private javax.swing.JTextField txtalergias;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdomicilio;
    private javax.swing.JTextField txtid_ciudad;
    private javax.swing.JTextField txtid_cliente;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
  
private void Limpiar() {
      
        txtcedula.setText("");
        txtnombre.setText("");
        txtaltura.setText("");
        txtpeso.setText("");
        txt_tipo_sangre.setText("");
        txtalergias.setText("");
        cb_ciudad.setSelectedIndex(0);
        txt_telefono.setText("");
        txtdomicilio.setText("");  
        txt_e_mail.setText("");
        cbsexo.setSelectedIndex(-1);
        dtfecha.setDate(null);
        txtbuscar.setText("");
        txtid_cliente.setText("");
        txtid_ciudad.setText("");
    }
}
