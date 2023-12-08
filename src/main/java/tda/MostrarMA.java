
package tda;
public class MostrarMA 
{
    String idMar;
    String marca;
    String idArt;
    String art;
    
    public MostrarMA()
    {
        
    }

    public MostrarMA(String idMar, String marca, String idArt, String art) 
    {
        this.idMar = idMar;
        this.marca = marca;
        this.idArt = idArt;
        this.art = art;
    }

    public void setIdMar(String idMar) 
    {
        this.idMar = idMar;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public void setIdArt(String idArt) 
    {
        this.idArt = idArt;
    }

    public void setArt(String art) 
    {
        this.art = art;
    }

    public String getIdMar() 
    {
        return idMar;
    }

    public String getMarca() 
    {
        return marca;
    }

    public String getIdArt() 
    {
        return idArt;
    }

    public String getArt() 
    {
        return art;
    }
}
