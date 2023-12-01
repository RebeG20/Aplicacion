/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.relaciones;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import tda.DAO_Ventas;
import tda.Empleados;
import tda.RegistrarVentas;

/**
 *
 * @author rebec
 */
public class VentanaRegistroV extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroventas
     */
    DAO_Ventas dao=new DAO_Ventas();
    RegistrarVentas v=new RegistrarVentas();
    DefaultTableModel dtm=new DefaultTableModel();
    public VentanaRegistroV() {
        initComponents();
        
        Agregar.setIcon(new ImageIcon("./src/main/java/Imagenes/anadircarrito.png"));
//        Eliminar.setIcon(new ImageIcon("./src/main/java/Imagenes/quitarcarrito.png"));
//        Editar.setIcon(new ImageIcon("./src/main/java/Imagenes/editar.png"));

        tablaV.setModel(dtm);
        dtm.addColumn("ID Articulo");
        dtm.addColumn("Nombre");
        dtm.addColumn("Precio");
        dtm.addColumn("Cantidad");
        dtm.addColumn("Total");

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelP = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idEm = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Totalizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaV = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        efectivo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 530));

        PanelP.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        PanelP.setLayout(new java.awt.BorderLayout(10, 10));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Abarrotes RMLR                                             Registrar  Ventas");
        jPanel2.add(jLabel3);

        PanelP.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(3, 2, 10, 15));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codigo del articulo:");
        jPanel7.add(jLabel1);

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setColumns(300);
        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(id);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad: ");
        jPanel7.add(jLabel2);

        cantidad.setBackground(new java.awt.Color(255, 255, 255));
        cantidad.setColumns(150);
        cantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cantidad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(cantidad);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Id Empleado");
        jPanel7.add(jLabel4);

        idEm.setBackground(new java.awt.Color(255, 255, 255));
        idEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idEm.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(idEm);

        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 40, 1, 40));
        jPanel8.setLayout(new java.awt.GridLayout(2, 3, 15, 15));

        Agregar.setBackground(new java.awt.Color(255, 102, 102));
        Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar");
        Agregar.setIconTextGap(9);
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel8.add(Agregar);

        Totalizar.setBackground(new java.awt.Color(255, 102, 102));
        Totalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Totalizar.setForeground(new java.awt.Color(255, 255, 255));
        Totalizar.setText("Totalizar");
        Totalizar.setIconTextGap(9);
        Totalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalizarActionPerformed(evt);
            }
        });
        jPanel8.add(Totalizar);

        jPanel4.add(jPanel8);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));

        tablaV.setBackground(new java.awt.Color(255, 255, 255));
        tablaV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Articulo", "Nombre", "Precio", "Cantidad ", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaV);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.GridLayout(2, 5, 35, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ingrece el efectivo:");
        jPanel9.add(jLabel16);

        efectivo.setBackground(new java.awt.Color(255, 255, 255));
        efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efectivoActionPerformed(evt);
            }
        });
        jPanel9.add(efectivo);

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cobrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Total:");
        jPanel9.add(jLabel14);

        total.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total.setText("$");
        jPanel9.add(total);
        jPanel9.add(jLabel5);
        jPanel9.add(jLabel11);
        jPanel9.add(jLabel12);
        jPanel9.add(jLabel13);

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        PanelP.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelP, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efectivoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
         LocalDate fechaActual = LocalDate.now();

        // Definir el formato deseado (yyyy-MM-dd)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Formatear la fecha según el formato deseado
        String fechaFormateada = fechaActual.format(formato);
        
        String idA=id.getText();
        String idEmpleado=idEm.getText();
        int cant=Integer.parseInt(cantidad.getText());
        
        try {
            dao.consultaSelect(idA, fechaFormateada, idEmpleado, cant);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistroV.class.getName()).log(Level.SEVERE, null, ex);
        }
        dao.mostrar(dtm);  
    }//GEN-LAST:event_AgregarActionPerformed

    private void TotalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalizarActionPerformed
        // TODO add your handling code here:
        dao.totalizar(total);
        
    }//GEN-LAST:event_TotalizarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        double ef=Double.parseDouble(efectivo.getText());
        
        dao.cobrar(ef);
        dtm.setRowCount(0);
        efectivo.setText("");
        total.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JPanel PanelP;
    private javax.swing.JButton Totalizar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField efectivo;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idEm;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaV;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
