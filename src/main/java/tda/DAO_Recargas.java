package tda;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import Funcionalidad.Conexion;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
public class DAO_Recargas 
{
    Conexion obCon=new Conexion();
    Connection conec;
    PreparedStatement ps;
    ResultSet rs;
    
    public int inserRec(Recargas rec)
    {
        
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("Insert into recargas(idRecargas,Precio,Tipo) values(?,?,?)");
            ps.setString(1, rec.getIdRec());
            ps.setInt(2, rec.getPrecio());
            ps.setString(3, rec.getTipo());
            ps.executeUpdate();
            return 1;
        }catch (Exception e)
        {
            
        }
        return 0;
    }
    
    public int actRec(Recargas rec)
    {
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("CALL actulizar_Rec(?,?,?)");
            ps.setString(1, rec.getIdRec());
            ps.setInt(2, rec.getPrecio());
            ps.setString(3, rec.getTipo());
            ps.executeUpdate();
            return 1;
        }catch(Exception e)
        {
            
        }
        return 0;
    }
    
    public void elimRec(String rec)
    {
        String delete = "delete from recargas where idRecargas ="+rec;
        try {
            conec = obCon.establecerConnection();
            ps = conec.prepareStatement(delete);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void selRec(DefaultTableModel t1)
    {
        List<Recargas> reca=new ArrayList<>();
        
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("CALL select_Rec()");
            rs=ps.executeQuery();
            while(rs.next())
            {
                Recargas obR=new Recargas();
                obR.setIdRec(rs.getString(1));
                obR.setPrecio(rs.getInt(2));
                obR.setTipo(rs.getString(3));
                reca.add(obR);
            }
            
            t1.setRowCount(0);
            Object[] fila = new Object[3];
            for (int i = 0; i < reca.size(); i++) 
            {
                fila[0] = reca.get(i).getIdRec();
                fila[1] = reca.get(i).getPrecio();
                fila[2] = reca.get(i).getTipo();
                t1.addRow(fila);
            }
            }catch(Exception e)
            {

            }
    }
}
