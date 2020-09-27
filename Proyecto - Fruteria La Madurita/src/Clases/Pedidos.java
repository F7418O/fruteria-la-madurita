package Clases;

public class Pedidos {

    private int id_cajon;
    private int cod_cliente;
    private String fecha_pedido;
    private String fecha_entrega;
    private String forma_pago;

    public Pedidos(int numero_pedido, int id_cajon, int cod_cliente, String fecha_pedido, String fecha_entrega, String forma_pago) {
        this.id_cajon = id_cajon;
        this.cod_cliente = cod_cliente;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.forma_pago = forma_pago;
    }

    public int getId_cajon() {
        return id_cajon;
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

    public String getForma_pago() {
        return forma_pago;
    }
    
    

    
}
