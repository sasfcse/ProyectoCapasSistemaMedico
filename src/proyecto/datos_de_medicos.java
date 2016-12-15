
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

public class datos_de_medicos extends javax.swing.JFrame implements Printable{

    public datos_de_medicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bn_consulta = new javax.swing.JButton();
        bn_imprimir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_consulta = new javax.swing.JTextField();
        bn_salir = new javax.swing.JButton();
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
        lb_cedula = new javax.swing.JLabel();
        lb_medico = new javax.swing.JLabel();
        lb_especialidad = new javax.swing.JLabel();
        lb_domicilio = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(bn_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 26, 30));

        bn_imprimir.setText("IMPRIMIR");
        bn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(bn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("BUSAR:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 20));
        getContentPane().add(txt_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 194, 30));

        bn_salir.setText("SALIR");
        bn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(bn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORME DEL MEDICO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("____________________________________________________________");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 430, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("____________________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 430, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo _clinica_imprecion.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CEDULA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("MEDICO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("ESPECIALIDAD:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("DOMICILIO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("TELEFONO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("E_MAIL:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 50, -1));
        jPanel1.add(lb_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 14));
        jPanel1.add(lb_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 170, 14));
        jPanel1.add(lb_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 130, 14));
        jPanel1.add(lb_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, 20));
        jPanel1.add(lb_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, 20));
        jPanel1.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 160, 14));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_imprimirActionPerformed
        // TODO add your handling code here:
         PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(this);
        if (printerJob.printDialog()){
            try{
                printerJob.print();
            }catch (PrinterException ex){
                JOptionPane.showMessageDialog(null, "ERROR! ", "Error\n" + ex, JOptionPane.INFORMATION_MESSAGE );
            }
        }        
    }//GEN-LAST:event_bn_imprimirActionPerformed

    private void bn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_consultaActionPerformed
        // llenar datos
         mostrarDatos (txt_consulta.getText());
        
    }//GEN-LAST:event_bn_consultaActionPerformed

    private void bn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_salirActionPerformed
        // TODO add your handling code here:
         menu me = new menu();
         me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_salirActionPerformed
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
    sql="SELECT * FROM medicos where cedula='"+ valor+"'";
    try{
        Statement st = conex.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
           lb_cedula.setText(rs.getString(2));
           lb_medico.setText(rs.getString(3));
           lb_domicilio.setText(rs.getString(4));
           lb_telefono.setText(rs.getString(5));
           lb_email.setText(rs.getString(6));
           lb_especialidad.setText(rs.getString(7));
           llenartipo(lb_especialidad.getText());
        }
    }catch(SQLException exc){
        System.out.println(exc.getMessage());
    }
}
void llenartipo(String valor){
    try{
        Statement st= conex.createStatement();
        String sql="Select * from especialidades where descripcion='"+valor + "'";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            lb_especialidad.setText(rs.getString(2));
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
            java.util.logging.Logger.getLogger(datos_de_medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datos_de_medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datos_de_medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datos_de_medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos_de_medicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bn_consulta;
    private javax.swing.JButton bn_imprimir;
    private javax.swing.JButton bn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_domicilio;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_especialidad;
    private javax.swing.JLabel lb_medico;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JTextField txt_consulta;
    // End of variables declaration//GEN-END:variables
     conexion con=new conexion();
     Connection conex=con.conexion();
}
