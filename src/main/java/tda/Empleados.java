package tda;
//@author rebec
public class Empleados 
{
    String idEmpleado;
    String NombreE;
    String ApellidoME;
    String ApellidoPE;
    String Calle; 
    String Colonia;
    int numCalle;

    public Empleados()
    {
        
    }
    public Empleados(String idEmpleado, String NombreE, String ApellidoME, String ApellidoPE, String Calle, String Colonia, int numCalle) {
        this.idEmpleado = idEmpleado;
        this.NombreE = NombreE;
        this.ApellidoME = ApellidoME;
        this.ApellidoPE = ApellidoPE;
        this.Calle = Calle;
        this.Colonia = Colonia;
        this.numCalle = numCalle;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public void setApellidoME(String ApellidoME) {
        this.ApellidoME = ApellidoME;
    }

    public void setApellidoPE(String ApellidoPE) {
        this.ApellidoPE = ApellidoPE;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombreE() {
        return NombreE;
    }

    public String getApellidoME() {
        return ApellidoME;
    }

    public String getApellidoPE() {
        return ApellidoPE;
    }

    public String getCalle() {
        return Calle;
    }

    public String getColonia() {
        return Colonia;
    }

    public int getNumCalle() {
        return numCalle;
    }
      
}
