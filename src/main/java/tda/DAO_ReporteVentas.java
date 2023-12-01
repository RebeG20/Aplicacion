
package tda;

import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class DAO_ReporteVentas 
{
    Conexion obConectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarVentas()
    {
        List<ReporteVentas> lista=new ArrayList<>();
        String selectSQL="SELECT Articulos_idArticulos, NombreArt, NombreEmp, CantidadV, FechaVentaArt FROM empleados inner join (ventasart inner join articulos on Articulos_idArticulos = idArticulos) on idEmpleados = Empleados_idEmpleados";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                ReporteVentas obRV=new ReporteVentas();
                obRV.setIdArt(rs.getString(1));
                obRV.setArticulo(rs.getString(2));
                obRV.setEmp(rs.getString(3));
                obRV.setCant(rs.getInt(4));
                obRV.setFecha(rs.getString(5));
                lista.add(obRV);
            }
        }
        catch(Exception e)
        {
            
        }
        return lista;
    }
}
