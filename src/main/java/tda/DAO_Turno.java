package tda;
import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class DAO_Turno 
{
    Conexion obConexion=new Conexion();
    Connection conectar;
    PreparedStatement ps;
    ResultSet rs;
    
    public void mostrarTurnos(DefaultTableModel dtm)
    {
        List<Turno> datosT = new ArrayList<>();
      
        //Obtener valores
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL mostrar_Turno()");
            rs=ps.executeQuery();
            
            while (rs.next()) 
            {
                Turno tur= new Turno();
                
                tur.setIdEmpleado(rs.getString(1));
                tur.setHorario(rs.getString(2));
                tur.setDias(rs.getString(3));
                datosT.add(tur);
            }
  
        }
        catch (Exception e) 
        {
            
        }
        //Mostrar valores 
        dtm.setRowCount(0);
        Object[] fila = new Object[7];
        for (int i = 0; i < datosT.size(); i++) 
        {
            fila[0] = datosT.get(i).getIdEmpleado();
            fila[1] = datosT.get(i).getHorario();
            fila[2] = datosT.get(i).getDias();
            dtm.addRow(fila);
        }
    
    }
    
    public int insertarTurno(Turno tur)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL insertar_Turno(?,?,?)");
            
            ps.setString(1, tur.getIdEmpleado());
            ps.setString(2, tur.getHorario());
            ps.setString(3, tur.getDias());
            ps.executeUpdate();
            System.out.println("se inserto");
            return 1;
        }
        catch(Exception e)
        {
            
                
        }return 0;
    }
    
    public void eliminar(String rEliminar)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL eliminar_Turno(?)");
            ps.setString(1, rEliminar);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("e "+e);   
        }
    }
    
    public int actualizarT(Turno tur)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL actualizar_Turno(?,?,?)");
            
            ps.setString(1, tur.getIdEmpleado());
            ps.setString(2, tur.getHorario());
            ps.setString(3, tur.getDias());
            ps.executeUpdate();
            
            return 1;
        }
        catch(Exception e)
        {
            
            System.out.println("e "+e);    
        }return 0;
    }
    
}
