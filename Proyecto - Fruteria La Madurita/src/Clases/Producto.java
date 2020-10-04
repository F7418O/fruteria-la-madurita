
package Clases;

public class Producto {
    // Atributos
    private int id;
    
    private String nom_prod;
    private int peso_prod;
    private String fecha_ingreso;
   
    private int proveedor;

    public Producto(int id, String nom_prod, int cant_prod, String fecha_ingreso, int pro) {
        this.id=id;
        this.nom_prod = nom_prod;
        this.peso_prod = cant_prod;
        this.fecha_ingreso = fecha_ingreso;
        this.proveedor=pro;
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

    public int getPeso_prod() {
        return peso_prod;
    }

    public void setPeso_prod(int cant_prod) {
        this.peso_prod = cant_prod;
    }

  

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    
    
   
}
