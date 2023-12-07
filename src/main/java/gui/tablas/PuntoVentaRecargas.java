/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.tablas;

import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import tda.DAO_Recargas;
import tda.DAO_VentasRecargas;
import tda.Recargas;
import tda.VentasRecargas;

/**
 *
 * @author rafae
 */
public class PuntoVentaRecargas extends javax.swing.JFrame {

    Recargas obRec = new Recargas();
    DAO_Recargas daoRec = new DAO_Recargas();
    VentasRecargas obVRec = new VentasRecargas();
    DAO_VentasRecargas daoVRec = new DAO_VentasRecargas();
    String idEmp;
    String id;
    String comp;
    int monto = 0;
    String fecha;

    public PuntoVentaRecargas() {
        initComponents();
    }

    public void agregar() {

        if (!txtId.getText().trim().isEmpty() && !txtNum.getText().trim().isEmpty() && !txtPago.getText().trim().isEmpty()) {
            if (txtNum.getText().length() == 10) {
                id = txtId.getText();
                String numero = txtNum.getText();
                comp = "";
                String tipo = "";
                monto = 0;
                int paga = Integer.parseInt(txtPago.getText());
                int cambio = 0;

                if (cbxComp.getSelectedIndex() == 0 || cbxTipo.getSelectedIndex() == 0 || cbxMonto.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Favor de seleccionar las opciones adecuadas");
                } else {
                    monto = Integer.parseInt((String) cbxMonto.getSelectedItem());
                    tipo = (String) cbxTipo.getSelectedItem();
                    comp = (String) cbxComp.getSelectedItem();
                    if (paga >= monto) {
                        //idEmp = JOptionPane.showInputDialog("Ingresa ID del empleado");
                        //fecha = obtenerFechaFormateada();

                        cambio = paga - monto;
                        lblCambio.setText("$" + cambio);

                        obRec.setIdRec(id);
                        obRec.setNumero(numero);
                        obRec.setCompañia(comp);
                        obRec.setTipo(tipo);
                        obRec.setMonto(monto);

                        //agregarVentaR();
                        int r = daoRec.agregarArticulos(obRec);
                        if (r == 1) {
                            JOptionPane.showMessageDialog(null, "Recarga realizada correctamente");
                        } else if (r == 0) {
                            JOptionPane.showMessageDialog(null, "Error: Ya existe una recarga con el mismo ID");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al hacer la recarga");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pago insuficiente");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Numero Invalido");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese datos en todos los campos");
        }

    }

    private void agregarVentaR() {
        obVRec.setIdEmpleado(idEmp);
        obVRec.setIdRecarga(id);
        obVRec.setFechaVenta(fecha);
        obVRec.setNombreCT(comp);
        obVRec.setTotal(monto);

        int r = daoVRec.agregarVentaRecarga(obVRec);
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Recarga realizada correctamente");
        } else if (r == 0) {
            JOptionPane.showMessageDialog(null, "Error: Ya existe una recarga con el mismo ID");
        } else {
            JOptionPane.showMessageDialog(null, "Error al hacer la recarga");
        }
    }

    // Método que retorna la fecha formateada
//    public static String obtenerFechaFormateada() {
//        // Obtén la fecha actual
//        LocalDate fechaActual = LocalDate.now();
//
//        // Crea un formateador para el formato "AAAA-MM-DD"
//        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//        // Formatea la fecha actual como una cadena en el formato deseado y retorna la cadena
//        return fechaActual.format(formateador);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aside = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        cbxComp = new javax.swing.JComboBox<>();
        cbxTipo = new javax.swing.JComboBox<>();
        cbxMonto = new javax.swing.JComboBox<>();
        center = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        footer = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new java.awt.BorderLayout(10, 10));

        header.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Recargas");
        header.add(jLabel1);

        principal.add(header, java.awt.BorderLayout.PAGE_START);

        aside.setBackground(new java.awt.Color(255, 255, 255));
        aside.setPreferredSize(new java.awt.Dimension(350, 366));
        aside.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos de la Recarga");
        jPanel1.add(jLabel2);

        aside.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 340));
        jPanel3.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("     Folio de recarga:");
        jPanel5.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("     Numero:");
        jPanel9.add(jLabel11, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("     Compañia:");
        jPanel6.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("     Tipo de Recarga:");
        jPanel7.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("     Monto:");
        jPanel8.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        txtId.setBackground(new java.awt.Color(250, 195, 195));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(txtId);

        txtNum.setBackground(new java.awt.Color(250, 195, 195));
        txtNum.setForeground(new java.awt.Color(0, 0, 0));
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumKeyTyped(evt);
            }
        });
        jPanel4.add(txtNum);

        cbxComp.setBackground(new java.awt.Color(250, 195, 195));
        cbxComp.setForeground(new java.awt.Color(0, 0, 0));
        cbxComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona una opcion--", "Telcel", "Movistar", "Unefon", "AT&T", "Weex" }));
        jPanel4.add(cbxComp);

        cbxTipo.setBackground(new java.awt.Color(250, 195, 195));
        cbxTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona una opcion--", "Normal", "Paquete", "Recarga Amigo" }));
        jPanel4.add(cbxTipo);

        cbxMonto.setBackground(new java.awt.Color(250, 195, 195));
        cbxMonto.setForeground(new java.awt.Color(0, 0, 0));
        cbxMonto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona una opcion--", "20", "30", "50", "100", "200", "500" }));
        jPanel4.add(cbxMonto);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        aside.add(jPanel2, java.awt.BorderLayout.CENTER);

        principal.add(aside, java.awt.BorderLayout.LINE_START);

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seccion de Cobro");
        jPanel10.add(jLabel3);

        center.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.GridLayout(5, 1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese cantidad de efectivo:");
        jPanel12.add(jLabel4);

        txtPago.setBackground(new java.awt.Color(250, 195, 195));
        txtPago.setForeground(new java.awt.Color(0, 0, 0));
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });
        jPanel12.add(txtPago);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cambio:");
        jPanel12.add(jLabel5);

        lblCambio.setForeground(new java.awt.Color(0, 0, 0));
        lblCambio.setText("$");
        jPanel12.add(lblCambio);

        btnAgregar.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Cobrar y Realizar Recarga");
        btnAgregar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel12.add(btnAgregar);

        center.add(jPanel12, java.awt.BorderLayout.CENTER);

        principal.add(center, java.awt.BorderLayout.CENTER);

        footer.setBackground(new java.awt.Color(255, 153, 153));
        footer.setPreferredSize(new java.awt.Dimension(637, 50));
        footer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.setPreferredSize(new java.awt.Dimension(120, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        footer.add(jButton2);

        btnMostrar.setBackground(new java.awt.Color(255, 102, 102));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar Recargas");
        btnMostrar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        footer.add(btnMostrar);

        principal.add(footer, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        VentanaRecargasQuerys obVR = new VentanaRecargasQuerys();
        obVR.setVisible(true);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyTyped
        // TODO add your handling code here:char c=evt.getKeyChar();
        char c = evt.getKeyChar();

        // Permitir solo dígitos, la tecla de retroceso o la tecla de suprimir
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Consumir el evento si no es un dígito o tecla de control
        }

        // Limitar la longitud del texto a 10 caracteres
        if (txtNum.getText().length() >= 10) {
            evt.consume(); // Consumir el evento si ya hay 10 caracteres
        }

    }//GEN-LAST:event_txtNumKeyTyped

    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPagoKeyTyped

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
            java.util.logging.Logger.getLogger(PuntoVentaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntoVentaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntoVentaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntoVentaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntoVentaRecargas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aside;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cbxComp;
    private javax.swing.JComboBox<String> cbxMonto;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel center;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JPanel principal;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
