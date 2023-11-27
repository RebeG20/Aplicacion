
package tda;

public class Articulos {
    String idArt;
    String nomArt;
    double precio;
    int stock;
    
    public Articulos(String idArt, String nomArt, double precio, int stock){
        this.idArt = idArt;
        this.nomArt = nomArt;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Articulos(){
        
    }

    public String getIdArt() {
        return idArt;
    }

    public void setIdArt(String idArt) {
        this.idArt = idArt;
    }

    public String getNomArt() {
        return nomArt;
    }

    public void setNomArt(String nomArt) {
        this.nomArt = nomArt;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
