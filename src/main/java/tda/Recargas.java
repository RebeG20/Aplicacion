package tda;

public class Recargas {

    String idRec;
    String tipo;
    int monto;
    String numero;
    String compañia;

    public Recargas() {

    }

    public Recargas(String idRec, String tipo, int monto, String numero, String compañia) {
        this.idRec = idRec;
        this.tipo = tipo;
        this.monto = monto;
        this.numero = numero;
        this.compañia = compañia;
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

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    
}
