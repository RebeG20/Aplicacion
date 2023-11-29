package tda;

import Funcionalidad.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class DAO_CompaniasTel {

    Conexion obConectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List mostrarCT() {
        List<CompaniasTel> datosCT = new ArrayList<>();
        String selectSQL = "SELECT * FROM compañiastelefonicas";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(selectSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                CompaniasTel obCT = new CompaniasTel();
                obCT.setIdCT(rs.getString(1));
                obCT.setNombreCT(rs.getString(2));
                datosCT.add(obCT);
            }
        } catch (Exception e) {
        }
        return datosCT;
    }
    
    public int agregarCT(CompaniasTel CT) {
        String insertSQL = "INSERT INTO compañiastelefonicas(IdCompañiaTelefonica, NombreCT) VALUES(?,?)";
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(insertSQL);
            ps.setString(1, CT.getIdCT());
            ps.setString(2, CT.getNombreCT());
            ps.executeUpdate();
            return 1; //Exito
        } catch (SQLIntegrityConstraintViolationException e) {
            return 0; // ID duplicado
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Otro tipo de error
        }
    }
    
    public void eliminarCT(String id){
        String deleteSQL = "DELETE FROM compañiastelefonicas WHERE IdCompañiaTelefonica = " + id;
        try {
            con = obConectar.establecerConnection();
            ps = con.prepareStatement(deleteSQL);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
