/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.relaciones;

import gui.tablas.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tda.DAO_Empleados;
import tda.DAO_Turno;
import tda.Turno;

/**
 *
 * @author rafae
 */
public class VentanaTurno extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRecargas
     */
    DefaultTableModel dtm = new DefaultTableModel();
    DAO_Turno dao = new DAO_Turno();
    Turno tur = new Turno();

    public VentanaTurno() {
        initComponents();

        Agregar.setIcon(new ImageIcon("./src/main/java/Imagenes/anadir.png"));
        Actualizar.setIcon(new ImageIcon("./src/main/java/Imagenes/actualizar.png"));
        Regresar.setIcon(new ImageIcon("./src/main/java/Imagenes/atras.png"));
        Mostrar.setIcon(new ImageIcon("./src/main/java/Imagenes/mostrar.png"));
        Eliminar.setIcon(new ImageIcon("./src/main/java/Imagenes/menos.png"));
        Editar.setIcon(new ImageIcon("./src/main/java/Imagenes/editar.png"));
        limpiar.setIcon(new ImageIcon("./src/main/java/Imagenes/limpiar.png"));

        TablaT.setModel(dtm);
        dtm.addColumn("ID Empleado");
        dtm.addColumn("Nombre");
        dtm.addColumn("Horario Turno");
        dtm.addColumn("Dias Que trabaja");
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
        Nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        horario = new javax.swing.JTextField();
        dias = new javax.swing.JTextField();
        center = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        footer = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaT = new componentes.TablaCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 540));
        setPreferredSize(new java.awt.Dimension(570, 550));
        setResizable(false);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new java.awt.BorderLayout(10, 10));

        header.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Turno");
        header.add(jLabel1);

        principal.add(header, java.awt.BorderLayout.PAGE_START);

        aside.setBackground(new java.awt.Color(255, 255, 255));
        aside.setPreferredSize(new java.awt.Dimension(350, 415));
        aside.setLayout(new java.awt.BorderLayout(0, 3));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresar Datos");
        jPanel1.add(jLabel2);

        aside.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 389));
        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 0, 15));

        Nombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("     Nombre del empleado: ");
        jPanel2.add(Nombre);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("     Horario Turno:");
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("     Dias que Trabaja:");
        jPanel2.add(jLabel5);

        aside.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 389));
        jPanel3.setLayout(new java.awt.GridLayout(3, 1, 0, 15));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(id);

        horario.setBackground(new java.awt.Color(255, 255, 255));
        horario.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        horario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(horario);

        dias.setBackground(new java.awt.Color(255, 255, 255));
        dias.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        dias.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(dias);

        aside.add(jPanel3, java.awt.BorderLayout.CENTER);

        principal.add(aside, java.awt.BorderLayout.LINE_START);

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setLayout(new java.awt.BorderLayout(0, 3));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Opciones");
        jPanel4.add(jLabel6);

        center.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(4, 1, 10, 5));

        Agregar.setBackground(new java.awt.Color(255, 102, 102));
        Agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar");
        Agregar.setPreferredSize(new java.awt.Dimension(80, 60));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel5.add(Agregar);

        Actualizar.setBackground(new java.awt.Color(255, 102, 102));
        Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Actualizar");
        Actualizar.setPreferredSize(new java.awt.Dimension(80, 40));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel5.add(Actualizar);

        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.setPreferredSize(new java.awt.Dimension(80, 40));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel5.add(Eliminar);

        Mostrar.setBackground(new java.awt.Color(255, 102, 102));
        Mostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("Mostrar");
        Mostrar.setPreferredSize(new java.awt.Dimension(80, 40));
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel5.add(Mostrar);

        center.add(jPanel5, java.awt.BorderLayout.CENTER);

        principal.add(center, java.awt.BorderLayout.CENTER);

        footer.setPreferredSize(new java.awt.Dimension(677, 300));
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

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tabla Turno");
        jPanel8.add(jLabel7);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        TablaT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaT);

        jPanel9.add(jScrollPane2);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        footer.add(jPanel7, java.awt.BorderLayout.CENTER);

        principal.add(footer, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        if (!id.getText().trim().isEmpty() && !horario.getText().trim().isEmpty() && !dias.getText().trim().isEmpty()) {
            String Nombre = id.getText();
            String horarion = horario.getText();
            String diasn = dias.getText();

            dao.validarNombre(Nombre, horarion, diasn, dtm);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese datos en todos los campos");
        }


    }//GEN-LAST:event_AgregarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        dao.mostrarTurnos(dtm);
    }//GEN-LAST:event_MostrarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        Nombre.setText("    ID Empleado");
        int filaSeleccionada = TablaT.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona la fila a editar");
        } else {
            String idE = (String) TablaT.getValueAt(filaSeleccionada, 0);
            String h = (String) TablaT.getValueAt(filaSeleccionada, 2);
            String d = (String) TablaT.getValueAt(filaSeleccionada, 3);

            id.setText(idE);
            horario.setText(h);
            dias.setText(d);
        }

    }//GEN-LAST:event_EditarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        dtm = (DefaultTableModel) TablaT.getModel();
        dtm.setRowCount(0);

        id.setText("");
        horario.setText("");
        dias.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = TablaT.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona la fila a eliminar");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el turno?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                String id = (String) TablaT.getValueAt(filaSeleccionada, 0);
                dao.eliminar(id);
                JOptionPane.showMessageDialog(null, "Turno Eliminado");
            }
        }
        dao.mostrarTurnos(dtm);
    }//GEN-LAST:event_EliminarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        
        String idEmpleado = id.getText();
        String horarion = horario.getText();
        String diasn = dias.getText();

        if (idEmpleado.equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccionar la fila a actualizar");
        } else {
            tur.setIdEmpleado(idEmpleado);
            tur.setHorario(horarion);
            tur.setDias(diasn);

            int r = dao.actualizarT(tur);

            if (r == 1) {
                JOptionPane.showMessageDialog(null, "Turno actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el turno");
            }

            dao.mostrarTurnos(dtm);
        }
        Nombre.setText("Nombre del Empleado");
        id.setText("");
        horario.setText("");
        dias.setText("");
        

    }//GEN-LAST:event_ActualizarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTurno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Regresar;
    private componentes.TablaCustom TablaT;
    private javax.swing.JPanel aside;
    private javax.swing.JPanel center;
    private javax.swing.JTextField dias;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JTextField horario;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
