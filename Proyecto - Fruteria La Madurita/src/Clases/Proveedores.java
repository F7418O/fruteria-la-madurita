package Clases;


public class Proveedores {
    
    private int id;
    private String empresa;
    private String contacto;
    private String direccion;
    private int telefono;
    private String ciudad;

    public Proveedores(int id, String empresa, String contacto, String direccion, int telefono, String ciudad) {
        this.id = id;
        this.empresa = empresa;
        this.contacto = contacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
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

    public String getCiudad() {
        return ciudad;
    }

        
}
