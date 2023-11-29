
package gui.tablas;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import tda.DAO_Proveedores;
import tda.Proveedores;
public class VentanaProveedores extends javax.swing.JFrame {

    DAO_Proveedores dao=new DAO_Proveedores();
    Proveedores prov=new Proveedores();
    DefaultTableModel dtm=new DefaultTableModel();
    
    public VentanaProveedores() {
        initComponents();
        Agregar.setIcon(new ImageIcon("./src/main/java/Imagenes/anadir.png"));
        Actualizar.setIcon(new ImageIcon("./src/main/java/Imagenes/actualizar.png"));
        Regresar.setIcon(new ImageIcon("./src/main/java/Imagenes/atras.png"));
        Mostrar.setIcon(new ImageIcon("./src/main/java/Imagenes/mostrar.png"));
        Eliminar.setIcon(new ImageIcon("./src/main/java/Imagenes/menos.png"));
        Editar.setIcon(new ImageIcon("./src/main/java/Imagenes/editar.png"));
        limpiar.setIcon(new ImageIcon("./src/main/java/Imagenes/limpiar.png"));
    }
    
    public void mostrar()
    {
        dtm= (DefaultTableModel) tablaProveedores.getModel();
        List<Proveedores> lista=dao.listarProveedores();
        Object[] fila=new Object[5];
        for(Proveedores l:lista)
        {
            fila[0]=l.getIdProveedores();
            fila[1]=l.getNombreProv();
            fila[2]=l.getDiasQueSurte();
            fila[3]=l.getNumTel();
            fila[4]=l.getCiudadP();
            dtm.addRow(fila);
        }
    }
    
    public void limpiarTabla() 
    {
        dtm = (DefaultTableModel) tablaProveedores.getModel();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        center = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        footer = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new java.awt.BorderLayout(10, 10));

        header.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setText("Proveedores");
        header.add(jLabel1);

        principal.add(header, java.awt.BorderLayout.PAGE_START);

        aside.setBackground(new java.awt.Color(255, 255, 255));
        aside.setPreferredSize(new java.awt.Dimension(500, 374));
        aside.setLayout(new java.awt.BorderLayout(10, 1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("     ID Proveedor:");
        jPanel6.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("     Nombre Proveedor:");
        jPanel6.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("     Dias que Surte:");
        jPanel6.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("     Telefono Proveedor:");
        jPanel6.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("     Ciudad Proveedor:");
        jPanel6.add(jLabel7);

        aside.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 15)); // NOI18N
        jLabel2.setText("Ingresar Datos");
        jPanel7.add(jLabel2);

        aside.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel8.add(jTextField1);

        jTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel8.add(jTextField2);

        jTextField3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel8.add(jTextField3);

        jTextField4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel8.add(jTextField4);

        jTextField5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel8.add(jTextField5);

        aside.add(jPanel8, java.awt.BorderLayout.CENTER);

        principal.add(aside, java.awt.BorderLayout.LINE_START);

        center.setBackground(new java.awt.Color(255, 255, 255));
        center.setPreferredSize(new java.awt.Dimension(300, 374));
        center.setLayout(new java.awt.BorderLayout(0, 2));

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 15)); // NOI18N
        jLabel8.setText("Opciones");
        jPanel9.add(jLabel8);

        center.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        Agregar.setBackground(new java.awt.Color(255, 102, 102));
        Agregar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar");
        jPanel10.add(Agregar);

        Actualizar.setBackground(new java.awt.Color(255, 102, 102));
        Actualizar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Actualizar");
        jPanel10.add(Actualizar);

        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        jPanel10.add(Eliminar);

        Mostrar.setBackground(new java.awt.Color(255, 102, 102));
        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel10.add(Mostrar);

        center.add(jPanel10, java.awt.BorderLayout.CENTER);

        principal.add(center, java.awt.BorderLayout.CENTER);

        footer.setPreferredSize(new java.awt.Dimension(754, 300));
        footer.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        Regresar.setBackground(new java.awt.Color(255, 102, 102));
        Regresar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar");
        Regresar.setPreferredSize(new java.awt.Dimension(120, 35));
        jPanel11.add(Regresar);

        Editar.setBackground(new java.awt.Color(255, 102, 102));
        Editar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("Editar");
        Editar.setPreferredSize(new java.awt.Dimension(120, 35));
        jPanel11.add(Editar);

        limpiar.setBackground(new java.awt.Color(255, 102, 102));
        limpiar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.setPreferredSize(new java.awt.Dimension(120, 35));
        jPanel11.add(limpiar);

        footer.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setPreferredSize(new java.awt.Dimension(754, 200));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(255, 153, 153));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel9.setText("Tabla Proveedores");
        jPanel13.add(jLabel9);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Proveedor", "Nombre Proveedor", "Dias que Surte", "Telefono Proveedor", "Ciudad Proveedor"
            }
        ));
        jScrollPane1.setViewportView(tablaProveedores);

        jPanel14.add(jScrollPane1);

        jPanel12.add(jPanel14, java.awt.BorderLayout.CENTER);

        footer.add(jPanel12, java.awt.BorderLayout.CENTER);

        principal.add(footer, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProveedores().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel principal;
    private javax.swing.JTable tablaProveedores;
    // End of variables declaration//GEN-END:variables
}
