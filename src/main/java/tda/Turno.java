package tda;
public class Turno 
{
    String idEmpleado;
    String horario;
    String dias;

    public Turno()
    {
        
    }
    
    public Turno(String idEmpleado, String horario, String dias) 
    {
        this.idEmpleado = idEmpleado;
        this.horario = horario;
        this.dias = dias;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getHorario() {
        return horario;
    }

    public String getDias() {
        return dias;
    }
    
    
    
    
}
