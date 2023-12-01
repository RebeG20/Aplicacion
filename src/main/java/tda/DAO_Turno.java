package tda;
import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class DAO_Turno 
{
    public ArrayList<Turno> datosT;
    Conexion obConexion=new Conexion();
    Connection conectar;
    PreparedStatement ps;
    ResultSet rs;
    DAO_Empleados obE=new DAO_Empleados();
    
    public void validarNombre(String Nombre,String horario,String dias,DefaultTableModel dtm)
    {
        Turno tur=new Turno();
        obE.guardarDatos();
        int v=0;
        
        for (int i = 0; i < obE.getDatosEmp().size(); i++) 
        {
            if(obE.getDatosEmp().get(i).getNombreE().equals(Nombre))
            {
                tur.setIdEmpleado(obE.getDatosEmp().get(i).getIdEmpleado());
                tur.setHorario(horario);
                tur.setDias(dias);
                insertarTurno(tur);
                v=1;
            }
        } 
        if(v==0)
        {
            JOptionPane.showMessageDialog(null, "El empleado no existe en el sistema");
        }
        mostrarTurnos(dtm);
    }

    public void mostrarTurnos(DefaultTableModel dtm)
    {
        datosT = new ArrayList<>();
        //Obtener valores
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL mostrar_Turnos()");
            rs=ps.executeQuery();
            
            while (rs.next()) 
            {
                Turno tur= new Turno();
                
                tur.setIdEmpleado(rs.getString(1));
                tur.setNombre(rs.getString(2));
                tur.setHorario(rs.getString(3));
                tur.setDias(rs.getString(4));
                
                datosT.add(tur);
            }
  
        }
        catch (Exception e) 
        {
            
        }
        //Mostrar valores 
        dtm.setRowCount(0);
        Object[] fila = new Object[4];
        for (int i = 0; i < datosT.size(); i++) 
        {
            fila[0] = datosT.get(i).getIdEmpleado();
            fila[1] = datosT.get(i).getNombre();
            fila[2] = datosT.get(i).getHorario();
            fila[3] = datosT.get(i).getDias();
            dtm.addRow(fila);
        }
        
    }
    
    public void insertarTurno(Turno tur)
    {
        try
        {
            conectar=obConexion.establecerConnection();
            ps=conectar.prepareStatement("CALL insertar_Turno(?,?,?)");
            
            ps.setString(1, tur.getIdEmpleado());
            ps.setString(2, tur.getHorario());
            ps.setString(3, tur.getDias());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se registro de manera exitosa");
            
        } catch (Exception e) 
        {
            e.printStackTrace();  
        }
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

    public ArrayList<Turno> getDatosT() {
        return datosT;
    }
    
    
}
