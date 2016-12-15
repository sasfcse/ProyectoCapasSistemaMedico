
package proyecto;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class datos_de_paciente extends javax.swing.JFrame implements Printable {

    public datos_de_paciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        txt_consulta = new javax.swing.JTextField();
        bnconsultar = new javax.swing.JButton();
        bnimprimir = new javax.swing.JButton();
        bnsalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_cedula = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        lb_sexo = new javax.swing.JLabel();
        lb_altura = new javax.swing.JLabel();
        lb_peso = new javax.swing.JLabel();
        lb_tipodesangre = new javax.swing.JLabel();
        lb_alergias = new javax.swing.JLabel();
        lb_ciudad = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        lb_domicilio = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("BUSCAR:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 592, -1, -1));
        getContentPane().add(txt_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 589, 153, -1));

        bnconsultar.setText("CONSULTA");
        bnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(bnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 588, -1, -1));

        bnimprimir.setText("IMPRIMIR");
        bnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(bnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 617, -1, -1));

        bnsalir.setText("SALIR");
        bnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(bnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 617, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("__________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 438, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INFORME DEL PACIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 438, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("__________________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 438, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo _clinica_imprecion.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 440, 77));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CEDULA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 179, 63, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("NOMBRE:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 211, 72, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("FECHA DE NACIMIENTO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 243, 136, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("SEXO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 275, 48, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ALTURA:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 307, 64, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("PESO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 339, 42, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("TIPO DE SANGRE:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 371, 105, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("ALERGIAS:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 403, 65, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("CIUDAD:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 435, 57, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("TELEFONO:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 472, 65, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("DOMICILIO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 507, 74, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("E-MAIL:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 539, 55, -1));
        jPanel1.add(lb_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 179, 104, 19));
        jPanel1.add(lb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 209, 201, 16));
        jPanel1.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 243, 96, 14));
        jPanel1.add(lb_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 275, 96, 14));
        jPanel1.add(lb_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 307, 96, 14));
        jPanel1.add(lb_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 339, 96, 14));
        jPanel1.add(lb_tipodesangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 371, 96, 14));
        jPanel1.add(lb_alergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 403, 201, 14));
        jPanel1.add(lb_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 435, 201, 14));
        jPanel1.add(lb_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 472, 201, 14));
        jPanel1.add(lb_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 507, 145, 18));
        jPanel1.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 536, 201, 17));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnconsultarActionPerformed
        // llenar los datos
        mostrarDatos (txt_consulta.getText());
    }//GEN-LAST:event_bnconsultarActionPerformed

    private void bnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnimprimirActionPerformed
        // imprimir
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(this);
        if (printerJob.printDialog()){
            try{
                printerJob.print();
            }catch (PrinterException ex){
                JOptionPane.showMessageDialog(null, "ERROR! ", "Error\n" + ex, JOptionPane.INFORMATION_MESSAGE );
            }
        }        
    }//GEN-LAST:event_bnimprimirActionPerformed

    private void bnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsalirActionPerformed
        // TODO add your handling code here:
        menu me = new menu();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnsalirActionPerformed
public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException{
        if (pageIndex == 0 ){
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX() + 10, pageFormat.getImageableY() + 10);
            jPanel1.printAll(graphics);
            return PAGE_EXISTS;
        }
        else{
            return NO_SUCH_PAGE;
        }
    }
    void mostrarDatos(String valor){
    String sql="";
    sql="SELECT * FROM clientes where cedula='"+ valor+"'";
    try{
        Statement st = conex.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){

            lb_cedula.setText(rs.getString(2));
            lb_nombre.setText(rs.getString(3));
            lb_fecha.setText(rs.getString(4));
            lb_sexo.setText(rs.getString(5));
            lb_altura.setText(rs.getString(6));
            lb_peso.setText(rs.getString(7));
            lb_tipodesangre.setText(rs.getString(8));
            lb_alergias.setText(rs.getString(9));
            lb_telefono.setText(rs.getString(10));
            lb_domicilio.setText(rs.getString(11));
            lb_email.setText(rs.getString(12));
            lb_ciudad.setText(rs.getString(13));
            llenarciudad(lb_ciudad.getText());
            
        }
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
    }
void llenarciudad(String valor){
    try{
        Statement st= conex.createStatement();
        String sql="Select * from ciudades where id_ciudad='"+valor + "'";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            lb_ciudad.setText(rs.getString(2));
        }
    }catch(SQLException exc){
        System.out.println(exc.getMessage());
    }
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
            java.util.logging.Logger.getLogger(datos_de_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datos_de_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datos_de_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datos_de_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos_de_paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnconsultar;
    private javax.swing.JButton bnimprimir;
    private javax.swing.JButton bnsalir;
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
    private javax.swing.JLabel lb_alergias;
    private javax.swing.JLabel lb_altura;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_ciudad;
    private javax.swing.JLabel lb_domicilio;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_peso;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JLabel lb_tipodesangre;
    private javax.swing.JTextField txt_consulta;
    // End of variables declaration//GEN-END:variables
     conexion con=new conexion();
     Connection conex=con.conexion();
}
