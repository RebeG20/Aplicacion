
package tda;
public class Proveedores 
{
    String idProveedores;
    String nombreProv;
    String diasQueSurte;
    String numTel;
    String ciudadP;
    
    public Proveedores()
    {
        
    }

    public Proveedores(String idProveedores, String nombreProv, String diasQueSurte, String numTel, String ciudadP) 
    {
        this.idProveedores = idProveedores;
        this.nombreProv = nombreProv;
        this.diasQueSurte = diasQueSurte;
        this.numTel = numTel;
        this.ciudadP = ciudadP;
    }

    public void setIdProveedores(String idProveedores) 
    {
        this.idProveedores = idProveedores;
    }

    public void setNombreProv(String nombreProv) 
    {
        this.nombreProv = nombreProv;
    }

    public void setDiasQueSurte(String diasQueSurte) 
    {
        this.diasQueSurte = diasQueSurte;
    }

    public void setNumTel(String numTel) 
    {
        this.numTel = numTel;
    }

    public void setCiudadP(String ciudadP) 
    {
        this.ciudadP = ciudadP;
    }

    public String getIdProveedores() 
    {
        return idProveedores;
    }

    public String getNombreProv() 
    {
        return nombreProv;
    }

    public String getDiasQueSurte() 
    {
        return diasQueSurte;
    }

    public String getNumTel() 
    {
        return numTel;
    }

    public String getCiudadP() 
    {
        return ciudadP;
    }
}
