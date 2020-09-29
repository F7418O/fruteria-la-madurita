
package Clases;

public class Producto {
    // Atributos
    private int id;
    
    private String nom_prod;
    private int cant_prod;
    private String fecha_ingreso;
    private int peso;
    
    private int proveedor;

    public Producto(String nom_prod, int cant_prod, String fecha_ingreso, int peso) {
        this.nom_prod = nom_prod;
        this.cant_prod = cant_prod;
        this.fecha_ingreso = fecha_ingreso;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }
    
    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getCant_prod() {
        return cant_prod;
    }

    public void setCant_prod(int cant_prod) {
        this.cant_prod = cant_prod;
    }

    public int getPeso() {
        return peso;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    
    
   
}
