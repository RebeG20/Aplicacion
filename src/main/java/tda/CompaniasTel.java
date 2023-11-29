package tda;

public class CompaniasTel {

    String idCT;
    String nombreCT;

    public CompaniasTel(String idCT, String nombreCT) {
        this.idCT = idCT;
        this.nombreCT = nombreCT;
    }

    public CompaniasTel() {
    }

    public String getIdCT() {
        return idCT;
    }

    public void setIdCT(String idCT) {
        this.idCT = idCT;
    }

    public String getNombreCT() {
        return nombreCT;
    }

    public void setNombreCT(String nombreCT) {
        this.nombreCT = nombreCT;
    }

}
