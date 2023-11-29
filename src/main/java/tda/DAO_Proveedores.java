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
    
    public int agregarProveedores(Proveedores prov)
    {
        String insertSQL="INSERT INTO proveedores(idProveedores, NombreProv, DiasQueSurte, `#TelProv`, CiudadP) VALUES(?,?,?,?,?)";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(insertSQL);
            ps.setString(1, prov.getIdProveedores());
            ps.setString(2, prov.getNombreProv());
            ps.setString(3, prov.getDiasQueSurte());
            ps.setString(4, prov.getNumTel());
            ps.setString(5, prov.getCiudadP());
            ps.executeUpdate();
            return 1;   //Exito
        }
        catch(SQLIntegrityConstraintViolationException e)
        {
            return 0;   //ID Duplicado
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return -1;  //Otro tipo de error
        }
    }
}
