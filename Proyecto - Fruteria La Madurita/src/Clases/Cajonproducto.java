package Clases;

/**
 *
 * @author Frael Campos
 */
public class Cajonproducto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private int precio;
    
    private int producto;

    public Cajonproducto(int id,String nombre, String descripcion, int cantidad_total) {
        this.nombre = nombre;
        this.descripcion = descripcion;
<<<<<<< HEAD
        this.precio = precio;
=======
        this.precio = cantidad_total;
        this.id=id;
>>>>>>> 12e8c714b98d393a0b451a24cb06803a5d228db3
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

<<<<<<< HEAD
    public int getCantidad_total() {
=======
    public int getPrecio() {
>>>>>>> 12e8c714b98d393a0b451a24cb06803a5d228db3
        return precio;
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
