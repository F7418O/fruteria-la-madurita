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
    
    public Cajonproducto(int id,String nombre, String descripcion, int cantidad_total) {
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

    public int getPrecio() {

        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}
