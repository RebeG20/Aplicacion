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
public class DAO_Pedido 
{

    public ArrayList<Pedido> datosT;
    Conexion obCon=new Conexion();
    Connection conec;
    PreparedStatement ps;
    ResultSet rs;
    
    public int inserpedido(Pedido ped)
    {
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("insert into pedido (Articulos_idArticulos,Proveedores_idProveedores,Cantidad,FechaP) values (?,?,?,?)");
            ps.setString(1, ped.idArticulo);
            ps.setString(2, ped.idProveedor);
            ps.setInt(3, ped.cantidad);
            ps.setString(4, ped.fecha);
            ps.executeUpdate();
            return 1;
        }catch (SQLIntegrityConstraintViolationException e) {
            return 0; // ID duplicado
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Otro tipo de error
        }
    }
    
    public int actped(Pedido ped)
    {
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("call actulizar_ped(?,?,?,?)");
            ps.setString(1, ped.idArticulo);
            ps.setString(2, ped.idProveedor);
            ps.setInt(3, ped.cantidad);
            ps.setString(4, ped.fecha);
            ps.executeUpdate();
            return 1;
        }catch(Exception e)
        {
            
        }
        return 0;
    }
    
    
    public void selPed(DefaultTableModel t1)
    {
        List<Pedido> pedi=new ArrayList<>();
        
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("CALL select_ped()");
            rs=ps.executeQuery();
            while(rs.next())
            {
                Pedido obP=new Pedido();
                obP.setIdArticulo(rs.getString(1));
                obP.setIdProveedor(rs.getString(2));
                obP.setCantidad(rs.getInt(3));
                obP.setFecha(rs.getString(4));
                pedi.add(obP);
            }
            
            t1.setRowCount(0);
            Object[] fila = new Object[4];
            for (int i = 0; i < pedi.size(); i++) 
            {
                fila[0] = pedi.get(i).getIdArticulo();
                fila[1] = pedi.get(i).getIdProveedor();
                fila[2] = pedi.get(i).getCantidad();
                fila[3] = pedi.get(i).getFecha();
                t1.addRow(fila);
            }
            }catch(Exception e)
            {

            }
    }
    
    public int comprobarExistencia(String art, String prov)
    {
        List<String> lArt=new ArrayList<String>();
        List<String> lProv=new ArrayList<String>();
        
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("SELECT idArticulos FROM articulos");
            rs=ps.executeQuery();
            while(rs.next())
            {
                lArt.add(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            
        }
        
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("SELECT idProveedores FROM proveedores");
            rs=ps.executeQuery();
            while(rs.next())
            {
                lProv.add(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            
        }
        
        if(lArt.contains(art) && lProv.contains(prov))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
