package tda;
import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class DAO_Marca 
{
    Conexion obConexion=new Conexion();
    Connection conectar;
    PreparedStatement ps;
    ResultSet rs;
    public void mostrarMarcas(DefaultTableModel dtm)
    {
        List<Marca> datosM = new ArrayList<>();
      
        //Obtener valores
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL mostrar_Marca()");
            rs=ps.executeQuery();
            
            while (rs.next()) 
            {
                Marca marc= new Marca();
                
                marc.setIdMarca(rs.getString(1));
                marc.setNombreM(rs.getString(2));
                
                datosM.add(marc);
            }
  
        }
        catch (Exception e) 
        {
            
        }
        //Mostrar valores 
        dtm.setRowCount(0);
        Object[] fila = new Object[2];
        for (int i = 0; i < datosM.size(); i++) 
        {
            fila[0] = datosM.get(i).getIdMarca();
            fila[1] = datosM.get(i).getNombreM();
            dtm.addRow(fila);
        }
    
    }
    
    public int insertarMarca(Marca m)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL insertar_Marca(?,?)");
            
            ps.setString(1, m.getIdMarca());
            ps.setString(2, m.getNombreM());
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
    
     public void eliminarMarca(String Eliminar)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL eliminar_Marca(?)");
            ps.setString(1, Eliminar);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("e "+e);   
        }
    }
    
    
}
