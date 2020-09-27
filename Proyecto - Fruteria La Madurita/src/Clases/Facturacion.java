
package Clases;

/**
 *
 * @author Frael Campos
 */
public class Facturacion {
    
    private int id_factu;
    private int id_vendedor;
    private int id_clien;
    private int total_pagar;
    
    private int cantidad_cajon;
    private int id_cajonproducto;
    private int cantidad_total;
    private String fecha_ven;

    public Facturacion(int id_factu, int id_vendedor, int id_clien, int total_pagar, String fecha_ven) {
        this.id_factu = id_factu;
        this.id_vendedor = id_vendedor;
        this.id_clien = id_clien;
        this.total_pagar = total_pagar;
        this.fecha_ven = fecha_ven;
    }

    public int getId_factu() {
        return id_factu;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public int getId_clien() {
        return id_clien;
    }

    public int getTotal_pagar() {
        return total_pagar;
    }

    public String getFecha_ven() {
        return fecha_ven;
    }   

    public int getCantidad_cajon() {
        return cantidad_cajon;
    }

    public void setCantidad_cajon(int cantidad_cajon) {
        this.cantidad_cajon = cantidad_cajon;
    }

    public int getId_cajonproducto() {
        return id_cajonproducto;
    }

    public void setId_cajonproducto(int id_cajonproducto) {
        this.id_cajonproducto = id_cajonproducto;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }
  
    
    
    
    public class Detalle_ven{
    
    
    }
}
