package tda;
import java.util.Calendar;
public class Pedido 
{
    String idArticulo;
    String idProveedor;
    String fecha;
    int cantidad;
   
    public Pedido()
    {
        
    }
    public Pedido(String idArticulo,String idProveedor,String fecha, int cantidad)
    {
        this.idArticulo=idArticulo;
        this.idProveedor=idProveedor;
        this.cantidad=cantidad;
        this.fecha=fecha;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
