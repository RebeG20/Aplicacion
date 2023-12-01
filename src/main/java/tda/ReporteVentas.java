
package tda;
public class ReporteVentas 
{
    String idArt;
    String articulo;
    String emp;
    int cant;
    String fecha;
    
    public ReporteVentas()
    {
        
    }
    
    public ReporteVentas(String idArt, String articulo, String emp, int cant, String fecha)
    {
        this.idArt=idArt;
        this.articulo=articulo;
        this.emp=emp;
        this.cant=cant;
        this.fecha=fecha;
    }

    public void setIdArt(String idArt) 
    {
        this.idArt = idArt;
    }

    public void setArticulo(String articulo) 
    {
        this.articulo = articulo;
    }

    public void setEmp(String emp) 
    {
        this.emp = emp;
    }

    public void setCant(int cant) 
    {
        this.cant = cant;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public String getIdArt() 
    {
        return idArt;
    }

    public String getArticulo() 
    {
        return articulo;
    }

    public String getEmp() 
    {
        return emp;
    }

    public int getCant() 
    {
        return cant;
    }

    public String getFecha() 
    {
        return fecha;
    }    
}
