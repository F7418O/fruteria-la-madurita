package Clases;

/**
*
*author @Frael
*/
public class Pedidos {

    private int id_pedido;
    private int cod_cliente;
    private String fecha_pedido;
    private String fecha_entrega;
    private int forma_pago;
    private String descripcion;

    public Pedidos(int id_pedido, int cod_cliente, String fecha_pedido, String fecha_entrega, int forma_pago , String de) {
        this.id_pedido = id_pedido;
        this.cod_cliente = cod_cliente;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.forma_pago = forma_pago;
        this.descripcion=de;
    }   

    public int getId_pedido() {
        return id_pedido;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public int getForma_pago() {
        return forma_pago;
    }
    
    
    public String getDescripcion(){
        return descripcion;
    }
    
}
