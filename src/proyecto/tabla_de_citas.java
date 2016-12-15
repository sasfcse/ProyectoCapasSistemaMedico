
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
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tabla_de_citas extends javax.swing.JFrame implements Printable {

    public tabla_de_citas() {
        initComponents();
        mostrarDatos("");
        tb_registro.setVisible(true);
        cargarcbespecialidad();
        cbespecialidad.setVisible(false);
        txtcedula.setVisible(false);
        txtcg_especialidad.setVisible(false);
    }
public void cargarcbespecialidad() {
        try{
            Statement st = conex.createStatement();
            String sql="Select * from especialidades";
            ResultSet rs = st.executeQuery(sql);
            cbespecialidad.addItem("");
            while(rs.next()){
                cbespecialidad.addItem(rs.getString(2));
            }   
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btsalir = new javax.swing.JButton();
        rbtcedula = new javax.swing.JRadioButton();
        rbtespecialidad = new javax.swing.JRadioButton();
        txtcedula = new javax.swing.JTextField();
        cbespecialidad = new javax.swing.JComboBox<>();
        btbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_registro = new javax.swing.JTable();
        txtcg_especialidad = new javax.swing.JTextField();
        bnimprimir = new javax.swing.JButton();
        btmenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo citas.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btsalir.setText("SALIR");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 330, 80, 20));

        buttonGroup1.add(rbtcedula);
        rbtcedula.setText("CEDULA");
        rbtcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtcedulaMouseClicked(evt);
            }
        });
        jPanel1.add(rbtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        buttonGroup1.add(rbtespecialidad);
        rbtespecialidad.setText("ESPECIALIDAD");
        rbtespecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtespecialidadMouseClicked(evt);
            }
        });
        jPanel1.add(rbtespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 194, -1));

        cbespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbespecialidadActionPerformed(evt);
            }
        });
        jPanel1.add(cbespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 146, -1));

        btbuscar.setText("BUSCAR");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        tb_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_CITAS", "FEECHA", "HORA", "PACIENTE", "CEDULA", "ESPECIALIDAD"
            }
        ));
        tb_registro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tb_registroAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tb_registro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 590, 110));
        jPanel1.add(txtcg_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 25, -1));

        bnimprimir.setText("Imprimir");
        bnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnimprimirActionPerformed(evt);
            }
        });
        jPanel1.add(bnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        btmenu.setText("MENU");
        btmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTROS DE CITAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 640, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo citas.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbespecialidadActionPerformed
        // llenar combox
        try{
            Statement st =conex.createStatement();
            String sql = "Select * from especialidades where descripcion = '"+cbespecialidad.getSelectedItem().toString()+"'";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()){
                txtcg_especialidad.setText(rs.getString(1));
            }
        }catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage());
            System.out.println(exc.getMessage());
        }
    }//GEN-LAST:event_cbespecialidadActionPerformed

    private void rbtcedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtcedulaMouseClicked
        // rbton cedula
        txtcedula.setVisible(true);
        cbespecialidad.setVisible(false);
    }//GEN-LAST:event_rbtcedulaMouseClicked

    private void rbtespecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtespecialidadMouseClicked
        // rbton especialidad
        txtcedula.setVisible(false);
        cbespecialidad.setVisible(true);
    }//GEN-LAST:event_rbtespecialidadMouseClicked

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        // accion buscar 
        if(rbtcedula.isSelected()==true){
            busca=txtcedula.getText();
        }
        if(rbtespecialidad.isSelected()==true){
            busca=txtcg_especialidad.getText();
        }
       mostrarDatos(busca);
    }//GEN-LAST:event_btbuscarActionPerformed

    private void bnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnimprimirActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat ("REGISTROS DE CITAS");
        MessageFormat footer = new MessageFormat ("Pagina {0, number, interger}");
        try{
            tb_registro.print(JTable.PrintMode.NORMAL, header, footer);
        }catch (java.awt.print.PrinterException e){
            System.err.format("Error, no se puede imprimir %s %n ", e.getMessage());
        }
                
    }//GEN-LAST:event_bnimprimirActionPerformed

    public void botonimprimircitas (){
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(this);
        if (printerJob.printDialog()){
            try{
                printerJob.print();
            }catch (PrinterException ex){
                JOptionPane.showMessageDialog(null, "ERROR! ", "Error\n" + ex, JOptionPane.INFORMATION_MESSAGE );
            }
        }
    }
    
    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
         citas cts = new citas();
         cts.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void tb_registroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tb_registroAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_registroAncestorAdded

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if(e<'0'|| e>'9'){evt.consume();}
        if(txtcedula.getText().length()==10){evt.consume();}
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void btmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuActionPerformed
        // volver al menu
         menu me = new menu();
         me.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_btmenuActionPerformed

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException{
        if (pageIndex == 0 ){
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX() + 30, pageFormat.getImageableY() + 30);
            jPanel1.printAll(graphics);
            return PAGE_EXISTS;
        }
        else{
            return NO_SUCH_PAGE;
        }
    }
    
    void mostrarDatos(String Valor){
       DefaultTableModel tabla = new DefaultTableModel();
       tabla.addColumn("ID_CODIGO");
       tabla.addColumn("FECHA");
       tabla.addColumn("HORA");
       tabla.addColumn("PACIENTE");
       tabla.addColumn("CEDULA");
       tabla.addColumn("ESPECIALIDAD");
       
       
       
       
       tb_registro.setModel(tabla);
       String sql="";
       if (Valor.equals("")){
            sql="SELECT id_citas,fecha,hora,citas.paciente,cedula,especialidades.descripcion\n"+
                 "FROM citas \n" +
                 "inner join especialidades on citas.id_especialidad=especialidades.id_especialidad ";
                   
        }
        else{
            if (rbtcedula.isSelected()){
           sql="SELECT id_citas,fecha,hora,citas.paciente,cedula,especialidades.descripcion\n"+
                "FROM citas \n" +
                "inner join especialidades on citas.id_especialidad=especialidades.id_especialidad where cedula='" + Valor + "'";
            }
            if (rbtespecialidad.isSelected() ){
            sql="SELECT id_citas,fecha,hora,citas.paciente,cedula,especialidades.descripcion\n"+
                "FROM citas \n" +
                 
                "inner join especialidades on citas.id_especialidad=especialidades.id_especialidad where citas.id_especialidad=" + Valor + "";
            }
        }
        String []datos = new String[7];
        try {
            Statement st = conex.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while (rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                
                tabla.addRow(datos);
            }
            tb_registro.setModel(tabla);
            //limpiar();
            
        } catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
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
            java.util.logging.Logger.getLogger(tabla_de_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla_de_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla_de_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla_de_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla_de_citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnimprimir;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btmenu;
    private javax.swing.JButton btsalir;
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbespecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbtcedula;
    private javax.swing.JRadioButton rbtespecialidad;
    private javax.swing.JTable tb_registro;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcg_especialidad;
    // End of variables declaration//GEN-END:variables
     conexion con=new conexion();
     Connection conex=con.conexion();
     public String busca="";
}
