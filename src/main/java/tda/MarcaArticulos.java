package tda;
public class MarcaArticulos 
{
    String idMar;
    String idArt;
    
    public MarcaArticulos()
    {
        
    }
    public MarcaArticulos(String idMar,String idArt)
    {
        this.idMar=idMar;
        this.idArt=idArt;
    }

    public String getIdMar() {
        return idMar;
    }

    public void setIdMar(String idMar) {
        this.idMar = idMar;
    }

    public String getIdArt() {
        return idArt;
    }

    public void setIdArt(String idArt) {
        this.idArt = idArt;
    }
}
