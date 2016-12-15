
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
import javax.swing.JOptionPane;import javax.swing.JTable ;

import javax.swing.table.DefaultTableModel;

public class tabla_de_clientes extends javax.swing.JFrame implements Printable{

    public tabla_de_clientes() {
        initComponents();
        mostrarDatos("");
        cargarcbciudad();
        tb_registroclientes.setVisible(true);
        txtcedula.setVisible(false);
        cb_ciudad.setVisible(false);
        txtid_ciudad.setVisible(false);
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
          
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbtcedula = new javax.swing.JRadioButton();
        rbtciudad = new javax.swing.JRadioButton();
        txtcedula = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_registroclientes = new javax.swing.JTable();
        btsalir = new javax.swing.JButton();
        cb_ciudad = new javax.swing.JComboBox<>();
        txtid_ciudad = new javax.swing.JTextField();
        bnimprimirtablaclientes = new javax.swing.JButton();
        btmenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTROS DE CLIENTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, -1));

        buttonGroup1.add(rbtcedula);
        rbtcedula.setText("CEDULA");
        rbtcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtcedulaMouseClicked(evt);
            }
        });
        getContentPane().add(rbtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        buttonGroup1.add(rbtciudad);
        rbtciudad.setText("CIUDAD");
        rbtciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtciudadActionPerformed(evt);
            }
        });
        getContentPane().add(rbtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

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
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, -1));

        btbuscar.setText("BUSCAR");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        tb_registroclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "FECHA", "TELEFONO", "CIUDAD"
            }
        ));
        jScrollPane1.setViewportView(tb_registroclientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 580, 120));

        btsalir.setText("SALIR");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        cb_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ciudadActionPerformed(evt);
            }
        });
        getContentPane().add(cb_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, -1));
        getContentPane().add(txtid_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 20, -1));

        bnimprimirtablaclientes.setText("IMPRIMIR");
        bnimprimirtablaclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnimprimirtablaclientesActionPerformed(evt);
            }
        });
        getContentPane().add(bnimprimirtablaclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        btmenu.setText("MENU");
        btmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo citas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -6, 700, 450));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 580, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtcedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtcedulaMouseClicked
        // CEDULA 
        txtcedula.setVisible(true);
        cb_ciudad.setVisible(false);
    }//GEN-LAST:event_rbtcedulaMouseClicked

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        // FUNCION MOSTRAR EL REGISTRO ESPECIFICADO
       if(rbtcedula.isSelected()==true){
            busca=txtcedula.getText();
        }
        if(rbtciudad.isSelected()==true){
            busca=txtid_ciudad.getText();
        }
       mostrarDatos(busca);
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // retornar a clientes
        paciente clit = new paciente();
        clit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void rbtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtciudadActionPerformed
        // 
        txtcedula.setVisible(false);
        cb_ciudad.setVisible(true);
    }//GEN-LAST:event_rbtciudadActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void cb_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ciudadActionPerformed
        // combox ciudad
        try{
            Statement st =conex.createStatement();
            String sql = "Select * from ciudades where ciudad = '"+cb_ciudad.getSelectedItem().toString()+"'";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()){
                txtid_ciudad.setText(rs.getString(1));
            }
        }catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage());
            System.out.println(exc.getMessage());
        }
    }//GEN-LAST:event_cb_ciudadActionPerformed

    private void bnimprimirtablaclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnimprimirtablaclientesActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat ("REGISTROS DE CLIENTES");
        MessageFormat footer = new MessageFormat ("Pagina {0, number, interger}");
        try{
            tb_registroclientes.print(JTable.PrintMode.NORMAL, header, footer);
        }catch (java.awt.print.PrinterException e){
            System.err.format("Error, no se puede imprimir %s %n ", e.getMessage());
        }
    }//GEN-LAST:event_bnimprimirtablaclientesActionPerformed

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
   
    public void botonimprimirclientes (){
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
       tabla.addColumn("ID");
       tabla.addColumn("CEDULA");
       tabla.addColumn("NOMBRE");
       tabla.addColumn("FECHA");
       tabla.addColumn("DOMICILIO");
       tabla.addColumn("CIUDAD");
       
       tb_registroclientes.setModel(tabla);
       String sql="";
       if (Valor.equals("")){
            sql="SELECT id_cliente,cedula,clientes.nombre,fecha,domicilio,ciudades.ciudad\n"+
                "FROM clientes \n" +
               "inner join ciudades on clientes.id_ciudad=ciudades.id_ciudad ";
        }
        else{
            if (rbtcedula.isSelected()){
            sql="SELECT id_cliente,cedula,clientes.nombre,fecha,domicilio,ciudades.ciudad\n"+
                "FROM clientes \n" +
                " inner join ciudades on clientes.id_ciudad=ciudades.id_ciudad where cedula='" + Valor + "'";
            }
            else{
            if (rbtciudad.isSelected()){
            sql="SELECT id_cliente,cedula,clientes.nombre,fecha,domicilio,ciudades.ciudad\n"+
                "FROM clientes \n" +
                "inner join ciudades on clientes.id_ciudad=ciudades.id_ciudad where clientes.id_ciudad=" + Valor + "";
            }
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
            tb_registroclientes.setModel(tabla);
            limpiar();
            
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
            java.util.logging.Logger.getLogger(tabla_de_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla_de_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla_de_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla_de_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla_de_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnimprimirtablaclientes;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btmenu;
    private javax.swing.JButton btsalir;
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_ciudad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtcedula;
    private javax.swing.JRadioButton rbtciudad;
    private javax.swing.JTable tb_registroclientes;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtid_ciudad;
    // End of variables declaration//GEN-END:variables
     conexion con=new conexion();
     Connection conex=con.conexion();
     public String busca="";
public void limpiar(){
    txtcedula.setText("");
    txtid_ciudad.setText("");
   
}
    
}
