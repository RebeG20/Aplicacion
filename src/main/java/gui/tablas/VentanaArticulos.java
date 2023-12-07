package gui.tablas;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tda.Articulos;
import tda.DAO_Articulos;

import javax.swing.ImageIcon;

public class VentanaArticulos extends javax.swing.JFrame {

    DAO_Articulos dao = new DAO_Articulos();
    Articulos art = new Articulos();
    DefaultTableModel dtm = new DefaultTableModel();

    public VentanaArticulos() {
        initComponents();

        btnAgregar.setIcon(new ImageIcon("./src/main/java/Imagenes/anadir.png"));
        btnActualizar.setIcon(new ImageIcon("./src/main/java/Imagenes/actualizar.png"));
        btnRegresar.setIcon(new ImageIcon("./src/main/java/Imagenes/atras.png"));
        btnMostrar.setIcon(new ImageIcon("./src/main/java/Imagenes/mostrar.png"));
        btnEliminar.setIcon(new ImageIcon("./src/main/java/Imagenes/menos.png"));
        btnEditar.setIcon(new ImageIcon("./src/main/java/Imagenes/editar.png"));
        btnLimpiar.setIcon(new ImageIcon("./src/main/java/Imagenes/limpiar.png"));

        this.setLocationRelativeTo(null);
    }

    public void mostrar() {
        dtm = (DefaultTableModel) tablaArticulos.getModel();
        List<Articulos> lista = dao.listarArticulos();
        Object[] fila = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getIdArt();
            fila[1] = lista.get(i).getNomArt();
            fila[2] = lista.get(i).getPrecio();
            fila[3] = lista.get(i).getStock();
            dtm.addRow(fila);
        }
        tablaArticulos.setModel(dtm);
    }

    public void agregar() {
        if (!txtID.getText().trim().isEmpty() && !txtNombre.getText().trim().isEmpty() && !txtPrecio.getText().trim().isEmpty() && !txtStock.getText().trim().isEmpty()) {
            String id = txtID.getText();
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            int stock = Integer.parseInt(txtStock.getText());

            art.setIdArt(id);
            art.setNomArt(nombre);
            art.setPrecio(precio);
            art.setStock(stock);

            int r = dao.agregarArticulos(art);
            if (r == 1) {
                JOptionPane.showMessageDialog(null, "Articulo agregado correctamente");
                limpiarTabla();
                mostrar();
            } else if (r == 0) {
                JOptionPane.showMessageDialog(null, "Error: Ya existe un artículo con el mismo ID");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar el articulo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese datos en todos los campos");
        }

    }

    public void editar() {
        int filaSeleccionada = tablaArticulos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona la fila a editar");
        } else {
            String id = (String) tablaArticulos.getValueAt(filaSeleccionada, 0);
            String nombre = (String) tablaArticulos.getValueAt(filaSeleccionada, 1);
            double precio = (Double) tablaArticulos.getValueAt(filaSeleccionada, 2);
            int stock = (Integer) tablaArticulos.getValueAt(filaSeleccionada, 3);

            txtID.setText(id);
            txtNombre.setText(nombre);
            txtPrecio.setText(String.valueOf(precio));
            txtStock.setText(String.valueOf(stock));
        }
    }

    public void actualizar() {
        if (!txtID.getText().trim().isEmpty() && !txtNombre.getText().trim().isEmpty() && !txtPrecio.getText().trim().isEmpty() && !txtStock.getText().trim().isEmpty()) {
            String id = txtID.getText();
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            int stock = Integer.parseInt(txtStock.getText());

            art.setIdArt(id);
            art.setNomArt(nombre);
            art.setPrecio(precio);
            art.setStock(stock);

            int r = dao.actualizarArticulos(art);
            if (r == 1) {
                JOptionPane.showMessageDialog(null, "Artículo actualizado correctamente");
                limpiarTabla();
                mostrar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el artículo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese datos en todos los campos");
        }

    }

    public void eliminar() {
        int filaSeleccionada = tablaArticulos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona la fila a eliminar");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el articulo?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                String id = (String) tablaArticulos.getValueAt(filaSeleccionada, 0);
                dao.eliminarArticulos(id);
                JOptionPane.showMessageDialog(null, "Articulo Eliminado");
            }
        }
    }

    public void limpiarTabla() {
        dtm = (DefaultTableModel) tablaArticulos.getModel();
        dtm.setRowCount(0);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        center = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        footer = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArticulos = new componentes.TablaCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new java.awt.BorderLayout(10, 10));

        header.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Articulos");
        header.add(jLabel1);

        principal.add(header, java.awt.BorderLayout.PAGE_START);

        aside.setBackground(new java.awt.Color(255, 255, 255));
        aside.setPreferredSize(new java.awt.Dimension(350, 387));
        aside.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresar Datos");
        jPanel1.add(jLabel2);

        aside.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 361));
        jPanel2.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("     ID Articulo:");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("     Nombre Articulo:");
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("     Precio:");
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("     Stock:");
        jPanel2.add(jLabel6);

        aside.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtID);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNombre);

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel3.add(txtPrecio);

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel3.add(txtStock);

        aside.add(jPanel3, java.awt.BorderLayout.CENTER);

        principal.add(aside, java.awt.BorderLayout.LINE_START);

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setLayout(new java.awt.BorderLayout(0, 3));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Opciones");
        jPanel4.add(jLabel7);

        center.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(4, 0, 0, 3));

        btnAgregar.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregar);

        btnActualizar.setBackground(new java.awt.Color(255, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizar);

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminar);

        btnMostrar.setBackground(new java.awt.Color(255, 102, 102));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnMostrar);

        center.add(jPanel5, java.awt.BorderLayout.CENTER);

        principal.add(center, java.awt.BorderLayout.CENTER);

        footer.setPreferredSize(new java.awt.Dimension(548, 300));
        footer.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        btnRegresar.setBackground(new java.awt.Color(255, 102, 102));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegresar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel6.add(btnRegresar);

        btnEditar.setBackground(new java.awt.Color(255, 102, 102));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel6.add(btnEditar);

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel6.add(btnLimpiar);

        footer.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tabla Articulos");
        jPanel8.add(jLabel8);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio ", "Stock"
            }
        ));
        jScrollPane2.setViewportView(tablaArticulos);

        jPanel9.add(jScrollPane2);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        footer.add(jPanel7, java.awt.BorderLayout.CENTER);

        principal.add(footer, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
//        limpiarTabla();
//        mostrar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
//        limpiarTabla();
//        mostrar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtID.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aside;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel center;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel principal;
    private componentes.TablaCustom tablaArticulos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
