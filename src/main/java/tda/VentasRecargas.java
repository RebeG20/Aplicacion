
package tda;

public class VentasRecargas {
    
    String idEmpleado;
    String idRecarga;
    String fechaVenta;
    String nombreCT;
    int total;

    public VentasRecargas() {
    }

    public VentasRecargas(String idEmpleado, String idRecarga, String fechaVenta, String nombreCT, int total) {
        this.idEmpleado = idEmpleado;
        this.idRecarga = idRecarga;
        this.fechaVenta = fechaVenta;
        this.nombreCT = nombreCT;
        this.total = total;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdRecarga() {
        return idRecarga;
    }

    public void setIdRecarga(String idRecarga) {
        this.idRecarga = idRecarga;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String frchaVenta) {
        this.fechaVenta = frchaVenta;
    }

    public String getNombreCT() {
        return nombreCT;
    }

    public void setNombreCT(String nombreCT) {
        this.nombreCT = nombreCT;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
