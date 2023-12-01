package tda;
public class RegistrarVentas 
{
    String idEmpleado;
    String idArticulo;
    String nombre;
    double precio;
    int cantidad;
    double total;
    String fecha;
    

    public RegistrarVentas() {
    }

    public RegistrarVentas(String idEmpleado,String idArticulo, String nombre,String fecha, int precio, int cantidad,double total) 
    {
        this.idEmpleado=idEmpleado;
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.fecha=fecha;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total=total;
        
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTotal(double total) {
        this.total = total;
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

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTotal() {
        return total;
    }
    
    
    
    
    
}
