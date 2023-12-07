package Funcionalidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection conexion = null;
    String user = "root";
    //Base de datos de Rebeca:
//    String password="Rebecaga20";
//    String database="tiendav2";
    
//    //Base de datos de Rebeca:
//    String password="Rebecaga20";
//    String database="tienda";
    
    //Base de datos de Luis
//    String password = "G.umball37";
//    String database = "tienda";
    
    //Base de datos de Luis
//    String password = "G.umball37";
//    String database = "tiendav2";

//    Base de datos de Rafa:
//    String password = "R4f43l60$7";
//    String database = "tiendav2";

//    Base de datos lupita 
    String password="rootmaria";
    String database="tiendav2";
//    Base de datos lupita 
//    String password="rootmaria";
//    String database="tienda";
//    
    String ip = "localhost";
    String puerto = "3306";
    
    String dir = "jdbc:mysql://" + ip + ":" + puerto + "/" + database;

    public Connection establecerConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(dir, user, password);

        } catch (ClassNotFoundException | SQLException e) {
           
        }
        return conexion;
    }

    public void closeConnection() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {

        }
    }

}
