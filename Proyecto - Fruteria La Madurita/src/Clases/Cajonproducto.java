package Clases;

/**
 *
 * @author Frael Campos
 */
public class Cajonproducto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private int cantidad_total;
    
    private int producto;

    public Cajonproducto(String nombre, String descripcion, int cantidad_total) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad_total = cantidad_total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getProducto() {
        return producto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}
