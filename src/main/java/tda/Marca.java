package tda;
public class Marca 
{
    String idMarca;
    String nombreM;

    public Marca() 
    {
        
    }

    public Marca(String idMarca, String nombreM) 
    {
        this.idMarca = idMarca;
        this.nombreM = nombreM;
    }

    public void setIdMarca(String idMarca) 
    {
        this.idMarca = idMarca;
    }

    public void setNombreM(String nombreM) 
    {
        this.nombreM = nombreM;
    }

    public String getIdMarca() 
    {
        return idMarca;
    }

    public String getNombreM() 
    {
        return nombreM;
    }
    
    
}
