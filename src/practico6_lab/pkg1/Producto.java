
package practico6_lab.pkg1;

public class Producto {

    private String categoria;
    private String nombre;
    private double precio;


    public Producto(String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
}
