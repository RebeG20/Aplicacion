
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
    
    public String max()
    {
        String r="";
        String selectSQL="SELECT NombreArt FROM empleados inner join (ventasart inner join articulos on Articulos_idArticulos=idArticulos) on idEmpleados = Empleados_idEmpleados ORDER BY CantidadV desc LIMIT 1";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                r=rs.getString(1);
            }
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
    
    public String min()
    {
        String r="";
        String selectSQL="SELECT NombreArt FROM empleados inner join (ventasart inner join articulos on Articulos_idArticulos=idArticulos) on idEmpleados = Empleados_idEmpleados ORDER BY CantidadV asc LIMIT 1";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                r=rs.getString(1);
            }
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
    
    public Double prom()
    {
        Double r=0.0;
        String selectSQL="SELECT avg(Stock) FROM articulos";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                r=rs.getDouble(1);
            }
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
    
    public Integer sum()
    {
        Integer r=0;
        String selectSQL="SELECT sum(Stock) FROM articulos";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                r=rs.getInt(1);
            }
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
    
    public Integer filasArt()
    {
        Integer r=0;
        String selectSQL="SELECT count(*) FROM articulos";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                r=rs.getInt(1);
            }
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
    
    public Integer filasVentas()
    {
        Integer r=0;
        String selectSQL="SELECT count(*) FROM ventasart";
        try
        {
            con=obConectar.establecerConnection();
            ps=con.prepareStatement(selectSQL);
            rs=ps.executeQuery();
            while(rs.next())
            {
                r=rs.getInt(1);
            }
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
}
