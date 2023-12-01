package tda;

import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

public class DAO_Ventas 
{
    Conexion obConexion=new Conexion();
    Connection conectar;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public void guardarVentas(RegistrarVentas venta) throws SQLException
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL RegistrarVentas(?,?,?,?)");
            
            ps.setString(1, venta.getIdArticulo());
            ps.setInt(2, venta.getCantidad());
            ps.setString(3, venta.getIdEmpleado());
            ps.setString(4, venta.getFecha());

            
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
            conectar.rollback();
        }
        
    }
    
}
