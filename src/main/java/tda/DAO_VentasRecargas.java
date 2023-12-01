
package tda;

import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

public class DAO_VentasRecargas {
    
    Conexion obConectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public int agregarArticulos(VentasRecargas venRec) {
        String insertSQL = "INSERT INTO ventasrecargas(Empleados_idEmpleados, Recargas_idRecargas, FechaVentaR, NombreCT, Total) VALUES(?,?,?,?,?)";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, venRec.getIdEmpleado());
            ps.setString(2, venRec.getIdRecarga());
            ps.setString(3, venRec.getFechaVenta());
            ps.setString(4, venRec.getNombreCT());
            ps.setInt(5, venRec.getTotal());
            ps.executeUpdate();
            return 1; //Exito
        } catch (SQLIntegrityConstraintViolationException e) {
            return 0; // ID duplicado
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Otro tipo de error
        }
    }
}
