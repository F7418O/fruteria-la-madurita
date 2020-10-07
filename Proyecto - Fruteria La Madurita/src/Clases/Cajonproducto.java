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
    private int cantidad_total;

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }
    private int producto;
    
    public Cajonproducto(int id,String nombre, String descripcion, float precio) {
        this.id=id;    
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

    }
    
    public Cajonproducto(){
    
    }
    
    public String toString(){
        return this.nombre;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
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
