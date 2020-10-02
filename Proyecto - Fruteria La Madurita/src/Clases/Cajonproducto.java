package Clases;

/**
 *
 * @author Frael Campos
 */
public class Cajonproducto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    
    private int producto;
    
    public Cajonproducto(int id,String nombre, String descripcion, float precio) {
        this.id=id;    
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {

        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public int getProducto() {
        return producto;
    }
    
    public void setProducto( int producto) {
        this.producto=producto;
    }
    
}
