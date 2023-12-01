package tda;

import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAO_Ventas 
{
    public ArrayList<RegistrarVentas> datosV = new ArrayList<>();
    Conexion obConexion=new Conexion();
    Connection conectar;
    PreparedStatement ps;
    ResultSet rs;
    public double total=0;
    
    public void consultaSelect(String idA,String fecha,String idEmpleado,int cant) throws SQLException
    {
        try 
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL mostrarArt(?,?)");
            ps.setString(1, idA);
            ps.setInt(2, cant);
            rs=ps.executeQuery();
            
            while (rs.next()) {
                
                int stock=rs.getInt(4); 
                
                if(stock<=0 || stock<cant)
                {
                    JOptionPane.showMessageDialog(null, "Stock disponible del articulo "+stock);
                }
                else
                {
                    RegistrarVentas rv = new RegistrarVentas();
                    
                    rv.setIdEmpleado(idEmpleado);
                    rv.setIdArticulo(idA);
                    rv.setNombre(rs.getString(2));
                    rv.setPrecio(rs.getDouble(3));
                    rv.setCantidad(cant);
                    rv.setFecha(fecha);
                    rv.setTotal(cant*rs.getDouble(3));
                    datosV.add(rv);
                    
                    guardarVentas(rv);
                }

                
            }
        } catch (Exception e) 
        {
           
        }
        
        
    }
    
    
    public void mostrar(DefaultTableModel dtm)
    {
        Object[] fila = new Object[5];
        dtm.setRowCount(0);
        for (int i = 0; i < datosV.size(); i++) 
        {
            fila[0] = datosV.get(i).getIdArticulo();
            fila[1] = datosV.get(i).getNombre();
            fila[2] = datosV.get(i).getPrecio();
            fila[3] = datosV.get(i).getCantidad();
            fila[4] =datosV.get(i).getTotal();
            dtm.addRow(fila);
        }   
            
    }
    
     public void guardarVentas(RegistrarVentas venta) throws SQLException
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL RegistrarVentas(?,?,?,?)");
            
            ps.setString(1, venta.getIdArticulo());
            ps.setString(2, venta.getIdEmpleado());
            ps.setString(3, venta.getFecha());
            ps.setInt(4, venta.getCantidad());

            
             rs = ps.executeQuery();
                
             String mensaje;
                
                if (rs.next()) {
                    mensaje = rs.getString("Mensaje");
                    if(mensaje.contains("No hay suficiente stock disponible"))
                    {
                        JOptionPane.showMessageDialog(null, mensaje);
                    }
                }

        } catch (SQLException e) {
            System.out.println("e "+e);
            conectar.rollback();
        }
    }
     
    
    public void totalizar(JLabel tot)
    {
        
        for (int i = 0; i < datosV.size(); i++) 
        {
            total=total+datosV.get(i).getTotal();
        }
        
       
        tot.setText("$ "+String.valueOf(total));
        datosV.clear();
    }
    
    public void cobrar(double cant)
    {
        double cambio=cant-total;
        JOptionPane.showMessageDialog(null, "Cambio a entregar"+cambio);
    }
}
