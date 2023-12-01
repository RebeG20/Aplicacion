package tda;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import Funcionalidad.Conexion;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
public class DAO_MarcaArticulos 
{
    Conexion obCon=new Conexion();
    Connection conec;
    PreparedStatement ps;
    ResultSet rs;
    
    public int inserMA(MarcaArticulos ma)
    {
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("insert into marcaarticulos(Marca_idMarca,Articulos_idArticulos) values(?,?)");
            ps.setString(1, ma.idMar);
            ps.setString(2, ma.idArt);
            ps.executeUpdate();
            return 1;
        }catch (Exception e)
        {
            
        }
        return 0;
    }
    
    public int actMA(MarcaArticulos ma)
    {
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("call actulizar_MA(?,?)");
            ps.setString(1, ma.idMar);
            ps.setString(2, ma.idArt);
            ps.executeUpdate();
            return 1;
        }catch(Exception e)
        {
            
        }
        return 0;
    }
    
    public void elimMA(String maM, String maA)
    {
        String delete = "delete from marcaarticulos where Marca_idMarca= "+maM+" and Articulos_idArticulos= "+maA;
        try {
            conec = obCon.establecerConnection();
            ps = conec.prepareStatement(delete);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void selMA(DefaultTableModel t1)
    {
        List<MarcaArticulos> marA=new ArrayList<>();
        try
        {
            conec=obCon.establecerConnection();
            ps=conec.prepareStatement("CALL select_MA()");
            rs=ps.executeQuery();
            while(rs.next())
            {
                MarcaArticulos obMA=new MarcaArticulos();
                obMA.setIdMar(rs.getString(1));
                obMA.setIdArt(rs.getString(2));
                marA.add(obMA);
            }
            
            t1.setRowCount(0);
            Object[] fila = new Object[2];
            for (int i = 0; i < marA.size(); i++) 
            {
                fila[0] = marA.get(i).getIdMar();
                fila[1] = marA.get(i).getIdArt();
                t1.addRow(fila);
            }
            }catch(Exception e)
            {

            }
    }
}