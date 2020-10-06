package Clases;


public class Proveedores {
    
    private int id;
    private String empresa;
    private String contacto;
    private String direccion;
    private int telefono;
    private String dias_entrega;

    public Proveedores(int id, String empresa, String contacto, String direccion, int telefono, String dias_entrega) {
        this.id = id;
        this.empresa = empresa;
        this.contacto = contacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dias_entrega = dias_entrega;
    }


   

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getId() {
        return id;
    }

    public String getDias_entrega() {
        return dias_entrega;
    }

        
}
