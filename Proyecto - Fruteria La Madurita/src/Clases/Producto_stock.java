package Clases;

/**
 *
 * @author Frael Campos
 */
public class Producto_stock {
    
    private int id;
    private int cantidad;
    private float precio_unit;

    public Producto_stock(int id, int cantidad, float precio_unit) {
        this.id= id;
        this.cantidad = cantidad;
        this.precio_unit = precio_unit;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio_unit() {
        return precio_unit;
    }
    
    
}
