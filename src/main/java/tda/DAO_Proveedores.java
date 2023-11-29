
package tda;
import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
public class DAO_Proveedores 
{
    Conexion obConectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarProveedores()
    {
        List<Proveedores> datosProv= new ArrayList<>();
        String selectSQL = "SELECT * FROM proveedores";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Proveedores prov=new Proveedores();
                prov.setIdProveedores(rs.getString(1));
                prov.setNombreProv(rs.getString(2));
                prov.setDiasQueSurte(rs.getString(3));
                prov.setNumTel(rs.getString(4));
                prov.setCiudadP(rs.getString(5));
                datosProv.add(prov);
            }
        }
        catch(Exception e)
        {
            
        }
        return datosProv;
    }
}
