package Funcionalidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Consultas 
{
    //Ejemplo para insertar articulos 
   public void ejemplo()
   {
        Connection conexion= null;
        PreparedStatement preparedStatement = null;
        Conexion obC = new Conexion();
        try
        {
            conexion = obC.establecerConnection();
            String clave = "020", nombre = "Mazapan";
            int precio = 15, stock = 15;

            String query2 = "INSERT INTO articulos (idArticulos, nombreArt, Precio, Stock) VALUES (?, ?, ?, ?)";
            preparedStatement = conexion.prepareStatement(query2);

            // Establecer los valores de los parámetros
            preparedStatement.setString(1, clave);
            preparedStatement.setString(2, nombre);
            preparedStatement.setInt(3, precio);
            preparedStatement.setInt(4, stock);

            // Ejecutar la consulta de inserción
            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("error "+e);
        }
        obC.closeConnection();
   }

}
