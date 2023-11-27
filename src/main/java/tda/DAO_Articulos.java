package tda;

import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO_Articulos {
    Conexion obConectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarArticulos(){
        List<Articulos> datosArt = new ArrayList<>();
        String selectSQL = "SELECT * FROM articulos";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(selectSQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Articulos art = new Articulos();
                art.setIdArt(rs.getString(1));
                art.setNomArt(rs.getString(2));
                art.setPrecio(rs.getDouble(3));
                art.setStock(rs.getInt(4));
                datosArt.add(art);
            }
        } catch (Exception e) {
        }
        return datosArt;
    }
}
