
package gui.relaciones;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tda.DAO_ReporteVentas;
import tda.ReporteVentas;

public class VentanaReporteVentas extends javax.swing.JFrame {

    DAO_ReporteVentas dao=new DAO_ReporteVentas();
    ReporteVentas rv=new ReporteVentas();
    DefaultTableModel dtm=new DefaultTableModel();
    
    public VentanaReporteVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void mostrarLista()
    {
        dtm= (DefaultTableModel) tablaVentas.getModel();
        List<ReporteVentas> lista=dao.listarVentas();
        Object fila[]=new Object[5];
        for(ReporteVentas l:lista)
        {
            fila[0]=l.getIdArt();
            fila[1]=l.getArticulo();
            fila[2]=l.getEmp();
            fila[3]=l.getCant();
            fila[4]=l.getFecha();
            dtm.addRow(fila);
        }
    }
    
    public void limpiarTabla() 
    {
        dtm = (DefaultTableModel) tablaVentas.getModel();
        dtm.setRowCount(0);
    }
    
    public void generarReporte()
    {
        max.setText(dao.max());
        min.setText(dao.min());
        prom.setText(""+dao.prom());
        total.setText(""+dao.sum());
        nArt.setText(""+dao.filasArt());
        nVentas.setText(""+dao.filasVentas());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prom = new javax.swing.JLabel();
        nVentas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        nArt = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(677, 541));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setText("Reporte de Ventas");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jButton2.setText("Generar Reporte de Ventas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2);

        jPanel4.add(jPanel10, java.awt.BorderLayout.SOUTH);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(6, 2, 15, 0));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Articulo  con Mayor Cantidad Vendida");
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2);

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Articulo con Menor Cantidad Vendida");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3);

        max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        max.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(max);

        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(min);

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Promedio de Articulos en Stock");
        jLabel6.setOpaque(true);
        jPanel3.add(jLabel6);

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Numero de Ventas Realizadas");
        jLabel7.setOpaque(true);
        jPanel3.add(jLabel7);

        prom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(prom);

        nVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(nVentas);

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total de Articulos en Existencia");
        jLabel10.setOpaque(true);
        jPanel3.add(jLabel10);

        jLabel11.setBackground(new java.awt.Color(255, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tipos de Articulos en Venta");
        jLabel11.setOpaque(true);
        jPanel3.add(jLabel11);

        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(total);

        nArt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nArt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(nArt);

        jPanel4.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel9.setLayout(new java.awt.GridLayout(1, 1));

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Articulo", "Articulo", "Empleado", "Cantidad Vendida", "Fecha de la Venta"
            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        jPanel9.add(jScrollPane1);

        jPanel2.add(jPanel9);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarTabla();
        mostrarLista();
        generarReporte();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReporteVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel max;
    private javax.swing.JLabel min;
    private javax.swing.JLabel nArt;
    private javax.swing.JLabel nVentas;
    private javax.swing.JLabel prom;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
