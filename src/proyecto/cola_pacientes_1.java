package proyecto;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class cola_pacientes_1 extends javax.swing.JFrame {

    public cola_pacientes_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_mostrar = new javax.swing.JButton();
        bt_salir = new javax.swing.JButton();
        bn_atendido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamostrar = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_mostrar.setText("MOSTRAR");
        bt_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mostrarActionPerformed(evt);
            }
        });

        bt_salir.setText("SALIR");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        bn_atendido.setText("ATENDIDO");
        bn_atendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_atendidoActionPerformed(evt);
            }
        });

        tablamostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CITAS", "FECHA", "HORA", "PACIENTES", "CEDULA", "MEDICO"
            }
        ));
        jScrollPane1.setViewportView(tablamostrar);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ATENCION PACIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_mostrar)
                        .addGap(106, 106, 106)
                        .addComponent(bn_atendido)
                        .addGap(123, 123, 123)
                        .addComponent(bt_salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mostrar)
                    .addComponent(bt_salir)
                    .addComponent(bn_atendido))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mostrarActionPerformed
        //MOSTRAR LA TABLA
        DefaultTableModel tabla =  (DefaultTableModel)cola_pacientes_1.tablamostrar.getModel();
        tabla.setRowCount(0);
        tablamostrar.setModel(tabla);
        String sql="SELECT citas.*,medicos.nombre from citas inner join medicos on citas.id_medico=medicos.id_medico ";
        atencion_paciente ap = new atencion_paciente();
        try {
            Statement st = conex.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while (rs.next()){
                ap.InsertarCola(rs.getInt(1),rs.getString(2),rs.getString(3) ,rs.getString(4), rs.getString(5), rs.getString(9));
            }
            ap.llenarTabla();
            
     
        } catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
    }//GEN-LAST:event_bt_mostrarActionPerformed

    private void bn_atendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_atendidoActionPerformed
        // eliminar 
        
    }//GEN-LAST:event_bn_atendidoActionPerformed

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        // volver al menu
        menu me = new menu();
         me.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bt_salirActionPerformed

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
            java.util.logging.Logger.getLogger(cola_pacientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cola_pacientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cola_pacientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cola_pacientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cola_pacientes_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bn_atendido;
    private javax.swing.JButton bt_mostrar;
    private javax.swing.JButton bt_salir;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablamostrar;
    // End of variables declaration//GEN-END:variables
     conexion con=new conexion();
     Connection conex=con.conexion();
}
