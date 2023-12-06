/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.relaciones;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tda.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rafae
 */
public class VentanaMarcaArticulos extends javax.swing.JFrame {
    MarcaArticulos obMA=new MarcaArticulos();
    DAO_MarcaArticulos obma=new DAO_MarcaArticulos();
    DefaultTableModel tabla = new DefaultTableModel();
    /**
     * Creates new form VentanaMarca
     */
    public VentanaMarcaArticulos() {
        initComponents();
        Agregar.setIcon(new ImageIcon("./src/main/java/Imagenes/anadir.png"));
        Actualizar.setIcon(new ImageIcon("./src/main/java/Imagenes/actualizar.png"));
        Regresar.setIcon(new ImageIcon("./src/main/java/Imagenes/atras.png"));
        Mostrar.setIcon(new ImageIcon("./src/main/java/Imagenes/mostrar.png"));
        Eliminar.setIcon(new ImageIcon("./src/main/java/Imagenes/menos.png"));
        Editar.setIcon(new ImageIcon("./src/main/java/Imagenes/editar.png"));
        limpiar.setIcon(new ImageIcon("./src/main/java/Imagenes/limpiar.png"));
        
        tabla.addColumn("idMarca");
        tabla.addColumn("idArticulos");
        jTable1.setModel(tabla);
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

        principal = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aside = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        center = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        footer = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new java.awt.BorderLayout(10, 10));

        header.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 17)); // NOI18N
        jLabel1.setText("Marca Articulos");
        header.add(jLabel1);

        principal.add(header, java.awt.BorderLayout.PAGE_START);

        aside.setBackground(new java.awt.Color(255, 255, 255));
        aside.setPreferredSize(new java.awt.Dimension(250, 387));
        aside.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel2.setText("Ingresar Datos");
        jPanel1.add(jLabel2);

        aside.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 361));
        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 0, 15));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Clave de la marca");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Codigo del articulo");
        jPanel2.add(jLabel4);

        aside.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 0, 15));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1);

        jTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField2);

        aside.add(jPanel3, java.awt.BorderLayout.CENTER);

        principal.add(aside, java.awt.BorderLayout.LINE_START);

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setLayout(new java.awt.BorderLayout(0, 3));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setText("Opciones");
        jPanel4.add(jLabel5);

        center.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        Agregar.setBackground(new java.awt.Color(255, 102, 102));
        Agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel5.add(Agregar);

        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel5.add(Eliminar);

        Actualizar.setBackground(new java.awt.Color(255, 102, 102));
        Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel5.add(Actualizar);

        Mostrar.setBackground(new java.awt.Color(255, 102, 102));
        Mostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel5.add(Mostrar);

        center.add(jPanel5, java.awt.BorderLayout.CENTER);

        principal.add(center, java.awt.BorderLayout.CENTER);

        footer.setPreferredSize(new java.awt.Dimension(548, 250));
        footer.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        Regresar.setBackground(new java.awt.Color(255, 102, 102));
        Regresar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar");
        Regresar.setPreferredSize(new java.awt.Dimension(120, 35));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel6.add(Regresar);

        Editar.setBackground(new java.awt.Color(255, 102, 102));
        Editar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("Editar");
        Editar.setPreferredSize(new java.awt.Dimension(120, 35));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPanel6.add(Editar);

        limpiar.setBackground(new java.awt.Color(255, 102, 102));
        limpiar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.setPreferredSize(new java.awt.Dimension(120, 35));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel6.add(limpiar);

        footer.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel6.setText("Tabla Marca Articulos");
        jPanel8.add(jLabel6);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Marca", "ID Articulo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel9.add(jScrollPane1);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        footer.add(jPanel7, java.awt.BorderLayout.CENTER);

        principal.add(footer, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int filaSeleccionada=jTable1.getSelectedRow();
        if(filaSeleccionada==-1)
        {
            JOptionPane.showMessageDialog(null, "Seleccione una fila ");
        }
        else
        {
           String idMarca=(String) jTable1.getValueAt(filaSeleccionada, 0);
           String idArticulo=(String) jTable1.getValueAt(filaSeleccionada, 1);
           
           jTextField1.setText(idMarca);
           jTextField2.setText(idArticulo);
        }
        obma.selMA(tabla);
    }//GEN-LAST:event_EditarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        
        tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
    }//GEN-LAST:event_limpiarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        if (!jTextField1.getText().trim().isEmpty() && !jTextField2.getText().trim().isEmpty()) 
        {
            String idMarca,idArticulos;
        
            idMarca=jTextField1.getText();
            idArticulos=jTextField2.getText();

            obMA.setIdMar(idMarca);
            obMA.setIdArt(idArticulos);

            obma.inserMA(obMA);

            tabla = (DefaultTableModel) jTable1.getModel();
            tabla.setRowCount(0);
            obma.selMA(tabla);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error. Por favor llene todos los campos.");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar la recarga?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                String idMar = (String) jTable1.getValueAt(filaSeleccionada, 0);
                String idAr = (String) jTable1.getValueAt(filaSeleccionada, 1);
                obma.elimMA(idMar, idAr);
                JOptionPane.showMessageDialog(null, "Articulo Eliminado");
            }
        }
        obma.selMA(tabla);
    }//GEN-LAST:event_EliminarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        String idMarca,idArticulos;
        
        idMarca=jTextField1.getText();
        idArticulos=jTextField2.getText();
        
        obMA.setIdMar(idMarca);
        obMA.setIdArt(idArticulos);
        
        int r=obma.actMA(obMA);
        if(r==1)
        {
            JOptionPane.showMessageDialog(null, "Actualizado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No actualizado");
        }
        obma.selMA(tabla);
    }//GEN-LAST:event_ActualizarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        obma.selMA(tabla);
    }//GEN-LAST:event_MostrarActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();

        // Permitir solo dígitos, la tecla de retroceso o la tecla de suprimir
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Consumir el evento si no es un dígito o tecla de control
        }

        // Limitar la longitud del texto a 10 caracteres
        if (jTextField1.getText().length() >= 8) {
            evt.consume(); // Consumir el evento si ya hay 10 caracteres
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();

        // Permitir solo dígitos, la tecla de retroceso o la tecla de suprimir
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Consumir el evento si no es un dígito o tecla de control
        }

        // Limitar la longitud del texto a 10 caracteres
        if (jTextField2.getText().length() >= 8) {
            evt.consume(); // Consumir el evento si ya hay 10 caracteres
        }
    }//GEN-LAST:event_jTextField2KeyTyped

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
            java.util.logging.Logger.getLogger(VentanaMarcaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMarcaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMarcaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMarcaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMarcaArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JPanel aside;
    private javax.swing.JPanel center;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
