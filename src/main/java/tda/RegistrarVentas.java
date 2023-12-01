package tda;
public class RegistrarVentas 
{
    String idEmpleado;
    String idArticulo;
    int cantidad;
    String fecha;

    public RegistrarVentas() {
    }

    
    public RegistrarVentas(String idEmpleado, String idArticulo, int cantidad, String fecha) {
        this.idEmpleado = idEmpleado;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
    
    
}
