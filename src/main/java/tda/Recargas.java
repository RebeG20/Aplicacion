package tda;
public class Recargas 
{
    String idRec;
    String tipo;
    int precio;
    
    public Recargas()
    {
        
    }
    
    public Recargas(String idRec,String tipo,int precio)
    {
        this.idRec=idRec;
        this.tipo=tipo;
        this.precio=precio;
    }
    
    public String getIdRec() {
        return idRec;
    }

    public void setIdRec(String idRec) {
        this.idRec = idRec;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
