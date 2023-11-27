package tda;

import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class DAO_Articulos {

    Conexion obConectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List listarArticulos() {
        List<Articulos> datosArt = new ArrayList<>();
        String selectSQL = "SELECT * FROM articulos";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(selectSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
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

    public int agregarArticulos(Articulos art) {
        String insertSQL = "INSERT INTO articulos(idArticulos, NombreArt, Precio, Stock) VALUES(?,?,?,?)";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, art.getIdArt());
            ps.setString(2, art.getNomArt());
            ps.setDouble(3, art.getPrecio());
            ps.setInt(4, art.getStock());
            ps.executeUpdate();
            return 1; //Exito
        } catch (SQLIntegrityConstraintViolationException e) {
            return 0; // ID duplicado
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Otro tipo de error
        }
    }

    public int actualizarArticulos(Articulos art) {
        String updateSQL = "UPDATE articulos SET NombreArt = ?, Precio = ?, Stock = ? WHERE idArticulos = ?";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(updateSQL);

            ps.setString(1, art.getNomArt());
            ps.setDouble(2, art.getPrecio());
            ps.setInt(3, art.getStock());
            ps.setString(4, art.getIdArt());

            ps.executeUpdate();
            return 1; // Éxito
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Otro tipo de error
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void eliminarArticulos(String id){
        String deleteSQL = "DELETE FROM articulos WHERE idArticulos = " + id;
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(deleteSQL);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
