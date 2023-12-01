package tda;

import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import Funcionalidad.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.table.DefaultTableModel;

public class DAO_Recargas {

    Conexion obConectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public int agregarArticulos(Recargas rec) {
        String insertSQL = "INSERT INTO recargas(idRecargas, Monto, Tipo, Numero, Compañia) VALUES(?,?,?,?,?)";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, rec.getIdRec());
            ps.setInt(2, rec.getMonto());
            ps.setString(3, rec.getTipo());
            ps.setString(4, rec.getNumero());
            ps.setString(5, rec.getCompañia());
            ps.executeUpdate();
            return 1; //Exito
        } catch (SQLIntegrityConstraintViolationException e) {
            return 0; // ID duplicado
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Otro tipo de error
        }
    }
    
    public List mostrarRecargas() {
        List<Recargas> datosRec = new ArrayList<>();
        String selectSQL = "SELECT * FROM recargas";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(selectSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Recargas rec = new Recargas();
                rec.setIdRec(rs.getString(1));
                rec.setMonto(rs.getInt(2));
                rec.setTipo(rs.getString(3));
                rec.setNumero(rs.getString(4));
                rec.setCompañia(rs.getString(5));
                datosRec.add(rec);
            }
        } catch (Exception e) {
        }
        return datosRec;
    }

    public void eliminarArticulos(String id){
        String deleteSQL = "DELETE FROM recargas WHERE idRecargas = " + id;
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(deleteSQL);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
