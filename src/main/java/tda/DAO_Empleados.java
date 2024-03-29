package tda;
import Funcionalidad.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class DAO_Empleados 
{
    public ArrayList<Empleados> datosEmp = new ArrayList<>();
    Conexion obConexion=new Conexion();
    Connection conectar;
    PreparedStatement ps;
    ResultSet rs; 
    
    public void guardarDatos()
    {
        //Obtener valores
        ArrayList<Empleados> aux=new ArrayList<>();
        datosEmp=aux;
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL mostrar_Empleados()");
            rs=ps.executeQuery();
            
            while (rs.next()) 
            {
                Empleados emp= new Empleados();
                emp.setIdEmpleado(rs.getString(1));
                emp.setNombreE(rs.getString(2));
                emp.setApellidoPE(rs.getString(3));
                emp.setApellidoME(rs.getString(4));
                emp.setCalle(rs.getString(5));
                emp.setColonia(rs.getString(6));
                emp.setNumCalle(rs.getInt(7));
                datosEmp.add(emp);
            }
  
        }
        catch (Exception e) 
        {
            
        }
        
        
    }
    
    
    
    public void mostrarEmpleados(DefaultTableModel dtm)
    {
        List<Empleados> datosE = new ArrayList<>();
      
        //Obtener valores
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL mostrar_Empleados()");
            rs=ps.executeQuery();
            
            while (rs.next()) 
            {
                Empleados emp= new Empleados();
                emp.setIdEmpleado(rs.getString(1));
                emp.setNombreE(rs.getString(2));
                emp.setApellidoPE(rs.getString(3));
                emp.setApellidoME(rs.getString(4));
                emp.setCalle(rs.getString(5));
                emp.setColonia(rs.getString(6));
                emp.setNumCalle(rs.getInt(7));
                datosE.add(emp);
            }
  
        }
        catch (Exception e) 
        {
            
        }
        //Mostrar valores 
        dtm.setRowCount(0);
        Object[] fila = new Object[7];
        for (int i = 0; i < datosE.size(); i++) 
        {
            fila[0] = datosE.get(i).getIdEmpleado();
            fila[1] = datosE.get(i).getNombreE();
            fila[2] = datosE.get(i).getApellidoPE();
            fila[3] = datosE.get(i).getApellidoME();
            fila[4] = datosE.get(i).getCalle();
            fila[5] = datosE.get(i).getColonia();
            fila[6] = datosE.get(i).getNumCalle();
            dtm.addRow(fila);
        }
    
    }
    
    public int insertarEmpleados(Empleados emp)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL insertar_Empleados(?,?,?,?,?,?,?)");
            
            ps.setString(1, emp.getIdEmpleado());
            ps.setString(2, emp.getNombreE());
            ps.setString(3, emp.getApellidoPE());
            ps.setString(4, emp.getApellidoME());
            ps.setString(5, emp.getCalle());
            ps.setString(6, emp.getColonia());
            ps.setInt(7, emp.getNumCalle());
            ps.executeUpdate();
            
            return 1;
        }
        catch (SQLIntegrityConstraintViolationException e) {
            return 0; // ID duplicado
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Otro tipo de error
        }
    }
    
    
    public void eliminarEmpleados(String Eliminar)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL eliminar_Empleados(?)");
            ps.setString(1, Eliminar);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
               
        }
    }
    
    public int actualizarE(Empleados emp)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL actualizar_Empleado(?,?,?,?)");
            
            ps.setString(1, emp.getCalle());
            ps.setString(2, emp.getColonia());
            ps.setInt(3, emp.getNumCalle());
            ps.setString(4, emp.getIdEmpleado());
            ps.executeUpdate();
            
            return 1;
        }
        catch(Exception e)
        {
              System.out.println("");  
        }return 0;
    }

    public ArrayList<Empleados> getDatosEmp() {
        return datosEmp;
    }
  
    
}
