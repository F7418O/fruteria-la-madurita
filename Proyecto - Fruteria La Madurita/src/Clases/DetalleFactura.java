/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author douglasgallardo
 */
public class DetalleFactura {
    
    private int id_detalle;
    private int id_factura;
    private int cantidad;
    private float precio;
    private Cajonproducto oCajonP;
    private boolean seleccion=false;

    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }
    
    
    public DetalleFactura(){
    
    
    }
    
    public DetalleFactura(int id_detalle, int id_factura, int cantidad, float precio, Cajonproducto oCajonP){
    
        this.cantidad = cantidad;
        this.id_detalle = id_detalle;
        this.id_factura = id_factura;
        this.precio = precio;
        this.oCajonP = oCajonP;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Cajonproducto getoCajonP() {
        return oCajonP;
    }

    public void setoCajonP(Cajonproducto oCajonP) {
        this.oCajonP = oCajonP;
    }
    
    
    
    
    
}
